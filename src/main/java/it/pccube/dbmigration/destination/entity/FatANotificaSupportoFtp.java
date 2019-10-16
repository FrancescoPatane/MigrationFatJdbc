package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the FAT_A_NOTIFICA_SUPPORTO_FTP database table.
 * 
 */
@Entity
@Table(name="FAT_A_NOTIFICA_SUPPORTO_FTP")
public class FatANotificaSupportoFtp implements EntityInterface {
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="FAT_A_NOTIFICA_SUPPORTO_FTP_IDNOTIFICASUPPORTOFTP_GENERATOR", sequenceName = "SEQ_ID_NOTIFICA_SUPPORTO_FTP", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_A_NOTIFICA_SUPPORTO_FTP_IDNOTIFICASUPPORTOFTP_GENERATOR")
	@Column(name="ID_NOTIFICA_SUPPORTO_FTP")
	private Long idNotificaSupportoFtp;

	@Column(name="FL_LAVORATO")
	private Boolean flLavorato;

	@Column(name="NM_NOME_FILE_NOTIFICA")
	private String nmNomeFileNotifica;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Column(name="ID_FILE_NOTIFICA")
	private String idFileNotifica;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTNotifica
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_NOTIFICA")
	private FatTNotifica notifica;

	//bi-directional many-to-one association to FatTSupportoFtp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_SUPPORTO_FTP")
	private FatTSupportoFtp supportoFtp;

	//bi-directional many-to-one association to FatTDizTipologiaNotifica
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_TIPO_NOTIFICA")
	private FatTDizTipologiaNotifica dizTipologiaNotifica;

	public FatANotificaSupportoFtp() {
	}

	public Long getIdNotificaSupportoFtp() {
		return this.idNotificaSupportoFtp;
	}

	public void setIdNotificaSupportoFtp(Long idNotificaSupportoFtp) {
		this.idNotificaSupportoFtp = idNotificaSupportoFtp;
	}

	public Boolean getFlLavorato() {
		return this.flLavorato;
	}

	public void setFlLavorato(Boolean flLavorato) {
		this.flLavorato = flLavorato;
	}

	public String getNmNomeFileNotifica() {
		return this.nmNomeFileNotifica;
	}

	public void setNmNomeFileNotifica(String nmNomeFileNotifica) {
		this.nmNomeFileNotifica = nmNomeFileNotifica;
	}

	public String getNmUtenteInserimento() {
		return this.nmUtenteInserimento;
	}

	public void setNmUtenteInserimento(String nmUtenteInserimento) {
		this.nmUtenteInserimento = nmUtenteInserimento;
	}

	public String getNmUtenteUltimaModifica() {
		return this.nmUtenteUltimaModifica;
	}

	public void setNmUtenteUltimaModifica(String nmUtenteUltimaModifica) {
		this.nmUtenteUltimaModifica = nmUtenteUltimaModifica;
	}


	public Date getTsInserimento() {
		return this.tsInserimento;
	}

	public void setTsInserimento(Date tsInserimento) {
		this.tsInserimento = tsInserimento;
	}

	public Date getTsUltimaModifica() {
		return this.tsUltimaModifica;
	}

	public void setTsUltimaModifica(Date tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}

	public FatTNotifica getNotifica() {
		return this.notifica;
	}

	public void setNotifica(FatTNotifica notifica) {
		this.notifica = notifica;
	}

	public FatTSupportoFtp getSupportoFtp() {
		return this.supportoFtp;
	}

	public void setSupportoFtp(FatTSupportoFtp supportoFtp) {
		this.supportoFtp = supportoFtp;
	}

	public FatTDizTipologiaNotifica getDizTipologiaNotifica() {
		return this.dizTipologiaNotifica;
	}

	public void setDizTipologiaNotifica(FatTDizTipologiaNotifica dizTipologiaNotifica) {
		this.dizTipologiaNotifica = dizTipologiaNotifica;
	}

	public Serializable getPrimaryKey() {
		return this.idNotificaSupportoFtp;
	}

	public String getIdFileNotifica() {
		return idFileNotifica;
	}

	public void setIdFileNotifica(String idFileNotifica) {
		this.idFileNotifica = idFileNotifica;
	}

	

}