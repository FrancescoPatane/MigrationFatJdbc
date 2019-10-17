package it.pccube.dbmigration.destination.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class DestinationDao {
	
	@Autowired
	@Qualifier("jdbcTemplateDestination")
	protected JdbcTemplate jdbcTemplate;
	
	

}
