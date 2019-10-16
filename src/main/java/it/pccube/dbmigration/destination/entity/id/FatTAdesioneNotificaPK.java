package it.pccube.dbmigration.destination.entity.id;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FAT_T_ADESIONE_NOTIFICA database table.
 * 
 */
@Embeddable
public class FatTAdesioneNotificaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_ADESIONE")
	private Long idAdesione;

	@Column(name="ID_DIZ_STATO_ADESIONE_NOTIFICA")
	private String idDizStatoAdesioneNotifica;

	public FatTAdesioneNotificaPK() {
	}
	public Long getIdAdesione() {
		return this.idAdesione;
	}
	public void setIdAdesione(Long idAdesione) {
		this.idAdesione = idAdesione;
	}
	public String getIdDizStatoAdesioneNotifica() {
		return this.idDizStatoAdesioneNotifica;
	}
	public void setIdDizStatoAdesioneNotifica(String idDizStatoAdesioneNotifica) {
		this.idDizStatoAdesioneNotifica = idDizStatoAdesioneNotifica;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FatTAdesioneNotificaPK)) {
			return false;
		}
		FatTAdesioneNotificaPK castOther = (FatTAdesioneNotificaPK)other;
		return 
			(this.idAdesione == castOther.idAdesione)
			&& this.idDizStatoAdesioneNotifica.equals(castOther.idDizStatoAdesioneNotifica);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idAdesione ^ (this.idAdesione >>> 32)));
		hash = hash * prime + this.idDizStatoAdesioneNotifica.hashCode();
		
		return hash;
	}
}