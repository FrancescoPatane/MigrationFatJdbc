package it.pccube.dbmigration.destination;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.pccube.dbmigration.destination.dao.FatTLottoDao;
import it.pccube.dbmigration.destination.model.FatTLotto;
import it.pccube.dbmigration.mapper.Mapper;
import it.pccube.dbmigration.source.model.FeLotto;

@Service
@Transactional(rollbackFor = Exception.class)

public class DestinationService {

	private static  Logger log = LoggerFactory.getLogger(DestinationService.class);


	@Autowired
	private Mapper mapper;
	
	@Autowired
	private FatTLottoDao lottoDao;


	public void importFatTLotto(List<FeLotto> beans) {
		for(FeLotto bean : beans){
			try{
				log.info("Trying to import FeLotto with PK " + bean.getIdLotto());
				FatTLotto entity = this.mapper.mapFatTLotto(bean);
				lottoDao.insert(entity);
				log.info("Successfully imported FeLotto with PK " + bean.getIdLotto() );
			}catch (Exception e){
				e.printStackTrace();
				log.error("Error importing FeLotto with PK " + bean.getIdLotto());
				throw e;
			}
		}
	}

}
