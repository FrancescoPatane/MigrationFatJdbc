package it.pccube.dbmigration.destination.entity.id;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The primary key class for the FAT_A_LOTTO_SUPPORTO_FTP database table.
 * 
 */
@Embeddable
public class FatALottoSupportoFtpPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_LOTTO")
	private Long idLotto;

	@Column(name="ID_SUPPORTO_FTP")
	private Long idSupportoFtp;

	public FatALottoSupportoFtpPK() {
	}
	public Long getIdLotto() {
		return this.idLotto;
	}
	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}
	public Long getIdSupportoFtp() {
		return this.idSupportoFtp;
	}
	public void setIdSupportoFtp(Long idSupportoFtp) {
		this.idSupportoFtp = idSupportoFtp;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FatALottoSupportoFtpPK)) {
			return false;
		}
		FatALottoSupportoFtpPK castOther = (FatALottoSupportoFtpPK)other;
		return 
			(this.idLotto == castOther.idLotto)
			&& (this.idSupportoFtp == castOther.idSupportoFtp);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idLotto ^ (this.idLotto >>> 32)));
		hash = hash * prime + ((int) (this.idSupportoFtp ^ (this.idSupportoFtp >>> 32)));
		
		return hash;
	}
}