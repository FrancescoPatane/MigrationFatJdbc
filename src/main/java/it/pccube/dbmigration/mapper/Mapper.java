package it.pccube.dbmigration.mapper;

import java.util.Date;

import org.springframework.stereotype.Component;

import it.pccube.dbmigration.destination.entity.FatTAdesione;
import it.pccube.dbmigration.destination.entity.FatTDizTipoCassa;
import it.pccube.dbmigration.destination.entity.FatTLotto;
import it.pccube.dbmigration.source.model.FeDizTipoCassa;
import it.pccube.dbmigration.source.model.FeLotto;

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
	
	public FatTLotto mapFatTLotto(FeLotto bean){
		FatTLotto entity = new FatTLotto();
		entity.setIdLotto(bean.getIdLotto());
		FatTAdesione adesione = new FatTAdesione();
		adesione.setIdAdesione(bean.getIdAdesione());
		entity.setAdesione(adesione);
		entity.setCdCapSedeCedente(bean.getCapSedeCedente());
		entity.setCdCapSedeCessionario(bean.getCapSedeCessionario());
		entity.setCdCapStabileCedente(bean.getCapStabileCedente());
		entity.setCdCapStabileCessionario(bean.getCapStabileCessionario());
		return entity;
	}

}
