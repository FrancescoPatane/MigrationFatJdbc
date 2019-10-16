package it.pccube.dbmigration.destination.entity.id;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FAT_A_FATTURA_INZ_STOR database table.
 * 
 */
@Embeddable
public class FatAFatturaInzStorPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_FATTURA_STOR")
	private Long idFatturaStor;

	@Column(name="ID_IDT")
	private Long idIdt;

	public FatAFatturaInzStorPK() {
	}
	public Long getIdFatturaStor() {
		return this.idFatturaStor;
	}
	public void setIdFatturaStor(Long idFatturaStor) {
		this.idFatturaStor = idFatturaStor;
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
		if (!(other instanceof FatAFatturaInzStorPK)) {
			return false;
		}
		FatAFatturaInzStorPK castOther = (FatAFatturaInzStorPK)other;
		return 
			(this.idFatturaStor == castOther.idFatturaStor)
			&& (this.idIdt == castOther.idIdt);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idFatturaStor ^ (this.idFatturaStor >>> 32)));
		hash = hash * prime + ((int) (this.idIdt ^ (this.idIdt >>> 32)));
		
		return hash;
	}
}