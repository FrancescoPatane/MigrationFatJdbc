package it.pccube.dbmigration.ext;

import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.pccube.dbmigration.ext.doc.DocumentaleException;
import it.pccube.dbmigration.ext.doc.FileResource;
import it.pccube.dbmigration.ext.doc.OutputDeleteDocumentale;


@Component
public class RestfulClientB2BService {
	
	
	private static final Logger logger = LoggerFactory.getLogger(RestfulClientB2BService.class);

	private RestTemplate restfulClient = null;
	private ObjectMapper jsonMapper = null;

//	private static final String BILANCIATORE_URL = "http://10.52.2.85:82/";

	private static final int REST_CLIENT_CONN_TIMEOUT = 30000;

	private static final int REST_CLIENT_READ_TIMEOUT = 30000;
	
	private static final String ERR_MSG = "Errore chiamata documentale";

	public RestfulClientB2BService() {
		super();
	}

	@PostConstruct
	private void init() {
		SimpleClientHttpRequestFactory schrf = new SimpleClientHttpRequestFactory();
		schrf.setConnectTimeout(REST_CLIENT_CONN_TIMEOUT);
		schrf.setReadTimeout(REST_CLIENT_READ_TIMEOUT);
		this.restfulClient = new RestTemplate(schrf);
		this.restfulClient.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));

		for (HttpMessageConverter<?> converter : restfulClient.getMessageConverters()) {
			if (converter instanceof StringHttpMessageConverter) {
				((StringHttpMessageConverter) converter).setWriteAcceptCharset(false);
			}
		}

		this.jsonMapper = new ObjectMapper();
		this.jsonMapper.enable(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		this.jsonMapper
				.disable(com.fasterxml.jackson.databind.DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
		this.jsonMapper.setSerializationInclusion(Include.NON_NULL);

		logger.info("restful client successfully initialized");
	}



	public <T> T doPostUpload(String url, String filename, Class<T> responseType, byte[] data) {
		logger.info("doPostUpload " + url);

		HttpHeaders headers = new HttpHeaders();
		MultiValueMap<String, Object> multiValueMap = new LinkedMultiValueMap<>();

		FileResource fileResource = new FileResource(data);
		fileResource.setFilename(filename);
		multiValueMap.add("file", fileResource);

		headers.set("Content-Type", "multipart/form-data");

		T t = this.restfulClient.postForObject(url, new HttpEntity<>(multiValueMap, headers), responseType);
		logger.info("doPostUpload end " + t.toString() );
		return t;
	}

	public ResponseEntity<byte[]> doGetDownload(String url, HttpHeaders headers) {
		ResponseEntity<byte[]> response = this.restfulClient.exchange(url, HttpMethod.GET,
				new HttpEntity<>(null, headers), byte[].class);
		if (!HttpStatus.OK.equals(response.getStatusCode())) {
			logger.debug("status code: " + response.getStatusCode());
			throw new DocumentaleException(ERR_MSG);
		}
		return response;
	}
	
	//Documentale
	public ResponseEntity<OutputDeleteDocumentale> doGetDelete(String url, HttpHeaders headers) {
		ResponseEntity<OutputDeleteDocumentale> response = this.restfulClient.exchange(url, HttpMethod.GET,
				new HttpEntity<>(null, headers), OutputDeleteDocumentale.class);
		if (!HttpStatus.OK.equals(response.getStatusCode())) {
			logger.debug("status code: " + response.getStatusCode());
			throw new DocumentaleException(ERR_MSG);
		}
		return response;
	}
	

}
