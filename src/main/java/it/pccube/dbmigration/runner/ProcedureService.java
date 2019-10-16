package it.pccube.dbmigration.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pccube.dbmigration.destination.DestinationService;
import it.pccube.dbmigration.source.SourceService;
import it.pccube.dbmigration.source.model.FeDizTipoCassa;

@Service
public class ProcedureService {
	
	@Autowired
	private SourceService sourceService;
	
	@Autowired
	private DestinationService destinationService;
	
	public String start(){
		List<FeDizTipoCassa> sourceList = sourceService.findAll("FE_DIZ_TIPO_CASSA", FeDizTipoCassa.class);
		
		this.destinationService.importFatTDizTipoCassa(sourceList);
		return "#### END ####";
	}

}
