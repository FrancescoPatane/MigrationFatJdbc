package it.pccube.dbmigration.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DatasourceConfiguration {
	
	 @Bean(name = "dbSource")
	 @ConfigurationProperties(prefix = "spring.datasource-source")
	 public DataSource dataSource1() {
	  return DataSourceBuilder.create().build();
	 }

	 @Primary
	 @Bean(name = "dbDestination")
	 @ConfigurationProperties(prefix = "spring.datasource-destination")
	 public DataSource dataSource2() {
	  return  DataSourceBuilder.create().build();
	 }

	 

}
