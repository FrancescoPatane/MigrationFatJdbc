package it.pccube.dbmigration.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pccube.dbmigration.destination.DestinationService;
import it.pccube.dbmigration.source.SourceService;

@Service
public class ProcedureService {
	
	@Autowired
	private SourceService sourceService;
	
	@Autowired
	private DestinationService destinationService;
	
	public String test(){
		int countS = sourceService.countAll();
		int countD = destinationService.countAll();

		return "Count source: " + countS + " count destinatio " + countD;
	}

}
