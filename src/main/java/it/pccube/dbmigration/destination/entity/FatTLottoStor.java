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



/**
 * The persistent class for the FAT_T_LOTTO_STOR database table.
 * 
 */
@Entity
@Table(name="FAT_T_LOTTO_STOR")
public class FatTLottoStor implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_LOTTO_STOR_IDLOTTOSTOR_GENERATOR",sequenceName="SEQ_ID_LOTTO_STO",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_LOTTO_STOR_IDLOTTOSTOR_GENERATOR")
	@Column(name="ID_LOTTO_STOR")
	private Long idLottoStor;

	@Column(name="CD_CAP_SEDE_CEDENTE")
	
	private String cdCapSedeCedente;

	@Column(name="CD_CAP_SEDE_CESSIONARIO")
	
	private String cdCapSedeCessionario;

	@Column(name="CD_CAP_STABILE_CEDENTE")
	
	private String cdCapStabileCedente;

	@Column(name="CD_CAP_STABILE_CESSIONARIO")
	
	private String cdCapStabileCessionario;

	@Column(name="CD_CODICE_FISCALE_CEDENTE")
	
	private String cdCfCedente;

	@Column(name="CD_CIVICO_STABILE_CESSIONARIO")
	
	private String cdCivicoStabileCessionario;

	@Column(name="CD_COD_EORI_CEDENTE")
	
	private String cdCodEoriCedente;

	@Column(name="CD_COD_EORI_CESSIONARIO")
	
	private String cdCodEoriCessionario;

	@Column(name="CD_COD_EORI_RAP_FISCALE")
	
	private String cdCodEoriRapFiscale;

	@Column(name="CD_COD_EORI_TERZO_INT")
	
	private String cdCodEoriTerzoInt;

	@Column(name="CD_CODICE_RAP_FISCALE_CES")
	
	private String cdCodRapFiscaleCes;

	@Column(name="CD_CODICE_CEDENTE")
	
	private String cdCodiceCedente;

	@Column(name="CD_CODICE_CESSIONARIO")
	
	private String cdCodiceCessionario;

	@Column(name="CD_CODICE_DESTINATARIO")
	
	private String cdCodiceDestinatario;

	@Column(name="CD_CODICE_FISCALE_CESSIONARIO")
	
	private String cdCodiceFiscaleCessionario;

	@Column(name="CD_CODICE_FISCALE_RAP_FISCALE")
	
	private String cdCodiceFiscaleRapFiscale;

	@Column(name="CD_CODICE_FISCALE_TERZO_INT")
	
	private String cdCodiceFiscaleTerzoInt;

	@Column(name="CD_CODICE_RAP_FISCALE")
	
	private String cdCodiceRapFiscale;

	@Column(name="CD_CODICE_TERZO_INT")
	
	private String cdCodiceTerzoInt;

	@Column(name="CD_CODICE_TRASMITTENTE")
	
	private String cdCodiceTrasmittente;

	@Column(name="CD_FAX_CEDENTE")
	
	private String cdFaxCedente;

	@Column(name="CD_FORMATO_TRASMISSIONE")
	
	private String cdFormatoTrasmissione;

	@Column(name="CD_HASH_XML_FIRMATO")
	
	private String cdHashXmlFirmato;

	@Column(name="CD_IDENTIFICATIVO_SDI_LOTTO")
	
	private String cdIdentificativoSdiLotto;

	@Column(name="NM_INDIRIZZO_STABILE_CEDENTE")
	
	private String nmIndirizzoStabileCedente;

	@Column(name="CD_NUM_CIVICO_SEDE_CESSIONARIO")
	
	private String cdNumCivicoSedeCessionario;

	@Column(name="CD_NUM_CIVICO_STABILE_CEDENTE")
	
	private String cdNumCivicoStabileCedente;

	@Column(name="CD_NUM_ISCRIZIONE_ALBO_CEDENTE")
	
	private String cdNumIscrizioneAlboCedente;

	@Column(name="CD_NUMERO_CIVICO_SEDE_CEDENTE")
	
	private String cdNumeroCivicoSedeCedente;

	@Column(name="CD_NUMERO_REA_CEDENTE")
	
	private String cdNumeroReaCedente;

	@Column(name="CD_PAESE_TRASMITTENTE")
	
	private String cdPaeseTrasmittente;

	@Column(name="CD_PROGRESSIVO_INVIO")
	
	private String cdProgressivoInvio;

	@Column(name="CD_RIF_AMMINISTRAZIONE_CEDENTE")
	
	private String cdRifAmministrazioneCedente;

	@Column(name="CD_TELEFONO_CEDENTE")
	
	private String cdTelefonoCedente;

	@Column(name="CD_TELEFONO_TRASMITTENTE")
	
	private String cdTelefonoTrasmittente;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ISCR_ALBO_CEDENTE")
	
	private Date dtDataIscrAlboCedente;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_PRIMA_CREAZIONE")
	
	private Date dtDataOraPrimaCreazione;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_RICEZIONE")
	
	private Date dtDataOraRicezione;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_ULTIMA_MODIFICA")
	
	private Date dtDataOraUltimaModifica;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_ULTIMO_INVIO_SDI")
	
	private Date dtDataOraUltimoInvioSdi;

	@Column(name="FL_DA_STORICIZZARE")
	
	private Boolean flDaStoricizzare;

	@Column(name="FL_ESITO_VERIFICA_FIRMA")
	
	private Boolean flEsitoVerificaFirma;

	@Column(name="FL_FTP")
	
	private Boolean flFtp;

	@Column(name="FL_VERIFICA_FIRMA")
	
	private Boolean flVerificaFirma;

	@Column(name="ID_COMUNE_SEDE_CEDENTE")
	private Long idComuneSedeCedente;

	@Column(name="ID_COMUNE_SEDE_CESSIONARIO")
	private Long idComuneSedeCessionario;

	@Column(name="ID_COMUNE_STABILE_CEDENTE")
	private Long idComuneStabileCedente;

	@Column(name="ID_COMUNE_STABILE_CESSIONARIO")
	private Long idComuneStabileCessionario;

	@Column(name="ID_NAZIONE_SEDE_CEDENTE")
	private Long idNazioneSedeCedente;

	@Column(name="ID_NAZIONE_SEDE_CESSIONARIO")
	private Long idNazioneSedeCessionario;

	@Column(name="ID_NAZIONE_STABILE_CEDENTE")
	private Long idNazioneStabileCedente;

	@Column(name="ID_NAZIONE_STABILE_CESSIONARIO")
	private Long idNazioneStabileCessionario;

	@Column(name="ID_PAESE_CEDENTE")
	private Long idPaeseCedente;

	@Column(name="ID_PAESE_CESSIONARIO")
	private Long idPaeseCessionario;

	@Column(name="ID_PAESE_RAP_FISCALE")
	private Long idPaeseRapFiscale;

	@Column(name="ID_PAESE_RAP_FISCALE_CES")
	private Long idPaeseRapFiscaleCes;

	@Column(name="ID_PAESE_TERZO_INT")
	private Long idPaeseTerzoInt;

	@Column(name="ID_PROVINCIA_ALBO_CEDENTE")
	private Long idProvinciaAlboCedente;

	@Column(name="ID_PROVINCIA_SEDE_CEDENTE")
	private Long idProvinciaSedeCedente;

	@Column(name="ID_PROVINCIA_SEDE_CESSIONARIO")
	private Long idProvinciaSedeCessionario;

	@Column(name="ID_PROVINCIA_STABILE_CEDENTE")
	private Long idProvinciaStabileCedente;

	@Column(name="ID_PROVINCIA_STABILE_CES")
	private Long idProvinciaStabileCes;

	@Column(name="ID_REGIONE_ALBO_CEDENTE")
	private Long idRegioneAlboCedente;

	@Column(name="ID_REGIONE_REA_CEDENTE")
	private Long idRegioneReaCedente;

	@Column(name="ID_REGIONE_SEDE_CEDENTE")
	private Long idRegioneSedeCedente;

	@Column(name="ID_REGIONE_SEDE_CESSIONARIO")
	private Long idRegioneSedeCessionario;

	@Column(name="ID_REGIONE_STABILE_CEDENTE")
	private Long idRegioneStabileCedente;

	@Column(name="ID_REGIONE_STABILE_CESSIONARIO")
	private Long idRegioneStabileCessionario;

	@Column(name="ID_SEDIA_ASSEGNATARIO")
	private Long idSediaAssegnatario;

	@Column(name="ID_SEDIA_CREATORE")
	private Long idSediaCreatore;

	@Column(name="ID_SEDIA_ULTIMA_MOD")
	private Long idSediaUltimaMod;

	@Column(name="ID_UFFICIO_REA_CEDENTE")
	private Long idUfficioReaCedente;

	@Column(name="IM_CAPITALE_SOCIALE_CEDENTE")
	
	private BigDecimal imCapitaleSocialeCedente;

	@Column(name="NM_ALBO_PROFESSIONALE_CEDENTE")
	
	private String nmAlboProfessionaleCedente;

	@Column(name="NM_COGNOME_CEDENTE")
	
	private String nmCognomeCedente;

	@Column(name="NM_COGNOME_CESSIONARIO")
	
	private String nmCognomeCessionario;

	@Column(name="NM_COGNOME_RAP_FISCALE")
	
	private String nmCognomeRapFiscale;

	@Column(name="NM_COGNOME_RAP_FISCALE_CES")
	
	private String nmCognomeRapFiscaleCes;

	@Column(name="NM_COGNOME_TERZO_INT")
	
	private String nmCognomeTerzoInt;

	@Column(name="NM_COMUNE_SEDE_CEDENTE_EST")
	
	private String nmComuneSedeCedenteEst;

	@Column(name="NM_COMUNE_SEDE_CESSIONARIO_EST")
	
	private String nmComuneSedeCessionarioEst;

	@Column(name="NM_COMUNE_STABILE_CEDENTE_EST")
	
	private String nmComuneStabileCedenteEst;

	@Column(name="NM_COMUNE_STABILE_CES_EST")
	
	private String nmComuneStabileCesEst;

	@Column(name="NM_CONTENT_TYPE_XML_FIRMATO")
	
	private String nmContentTypeXmlFirmato;

	@Column(name="NM_DENOMINAZIONE_CEDENTE")
	
	private String nmDenominazioneCedente;

	@Column(name="NM_DENOMINAZIONE_CESSIONARIO")
	
	private String nmDenominazioneCessionario;

	@Column(name="NM_DENOMINAZIONE_RAP_FISC_CES")
	
	private String nmDenominazioneRapFiscCes;

	@Column(name="NM_DENOMINAZIONE_RAP_FISCALE")
	
	private String nmDenominazioneRapFiscale;

	@Column(name="NM_DENOMINAZIONE_TERZO_INT")
	
	private String nmDenominazioneTerzoInt;

	@Column(name="NM_EMAIL_CEDENTE")
	
	private String nmEmailCedente;

	@Column(name="NM_EMAIL_TRASMITTENTE")
	
	private String nmEmailTrasmittente;

	@Column(name="NM_INDIRIZZO_SEDE_CEDENTE")
	
	private String nmIndirizzoSedeCedente;

	@Column(name="NM_INDIRIZZO_SEDE_CESSIONARIO")
	
	private String nmIndirizzoSedeCessionario;
	
	@Column(name="NM_INDIRIZZO_STABILE_CES")
	
	private String nmIndirizzoStabileCessionario;	

	@Column(name="NM_NOME_CEDENTE")
	
	private String nmNomeCedente;

	@Column(name="NM_NOME_CESSIONARIO")
	
	private String nmNomeCessionario;

	@Column(name="NM_NOME_RAP_FISCALE")
	
	private String nmNomeRapFiscale;

	@Column(name="NM_NOME_RAP_FISCALE_CES")
	
	private String nmNomeRapFiscaleCes;

	@Column(name="NM_NOME_TERZO_INT")
	
	private String nmNomeTerzoInt;

	@Column(name="NM_NOME_XML_FIRMATO")
	
	private String nmNomeXmlFirmato;

	@Column(name="NM_NOME_XML_NON_FIRMATO")
	
	private String nmNomeXmlNonFirmato;

	@Column(name="NM_PEC_DESTINATARIO")
	
	private String nmPecDestinatario;

	@Column(name="NM_TICKET_CONSERVAZIONE")
	
	private String nmTicketConservazione;

	@Column(name="NM_TITOLO_CEDENTE")
	
	private String nmTitoloCedente;

	@Column(name="NM_TITOLO_CESSIONARIO")
	
	private String nmTitoloCessionario;

	@Column(name="NM_TITOLO_RAP_FISCALE")
	
	private String nmTitoloRapFiscale;

	@Column(name="NM_TITOLO_TERZO_INT")
	
	private String nmTitoloTerzoInt;

	@Column(name="NM_UTENTE_INSERIMENTO")
	
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	
	private String nmUtenteUltimaModifica;

	@Column(name="ID_XML_FIRMATO")
	
	private String idXmlFirmato;

	@Column(name="ID_XML_NON_FIRMATO")
	
	private String idXmlNonFirmato;

	@Column(name="QT_SIZE_XML_FIRMATO")
	
	private BigDecimal qtSizeXmlFirmato;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	
	private Date tsUltimaModifica;

	@Column(name="FL_LOTTO_EU")
	private Boolean flLottoEu;
	
	//bi-directional many-to-one association to FatTCompSezioneStor
	@OneToMany(mappedBy="lottoStor")
	private List<FatTCompSezioneStor> listCompSezioneStor;

	//bi-directional many-to-one association to FatTFatturaStor
	@OneToMany(mappedBy="lottoStor")
	private List<FatTFatturaStor> listFatturaStor;

	//bi-directional many-to-one association to FatTDizSocioUnico
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_SOCIO_UNICO_CEDENTE")
	private FatTDizSocioUnico dizSocioUnico;

	//bi-directional many-to-one association to FatTDizSoggettoEmittente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_SOGGETTO_EMITTENTE")
	private FatTDizSoggettoEmittente dizSoggettoEmittente;
	//bi-directional many-to-one association to FatTDizStatoLiquidazione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_STATO_LIQUIDAZ_CEDENTE")
	private FatTDizStatoLiquidazione dizStatoLiquidazione;
	//bi-directional many-to-one association to FatTDizStatoLottoFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_STATO_LOTTO_FATTURA")
	private FatTDizStatoLottoFattura dizStatoLottoFattura;

	//bi-directional many-to-one association to FatTDizTipoDestinatario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_TIPOLOGIA_DESTINATARIO")
	private FatTDizTipoDestinatario dizTipoDestinatario;
	//bi-directional many-to-one association to FatTDizEsitoInvio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ESITO_INVIO")
	private FatTDizEsitoInvio dizEsitoInvio;

	//bi-directional many-to-one association to FatTDizRegimeFiscale
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_REGIME_FISCALE_CEDENTE")
	private FatTDizRegimeFiscale dizRegimeFiscale;

	//bi-directional many-to-one association to FatTAdesione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ADESIONE")
	private FatTAdesione adesione;

	//bi-directional many-to-one association to FatTLotto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_LOTTO")
	private FatTLotto lotto;

	public FatTLottoStor() {
	}

	public Long getIdLottoStor() {
		return this.idLottoStor;
	}

	public void setIdLottoStor(Long idLottoStor) {
		this.idLottoStor = idLottoStor;
	}

	public String getNmAlboProfessionaleCedente() {
		return this.nmAlboProfessionaleCedente;
	}

	public void setNmAlboProfessionaleCedente(String nmAlboProfessionaleCedente) {
		this.nmAlboProfessionaleCedente = nmAlboProfessionaleCedente;
	}

	public String getCdCapSedeCedente() {
		return this.cdCapSedeCedente;
	}

	public void setCdCapSedeCedente(String cdCapSedeCedente) {
		this.cdCapSedeCedente = cdCapSedeCedente;
	}

	public String getCdCapSedeCessionario() {
		return this.cdCapSedeCessionario;
	}

	public void setCdCapSedeCessionario(String cdCapSedeCessionario) {
		this.cdCapSedeCessionario = cdCapSedeCessionario;
	}

	public String getCdCapStabileCedente() {
		return this.cdCapStabileCedente;
	}

	public void setCdCapStabileCedente(String cdCapStabileCedente) {
		this.cdCapStabileCedente = cdCapStabileCedente;
	}

	public String getCdCapStabileCessionario() {
		return this.cdCapStabileCessionario;
	}

	public void setCdCapStabileCessionario(String cdCapStabileCessionario) {
		this.cdCapStabileCessionario = cdCapStabileCessionario;
	}

	public String getCdCivicoStabileCessionario() {
		return this.cdCivicoStabileCessionario;
	}

	public void setCdCivicoStabileCessionario(String cdCivicoStabileCessionario) {
		this.cdCivicoStabileCessionario = cdCivicoStabileCessionario;
	}

	public String getCdCodEoriCedente() {
		return this.cdCodEoriCedente;
	}

	public void setCdCodEoriCedente(String cdCodEoriCedente) {
		this.cdCodEoriCedente = cdCodEoriCedente;
	}

	public String getCdCodEoriCessionario() {
		return this.cdCodEoriCessionario;
	}

	public void setCdCodEoriCessionario(String cdCodEoriCessionario) {
		this.cdCodEoriCessionario = cdCodEoriCessionario;
	}

	public String getCdCodEoriRapFiscale() {
		return this.cdCodEoriRapFiscale;
	}

	public void setCdCodEoriRapFiscale(String cdCodEoriRapFiscale) {
		this.cdCodEoriRapFiscale = cdCodEoriRapFiscale;
	}

	public String getCdCodEoriTerzoInt() {
		return this.cdCodEoriTerzoInt;
	}

	public void setCdCodEoriTerzoInt(String cdCodEoriTerzoInt) {
		this.cdCodEoriTerzoInt = cdCodEoriTerzoInt;
	}

	public String getCdCodiceCedente() {
		return this.cdCodiceCedente;
	}

	public void setCdCodiceCedente(String cdCodiceCedente) {
		this.cdCodiceCedente = cdCodiceCedente;
	}

	public String getCdCodiceCessionario() {
		return this.cdCodiceCessionario;
	}

	public void setCdCodiceCessionario(String cdCodiceCessionario) {
		this.cdCodiceCessionario = cdCodiceCessionario;
	}

	public String getCdCodiceDestinatario() {
		return this.cdCodiceDestinatario;
	}

	public void setCdCodiceDestinatario(String cdCodiceDestinatario) {
		this.cdCodiceDestinatario = cdCodiceDestinatario;
	}

	public String getCdCodiceFiscaleCessionario() {
		return this.cdCodiceFiscaleCessionario;
	}

	public void setCdCodiceFiscaleCessionario(String cdCodiceFiscaleCessionario) {
		this.cdCodiceFiscaleCessionario = cdCodiceFiscaleCessionario;
	}

	public String getCdCodiceFiscaleRapFiscale() {
		return this.cdCodiceFiscaleRapFiscale;
	}

	public void setCdCodiceFiscaleRapFiscale(String cdCodiceFiscaleRapFiscale) {
		this.cdCodiceFiscaleRapFiscale = cdCodiceFiscaleRapFiscale;
	}

	public String getCdCodiceFiscaleTerzoInt() {
		return this.cdCodiceFiscaleTerzoInt;
	}

	public void setCdCodiceFiscaleTerzoInt(String cdCodiceFiscaleTerzoInt) {
		this.cdCodiceFiscaleTerzoInt = cdCodiceFiscaleTerzoInt;
	}

	public String getCdCodiceRapFiscale() {
		return this.cdCodiceRapFiscale;
	}

	public void setCdCodiceRapFiscale(String cdCodiceRapFiscale) {
		this.cdCodiceRapFiscale = cdCodiceRapFiscale;
	}

	public String getCdCodRapFiscaleCes() {
		return this.cdCodRapFiscaleCes;
	}

	public void setCdCodRapFiscaleCes(String cdCodRapFiscaleCes) {
		this.cdCodRapFiscaleCes = cdCodRapFiscaleCes;
	}

	public String getCdCodiceTerzoInt() {
		return this.cdCodiceTerzoInt;
	}

	public void setCdCodiceTerzoInt(String cdCodiceTerzoInt) {
		this.cdCodiceTerzoInt = cdCodiceTerzoInt;
	}

	public String getCdCodiceTrasmittente() {
		return this.cdCodiceTrasmittente;
	}

	public void setCdCodiceTrasmittente(String cdCodiceTrasmittente) {
		this.cdCodiceTrasmittente = cdCodiceTrasmittente;
	}

	public String getCdFaxCedente() {
		return this.cdFaxCedente;
	}

	public void setCdFaxCedente(String cdFaxCedente) {
		this.cdFaxCedente = cdFaxCedente;
	}

	public String getCdFormatoTrasmissione() {
		return this.cdFormatoTrasmissione;
	}

	public void setCdFormatoTrasmissione(String cdFormatoTrasmissione) {
		this.cdFormatoTrasmissione = cdFormatoTrasmissione;
	}

	public String getCdHashXmlFirmato() {
		return this.cdHashXmlFirmato;
	}

	public void setCdHashXmlFirmato(String cdHashXmlFirmato) {
		this.cdHashXmlFirmato = cdHashXmlFirmato;
	}

	public String getCdIdentificativoSdiLotto() {
		return this.cdIdentificativoSdiLotto;
	}

	public void setCdIdentificativoSdiLotto(String cdIdentificativoSdiLotto) {
		this.cdIdentificativoSdiLotto = cdIdentificativoSdiLotto;
	}

	public String getCdNumCivicoSedeCessionario() {
		return this.cdNumCivicoSedeCessionario;
	}

	public void setCdNumCivicoSedeCessionario(String cdNumCivicoSedeCessionario) {
		this.cdNumCivicoSedeCessionario = cdNumCivicoSedeCessionario;
	}

	public String getCdNumCivicoStabileCedente() {
		return this.cdNumCivicoStabileCedente;
	}

	public void setCdNumCivicoStabileCedente(String cdNumCivicoStabileCedente) {
		this.cdNumCivicoStabileCedente = cdNumCivicoStabileCedente;
	}

	public String getCdNumIscrizioneAlboCedente() {
		return this.cdNumIscrizioneAlboCedente;
	}

	public void setCdNumIscrizioneAlboCedente(String cdNumIscrizioneAlboCedente) {
		this.cdNumIscrizioneAlboCedente = cdNumIscrizioneAlboCedente;
	}

	public String getCdNumeroCivicoSedeCedente() {
		return this.cdNumeroCivicoSedeCedente;
	}

	public void setCdNumeroCivicoSedeCedente(String cdNumeroCivicoSedeCedente) {
		this.cdNumeroCivicoSedeCedente = cdNumeroCivicoSedeCedente;
	}

	public String getCdNumeroReaCedente() {
		return this.cdNumeroReaCedente;
	}

	public void setCdNumeroReaCedente(String cdNumeroReaCedente) {
		this.cdNumeroReaCedente = cdNumeroReaCedente;
	}

	public String getCdPaeseTrasmittente() {
		return this.cdPaeseTrasmittente;
	}

	public void setCdPaeseTrasmittente(String cdPaeseTrasmittente) {
		this.cdPaeseTrasmittente = cdPaeseTrasmittente;
	}

	public String getCdProgressivoInvio() {
		return this.cdProgressivoInvio;
	}

	public void setCdProgressivoInvio(String cdProgressivoInvio) {
		this.cdProgressivoInvio = cdProgressivoInvio;
	}

	public String getCdRifAmministrazioneCedente() {
		return this.cdRifAmministrazioneCedente;
	}

	public void setCdRifAmministrazioneCedente(String cdRifAmministrazioneCedente) {
		this.cdRifAmministrazioneCedente = cdRifAmministrazioneCedente;
	}

	public String getCdTelefonoCedente() {
		return this.cdTelefonoCedente;
	}

	public void setCdTelefonoCedente(String cdTelefonoCedente) {
		this.cdTelefonoCedente = cdTelefonoCedente;
	}

	public String getCdTelefonoTrasmittente() {
		return this.cdTelefonoTrasmittente;
	}

	public void setCdTelefonoTrasmittente(String cdTelefonoTrasmittente) {
		this.cdTelefonoTrasmittente = cdTelefonoTrasmittente;
	}

	public Date getDtDataIscrAlboCedente() {
		return this.dtDataIscrAlboCedente;
	}

	public void setDtDataIscrAlboCedente(Date dtDataIscrAlboCedente) {
		this.dtDataIscrAlboCedente = dtDataIscrAlboCedente;
	}

	public Date getDtDataOraPrimaCreazione() {
		return this.dtDataOraPrimaCreazione;
	}

	public void setDtDataOraPrimaCreazione(Date dtDataOraPrimaCreazione) {
		this.dtDataOraPrimaCreazione = dtDataOraPrimaCreazione;
	}

	public Date getDtDataOraRicezione() {
		return this.dtDataOraRicezione;
	}

	public void setDtDataOraRicezione(Date dtDataOraRicezione) {
		this.dtDataOraRicezione = dtDataOraRicezione;
	}

	public Date getDtDataOraUltimaModifica() {
		return this.dtDataOraUltimaModifica;
	}

	public void setDtDataOraUltimaModifica(Date dtDataOraUltimaModifica) {
		this.dtDataOraUltimaModifica = dtDataOraUltimaModifica;
	}

	public Date getDtDataOraUltimoInvioSdi() {
		return this.dtDataOraUltimoInvioSdi;
	}

	public void setDtDataOraUltimoInvioSdi(Date dtDataOraUltimoInvioSdi) {
		this.dtDataOraUltimoInvioSdi = dtDataOraUltimoInvioSdi;
	}

	public Boolean getFlDaStoricizzare() {
		return this.flDaStoricizzare;
	}

	public void setFlDaStoricizzare(Boolean flDaStoricizzare) {
		this.flDaStoricizzare = flDaStoricizzare;
	}

	public Boolean getFlEsitoVerificaFirma() {
		return this.flEsitoVerificaFirma;
	}

	public void setFlEsitoVerificaFirma(Boolean flEsitoVerificaFirma) {
		this.flEsitoVerificaFirma = flEsitoVerificaFirma;
	}

	public Boolean getFlFtp() {
		return this.flFtp;
	}

	public void setFlFtp(Boolean flFtp) {
		this.flFtp = flFtp;
	}

	public Boolean getFlVerificaFirma() {
		return this.flVerificaFirma;
	}

	public void setFlVerificaFirma(Boolean flVerificaFirma) {
		this.flVerificaFirma = flVerificaFirma;
	}

	public Long getIdComuneSedeCedente() {
		return this.idComuneSedeCedente;
	}

	public void setIdComuneSedeCedente(Long idComuneSedeCedente) {
		this.idComuneSedeCedente = idComuneSedeCedente;
	}

	public Long getIdComuneSedeCessionario() {
		return this.idComuneSedeCessionario;
	}

	public void setIdComuneSedeCessionario(Long idComuneSedeCessionario) {
		this.idComuneSedeCessionario = idComuneSedeCessionario;
	}

	public Long getIdComuneStabileCedente() {
		return this.idComuneStabileCedente;
	}

	public void setIdComuneStabileCedente(Long idComuneStabileCedente) {
		this.idComuneStabileCedente = idComuneStabileCedente;
	}

	public Long getIdComuneStabileCessionario() {
		return this.idComuneStabileCessionario;
	}

	public void setIdComuneStabileCessionario(Long idComuneStabileCessionario) {
		this.idComuneStabileCessionario = idComuneStabileCessionario;
	}

	public Long getIdNazioneSedeCedente() {
		return this.idNazioneSedeCedente;
	}

	public void setIdNazioneSedeCedente(Long idNazioneSedeCedente) {
		this.idNazioneSedeCedente = idNazioneSedeCedente;
	}

	public Long getIdNazioneSedeCessionario() {
		return this.idNazioneSedeCessionario;
	}

	public void setIdNazioneSedeCessionario(Long idNazioneSedeCessionario) {
		this.idNazioneSedeCessionario = idNazioneSedeCessionario;
	}

	public Long getIdNazioneStabileCedente() {
		return this.idNazioneStabileCedente;
	}

	public void setIdNazioneStabileCedente(Long idNazioneStabileCedente) {
		this.idNazioneStabileCedente = idNazioneStabileCedente;
	}

	public Long getIdNazioneStabileCessionario() {
		return this.idNazioneStabileCessionario;
	}

	public void setIdNazioneStabileCessionario(Long idNazioneStabileCessionario) {
		this.idNazioneStabileCessionario = idNazioneStabileCessionario;
	}

	public Long getIdPaeseCedente() {
		return this.idPaeseCedente;
	}

	public void setIdPaeseCedente(Long idPaeseCedente) {
		this.idPaeseCedente = idPaeseCedente;
	}

	public Long getIdPaeseCessionario() {
		return this.idPaeseCessionario;
	}

	public void setIdPaeseCessionario(Long idPaeseCessionario) {
		this.idPaeseCessionario = idPaeseCessionario;
	}

	public Long getIdPaeseRapFiscale() {
		return this.idPaeseRapFiscale;
	}

	public void setIdPaeseRapFiscale(Long idPaeseRapFiscale) {
		this.idPaeseRapFiscale = idPaeseRapFiscale;
	}

	public Long getIdPaeseRapFiscaleCes() {
		return this.idPaeseRapFiscaleCes;
	}

	public void setIdPaeseRapFiscaleCes(Long idPaeseRapFiscaleCes) {
		this.idPaeseRapFiscaleCes = idPaeseRapFiscaleCes;
	}

	public Long getIdPaeseTerzoInt() {
		return this.idPaeseTerzoInt;
	}

	public void setIdPaeseTerzoInt(Long idPaeseTerzoInt) {
		this.idPaeseTerzoInt = idPaeseTerzoInt;
	}

	public Long getIdProvinciaAlboCedente() {
		return this.idProvinciaAlboCedente;
	}

	public void setIdProvinciaAlboCedente(Long idProvinciaAlboCedente) {
		this.idProvinciaAlboCedente = idProvinciaAlboCedente;
	}

	public Long getIdProvinciaSedeCedente() {
		return this.idProvinciaSedeCedente;
	}

	public void setIdProvinciaSedeCedente(Long idProvinciaSedeCedente) {
		this.idProvinciaSedeCedente = idProvinciaSedeCedente;
	}

	public Long getIdProvinciaSedeCessionario() {
		return this.idProvinciaSedeCessionario;
	}

	public void setIdProvinciaSedeCessionario(Long idProvinciaSedeCessionario) {
		this.idProvinciaSedeCessionario = idProvinciaSedeCessionario;
	}

	public Long getIdProvinciaStabileCedente() {
		return this.idProvinciaStabileCedente;
	}

	public void setIdProvinciaStabileCedente(Long idProvinciaStabileCedente) {
		this.idProvinciaStabileCedente = idProvinciaStabileCedente;
	}

	public Long getIdProvinciaStabileCes() {
		return this.idProvinciaStabileCes;
	}

	public void setIdProvinciaStabileCes(Long idProvinciaStabileCes) {
		this.idProvinciaStabileCes = idProvinciaStabileCes;
	}

	public Long getIdRegioneAlboCedente() {
		return this.idRegioneAlboCedente;
	}

	public void setIdRegioneAlboCedente(Long idRegioneAlboCedente) {
		this.idRegioneAlboCedente = idRegioneAlboCedente;
	}

	public Long getIdRegioneReaCedente() {
		return this.idRegioneReaCedente;
	}

	public void setIdRegioneReaCedente(Long idRegioneReaCedente) {
		this.idRegioneReaCedente = idRegioneReaCedente;
	}

	public Long getIdRegioneSedeCedente() {
		return this.idRegioneSedeCedente;
	}

	public void setIdRegioneSedeCedente(Long idRegioneSedeCedente) {
		this.idRegioneSedeCedente = idRegioneSedeCedente;
	}

	public Long getIdRegioneSedeCessionario() {
		return this.idRegioneSedeCessionario;
	}

	public void setIdRegioneSedeCessionario(Long idRegioneSedeCessionario) {
		this.idRegioneSedeCessionario = idRegioneSedeCessionario;
	}

	public Long getIdRegioneStabileCedente() {
		return this.idRegioneStabileCedente;
	}

	public void setIdRegioneStabileCedente(Long idRegioneStabileCedente) {
		this.idRegioneStabileCedente = idRegioneStabileCedente;
	}

	public Long getIdRegioneStabileCessionario() {
		return this.idRegioneStabileCessionario;
	}

	public void setIdRegioneStabileCessionario(Long idRegioneStabileCessionario) {
		this.idRegioneStabileCessionario = idRegioneStabileCessionario;
	}

	public Long getIdSediaAssegnatario() {
		return this.idSediaAssegnatario;
	}

	public void setIdSediaAssegnatario(Long idSediaAssegnatario) {
		this.idSediaAssegnatario = idSediaAssegnatario;
	}

	public Long getIdSediaCreatore() {
		return this.idSediaCreatore;
	}

	public void setIdSediaCreatore(Long idSediaCreatore) {
		this.idSediaCreatore = idSediaCreatore;
	}

	public Long getIdSediaUltimaMod() {
		return this.idSediaUltimaMod;
	}

	public void setIdSediaUltimaMod(Long idSediaUltimaMod) {
		this.idSediaUltimaMod = idSediaUltimaMod;
	}

	public Long getIdUfficioReaCedente() {
		return this.idUfficioReaCedente;
	}

	public void setIdUfficioReaCedente(Long idUfficioReaCedente) {
		this.idUfficioReaCedente = idUfficioReaCedente;
	}

	public BigDecimal getImCapitaleSocialeCedente() {
		return this.imCapitaleSocialeCedente;
	}

	public void setImCapitaleSocialeCedente(BigDecimal imCapitaleSocialeCedente) {
		this.imCapitaleSocialeCedente = imCapitaleSocialeCedente;
	}

	public String getNmCognomeCedente() {
		return this.nmCognomeCedente;
	}

	public void setNmCognomeCedente(String nmCognomeCedente) {
		this.nmCognomeCedente = nmCognomeCedente;
	}

	public String getNmCognomeCessionario() {
		return this.nmCognomeCessionario;
	}

	public void setNmCognomeCessionario(String nmCognomeCessionario) {
		this.nmCognomeCessionario = nmCognomeCessionario;
	}

	public String getNmCognomeRapFiscale() {
		return this.nmCognomeRapFiscale;
	}

	public void setNmCognomeRapFiscale(String nmCognomeRapFiscale) {
		this.nmCognomeRapFiscale = nmCognomeRapFiscale;
	}

	public String getNmCognomeRapFiscaleCes() {
		return this.nmCognomeRapFiscaleCes;
	}

	public void setNmCognomeRapFiscaleCes(String nmCognomeRapFiscaleCes) {
		this.nmCognomeRapFiscaleCes = nmCognomeRapFiscaleCes;
	}

	public String getNmCognomeTerzoInt() {
		return this.nmCognomeTerzoInt;
	}

	public void setNmCognomeTerzoInt(String nmCognomeTerzoInt) {
		this.nmCognomeTerzoInt = nmCognomeTerzoInt;
	}

	public String getNmComuneSedeCedenteEst() {
		return this.nmComuneSedeCedenteEst;
	}

	public void setNmComuneSedeCedenteEst(String nmComuneSedeCedenteEst) {
		this.nmComuneSedeCedenteEst = nmComuneSedeCedenteEst;
	}

	public String getNmComuneSedeCessionarioEst() {
		return this.nmComuneSedeCessionarioEst;
	}

	public void setNmComuneSedeCessionarioEst(String nmComuneSedeCessionarioEst) {
		this.nmComuneSedeCessionarioEst = nmComuneSedeCessionarioEst;
	}

	public String getNmComuneStabileCedenteEst() {
		return this.nmComuneStabileCedenteEst;
	}

	public void setNmComuneStabileCedenteEst(String nmComuneStabileCedenteEst) {
		this.nmComuneStabileCedenteEst = nmComuneStabileCedenteEst;
	}

	public String getNmComuneStabileCesEst() {
		return this.nmComuneStabileCesEst;
	}

	public void setNmComuneStabileCesEst(String nmComuneStabileCesEst) {
		this.nmComuneStabileCesEst = nmComuneStabileCesEst;
	}

	public String getNmContentTypeXmlFirmato() {
		return this.nmContentTypeXmlFirmato;
	}

	public void setNmContentTypeXmlFirmato(String nmContentTypeXmlFirmato) {
		this.nmContentTypeXmlFirmato = nmContentTypeXmlFirmato;
	}

	public String getNmDenominazioneCedente() {
		return this.nmDenominazioneCedente;
	}

	public void setNmDenominazioneCedente(String nmDenominazioneCedente) {
		this.nmDenominazioneCedente = nmDenominazioneCedente;
	}

	public String getNmDenominazioneCessionario() {
		return this.nmDenominazioneCessionario;
	}

	public void setNmDenominazioneCessionario(String nmDenominazioneCessionario) {
		this.nmDenominazioneCessionario = nmDenominazioneCessionario;
	}

	public String getNmDenominazioneRapFiscCes() {
		return this.nmDenominazioneRapFiscCes;
	}

	public void setNmDenominazioneRapFiscCes(String nmDenominazioneRapFiscCes) {
		this.nmDenominazioneRapFiscCes = nmDenominazioneRapFiscCes;
	}

	public String getNmDenominazioneRapFiscale() {
		return this.nmDenominazioneRapFiscale;
	}

	public void setNmDenominazioneRapFiscale(String nmDenominazioneRapFiscale) {
		this.nmDenominazioneRapFiscale = nmDenominazioneRapFiscale;
	}

	public String getNmDenominazioneTerzoInt() {
		return this.nmDenominazioneTerzoInt;
	}

	public void setNmDenominazioneTerzoInt(String nmDenominazioneTerzoInt) {
		this.nmDenominazioneTerzoInt = nmDenominazioneTerzoInt;
	}

	public String getNmEmailCedente() {
		return this.nmEmailCedente;
	}

	public void setNmEmailCedente(String nmEmailCedente) {
		this.nmEmailCedente = nmEmailCedente;
	}

	public String getNmEmailTrasmittente() {
		return this.nmEmailTrasmittente;
	}

	public void setNmEmailTrasmittente(String nmEmailTrasmittente) {
		this.nmEmailTrasmittente = nmEmailTrasmittente;
	}

	public String getNmIndirizzoSedeCedente() {
		return this.nmIndirizzoSedeCedente;
	}

	public void setNmIndirizzoSedeCedente(String nmIndirizzoSedeCedente) {
		this.nmIndirizzoSedeCedente = nmIndirizzoSedeCedente;
	}

	public String getNmIndirizzoSedeCessionario() {
		return this.nmIndirizzoSedeCessionario;
	}

	public void setNmIndirizzoSedeCessionario(String nmIndirizzoSedeCessionario) {
		this.nmIndirizzoSedeCessionario = nmIndirizzoSedeCessionario;
	}

	public String getNmIndirizzoStabileCedente() {
		return this.nmIndirizzoStabileCedente;
	}

	public void setNmIndirizzoStabileCedente(String nmIndirizzoStabileCedente) {
		this.nmIndirizzoStabileCedente = nmIndirizzoStabileCedente;
	}

	public String getNmIndirizzoStabileCessionario() {
		return nmIndirizzoStabileCessionario;
	}

	public void setNmIndirizzoStabileCessionario(String nmIndirizzoStabileCessionario) {
		this.nmIndirizzoStabileCessionario = nmIndirizzoStabileCessionario;
	}

	public String getNmNomeCedente() {
		return this.nmNomeCedente;
	}

	public void setNmNomeCedente(String nmNomeCedente) {
		this.nmNomeCedente = nmNomeCedente;
	}

	public String getNmNomeCessionario() {
		return this.nmNomeCessionario;
	}

	public void setNmNomeCessionario(String nmNomeCessionario) {
		this.nmNomeCessionario = nmNomeCessionario;
	}

	public String getNmNomeRapFiscale() {
		return this.nmNomeRapFiscale;
	}

	public void setNmNomeRapFiscale(String nmNomeRapFiscale) {
		this.nmNomeRapFiscale = nmNomeRapFiscale;
	}

	public String getNmNomeRapFiscaleCes() {
		return this.nmNomeRapFiscaleCes;
	}

	public void setNmNomeRapFiscaleCes(String nmNomeRapFiscaleCes) {
		this.nmNomeRapFiscaleCes = nmNomeRapFiscaleCes;
	}

	public String getNmNomeTerzoInt() {
		return this.nmNomeTerzoInt;
	}

	public void setNmNomeTerzoInt(String nmNomeTerzoInt) {
		this.nmNomeTerzoInt = nmNomeTerzoInt;
	}

	public String getNmNomeXmlFirmato() {
		return this.nmNomeXmlFirmato;
	}

	public void setNmNomeXmlFirmato(String nmNomeXmlFirmato) {
		this.nmNomeXmlFirmato = nmNomeXmlFirmato;
	}

	public String getNmNomeXmlNonFirmato() {
		return this.nmNomeXmlNonFirmato;
	}

	public void setNmNomeXmlNonFirmato(String nmNomeXmlNonFirmato) {
		this.nmNomeXmlNonFirmato = nmNomeXmlNonFirmato;
	}

	public String getNmPecDestinatario() {
		return this.nmPecDestinatario;
	}

	public void setNmPecDestinatario(String nmPecDestinatario) {
		this.nmPecDestinatario = nmPecDestinatario;
	}

	public String getNmTicketConservazione() {
		return this.nmTicketConservazione;
	}

	public void setNmTicketConservazione(String nmTicketConservazione) {
		this.nmTicketConservazione = nmTicketConservazione;
	}

	public String getNmTitoloCedente() {
		return this.nmTitoloCedente;
	}

	public void setNmTitoloCedente(String nmTitoloCedente) {
		this.nmTitoloCedente = nmTitoloCedente;
	}

	public String getNmTitoloCessionario() {
		return this.nmTitoloCessionario;
	}

	public void setNmTitoloCessionario(String nmTitoloCessionario) {
		this.nmTitoloCessionario = nmTitoloCessionario;
	}

	public String getNmTitoloRapFiscale() {
		return this.nmTitoloRapFiscale;
	}

	public void setNmTitoloRapFiscale(String nmTitoloRapFiscale) {
		this.nmTitoloRapFiscale = nmTitoloRapFiscale;
	}

	public String getNmTitoloTerzoInt() {
		return this.nmTitoloTerzoInt;
	}

	public void setNmTitoloTerzoInt(String nmTitoloTerzoInt) {
		this.nmTitoloTerzoInt = nmTitoloTerzoInt;
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


	public BigDecimal getQtSizeXmlFirmato() {
		return this.qtSizeXmlFirmato;
	}

	public void setQtSizeXmlFirmato(BigDecimal qtSizeXmlFirmato) {
		this.qtSizeXmlFirmato = qtSizeXmlFirmato;
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

	public List<FatTCompSezioneStor> getListCompSezioneStor() {
		return this.listCompSezioneStor;
	}

	public FatTCompSezioneStor addFatTCompSezioneStor(FatTCompSezioneStor fatTCompSezioneStor) {
		getListCompSezioneStor().add(fatTCompSezioneStor);
		fatTCompSezioneStor.setLottoStor(this);

		return fatTCompSezioneStor;
	}

	public FatTCompSezioneStor removeFatTCompSezioneStor(FatTCompSezioneStor fatTCompSezioneStor) {
		getListCompSezioneStor().remove(fatTCompSezioneStor);
		fatTCompSezioneStor.setLottoStor(null);

		return fatTCompSezioneStor;
	}

	public List<FatTFatturaStor> getListFatturaStor() {
		return this.listFatturaStor;
	}

	public void setListFatturaStor(List<FatTFatturaStor> listFatturaStor) {
		this.listFatturaStor = listFatturaStor;
	}

//	public FatTFatturaStor addFatTFatturaStor(FatTFatturaStor fatTFatturaStor) {
//		getListFatturaStor().add(fatTFatturaStor);
//		fatTFatturaStor.setLottoStor(this);
//
//		return fatTFatturaStor;
//	}
//
//	public FatTFatturaStor removeFatTFatturaStor(FatTFatturaStor fatTFatturaStor) {
//		getListFatturaStor().remove(fatTFatturaStor);
//		fatTFatturaStor.setLottoStor(null);
//
//		return fatTFatturaStor;
//	}

	public FatTDizSocioUnico getDizSocioUnico() {
		return this.dizSocioUnico;
	}

	public void setDizSocioUnico(FatTDizSocioUnico dizSocioUnico) {
		this.dizSocioUnico = dizSocioUnico;
	}

	public FatTDizStatoLottoFattura getDizStatoLottoFattura() {
		return this.dizStatoLottoFattura;
	}

	public void setDizStatoLottoFattura(FatTDizStatoLottoFattura dizStatoLottoFattura) {
		this.dizStatoLottoFattura = dizStatoLottoFattura;
	}

	public FatTDizEsitoInvio getDizEsitoInvio() {
		return this.dizEsitoInvio;
	}

	public void setDizEsitoInvio(FatTDizEsitoInvio dizEsitoInvio) {
		this.dizEsitoInvio = dizEsitoInvio;
	}

	public FatTDizRegimeFiscale getDizRegimeFiscale() {
		return this.dizRegimeFiscale;
	}

	public void setDizRegimeFiscale(FatTDizRegimeFiscale dizRegimeFiscale) {
		this.dizRegimeFiscale = dizRegimeFiscale;
	}

	public FatTDizSoggettoEmittente getDizSoggettoEmittente() {
		return this.dizSoggettoEmittente;
	}

	public void setDizSoggettoEmittente(FatTDizSoggettoEmittente dizSoggettoEmittente) {
		this.dizSoggettoEmittente = dizSoggettoEmittente;
	}

	public FatTDizStatoLiquidazione getDizStatoLiquidazione() {
		return this.dizStatoLiquidazione;
	}

	public void setDizStatoLiquidazione(FatTDizStatoLiquidazione dizStatoLiquidazione) {
		this.dizStatoLiquidazione = dizStatoLiquidazione;
	}

	public FatTDizTipoDestinatario getDizTipoDestinatario() {
		return this.dizTipoDestinatario;
	}

	public void setDizTipoDestinatario(FatTDizTipoDestinatario dizTipoDestinatario) {
		this.dizTipoDestinatario = dizTipoDestinatario;
	}

	public FatTAdesione getAdesione() {
		return this.adesione;
	}

	public void setAdesione(FatTAdesione adesione) {
		this.adesione = adesione;
	}

	public FatTLotto getLotto() {
		return this.lotto;
	}

	public void setLotto(FatTLotto lotto) {
		this.lotto = lotto;
	}

	public Serializable getPrimaryKey() {
		return this.idLottoStor;
	}

	public String getCdCfCedente() {
		return cdCfCedente;
	}

	public void setCdCfCedente(String cdCfCedente) {
		this.cdCfCedente = cdCfCedente;
	}

	public Boolean getFlLottoEu() {
		return flLottoEu;
	}

	public void setFlLottoEu(Boolean flLottoEu) {
		this.flLottoEu = flLottoEu;
	}

	public void setListCompSezioneStor(List<FatTCompSezioneStor> listCompSezioneStor) {
		this.listCompSezioneStor = listCompSezioneStor;
	}

	public String getIdXmlFirmato() {
		return idXmlFirmato;
	}

	public void setIdXmlFirmato(String idXmlFirmato) {
		this.idXmlFirmato = idXmlFirmato;
	}

	public String getIdXmlNonFirmato() {
		return idXmlNonFirmato;
	}

	public void setIdXmlNonFirmato(String idXmlNonFirmato) {
		this.idXmlNonFirmato = idXmlNonFirmato;
	}

}