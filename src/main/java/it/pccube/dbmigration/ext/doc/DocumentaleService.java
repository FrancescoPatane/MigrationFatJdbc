package it.pccube.dbmigration.ext.doc;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import it.pccube.dbmigration.ext.RestfulClientB2BService;

import java.util.Base64;

import javax.mail.internet.ContentDisposition;
import javax.mail.internet.ParseException;


@Component
public class DocumentaleService {
	
	private static final Logger logger = LoggerFactory.getLogger(DocumentaleService.class);

	
	@Value("${clusters.documentale.ibm}")
	private String baseUrl;
	
	private static final String URL_UPLOAD = "/upload";

	private static final String URL_GET_FILE = "/file";

	private static final String URL_REMOVE_FILE = "/remove";
	
	private static final String ERR_MSG = "Errore chiamata documentale";


	@Autowired
	private RestfulClientB2BService restfulClient;

	public DocumentaleService() {
		// DEFAULT
	}

	public OutputDocumentale uploadDocumento(String fileBase64, String filename) {
		logger.info("Upload documento " + filename);

		byte[] data = Base64.getDecoder().decode(fileBase64);
		OutputDocumentale output = restfulClient.doPostUpload(baseUrl+URL_UPLOAD, filename, OutputDocumentale.class, data);
		logger.info(filename + "uploaded");
		return output;
	}

	public OutputGetDocumentale getFile(String id) {
		logger.info("Download documento");
		ResponseEntity<byte[]> response = restfulClient.doGetDownload(baseUrl+URL_GET_FILE + "/" + id, new HttpHeaders());
		try {
			ContentDisposition contentDisposition = new ContentDisposition(
					response.getHeaders().getFirst(HttpHeaders.CONTENT_DISPOSITION));
			OutputGetDocumentale result = new OutputGetDocumentale();
			result.setFile(response.getBody());
			result.setFilename(contentDisposition.getParameter("filename"));
			result.setContentType(response.getHeaders().getFirst(HttpHeaders.CONTENT_TYPE));
			return result;
		} catch (ParseException e) {
			throw new DocumentaleException(ERR_MSG);
		}
	}

	public OutputDeleteDocumentale deleteFile(String id) {
		logger.info("Delete documento " + id);
		ResponseEntity<OutputDeleteDocumentale> response = restfulClient.doGetDelete(baseUrl+URL_REMOVE_FILE + "/" + id,
				new HttpHeaders());
		OutputDeleteDocumentale result = response.getBody();
		return result;
	}

}
