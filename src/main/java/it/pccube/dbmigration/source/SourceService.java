package it.pccube.dbmigration.source;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class SourceService {
	
	@Autowired
	@Qualifier("jdbcTemplateSource")
	private JdbcTemplate jdbcTemplate;
	
	
	public int countAll(){
		String sql = "select count(*) from FE_DIZ_TIPO_CASSA";
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}
	
	
	public <T> List<T> findAll(String table, Class<T> modelClass){
		String sql = "select * from " + table;
		List<T> result = jdbcTemplate.query(sql, new BeanPropertyRowMapper(modelClass));
		return result;
	}
	
//	public <T> List<T> findAll(String table){
//		String sql = "select * from " + table;
//		List<T> result = jdbcTemplate.query.query(sql, new BeanPropertyRowMapper(modelClass));
//		return result;
//	}
	

}
