package it.pccube.dbmigration.destination;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.pccube.dbmigration.destination.dao.FatTDizTipoCassaDao;
import it.pccube.dbmigration.destination.entity.FatTDizTipoCassa;
import it.pccube.dbmigration.mapper.Mapper;
import it.pccube.dbmigration.source.model.FeDizTipoCassa;

@Service
public class DestinationService {
	
	@Autowired
	private Mapper mapper;
	
	@Autowired
	@Qualifier("jdbcTemplateDestination")
	private JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	private FatTDizTipoCassaDao fatTDizTipoCassaDao;
	
	
	
	@Transactional(transactionManager="tm2", rollbackFor = Exception.class)
	public void importFatTDizTipoCassa(List<FeDizTipoCassa> beans){
		
		for(FeDizTipoCassa bean : beans){
			FatTDizTipoCassa entity = this.mapper.mapFatTDizTipoCassa(bean);
			fatTDizTipoCassaDao.save(entity);
		}
		
	}

}
