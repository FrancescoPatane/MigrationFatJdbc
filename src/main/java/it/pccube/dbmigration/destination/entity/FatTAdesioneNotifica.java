package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import it.pccube.dbmigration.destination.entity.id.FatTAdesioneNotificaPK;


/**
 * The persistent class for the FAT_T_ADESIONE_NOTIFICA database table.
 * 
 */
@Entity
@Table(name = "FAT_T_ADESIONE_NOTIFICA")
public class FatTAdesioneNotifica implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FatTAdesioneNotificaPK id;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_DATA_NOTIFICA")
	private Date dtDataNotifica;

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

	// bi-directional many-to-one association to FatTAdesione
	@ManyToOne
	@JoinColumn(name = "ID_ADESIONE", insertable=false, updatable=false)
	private FatTAdesione adesione;

	@ManyToOne
	@JoinColumn(name = "ID_DIZ_STATO_ADESIONE_NOTIFICA", insertable=false, updatable=false)
	private FatTDizStatoAdesione dizStatoAdesione;

	public FatTAdesioneNotifica() {
		super();
	}

	public FatTAdesioneNotificaPK getId() {
		return this.id;
	}

	public void setId(FatTAdesioneNotificaPK id) {
		this.id = id;
	}

	public Date getDtDataNotifica() {
		return dtDataNotifica;
	}

	public void setDtDataNotifica(Date dtDataNotifica) {
		this.dtDataNotifica = dtDataNotifica;
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

	public FatTDizStatoAdesione getDizStatoAdesione() {
		return dizStatoAdesione;
	}

	public void setDizStatoAdesione(FatTDizStatoAdesione dizStatoAdesione) {
		this.dizStatoAdesione = dizStatoAdesione;
	}

	public FatTAdesione getAdesione() {
		return this.adesione;
	}

	public void setAdesione(FatTAdesione adesione) {
		this.adesione = adesione;
	}

	
	public Serializable getPrimaryKey() {
		return this.id;
	}

}