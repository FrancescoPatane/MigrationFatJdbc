package it.pccube.dbmigration.destination.entity.id;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FAT_A_FATTURA_INZ database table.
 * 
 */
@Embeddable
public class FatAFatturaInzPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ID_FATTURA")
	private Long idFattura;

	@Column(name="ID_IDT")
	private Long idIdt;

	public FatAFatturaInzPK() {
	}
	public Long getIdFattura() {
		return this.idFattura;
	}
	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}
	public Long getIdIdt() {
		return this.idIdt;
	}
	public void setIdIdt(Long idIdt) {
		this.idIdt = idIdt;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FatAFatturaInzPK)) {
			return false;
		}
		FatAFatturaInzPK castOther = (FatAFatturaInzPK)other;
		return 
			(this.idFattura == castOther.idFattura)
			&& (this.idIdt == castOther.idIdt);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idFattura ^ (this.idFattura >>> 32)));
		hash = hash * prime + ((int) (this.idIdt ^ (this.idIdt >>> 32)));
		
		return hash;
	}
}