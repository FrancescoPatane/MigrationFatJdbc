package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_VERIF_FIRM_SERV_NOTIF database table.
 * 
 */
@Entity
@Table(name="FAT_T_VERIF_FIRM_SERV_NOTIF")
public class FatTVerifFirmServNotif implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_VERIF_FIRM_SERV_NOTIF_IDVERIFFIRMASERVICENOTIF_GENERATOR", sequenceName="SEQ_ID_VERIF_FIRMA_SER_NOTIF", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_VERIF_FIRM_SERV_NOTIF_IDVERIFFIRMASERVICENOTIF_GENERATOR")
	@Column(name="ID_VERIF_FIRMA_SERVICE_NOTIF")
	private Long idVerifFirmaServiceNotif;

	@Column(name="CD_CERT_SERIAL_NUMBER")
	private String cdCertSerialNumber;

	@Column(name="CD_CERT_STATUS")
	private String cdCertStatus;

	@Column(name="CD_CERT_STATUS_CODE")
	private String cdCertStatusCode;

	@Column(name="CD_CRL_NUMBER")
	private String cdCrlNumber;

	@Column(name="DS_CERT_STATUS_INFO")
	private String dsCertStatusInfo;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CERT_END_DATE")
	private Date dtCertEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CERT_START_DATE")
	private Date dtCertStartDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CRL_EMISSION_DATE")
	private Date dtCrlEmissionDate;

	@Column(name="NM_ISSUER_DN")
	private String nmIssuerDn;

	@Column(name="NM_SUBJECT_DN")
	private String nmSubjectDn;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Column(name="NR_CERT_LEVEL")
	private BigDecimal nrCertLevel;

	@Temporal(TemporalType.DATE)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.DATE)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTVerifFirmaNotifica
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_VERIF_FIRMA_NOTIFICA")
	private FatTVerifFirmaNotifica verifFirmaNotifica;

	//bi-directional many-to-one association to FatTDizTipologiaFirma
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_TIPOLOGIA_FIRMA")
	private FatTDizTipologiaFirma dizTipologiaFirma;

	public FatTVerifFirmServNotif() {
	}

	public Long getIdVerifFirmaServiceNotif() {
		return this.idVerifFirmaServiceNotif;
	}

	public void setIdVerifFirmaServiceNotif(Long idVerifFirmaServiceNotif) {
		this.idVerifFirmaServiceNotif = idVerifFirmaServiceNotif;
	}

	public String getCdCertSerialNumber() {
		return this.cdCertSerialNumber;
	}

	public void setCdCertSerialNumber(String cdCertSerialNumber) {
		this.cdCertSerialNumber = cdCertSerialNumber;
	}

	public String getCdCertStatus() {
		return this.cdCertStatus;
	}

	public void setCdCertStatus(String cdCertStatus) {
		this.cdCertStatus = cdCertStatus;
	}

	public String getCdCertStatusCode() {
		return this.cdCertStatusCode;
	}

	public void setCdCertStatusCode(String cdCertStatusCode) {
		this.cdCertStatusCode = cdCertStatusCode;
	}

	public String getCdCrlNumber() {
		return this.cdCrlNumber;
	}

	public void setCdCrlNumber(String cdCrlNumber) {
		this.cdCrlNumber = cdCrlNumber;
	}

	public String getDsCertStatusInfo() {
		return this.dsCertStatusInfo;
	}

	public void setDsCertStatusInfo(String dsCertStatusInfo) {
		this.dsCertStatusInfo = dsCertStatusInfo;
	}

	public Date getDtCertEndDate() {
		return this.dtCertEndDate;
	}

	public void setDtCertEndDate(Date dtCertEndDate) {
		this.dtCertEndDate = dtCertEndDate;
	}

	public Date getDtCertStartDate() {
		return this.dtCertStartDate;
	}

	public void setDtCertStartDate(Date dtCertStartDate) {
		this.dtCertStartDate = dtCertStartDate;
	}

	public Date getDtCrlEmissionDate() {
		return this.dtCrlEmissionDate;
	}

	public void setDtCrlEmissionDate(Date dtCrlEmissionDate) {
		this.dtCrlEmissionDate = dtCrlEmissionDate;
	}

	public String getNmIssuerDn() {
		return this.nmIssuerDn;
	}

	public void setNmIssuerDn(String nmIssuerDn) {
		this.nmIssuerDn = nmIssuerDn;
	}

	public String getNmSubjectDn() {
		return this.nmSubjectDn;
	}

	public void setNmSubjectDn(String nmSubjectDn) {
		this.nmSubjectDn = nmSubjectDn;
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

	public BigDecimal getNrCertLevel() {
		return this.nrCertLevel;
	}

	public void setNrCertLevel(BigDecimal nrCertLevel) {
		this.nrCertLevel = nrCertLevel;
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

	public FatTVerifFirmaNotifica getVerifFirmaNotifica() {
		return this.verifFirmaNotifica;
	}

	public void setVerifFirmaNotifica(FatTVerifFirmaNotifica verifFirmaNotifica) {
		this.verifFirmaNotifica = verifFirmaNotifica;
	}

	public FatTDizTipologiaFirma getDizTipologiaFirma() {
		return this.dizTipologiaFirma;
	}

	public void setDizTipologiaFirma(FatTDizTipologiaFirma dizTipologiaFirma) {
		this.dizTipologiaFirma = dizTipologiaFirma;
	}

	public Serializable getPrimaryKey() {
		return this.idVerifFirmaServiceNotif;
	}

}