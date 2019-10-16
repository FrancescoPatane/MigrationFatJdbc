package it.pccube.dbmigration.runner;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pccube.dbmigration.destination.DestinationService;
import it.pccube.dbmigration.source.SourceService;
import it.pccube.dbmigration.source.model.FeDizTipoCassa;
import it.pccube.dbmigration.source.model.FeLotto;

@Service
public class ProcedureService {
	
    private static  Logger log = LoggerFactory.getLogger(ProcedureService.class);

	
	@Autowired
	private SourceService sourceService;
	
	@Autowired
	private DestinationService destinationService;
	
	public String start(){
		log.info("#######START-MIGRATION######");
		this.importFatTLotto();
//		this.importFatTDizTipoCassa();
		return "#### END ####";
	}
	
	private void importFatTDizTipoCassa(){
		log.info("--- START Fetching data FeLotto ---");
		List<FeDizTipoCassa> sourceList = sourceService.findAll("FE_DIZ_TIPO_CASSA", FeDizTipoCassa.class);
		log.info("--- START Import FatTDizTipoCassa, " + sourceList.size()  + " rows ---");
		this.destinationService.importFatTDizTipoCassa(sourceList);
		log.info("--- END Import FatTDizTipoCassa ---");

	}
	
	private void importFatTLotto(){
		log.info("--- START Fetching data FeLotto ---");
		List<FeLotto> sourceList = sourceService.findAll("FE_LOTTO", FeLotto.class);
		log.info("--- START Import FatTLotto, " + sourceList.size()  + " rows ---");
//		this.destinationService.importFatTLotto(sourceList);
		log.info("--- END Import FatTDizTipoCassa ---");

	}

}
