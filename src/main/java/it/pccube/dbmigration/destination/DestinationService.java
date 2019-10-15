package it.pccube.dbmigration.destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DestinationService {
	
	@Autowired
	@Qualifier("jdbcTemplateDestination")
	private JdbcTemplate jdbcTemplate;
	
	
	public int countAll(){
		String sql = "select count(*) from FAT_T_DIZ_TIPO_CASSA";
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}

}
