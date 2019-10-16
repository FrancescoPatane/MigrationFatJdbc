package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
 * The persistent class for the FAT_T_APPLICATIVO_LOG database table.
 * 
 */
@Entity
@Table(name = "FAT_T_APPLICATIVO_LOG")
public class FatTApplicativoLog implements EntityInterface {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FAT_T_APPLICATIVO_LOG_IDLOGAPPLICATIVO_GENERATOR", sequenceName = "SEQ_ID_LOG_APPLICATIVO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAT_T_APPLICATIVO_LOG_IDLOGAPPLICATIVO_GENERATOR")
	@Column(name = "ID_LOG_APPLICATIVO")
	private Long idLogApplicativo;

	@Column(name = "CD_INDIRIZZO_IP")
	private String cdIndirizzoIp;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_DATA_OPERAZIONE")
	private Date dtDataOperazione;

	@Column(name = "ID_ADESIONE")
	private Long idAdesione;

	@Column(name = "ID_ARCHIVIO")
	private Long idArchivio;

	@Column(name = "ID_DETTAGLIO_LINEA")
	private Long idDettaglioLinea;

	@Column(name = "ID_EXCEL_FATTURA")
	private Long idExcelFattura;

	@Column(name = "ID_FATTURA")
	private Long idFattura;

	@Column(name = "ID_LOTTO")
	private Long idLotto;

	@Column(name = "ID_NOTIFICA")
	private Long idNotifica;

	@Column(name = "ID_REPORT_SSA_INVII_SDI")
	private Long idReportSsaInviiSdi;

	@Column(name = "ID_REPORT_SSA_STATO_ADE")
	private Long idReportSsaStatoAde;

	@Column(name = "ID_RIC_ESTRAZIONE_UFFICIALE")
	private Long idRicEstrazioneUfficiale;

	@Column(name = "ID_RIC_IMPRONTA_ARCHIVIO")
	private Long idRicImprontaArchivio;

	@Column(name = "ID_SEDIA")
	private Long idSedia;

	@Column(name = "ID_SUPPORTO")
	private Long idSupporto;

	@Column(name = "ID_UTENTE_AMMINISTRAZIONE")
	private Long idUtenteAmministrazione;

	@Column(name = "PG_VERSIONE_LOTTO")
	private Long pgVersioneLotto;

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

	// bi-directional many-to-one association to FatTDizOperazioneLog
	@ManyToOne
	@JoinColumn(name = "ID_OPERAZIONE")
	private FatTDizOperazioneLog dizOperazioneLog;

	public FatTApplicativoLog() {
		super();
	}

	public Long getIdLogApplicativo() {
		return this.idLogApplicativo;
	}

	public void setIdLogApplicativo(Long idLogApplicativo) {
		this.idLogApplicativo = idLogApplicativo;
	}

	public String getCdIndirizzoIp() {
		return this.cdIndirizzoIp;
	}

	public void setCdIndirizzoIp(String cdIndirizzoIp) {
		this.cdIndirizzoIp = cdIndirizzoIp;
	}

	public Date getDtDataOperazione() {
		return this.dtDataOperazione;
	}

	public void setDtDataOperazione(Date dtDataOperazione) {
		this.dtDataOperazione = dtDataOperazione;
	}

	public Long getIdAdesione() {
		return this.idAdesione;
	}

	public void setIdAdesione(Long idAdesione) {
		this.idAdesione = idAdesione;
	}

	public Long getIdArchivio() {
		return this.idArchivio;
	}

	public void setIdArchivio(Long idArchivio) {
		this.idArchivio = idArchivio;
	}

	public Long getIdDettaglioLinea() {
		return this.idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}

	public Long getIdExcelFattura() {
		return this.idExcelFattura;
	}

	public void setIdExcelFattura(Long idExcelFattura) {
		this.idExcelFattura = idExcelFattura;
	}

