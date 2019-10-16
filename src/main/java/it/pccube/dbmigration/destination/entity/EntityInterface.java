package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;


/**
 * Interfaccia che definisce un oggetto del DB.
 * @author alessandro.guida
 *
 */
public interface EntityInterface extends Serializable {

	String PK_SEPARATOR = "-";

	/**
	 * Deve ritornare l'oggetto che rappresenta la chiave primaria (cosi come mappato in hibernate).
	 * @return
	 */
	Serializable getPrimaryKey();
}
