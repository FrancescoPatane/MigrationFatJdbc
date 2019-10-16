package it.pccube.dbmigration.source.model;

import java.io.Serializable;

/**
 * Interfaccia che definisce un oggetto del DB.
 * 
 * @author alessandro.guida
 *
 */
public interface Entity extends Serializable {

	/**
	 * Deve ritornare l'oggetto che rappresenta la chiave primaria (cosi come mappato in hibernate).
	 * @return
	 */
	Serializable getPrimaryKey();
}