	public Long getIdFattura() {
		return this.idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public Long getIdLotto() {
		return this.idLotto;
	}

	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}

	public Long getIdNotifica() {
		return this.idNotifica;
	}

	public void setIdNotifica(Long idNotifica) {
		this.idNotifica = idNotifica;
	}

	public Long getIdReportSsaInviiSdi() {
		return this.idReportSsaInviiSdi;
	}

	public void setIdReportSsaInviiSdi(Long idReportSsaInviiSdi) {
		this.idReportSsaInviiSdi = idReportSsaInviiSdi;
	}

	public Long getIdReportSsaStatoAde() {
		return this.idReportSsaStatoAde;
	}

	public void setIdReportSsaStatoAde(Long idReportSsaStatoAde) {
		this.idReportSsaStatoAde = idReportSsaStatoAde;
	}

	public Long getIdRicEstrazioneUfficiale() {
		return this.idRicEstrazioneUfficiale;
	}

	public void setIdRicEstrazioneUfficiale(Long idRicEstrazioneUfficiale) {
		this.idRicEstrazioneUfficiale = idRicEstrazioneUfficiale;
	}

	public Long getIdRicImprontaArchivio() {
		return this.idRicImprontaArchivio;
	}

	public void setIdRicImprontaArchivio(Long idRicImprontaArchivio) {
		this.idRicImprontaArchivio = idRicImprontaArchivio;
	}

	public Long getIdSedia() {
		return this.idSedia;
	}

	public void setIdSedia(Long idSedia) {
		this.idSedia = idSedia;
	}

	public Long getIdSupporto() {
		return this.idSupporto;
	}

	public void setIdSupporto(Long idSupporto) {
		this.idSupporto = idSupporto;
	}

	public Long getIdUtenteAmministrazione() {
		return this.idUtenteAmministrazione;
	}

	public void setIdUtenteAmministrazione(Long idUtenteAmministrazione) {
		this.idUtenteAmministrazione = idUtenteAmministrazione;
	}

	public Long getPgVersioneLotto() {
		return this.pgVersioneLotto;
	}

	public void setPgVersioneLotto(Long pgVersioneLotto) {
		this.pgVersioneLotto = pgVersioneLotto;
	}

	public Date getTsInserimento() {
		return this.tsInserimento;
	}

	public void setTsInserimento(Date tsInserimento) {
		this.tsInserimento = tsInserimento;
	}


	/**
	 * @return the nmUtenteInserimento
	 */
	public String getNmUtenteInserimento() {
		return nmUtenteInserimento;
	}

	/**
	 * @param nmUtenteInserimento the nmUtenteInserimento to set
	 */
	public void setNmUtenteInserimento(String nmUtenteInserimento) {
		this.nmUtenteInserimento = nmUtenteInserimento;
	}

	/**
	 * @return the nmUtenteUltimaModifica
	 */
	public String getNmUtenteUltimaModifica() {
		return nmUtenteUltimaModifica;
	}

	/**
	 * @param nmUtenteUltimaModifica the nmUtenteUltimaModifica to set
	 */
	public void setNmUtenteUltimaModifica(String nmUtenteUltimaModifica) {
		this.nmUtenteUltimaModifica = nmUtenteUltimaModifica;
	}

	/**
	 * @return the tsUltimaModifica
	 */
	public Date getTsUltimaModifica() {
		return tsUltimaModifica;
	}

	/**
	 * @param tsUltimaModifica the tsUltimaModifica to set
	 */
	public void setTsUltimaModifica(Date tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}

	public FatTDizOperazioneLog getDizOperazioneLog() {
		return this.dizOperazioneLog;
	}

	public void setDizOperazioneLog(FatTDizOperazioneLog fatTDizOperazioneLog) {
		this.dizOperazioneLog = fatTDizOperazioneLog;
	}

	
	public Serializable getPrimaryKey() {
		return this.idLogApplicativo;
	}

}