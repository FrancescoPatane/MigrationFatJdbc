package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;



/**
 * The persistent class for the FAT_T_MONITOR_INVIO_SDI database table.
 * 
 */
@Entity
@Table(name="FAT_T_MONITOR_INVIO_SDI")
public class FatTMonitorInvioSdi implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_MONITOR_INVIO_SDI_IDMONITORAGGIOINVIOSDI_GENERATOR", sequenceName = "SEQ_ID_MONITORAGGIO_INVIO_SDI", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_MONITOR_INVIO_SDI_IDMONITORAGGIOINVIOSDI_GENERATOR")
	@Column(name="ID_MONITORAGGIO_INVIO_SDI")
	private Long idMonitoraggioInvioSdi;

	@Column(name="CD_IDENTIFICATIVO_SDI_ARCHIVIO")
	
	private String cdIdentificativoSdiArchivio;

	@Column(name="CD_IDENTIFICATIVO_SDI_LOTTO")
	
	private String cdIdentificativoSdiLotto;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_INVIO")
	
	private Date dtDataOraInvio;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_RICEZIONE")
	
	private Date dtDataOraRicezione;

	@Column(name="NM_UTENTE_INSERIMENTO")
	
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	
	private String nmUtenteUltimaModifica;

	@Lob
	@Column(name="OJ_LOG")
	
	private String ojLog;

	@Column(name="PG_VERSIONE_LOTTO")
	private BigDecimal pgVersioneLotto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatAStatoArchivio
	@OneToMany(mappedBy="monitorInvioSdi")
	private List<FatAStatoArchivio> listStatoArchivio;

	//bi-directional many-to-one association to FatAStatoLottoFattura
	@OneToMany(mappedBy="monitorInvioSdi")
	private List<FatAStatoLottoFattura> listStatoLottoFattura;

	//bi-directional many-to-one association to FatTDizEsitoInvio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ESITO_INVIO")
	private FatTDizEsitoInvio dizEsitoInvio;

	//bi-directional many-to-one association to FatTDizTipElementoInviato
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_TIPO_ELEMENTO_INVIATO")
	private FatTDizTipElementoInviato dizTipElementoInviato;

	//bi-directional many-to-one association to FatTArchivio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ARCHIVIO")
	private FatTArchivio archivio;

	//bi-directional many-to-one association to FatTLotto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_LOTTO")
	private FatTLotto lotto;
	
	@Transient
	private Date dataInvioTo;
	
	/** The partita iva fornitore. */
	@Transient
	private String partitaIvaFornitore;
	
	/** The denominazione fornitore. */
	@Transient
	private String denominazioneFornitore;
	
	/** The nome fornitore. */
	@Transient
	private String nomeFornitore;
	
	/** The cognome fornitore. */
	@Transient
	private String cognomeFornitore;

	public FatTMonitorInvioSdi() {
	}

	public Long getIdMonitoraggioInvioSdi() {
		return this.idMonitoraggioInvioSdi;
	}

	public void setIdMonitoraggioInvioSdi(Long idMonitoraggioInvioSdi) {
		this.idMonitoraggioInvioSdi = idMonitoraggioInvioSdi;
	}

	public String getCdIdentificativoSdiArchivio() {
		return this.cdIdentificativoSdiArchivio;
	}

	public void setCdIdentificativoSdiArchivio(String cdIdentificativoSdiArchivio) {
		this.cdIdentificativoSdiArchivio = cdIdentificativoSdiArchivio;
	}

	public String getCdIdentificativoSdiLotto() {
		return this.cdIdentificativoSdiLotto;
	}

	public void setCdIdentificativoSdiLotto(String cdIdentificativoSdiLotto) {
		this.cdIdentificativoSdiLotto = cdIdentificativoSdiLotto;
	}

	public Date getDtDataOraInvio() {
		return this.dtDataOraInvio;
	}

	public void setDtDataOraInvio(Date dtDataOraInvio) {
		this.dtDataOraInvio = dtDataOraInvio;
	}

	public Date getDtDataOraRicezione() {
		return this.dtDataOraRicezione;
	}

	public void setDtDataOraRicezione(Date dtDataOraRicezione) {
		this.dtDataOraRicezione = dtDataOraRicezione;
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

	public List<FatAStatoArchivio> getListStatoArchivio() {
		return this.listStatoArchivio;
	}

	public void setListStatoArchivio(List<FatAStatoArchivio> listStatoArchivio) {
		this.listStatoArchivio = listStatoArchivio;
	}

	public FatAStatoArchivio addFatAStatoArchivio(FatAStatoArchivio fatAStatoArchivio) {
		getListStatoArchivio().add(fatAStatoArchivio);
		fatAStatoArchivio.setMonitorInvioSdi(this);

		return fatAStatoArchivio;
	}

	public FatAStatoArchivio removeFatAStatoArchivio(FatAStatoArchivio fatAStatoArchivio) {
		getListStatoArchivio().remove(fatAStatoArchivio);
		fatAStatoArchivio.setMonitorInvioSdi(null);

		return fatAStatoArchivio;
	}

	public List<FatAStatoLottoFattura> getListStatoLottoFattura() {
		return this.listStatoLottoFattura;
	}

	public void setListStatoLottoFattura(List<FatAStatoLottoFattura> listStatoLottoFattura) {
		this.listStatoLottoFattura = listStatoLottoFattura;
	}

	public FatAStatoLottoFattura addFatAStatoLottoFattura(FatAStatoLottoFattura fatAStatoLottoFattura) {
		getListStatoLottoFattura().add(fatAStatoLottoFattura);
		fatAStatoLottoFattura.setMonitorInvioSdi(this);

		return fatAStatoLottoFattura;
	}

	public FatAStatoLottoFattura removeFatAStatoLottoFattura(FatAStatoLottoFattura fatAStatoLottoFattura) {
		getListStatoLottoFattura().remove(fatAStatoLottoFattura);
		fatAStatoLottoFattura.setMonitorInvioSdi(null);

		return fatAStatoLottoFattura;
	}

	public FatTDizEsitoInvio getDizEsitoInvio() {
		return this.dizEsitoInvio;
	}

	public void setDizEsitoInvio(FatTDizEsitoInvio dizEsitoInvio) {
		this.dizEsitoInvio = dizEsitoInvio;
	}

	public FatTDizTipElementoInviato getDizTipElementoInviato() {
		return this.dizTipElementoInviato;
	}

	public void setDizTipElementoInviato(FatTDizTipElementoInviato dizTipElementoInviato) {
		this.dizTipElementoInviato = dizTipElementoInviato;
	}

	public FatTArchivio getArchivio() {
		return this.archivio;
	}

	public void setArchivio(FatTArchivio archivio) {
		this.archivio = archivio;
	}

	public FatTLotto getLotto() {
		return this.lotto;
	}

	public void setLotto(FatTLotto lotto) {
		this.lotto = lotto;
	}

	public Serializable getPrimaryKey() {
		return this.idMonitoraggioInvioSdi;
	}

	public Date getDataInvioTo() {
		return dataInvioTo;
	}

	public void setDataInvioTo(Date dataInvioTo) {
		this.dataInvioTo = dataInvioTo;
	}

	public String getPartitaIvaFornitore() {
		return partitaIvaFornitore;
	}

	public void setPartitaIvaFornitore(String partitaIvaFornitore) {
		this.partitaIvaFornitore = partitaIvaFornitore;
	}

	public String getDenominazioneFornitore() {
		return denominazioneFornitore;
	}

	public void setDenominazioneFornitore(String denominazioneFornitore) {
		this.denominazioneFornitore = denominazioneFornitore;
	}

	public String getNomeFornitore() {
		return nomeFornitore;
	}

	public void setNomeFornitore(String nomeFornitore) {
		this.nomeFornitore = nomeFornitore;
	}

	public String getCognomeFornitore() {
		return cognomeFornitore;
	}

	public void setCognomeFornitore(String cognomeFornitore) {
		this.cognomeFornitore = cognomeFornitore;
	}

	public String getOjLog() {
		return ojLog;
	}

	public void setOjLog(String ojLog) {
		this.ojLog = ojLog;
	}


}