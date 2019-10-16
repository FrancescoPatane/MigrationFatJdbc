package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_VERIF_FIRMA_ESITO_FTP database table.
 * 
 */
@Entity
@Table(name="FAT_T_VERIF_FIRMA_ESITO_FTP")
public class FatTVerifFirmaEsitoFtp implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_VERIF_FIRMA_ESITO_FTP_IDVERIFFIRMAESITOFTP_GENERATOR", sequenceName="SEQ_ID_VERIF_FIRMA_ESITO_FTP", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_VERIF_FIRMA_ESITO_FTP_IDVERIFFIRMAESITOFTP_GENERATOR")
	@Column(name="ID_VERIF_FIRMA_ESITO_FTP")
	private Long idVerifFirmaEsitoFtp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_DATA_VERIFICA")
	private Date dtDataVerifica;

	@Column(name="FL_CHECK_HASH_DOCUMENTO")
	private Boolean flCheckHashDocumento;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTDizRispostaCodFiscale
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_RISPOSTA_COD_FISCALE")
	private FatTDizRispostaCodFiscale dizRispostaCodFiscale;

	//bi-directional many-to-one association to FatTDizRispostaWsFirma
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_RISPOSTA_WS_FIRMA")
	private FatTDizRispostaWsFirma dizRispostaWsFirma;

	//bi-directional many-to-one association to FatTEsitoFtp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ESITO_FTP")
	private FatTEsitoFtp esitoFtp;

	//bi-directional many-to-one association to FatTVerFirmServEsiFtp
	@OneToMany(mappedBy="verifFirmaEsitoFtp")
	private List<FatTVerFirmServEsiFtp> listVerFirmServEsiFtp;

	public FatTVerifFirmaEsitoFtp() {
	}

	public Long getIdVerifFirmaEsitoFtp() {
		return this.idVerifFirmaEsitoFtp;
	}

	public void setIdVerifFirmaEsitoFtp(Long idVerifFirmaEsitoFtp) {
		this.idVerifFirmaEsitoFtp = idVerifFirmaEsitoFtp;
	}

	public Date getDtDataVerifica() {
		return this.dtDataVerifica;
	}

	public void setDtDataVerifica(Date dtDataVerifica) {
		this.dtDataVerifica = dtDataVerifica;
	}

	public Boolean getFlCheckHashDocumento() {
		return this.flCheckHashDocumento;
	}

	public void setFlCheckHashDocumento(Boolean flCheckHashDocumento) {
		this.flCheckHashDocumento = flCheckHashDocumento;
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

	public FatTDizRispostaCodFiscale getDizRispostaCodFiscale() {
		return this.dizRispostaCodFiscale;
	}

	public void setDizRispostaCodFiscale(FatTDizRispostaCodFiscale dizRispostaCodFiscale) {
		this.dizRispostaCodFiscale = dizRispostaCodFiscale;
	}

	public FatTDizRispostaWsFirma getDizRispostaWsFirma() {
		return this.dizRispostaWsFirma;
	}

	public void setDizRispostaWsFirma(FatTDizRispostaWsFirma dizRispostaWsFirma) {
		this.dizRispostaWsFirma = dizRispostaWsFirma;
	}

	public FatTEsitoFtp getEsitoFtp() {
		return this.esitoFtp;
	}

	public void setEsitoFtp(FatTEsitoFtp esitoFtp) {
		this.esitoFtp = esitoFtp;
	}

	public List<FatTVerFirmServEsiFtp> getListVerFirmServEsiFtp() {
		return this.listVerFirmServEsiFtp;
	}

	public void getListVerFirmServEsiFtp(List<FatTVerFirmServEsiFtp> listVerFirmServEsiFtp) {
		this.listVerFirmServEsiFtp = listVerFirmServEsiFtp;
	}

	public FatTVerFirmServEsiFtp addFatTVerFirmServEsiFtp(FatTVerFirmServEsiFtp fatTVerFirmServEsiFtp) {
		getListVerFirmServEsiFtp().add(fatTVerFirmServEsiFtp);
		fatTVerFirmServEsiFtp.setVerifFirmaEsitoFtp(this);

		return fatTVerFirmServEsiFtp;
	}

	public FatTVerFirmServEsiFtp removeFatTVerFirmServEsiFtp(FatTVerFirmServEsiFtp fatTVerFirmServEsiFtp) {
		getListVerFirmServEsiFtp().remove(fatTVerFirmServEsiFtp);
		fatTVerFirmServEsiFtp.setVerifFirmaEsitoFtp(null);

		return fatTVerFirmServEsiFtp;
	}

	public Serializable getPrimaryKey() {
		return this.idVerifFirmaEsitoFtp;
	}

}