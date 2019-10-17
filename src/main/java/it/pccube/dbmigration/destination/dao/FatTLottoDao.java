package it.pccube.dbmigration.destination.dao;

import org.springframework.stereotype.Repository;

import it.pccube.dbmigration.destination.model.FatTLotto;

@Repository
public class FatTLottoDao extends DestinationDao{
	
	//INSERT INTO fat_t_lotto (id_lotto, id_adesione) values (1, 2);

	
	public void insert(FatTLotto entity){
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO ");
		sb.append(FatTLotto.TABLE_NAME);
		sb.append(" (");
		sb.append("id_lotto, ");
		sb.append("id_adesione");
		sb.append(") VALUES (?, ?)");
		
		this.jdbcTemplate.update(sb.toString(), 
				entity.getIdLotto(),
				entity.getIdAdesione()
				);
	}
	

}
