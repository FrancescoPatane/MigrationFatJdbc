package it.pccube.dbmigration.mapper;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.stereotype.Component;

import it.pccube.dbmigration.destination.entity.FatTDizTipoCassa;
import it.pccube.dbmigration.source.model.FeDizTipoCassa;

@Component
public class Mapper {
	
	private static final String BATCH_USER = "MIGRATION_BATCH_PROCESS";
	
	public FatTDizTipoCassa mapFatTDizTipoCassa(FeDizTipoCassa bean){
		FatTDizTipoCassa entity = new FatTDizTipoCassa();
		entity.setIdDizTipoCassa(bean.getIdDizTipoCassa());
		entity.setCdCodice(bean.getCodice());
		entity.setDsDescrizione(bean.getDescrizione());
		entity.setNmUtenteInserimento(BATCH_USER);
		entity.setNmUtenteUltimaModifica(BATCH_USER);
		entity.setTsInserimento(new Date());
		entity.setTsUltimaModifica(new Date());
		return entity;
	}

}
