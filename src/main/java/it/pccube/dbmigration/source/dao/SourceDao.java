package it.pccube.dbmigration.source.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SourceDao {
	
	@Autowired
	@Qualifier("jdbcTemplateSource")
	private JdbcTemplate jdbcTemplate;
	
	
	public <T> Long countAll(String table, Class<T> modelClass){
		String sql = "SELECT COUNT(*) FROM " + table;
		Long count = jdbcTemplate.queryForObject(sql, Long.class);
		return count;
	}
	
	public <T> List<T> findAll(String table, Class<T> modelClass){
		String sql = "select * from " + table;
		List<T> result = jdbcTemplate.query(sql, new BeanPropertyRowMapper(modelClass));
		return result;
	}

}
