package it.pccube.dbmigration.mapper;

import org.springframework.stereotype.Component;

import it.pccube.dbmigration.destination.entity.FatTDizTipoCassa;
import it.pccube.dbmigration.source.model.FeDizTipoCassa;

@Component
public class Mapper {
	
	
	public FatTDizTipoCassa mapFatTDizTipoCassa(FeDizTipoCassa bean){
		FatTDizTipoCassa entity = new FatTDizTipoCassa();
		entity.setIdDizTipoCassa(bean.getIdDizTipoCassa());
		entity.setCdCodice(bean.getCodice());
		entity.setDsDescrizione(bean.getDescrizione());
//		entity.set.setNmUtenteInserimento(bean.get);
		return entity;
	}

}
