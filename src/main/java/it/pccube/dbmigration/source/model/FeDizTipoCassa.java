package it.pccube.dbmigration.source.model;

import java.io.Serializable;


/**
 * @author fiorenzo.amendola
 * @since Fatturazione elettronica
 * The Class FeDizTipoCassa.
 */

public class FeDizTipoCassa implements Entity {

	/**
	 * the serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public FeDizTipoCassa() {
	}

	/**
	 * the idDizTipoCassa
	 */
	private Long idDizTipoCassa;

	/**
	 * the codice
	 */
	private String codice;

	/**
	 * the descrizione
	 */
	private String descrizione;

	/**
	 * @return the idDizTipoCassa
	 */
	public Long getIdDizTipoCassa() {
		return idDizTipoCassa;
	}

	/**
	 * @param idDizTipoCassa the idDizTipoCassa to set
	 */
	public void setIdDizTipoCassa(Long idDizTipoCassa) {
		this.idDizTipoCassa = idDizTipoCassa;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FeDizTipoCassa [idDizTipoCassa=" + idDizTipoCassa + ", codice="
				+ codice + ", descrizione=" + descrizione + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idDizTipoCassa == null) ? 0 : idDizTipoCassa.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FeDizTipoCassa other = (FeDizTipoCassa) obj;
		if (idDizTipoCassa == null) {
			if (other.idDizTipoCassa != null)
				return false;
		} else if (!idDizTipoCassa.equals(other.idDizTipoCassa))
			return false;
		return true;
	}

	@Override
	public Serializable getPrimaryKey() {
		return this.getIdDizTipoCassa();
	}


}