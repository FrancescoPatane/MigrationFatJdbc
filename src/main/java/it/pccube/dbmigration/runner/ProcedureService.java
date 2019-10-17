package it.pccube.dbmigration.runner;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.pccube.dbmigration.destination.DestinationService;
import it.pccube.dbmigration.source.SourceService;
import it.pccube.dbmigration.source.model.FeLotto;

@Service
@Transactional(rollbackFor = Exception.class)
public class ProcedureService {
	
    private static  Logger log = LoggerFactory.getLogger(ProcedureService.class);

	
	@Autowired
	private SourceService sourceService;
	
	@Autowired
	private DestinationService destinationService;
	
	
	public String start(){
		log.info("####### START-MIGRATION ######");
		this.importFatTLotto();
		return "#### END ####";
	}
	
	private void importFatTLotto(){
		this.sourceService.countAll(FeLotto.TABLE_NAME, FeLotto.class);
		List<FeLotto> sourceList = sourceService.findAll(FeLotto.TABLE_NAME, FeLotto.class);
		log.info("START Import FatTLotto, " + sourceList.size()  + " rows");
		this.destinationService.importFatTLotto(sourceList);
		log.info("--- END Import FatTLotto ---");

	}

}
