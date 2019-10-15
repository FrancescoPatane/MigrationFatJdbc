package it.pccube.dbmigration.destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.pccube.dbmigration.destination.dao.FatTDizTipoCassaDao;

@Service
public class DestinationService {
	
	@Autowired
	@Qualifier("jdbcTemplateDestination")
	private JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	private FatTDizTipoCassaDao fatTDizTipoCassaDao;
	
	@Transactional(transactionManager="tm2")
	public long countAll(){
//		String sql = "select count(*) from FAT_T_DIZ_TIPO_CASSA";
//		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		long count = fatTDizTipoCassaDao.count();
		return count;
	}

}
