package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * The persistent class for the FAT_T_DIZ_TIPOLOGIA_MAIL database table.
 * 
 */
@Entity
@Table(name = "FAT_T_DIZ_TIPOLOGIA_MAIL")
public class FatTDizTipologiaMail implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_DIZ_TIPOLOGIA_MAIL")
	private Long idDizTipologiaMail;

	
	@Column(name = "DS_DESCRIZIONE")
	private String dsDescrizione;

	@Column(name = "NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name = "NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	public FatTDizTipologiaMail() {
	}

	public Long getIdDizTipologiaMail() {
		return this.idDizTipologiaMail;
	}

	public void setIdDizTipologiaMail(Long idDizTipologiaMail) {
		this.idDizTipologiaMail = idDizTipologiaMail;
	}

	public String getDsDescrizione() {
		return this.dsDescrizione;
	}

	public void setDsDescrizione(String dsDescrizione) {
		this.dsDescrizione = dsDescrizione;
	}

	public String getNmUtenteInserimento() {
		return nmUtenteInserimento;
	}

	public void setNmUtenteInserimento(String nmUtenteInserimento) {
		this.nmUtenteInserimento = nmUtenteInserimento;
	}

	public String getNmUtenteUltimaModifica() {
		return nmUtenteUltimaModifica;
	}

	public void setNmUtenteUltimaModifica(String nmUtenteUltimaModifica) {
		this.nmUtenteUltimaModifica = nmUtenteUltimaModifica;
	}

	public Date getTsInserimento() {
		return tsInserimento;
	}

	public void setTsInserimento(Date tsInserimento) {
		this.tsInserimento = tsInserimento;
	}

	public Date getTsUltimaModifica() {
		return tsUltimaModifica;
	}

	public void setTsUltimaModifica(Date tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}

	
	public Serializable getPrimaryKey() {
		return this.idDizTipologiaMail;
	}

}