package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the FAT_T_DIZ_STATO_LIQUIDAZIONE database table.
 * 
 */
@Entity
@Table(name = "FAT_T_DIZ_STATO_LIQUIDAZIONE")
public class FatTDizStatoLiquidazione implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_DIZ_STATO_LIQUIDAZIONE")
	private Long idDizStatoLiquidazione;

	
	@Column(name = "CD_CODICE")
	private String cdCodice;

	
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

	public FatTDizStatoLiquidazione() {
	}

	public Long getIdDizStatoLiquidazione() {
		return this.idDizStatoLiquidazione;
	}

	public void setIdDizStatoLiquidazione(Long idDizStatoLiquidazione) {
		this.idDizStatoLiquidazione = idDizStatoLiquidazione;
	}

	public String getCdCodice() {
		return this.cdCodice;
	}

	public void setCdCodice(String cdCodice) {
		this.cdCodice = cdCodice;
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
		return this.idDizStatoLiquidazione;
	}

}