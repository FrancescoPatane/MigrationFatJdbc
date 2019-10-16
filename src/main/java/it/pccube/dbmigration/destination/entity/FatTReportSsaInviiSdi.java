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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_REPORT_SSA_INVII_SDI database table.
 * 
 */
@Entity
@Table(name="FAT_T_REPORT_SSA_INVII_SDI")
public class FatTReportSsaInviiSdi implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_REPORT_SSA_INVII_SDI_IDREPORTSSAINVIISDI_GENERATOR", sequenceName="SEQ_ID_REPORT_SSA_INVII_SDI", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_REPORT_SSA_INVII_SDI_IDREPORTSSAINVIISDI_GENERATOR")
	@Column(name="ID_REPORT_SSA_INVII_SDI")
	private Long idReportSsaInviiSdi;

	@Column(name="CD_PARTITA_IVA_FORN")
	private String cdPartitaIvaForn;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_INVIO_A")
	private Date dtDataInvioA;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_INVIO_DA")
	private Date dtDataInvioDa;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_RICHIESTA")
	private Date dtDataRichiesta;

	@Column(name="ID_ARCHIVIO")
	private BigDecimal idArchivio;

	@Column(name="ID_LOTTO")
	private BigDecimal idLotto;

	@Column(name="NM_COGNOME_FORN")
	private String nmCognomeForn;

	@Column(name="NM_DENOMINAZIONE_FORN")
	private String nmDenominazioneForn;

	@Column(name="NM_NOME_FORN")
	private String nmNomeForn;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	
	@Column(name="ID_REPORT")
	private String idReport;

	@Column(name="PG_VERSIONE_LOTTO")
	private BigDecimal pgVersioneLotto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTDizEsitoInvio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ESITO_INVIO")
	private FatTDizEsitoInvio dizEsitoInvio;

	//bi-directional many-to-one association to FatTDizStatoReport
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_STATO_RICHIESTA")
	private FatTDizStatoReport dizStatoReport;

	public FatTReportSsaInviiSdi() {
	}

	public Long getIdReportSsaInviiSdi() {
		return this.idReportSsaInviiSdi;
	}

	public void setIdReportSsaInviiSdi(Long idReportSsaInviiSdi) {
		this.idReportSsaInviiSdi = idReportSsaInviiSdi;
	}

	public String getCdPartitaIvaForn() {
		return this.cdPartitaIvaForn;
	}

	public void setCdPartitaIvaForn(String cdPartitaIvaForn) {
		this.cdPartitaIvaForn = cdPartitaIvaForn;
	}

	public Date getDtDataInvioA() {
		return this.dtDataInvioA;
	}

	public void setDtDataInvioA(Date dtDataInvioA) {
		this.dtDataInvioA = dtDataInvioA;
	}

	public Date getDtDataInvioDa() {
		return this.dtDataInvioDa;
	}

	public void setDtDataInvioDa(Date dtDataInvioDa) {
		this.dtDataInvioDa = dtDataInvioDa;
	}

	public Date getDtDataRichiesta() {
		return this.dtDataRichiesta;
	}

	public void setDtDataRichiesta(Date dtDataRichiesta) {
		this.dtDataRichiesta = dtDataRichiesta;
	}

	public BigDecimal getIdArchivio() {
		return this.idArchivio;
	}

	public void setIdArchivio(BigDecimal idArchivio) {
		this.idArchivio = idArchivio;
	}

	public BigDecimal getIdLotto() {
		return this.idLotto;
	}

	public void setIdLotto(BigDecimal idLotto) {
		this.idLotto = idLotto;
	}

	public String getNmCognomeForn() {
		return this.nmCognomeForn;
	}

	public void setNmCognomeForn(String nmCognomeForn) {
		this.nmCognomeForn = nmCognomeForn;
	}

	public String getNmDenominazioneForn() {
		return this.nmDenominazioneForn;
	}

	public void setNmDenominazioneForn(String nmDenominazioneForn) {
		this.nmDenominazioneForn = nmDenominazioneForn;
	}

	public String getNmNomeForn() {
		return this.nmNomeForn;
	}

	public void setNmNomeForn(String nmNomeForn) {
		this.nmNomeForn = nmNomeForn;
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

	public BigDecimal getPgVersioneLotto() {
		return this.pgVersioneLotto;
	}

	public void setPgVersioneLotto(BigDecimal pgVersioneLotto) {
		this.pgVersioneLotto = pgVersioneLotto;
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

	public FatTDizEsitoInvio getDizEsitoInvio() {
		return this.dizEsitoInvio;
	}

	public void setDizEsitoInvio(FatTDizEsitoInvio dizEsitoInvio) {
		this.dizEsitoInvio = dizEsitoInvio;
	}

	public FatTDizStatoReport getDizStatoReport() {
		return this.dizStatoReport;
	}

	public void setDizStatoReport(FatTDizStatoReport dizStatoReport) {
		this.dizStatoReport = dizStatoReport;
	}

	public Serializable getPrimaryKey() {
		return this.idReportSsaInviiSdi;
	}

	public String getIdReport() {
		return idReport;
	}

	public void setIdReport(String idReport) {
		this.idReport = idReport;
	}

}