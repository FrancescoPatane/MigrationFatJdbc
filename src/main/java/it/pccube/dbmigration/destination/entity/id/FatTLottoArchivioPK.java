package it.pccube.dbmigration.destination.entity.id;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The primary key class for the FAT_T_LOTTO_ARCHIVIO database table.
 * 
 */
@Embeddable
public class FatTLottoArchivioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_LOTTO")
	private Long idLotto;

	@Column(name="ID_ARCHIVIO")
	private Long idArchivio;

	public FatTLottoArchivioPK() {
	}
	
	public FatTLottoArchivioPK(Long idLotto, Long idArchivio) {
		super();
		this.idLotto = idLotto;
		this.idArchivio = idArchivio;
	}

	public Long getIdLotto() {
		return this.idLotto;
	}
	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}
	public Long getIdArchivio() {
		return this.idArchivio;
	}
	public void setIdArchivio(Long idArchivio) {
		this.idArchivio = idArchivio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FatTLottoArchivioPK)) {
			return false;
		}
		FatTLottoArchivioPK castOther = (FatTLottoArchivioPK)other;
		return 
			(this.idLotto == castOther.idLotto)
			&& (this.idArchivio == castOther.idArchivio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idLotto ^ (this.idLotto >>> 32)));
		hash = hash * prime + ((int) (this.idArchivio ^ (this.idArchivio >>> 32)));
		
		return hash;
	}
}