package it.pccube.dbmigration.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {


	private static  Logger log = LoggerFactory.getLogger(CommandLineAppStartupRunner.class);

	@Autowired
	private ProcedureService procService;


	@Override
	public void run(String...args) throws Exception {
		procService.start();

	}

}
