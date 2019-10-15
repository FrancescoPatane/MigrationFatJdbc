package it.pccube.dbmigration.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;


@Configuration
public class JdbcConfiguration {
	
	
	@Bean(name = "jdbcTemplateSource")
	 public JdbcTemplate jdbcTemplate1(@Qualifier("dbSource") DataSource ds) {
	  return new JdbcTemplate(ds);
	 }
	 
	
	@Bean(name = "jdbcTemplateDestination")
	 public JdbcTemplate jdbcTemplate2(@Qualifier("dbDestination") DataSource ds) {
	  return new JdbcTemplate(ds);
	 }

}
