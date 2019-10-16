package it.pccube.dbmigration.destination;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.pccube.dbmigration.destination.dao.FatTDizTipoCassaDao;
import it.pccube.dbmigration.destination.dao.FatTLottoDao;
import it.pccube.dbmigration.destination.entity.FatTDizTipoCassa;
import it.pccube.dbmigration.destination.entity.FatTLotto;
import it.pccube.dbmigration.mapper.Mapper;
import it.pccube.dbmigration.source.model.FeDizTipoCassa;
import it.pccube.dbmigration.source.model.FeLotto;

@Service
//@Transactional(transactionManager="tm2",  rollbackFor = Exception.class)
@Transactional(rollbackFor = Exception.class)

public class DestinationService {

	private static  Logger log = LoggerFactory.getLogger(DestinationService.class);


	@Autowired
	private Mapper mapper;

	@Autowired
	@Qualifier("jdbcTemplateDestination")
	private JdbcTemplate jdbcTemplate;


	@Autowired
	private FatTDizTipoCassaDao fatTDizTipoCassaDao;

	@Autowired
	private FatTLottoDao lottoDao;

	public void importFatTDizTipoCassa(List<FeDizTipoCassa> beans){

		for(FeDizTipoCassa bean : beans){
			log.info("--- Trying to import FeDizTipoCassa with PK " + bean.getPrimaryKey() + " ---");
			try{
				FatTDizTipoCassa entity = this.mapper.mapFatTDizTipoCassa(bean);
				fatTDizTipoCassaDao.save(entity);
				log.info("--- Successfully imported FeDizTipoCassa with PK " + bean.getPrimaryKey() + " ---");
			}catch (Exception e){
				log.error("--- Error importing FeDizTipoCassa with PK " + bean.getPrimaryKey() + " ---");
				throw e;
			}
		}

	}


	public void importFatTLotto(List<FeLotto> beans) {
		for(FeLotto bean : beans){
			log.info("--- Trying to import FeLotto with PK " + bean.getIdLotto() + " ---");
			try{
				FatTLotto entity = this.mapper.mapFatTLotto(bean);
				FatTLotto entitySaved = lottoDao.save(entity);
				log.info("--- Successfully imported FeLotto with PK " + bean.getIdLotto() + " . It was saved with id " + entitySaved.getIdLotto() + " ---");
			}catch (Exception e){
				log.error("--- Error importing FeLotto with PK " + bean.getIdLotto() + " ---");
				throw e;
			}
		}
	}

}
