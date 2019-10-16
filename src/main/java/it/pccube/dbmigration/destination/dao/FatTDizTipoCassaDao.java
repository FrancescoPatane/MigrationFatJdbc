package it.pccube.dbmigration.destination.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.pccube.dbmigration.destination.entity.FatTDizTipoCassa;


public interface FatTDizTipoCassaDao extends JpaRepository<FatTDizTipoCassa, Long> {

}
