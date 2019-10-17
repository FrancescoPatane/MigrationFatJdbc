package it.pccube.dbmigration.source;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pccube.dbmigration.source.dao.SourceDao;

@Service
public class SourceService {
	
    private static  Logger log = LoggerFactory.getLogger(SourceService.class);



	@Autowired
	private SourceDao dao;


	public <T> Long countAll(String table, Class<T> modelClass){
		log.info("Counting rows in table " + table);
		Long count =  this.dao.countAll(table, modelClass);
		log.info("Found " + count + " rows");
		return count;
	}

	public <T> List<T> findAll(String table, Class<T> modelClass){
		log.info("Fetching rows from table " + table);
		List<T> rows =  this.dao.findAll(table, modelClass);
		log.info("Fetched " + rows.size() + " rows");
		return rows;
	}




}
