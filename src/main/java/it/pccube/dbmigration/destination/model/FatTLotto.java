package it.pccube.dbmigration.destination.model;

import java.math.BigDecimal;
import java.util.Date;

public class FatTLotto {
	
	public static final String TABLE_NAME = "FAT_T_LOTTO";
	
	private Long idLotto;

	
	
	private String cdCapSedeCedente;

	
	
	private String cdCapSedeCessionario;

	
	
	private String cdCapStabileCedente;

	
	
	private String cdCapStabileCessionario;

	
	
	private String cdCfCedente;

	
	
	private String cdCivicoStabileCessionario;

	
	
	private String cdCodEoriCedente;

	
	
	private String cdCodEoriCessionario;

	
	
	private String cdCodEoriRapFiscale;

	
	
	private String cdCodEoriTerzoInt;

	
	
	private String cdCodRapFiscaleCes;

	
	
	private String cdCodiceCedente;

	
	
	private String cdCodiceCessionario;

	
	
	private String cdCodiceDestinatario;

	
	
	private String cdCodiceFiscaleCessionario;

	
	
	private String cdCodiceFiscaleRapFiscale;

	
	
	private String cdCodiceFiscaleTerzoInt;

	
	
	private String cdCodiceRapFiscale;

	
	
	private String cdCodiceTerzoInt;

	
	
	private String cdCodiceTrasmittente;

	
	
	private String cdFaxCedente;

	
	
	private String cdFormatoTrasmissione;

	
	
	private String cdHashXmlFirmato;

	
	
	private String cdIdentificativoSdiLotto;

	
	
	private String nmIndirizzoStabileCedente;

	
	
	private String cdNumCivicoSedeCessionario;

	
	
	private String cdNumCivicoStabileCedente;

	
	
	private String cdNumIscrizioneAlboCedente;

	
	
	private String cdNumeroCivicoSedeCedente;

	
	
	private String cdNumeroReaCedente;

	
	
	private String cdPaeseTrasmittente;

	
	
	private String cdProgressivoInvio;

	
	
	private String cdRifAmministrazioneCedente;

	
	
	private String cdTelefonoCedente;

	
	
	private String cdTelefonoTrasmittente;

	
	
	
	private Date dtDataIscrAlboCedente;

	
	
	
	private Date dtDataOraPrimaCreazione;

	
	
	
	private Date dtDataOraRicezione;

	
	
	
	private Date dtDataOraUltimaModifica;

	
	
	
	private Date dtDataOraUltimoInvioSdi;

	
	
	private Boolean flDaStoricizzare;

	
	
	private Boolean flEsitoVerificaFirma;

	
	
	private Boolean flFtp;

	
	
	private Boolean flVerificaFirma;

	
	private Long idComuneSedeCedente;

	
	private Long idComuneSedeCessionario;

	
	private Long idComuneStabileCedente;

	
	private Long idComuneStabileCessionario;

	
	private Long idNazioneSedeCedente;

	
	private Long idNazioneSedeCessionario;

	
	private Long idNazioneStabileCedente;

	
	private Long idNazioneStabileCessionario;

	
	private Long idPaeseCedente;

	
	private Long idPaeseCessionario;

	
	private Long idPaeseRapFiscale;

	
	private Long idPaeseRapFiscaleCes;

	
	private Long idPaeseTerzoInt;

	
	private Long idProvinciaAlboCedente;

	
	private Long idProvinciaSedeCedente;

	
	private Long idProvinciaSedeCessionario;

	
	private Long idProvinciaStabileCedente;

	
	private Long idProvinciaStabileCes;

	
	private Long idRegioneAlboCedente;

	
	private Long idRegioneReaCedente;

	
	private Long idRegioneSedeCedente;

	
	private Long idRegioneSedeCessionario;

	
	private Long idRegioneStabileCedente;

	
	private Long idRegioneStabileCessionario;

	
	private Long idSediaAssegnatario;

	
	private Long idSediaCreatore;

	
	private Long idSediaUltimaMod;

	
	private Long idUfficioReaCedente;

	
	
	private BigDecimal imCapitaleSocialeCedente;

	
	
	private String nmAlboProfessionaleCedente;

	
	
	private String nmCognomeCedente;

	
	
	private String nmCognomeCessionario;

	
	
	private String nmCognomeRapFiscale;

	
	
	private String nmCognomeRapFiscaleCes;

	
	
	private String nmCognomeTerzoInt;

	
	
	private String nmComuneSedeCedenteEst;

	
	
	private String nmComuneSedeCessionarioEst;

	
	
	private String nmComuneStabileCedenteEst;

	
	
	private String nmComuneStabileCesEst;

	
	
	private String nmContentTypeXmlFirmato;

	
	
	private String nmDenominazioneCedente;

	
	
	private String nmDenominazioneCessionario;

	
	
	private String nmDenominazioneRapFiscCes;

	
	
	private String nmDenominazioneRapFiscale;

	
	
	private String nmDenominazioneTerzoInt;

	
	
	private String nmEmailCedente;

	
	
	private String nmEmailTrasmittente;

	
	
	private String nmIndirizStabileCessionario;

	
	
	private String nmIndirizzoSedeCedente;

	
	
	private String nmIndirizzoSedeCessionario;

	
	
	private String nmNomeCedente;

	
	
	private String nmNomeCessionario;

	
	
	private String nmNomeRapFiscale;

	
	
	private String nmNomeRapFiscaleCes;

	
	
	private String nmNomeTerzoInt;

	
	
	private String nmNomeXmlFirmato;

	
	
	private String nmNomeXmlNonFirmato;

	
	
	private String nmPecDestinatario;

	
	
	private String nmTicketConservazione;

	
	
	private String nmTitoloCedente;

	
	
	private String nmTitoloCessionario;

	
	
	private String nmTitoloRapFiscale;

	
	
	private String nmTitoloTerzoInt;

	
	
	private String nmUtenteInserimento;

	
	
	private String nmUtenteUltimaModifica;
	
	
	
	private String idXmlFirmato;

	
	
	private String idXmlNonFirmato;

	
	
	private BigDecimal pgVersioneLotto;

	
	
	private BigDecimal qtSizeXmlFirmato;

	
	
	
	private Date tsInserimento;

	
	
	
	private Date tsUltimaModifica;

	
	
	private Boolean flLottoEu;
	
	
	
	
	private Long idDizSocioUnicoCedente;

	
	
	private Long idDizSoggettoEmittente;
	
	
	private Long idDizStatoLiquidazCedente;

	
	
	private Long idDizStatoLottoFattura;

	
	
	private Long idDizTipologiaDestinatario;

	
	private Long idEsitoInvio;

	
	
	private Long idRegimeFiscaleCedente;

	
	
	private Long idAdesione;



	public Long getIdLotto() {
		return idLotto;
	}



	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}



	public String getCdCapSedeCedente() {
		return cdCapSedeCedente;
	}



	public void setCdCapSedeCedente(String cdCapSedeCedente) {
		this.cdCapSedeCedente = cdCapSedeCedente;
	}



	public String getCdCapSedeCessionario() {
		return cdCapSedeCessionario;
	}



	public void setCdCapSedeCessionario(String cdCapSedeCessionario) {
		this.cdCapSedeCessionario = cdCapSedeCessionario;
	}



	public String getCdCapStabileCedente() {
		return cdCapStabileCedente;
	}



	public void setCdCapStabileCedente(String cdCapStabileCedente) {
		this.cdCapStabileCedente = cdCapStabileCedente;
	}



	public String getCdCapStabileCessionario() {
		return cdCapStabileCessionario;
	}



	public void setCdCapStabileCessionario(String cdCapStabileCessionario) {
		this.cdCapStabileCessionario = cdCapStabileCessionario;
	}



	public String getCdCfCedente() {
		return cdCfCedente;
	}



	public void setCdCfCedente(String cdCfCedente) {
		this.cdCfCedente = cdCfCedente;
	}



	public String getCdCivicoStabileCessionario() {
		return cdCivicoStabileCessionario;
	}



	public void setCdCivicoStabileCessionario(String cdCivicoStabileCessionario) {
		this.cdCivicoStabileCessionario = cdCivicoStabileCessionario;
	}



	public String getCdCodEoriCedente() {
		return cdCodEoriCedente;
	}



	public void setCdCodEoriCedente(String cdCodEoriCedente) {
		this.cdCodEoriCedente = cdCodEoriCedente;
	}



	public String getCdCodEoriCessionario() {
		return cdCodEoriCessionario;
	}



	public void setCdCodEoriCessionario(String cdCodEoriCessionario) {
		this.cdCodEoriCessionario = cdCodEoriCessionario;
	}



	public String getCdCodEoriRapFiscale() {
		return cdCodEoriRapFiscale;
	}



	public void setCdCodEoriRapFiscale(String cdCodEoriRapFiscale) {
		this.cdCodEoriRapFiscale = cdCodEoriRapFiscale;
	}



	public String getCdCodEoriTerzoInt() {
		return cdCodEoriTerzoInt;
	}



	public void setCdCodEoriTerzoInt(String cdCodEoriTerzoInt) {
		this.cdCodEoriTerzoInt = cdCodEoriTerzoInt;
	}



	public String getCdCodRapFiscaleCes() {
		return cdCodRapFiscaleCes;
	}



	public void setCdCodRapFiscaleCes(String cdCodRapFiscaleCes) {
		this.cdCodRapFiscaleCes = cdCodRapFiscaleCes;
	}



	public String getCdCodiceCedente() {
		return cdCodiceCedente;
	}



	public void setCdCodiceCedente(String cdCodiceCedente) {
		this.cdCodiceCedente = cdCodiceCedente;
	}



	public String getCdCodiceCessionario() {
		return cdCodiceCessionario;
	}



	public void setCdCodiceCessionario(String cdCodiceCessionario) {
		this.cdCodiceCessionario = cdCodiceCessionario;
	}



	public String getCdCodiceDestinatario() {
		return cdCodiceDestinatario;
	}



	public void setCdCodiceDestinatario(String cdCodiceDestinatario) {
		this.cdCodiceDestinatario = cdCodiceDestinatario;
	}



	public String getCdCodiceFiscaleCessionario() {
		return cdCodiceFiscaleCessionario;
	}



	public void setCdCodiceFiscaleCessionario(String cdCodiceFiscaleCessionario) {
		this.cdCodiceFiscaleCessionario = cdCodiceFiscaleCessionario;
	}



	public String getCdCodiceFiscaleRapFiscale() {
		return cdCodiceFiscaleRapFiscale;
	}



	public void setCdCodiceFiscaleRapFiscale(String cdCodiceFiscaleRapFiscale) {
		this.cdCodiceFiscaleRapFiscale = cdCodiceFiscaleRapFiscale;
	}



	public String getCdCodiceFiscaleTerzoInt() {
		return cdCodiceFiscaleTerzoInt;
	}



	public void setCdCodiceFiscaleTerzoInt(String cdCodiceFiscaleTerzoInt) {
		this.cdCodiceFiscaleTerzoInt = cdCodiceFiscaleTerzoInt;
	}



	public String getCdCodiceRapFiscale() {
		return cdCodiceRapFiscale;
	}



	public void setCdCodiceRapFiscale(String cdCodiceRapFiscale) {
		this.cdCodiceRapFiscale = cdCodiceRapFiscale;
	}



	public String getCdCodiceTerzoInt() {
		return cdCodiceTerzoInt;
	}



	public void setCdCodiceTerzoInt(String cdCodiceTerzoInt) {
		this.cdCodiceTerzoInt = cdCodiceTerzoInt;
	}



	public String getCdCodiceTrasmittente() {
		return cdCodiceTrasmittente;
	}



	public void setCdCodiceTrasmittente(String cdCodiceTrasmittente) {
		this.cdCodiceTrasmittente = cdCodiceTrasmittente;
	}



	public String getCdFaxCedente() {
		return cdFaxCedente;
	}



	public void setCdFaxCedente(String cdFaxCedente) {
		this.cdFaxCedente = cdFaxCedente;
	}



	public String getCdFormatoTrasmissione() {
		return cdFormatoTrasmissione;
	}



	public void setCdFormatoTrasmissione(String cdFormatoTrasmissione) {
		this.cdFormatoTrasmissione = cdFormatoTrasmissione;
	}



	public String getCdHashXmlFirmato() {
		return cdHashXmlFirmato;
	}



	public void setCdHashXmlFirmato(String cdHashXmlFirmato) {
		this.cdHashXmlFirmato = cdHashXmlFirmato;
	}



	public String getCdIdentificativoSdiLotto() {
		return cdIdentificativoSdiLotto;
	}



	public void setCdIdentificativoSdiLotto(String cdIdentificativoSdiLotto) {
		this.cdIdentificativoSdiLotto = cdIdentificativoSdiLotto;
	}



	public String getNmIndirizzoStabileCedente() {
		return nmIndirizzoStabileCedente;
	}



	public void setNmIndirizzoStabileCedente(String nmIndirizzoStabileCedente) {
		this.nmIndirizzoStabileCedente = nmIndirizzoStabileCedente;
	}



	public String getCdNumCivicoSedeCessionario() {
		return cdNumCivicoSedeCessionario;
	}



	public void setCdNumCivicoSedeCessionario(String cdNumCivicoSedeCessionario) {
		this.cdNumCivicoSedeCessionario = cdNumCivicoSedeCessionario;
	}



	public String getCdNumCivicoStabileCedente() {
		return cdNumCivicoStabileCedente;
	}



	public void setCdNumCivicoStabileCedente(String cdNumCivicoStabileCedente) {
		this.cdNumCivicoStabileCedente = cdNumCivicoStabileCedente;
	}



	public String getCdNumIscrizioneAlboCedente() {
		return cdNumIscrizioneAlboCedente;
	}



	public void setCdNumIscrizioneAlboCedente(String cdNumIscrizioneAlboCedente) {
		this.cdNumIscrizioneAlboCedente = cdNumIscrizioneAlboCedente;
	}



	public String getCdNumeroCivicoSedeCedente() {
		return cdNumeroCivicoSedeCedente;
	}



	public void setCdNumeroCivicoSedeCedente(String cdNumeroCivicoSedeCedente) {
		this.cdNumeroCivicoSedeCedente = cdNumeroCivicoSedeCedente;
	}



	public String getCdNumeroReaCedente() {
		return cdNumeroReaCedente;
	}



	public void setCdNumeroReaCedente(String cdNumeroReaCedente) {
		this.cdNumeroReaCedente = cdNumeroReaCedente;
	}



	public String getCdPaeseTrasmittente() {
		return cdPaeseTrasmittente;
	}



	public void setCdPaeseTrasmittente(String cdPaeseTrasmittente) {
		this.cdPaeseTrasmittente = cdPaeseTrasmittente;
	}



	public String getCdProgressivoInvio() {
		return cdProgressivoInvio;
	}



	public void setCdProgressivoInvio(String cdProgressivoInvio) {
		this.cdProgressivoInvio = cdProgressivoInvio;
	}



	public String getCdRifAmministrazioneCedente() {
		return cdRifAmministrazioneCedente;
	}



	public void setCdRifAmministrazioneCedente(String cdRifAmministrazioneCedente) {
		this.cdRifAmministrazioneCedente = cdRifAmministrazioneCedente;
	}



	public String getCdTelefonoCedente() {
		return cdTelefonoCedente;
	}



	public void setCdTelefonoCedente(String cdTelefonoCedente) {
		this.cdTelefonoCedente = cdTelefonoCedente;
	}



	public String getCdTelefonoTrasmittente() {
		return cdTelefonoTrasmittente;
	}



	public void setCdTelefonoTrasmittente(String cdTelefonoTrasmittente) {
		this.cdTelefonoTrasmittente = cdTelefonoTrasmittente;
	}



	public Date getDtDataIscrAlboCedente() {
		return dtDataIscrAlboCedente;
	}



	public void setDtDataIscrAlboCedente(Date dtDataIscrAlboCedente) {
		this.dtDataIscrAlboCedente = dtDataIscrAlboCedente;
	}



	public Date getDtDataOraPrimaCreazione() {
		return dtDataOraPrimaCreazione;
	}



	public void setDtDataOraPrimaCreazione(Date dtDataOraPrimaCreazione) {
		this.dtDataOraPrimaCreazione = dtDataOraPrimaCreazione;
	}



	public Date getDtDataOraRicezione() {
		return dtDataOraRicezione;
	}



	public void setDtDataOraRicezione(Date dtDataOraRicezione) {
		this.dtDataOraRicezione = dtDataOraRicezione;
	}



	public Date getDtDataOraUltimaModifica() {
		return dtDataOraUltimaModifica;
	}



	public void setDtDataOraUltimaModifica(Date dtDataOraUltimaModifica) {
		this.dtDataOraUltimaModifica = dtDataOraUltimaModifica;
	}



	public Date getDtDataOraUltimoInvioSdi() {
		return dtDataOraUltimoInvioSdi;
	}



	public void setDtDataOraUltimoInvioSdi(Date dtDataOraUltimoInvioSdi) {
		this.dtDataOraUltimoInvioSdi = dtDataOraUltimoInvioSdi;
	}



	public Boolean getFlDaStoricizzare() {
		return flDaStoricizzare;
	}



	public void setFlDaStoricizzare(Boolean flDaStoricizzare) {
		this.flDaStoricizzare = flDaStoricizzare;
	}



	public Boolean getFlEsitoVerificaFirma() {
		return flEsitoVerificaFirma;
	}



	public void setFlEsitoVerificaFirma(Boolean flEsitoVerificaFirma) {
		this.flEsitoVerificaFirma = flEsitoVerificaFirma;
	}



	public Boolean getFlFtp() {
		return flFtp;
	}



	public void setFlFtp(Boolean flFtp) {
		this.flFtp = flFtp;
	}



	public Boolean getFlVerificaFirma() {
		return flVerificaFirma;
	}



	public void setFlVerificaFirma(Boolean flVerificaFirma) {
		this.flVerificaFirma = flVerificaFirma;
	}



	public Long getIdComuneSedeCedente() {
		return idComuneSedeCedente;
	}



	public void setIdComuneSedeCedente(Long idComuneSedeCedente) {
		this.idComuneSedeCedente = idComuneSedeCedente;
	}



	public Long getIdComuneSedeCessionario() {
		return idComuneSedeCessionario;
	}



	public void setIdComuneSedeCessionario(Long idComuneSedeCessionario) {
		this.idComuneSedeCessionario = idComuneSedeCessionario;
	}



	public Long getIdComuneStabileCedente() {
		return idComuneStabileCedente;
	}



	public void setIdComuneStabileCedente(Long idComuneStabileCedente) {
		this.idComuneStabileCedente = idComuneStabileCedente;
	}



	public Long getIdComuneStabileCessionario() {
		return idComuneStabileCessionario;
	}



	public void setIdComuneStabileCessionario(Long idComuneStabileCessionario) {
		this.idComuneStabileCessionario = idComuneStabileCessionario;
	}



	public Long getIdNazioneSedeCedente() {
		return idNazioneSedeCedente;
	}



	public void setIdNazioneSedeCedente(Long idNazioneSedeCedente) {
		this.idNazioneSedeCedente = idNazioneSedeCedente;
	}



	public Long getIdNazioneSedeCessionario() {
		return idNazioneSedeCessionario;
	}



	public void setIdNazioneSedeCessionario(Long idNazioneSedeCessionario) {
		this.idNazioneSedeCessionario = idNazioneSedeCessionario;
	}



	public Long getIdNazioneStabileCedente() {
		return idNazioneStabileCedente;
	}



	public void setIdNazioneStabileCedente(Long idNazioneStabileCedente) {
		this.idNazioneStabileCedente = idNazioneStabileCedente;
	}



	public Long getIdNazioneStabileCessionario() {
		return idNazioneStabileCessionario;
	}



	public void setIdNazioneStabileCessionario(Long idNazioneStabileCessionario) {
		this.idNazioneStabileCessionario = idNazioneStabileCessionario;
	}



	public Long getIdPaeseCedente() {
		return idPaeseCedente;
	}



	public void setIdPaeseCedente(Long idPaeseCedente) {
		this.idPaeseCedente = idPaeseCedente;
	}



	public Long getIdPaeseCessionario() {
		return idPaeseCessionario;
	}



	public void setIdPaeseCessionario(Long idPaeseCessionario) {
		this.idPaeseCessionario = idPaeseCessionario;
	}



	public Long getIdPaeseRapFiscale() {
		return idPaeseRapFiscale;
	}



	public void setIdPaeseRapFiscale(Long idPaeseRapFiscale) {
		this.idPaeseRapFiscale = idPaeseRapFiscale;
	}



	public Long getIdPaeseRapFiscaleCes() {
		return idPaeseRapFiscaleCes;
	}



	public void setIdPaeseRapFiscaleCes(Long idPaeseRapFiscaleCes) {
		this.idPaeseRapFiscaleCes = idPaeseRapFiscaleCes;
	}



	public Long getIdPaeseTerzoInt() {
		return idPaeseTerzoInt;
	}



	public void setIdPaeseTerzoInt(Long idPaeseTerzoInt) {
		this.idPaeseTerzoInt = idPaeseTerzoInt;
	}



	public Long getIdProvinciaAlboCedente() {
		return idProvinciaAlboCedente;
	}



	public void setIdProvinciaAlboCedente(Long idProvinciaAlboCedente) {
		this.idProvinciaAlboCedente = idProvinciaAlboCedente;
	}



	public Long getIdProvinciaSedeCedente() {
		return idProvinciaSedeCedente;
	}



	public void setIdProvinciaSedeCedente(Long idProvinciaSedeCedente) {
		this.idProvinciaSedeCedente = idProvinciaSedeCedente;
	}



	public Long getIdProvinciaSedeCessionario() {
		return idProvinciaSedeCessionario;
	}



	public void setIdProvinciaSedeCessionario(Long idProvinciaSedeCessionario) {
		this.idProvinciaSedeCessionario = idProvinciaSedeCessionario;
	}



	public Long getIdProvinciaStabileCedente() {
		return idProvinciaStabileCedente;
	}



	public void setIdProvinciaStabileCedente(Long idProvinciaStabileCedente) {
		this.idProvinciaStabileCedente = idProvinciaStabileCedente;
	}



	public Long getIdProvinciaStabileCes() {
		return idProvinciaStabileCes;
	}



	public void setIdProvinciaStabileCes(Long idProvinciaStabileCes) {
		this.idProvinciaStabileCes = idProvinciaStabileCes;
	}



	public Long getIdRegioneAlboCedente() {
		return idRegioneAlboCedente;
	}



	public void setIdRegioneAlboCedente(Long idRegioneAlboCedente) {
		this.idRegioneAlboCedente = idRegioneAlboCedente;
	}



	public Long getIdRegioneReaCedente() {
		return idRegioneReaCedente;
	}



	public void setIdRegioneReaCedente(Long idRegioneReaCedente) {
		this.idRegioneReaCedente = idRegioneReaCedente;
	}



	public Long getIdRegioneSedeCedente() {
		return idRegioneSedeCedente;
	}



	public void setIdRegioneSedeCedente(Long idRegioneSedeCedente) {
		this.idRegioneSedeCedente = idRegioneSedeCedente;
	}



	public Long getIdRegioneSedeCessionario() {
		return idRegioneSedeCessionario;
	}



	public void setIdRegioneSedeCessionario(Long idRegioneSedeCessionario) {
		this.idRegioneSedeCessionario = idRegioneSedeCessionario;
	}



	public Long getIdRegioneStabileCedente() {
		return idRegioneStabileCedente;
	}



	public void setIdRegioneStabileCedente(Long idRegioneStabileCedente) {
		this.idRegioneStabileCedente = idRegioneStabileCedente;
	}



	public Long getIdRegioneStabileCessionario() {
		return idRegioneStabileCessionario;
	}



	public void setIdRegioneStabileCessionario(Long idRegioneStabileCessionario) {
		this.idRegioneStabileCessionario = idRegioneStabileCessionario;
	}



	public Long getIdSediaAssegnatario() {
		return idSediaAssegnatario;
	}



	public void setIdSediaAssegnatario(Long idSediaAssegnatario) {
		this.idSediaAssegnatario = idSediaAssegnatario;
	}



	public Long getIdSediaCreatore() {
		return idSediaCreatore;
	}



	public void setIdSediaCreatore(Long idSediaCreatore) {
		this.idSediaCreatore = idSediaCreatore;
	}



	public Long getIdSediaUltimaMod() {
		return idSediaUltimaMod;
	}



	public void setIdSediaUltimaMod(Long idSediaUltimaMod) {
		this.idSediaUltimaMod = idSediaUltimaMod;
	}



	public Long getIdUfficioReaCedente() {
		return idUfficioReaCedente;
	}



	public void setIdUfficioReaCedente(Long idUfficioReaCedente) {
		this.idUfficioReaCedente = idUfficioReaCedente;
	}



	public BigDecimal getImCapitaleSocialeCedente() {
		return imCapitaleSocialeCedente;
	}



	public void setImCapitaleSocialeCedente(BigDecimal imCapitaleSocialeCedente) {
		this.imCapitaleSocialeCedente = imCapitaleSocialeCedente;
	}



	public String getNmAlboProfessionaleCedente() {
		return nmAlboProfessionaleCedente;
	}



	public void setNmAlboProfessionaleCedente(String nmAlboProfessionaleCedente) {
		this.nmAlboProfessionaleCedente = nmAlboProfessionaleCedente;
	}



	public String getNmCognomeCedente() {
		return nmCognomeCedente;
	}



	public void setNmCognomeCedente(String nmCognomeCedente) {
		this.nmCognomeCedente = nmCognomeCedente;
	}



	public String getNmCognomeCessionario() {
		return nmCognomeCessionario;
	}



	public void setNmCognomeCessionario(String nmCognomeCessionario) {
		this.nmCognomeCessionario = nmCognomeCessionario;
	}



	public String getNmCognomeRapFiscale() {
		return nmCognomeRapFiscale;
	}



	public void setNmCognomeRapFiscale(String nmCognomeRapFiscale) {
		this.nmCognomeRapFiscale = nmCognomeRapFiscale;
	}



	public String getNmCognomeRapFiscaleCes() {
		return nmCognomeRapFiscaleCes;
	}



	public void setNmCognomeRapFiscaleCes(String nmCognomeRapFiscaleCes) {
		this.nmCognomeRapFiscaleCes = nmCognomeRapFiscaleCes;
	}



	public String getNmCognomeTerzoInt() {
		return nmCognomeTerzoInt;
	}



	public void setNmCognomeTerzoInt(String nmCognomeTerzoInt) {
		this.nmCognomeTerzoInt = nmCognomeTerzoInt;
	}



	public String getNmComuneSedeCedenteEst() {
		return nmComuneSedeCedenteEst;
	}



	public void setNmComuneSedeCedenteEst(String nmComuneSedeCedenteEst) {
		this.nmComuneSedeCedenteEst = nmComuneSedeCedenteEst;
	}



	public String getNmComuneSedeCessionarioEst() {
		return nmComuneSedeCessionarioEst;
	}



	public void setNmComuneSedeCessionarioEst(String nmComuneSedeCessionarioEst) {
		this.nmComuneSedeCessionarioEst = nmComuneSedeCessionarioEst;
	}



	public String getNmComuneStabileCedenteEst() {
		return nmComuneStabileCedenteEst;
	}



	public void setNmComuneStabileCedenteEst(String nmComuneStabileCedenteEst) {
		this.nmComuneStabileCedenteEst = nmComuneStabileCedenteEst;
	}



	public String getNmComuneStabileCesEst() {
		return nmComuneStabileCesEst;
	}



	public void setNmComuneStabileCesEst(String nmComuneStabileCesEst) {
		this.nmComuneStabileCesEst = nmComuneStabileCesEst;
	}



	public String getNmContentTypeXmlFirmato() {
		return nmContentTypeXmlFirmato;
	}



	public void setNmContentTypeXmlFirmato(String nmContentTypeXmlFirmato) {
		this.nmContentTypeXmlFirmato = nmContentTypeXmlFirmato;
	}



	public String getNmDenominazioneCedente() {
		return nmDenominazioneCedente;
	}



	public void setNmDenominazioneCedente(String nmDenominazioneCedente) {
		this.nmDenominazioneCedente = nmDenominazioneCedente;
	}



	public String getNmDenominazioneCessionario() {
		return nmDenominazioneCessionario;
	}



	public void setNmDenominazioneCessionario(String nmDenominazioneCessionario) {
		this.nmDenominazioneCessionario = nmDenominazioneCessionario;
	}



	public String getNmDenominazioneRapFiscCes() {
		return nmDenominazioneRapFiscCes;
	}



	public void setNmDenominazioneRapFiscCes(String nmDenominazioneRapFiscCes) {
		this.nmDenominazioneRapFiscCes = nmDenominazioneRapFiscCes;
	}



	public String getNmDenominazioneRapFiscale() {
		return nmDenominazioneRapFiscale;
	}



	public void setNmDenominazioneRapFiscale(String nmDenominazioneRapFiscale) {
		this.nmDenominazioneRapFiscale = nmDenominazioneRapFiscale;
	}



	public String getNmDenominazioneTerzoInt() {
		return nmDenominazioneTerzoInt;
	}



	public void setNmDenominazioneTerzoInt(String nmDenominazioneTerzoInt) {
		this.nmDenominazioneTerzoInt = nmDenominazioneTerzoInt;
	}



	public String getNmEmailCedente() {
		return nmEmailCedente;
	}



	public void setNmEmailCedente(String nmEmailCedente) {
		this.nmEmailCedente = nmEmailCedente;
	}



	public String getNmEmailTrasmittente() {
		return nmEmailTrasmittente;
	}



	public void setNmEmailTrasmittente(String nmEmailTrasmittente) {
		this.nmEmailTrasmittente = nmEmailTrasmittente;
	}



	public String getNmIndirizStabileCessionario() {
		return nmIndirizStabileCessionario;
	}



	public void setNmIndirizStabileCessionario(String nmIndirizStabileCessionario) {
		this.nmIndirizStabileCessionario = nmIndirizStabileCessionario;
	}



	public String getNmIndirizzoSedeCedente() {
		return nmIndirizzoSedeCedente;
	}



	public void setNmIndirizzoSedeCedente(String nmIndirizzoSedeCedente) {
		this.nmIndirizzoSedeCedente = nmIndirizzoSedeCedente;
	}



	public String getNmIndirizzoSedeCessionario() {
		return nmIndirizzoSedeCessionario;
	}



	public void setNmIndirizzoSedeCessionario(String nmIndirizzoSedeCessionario) {
		this.nmIndirizzoSedeCessionario = nmIndirizzoSedeCessionario;
	}



	public String getNmNomeCedente() {
		return nmNomeCedente;
	}



	public void setNmNomeCedente(String nmNomeCedente) {
		this.nmNomeCedente = nmNomeCedente;
	}



	public String getNmNomeCessionario() {
		return nmNomeCessionario;
	}



	public void setNmNomeCessionario(String nmNomeCessionario) {
		this.nmNomeCessionario = nmNomeCessionario;
	}



	public String getNmNomeRapFiscale() {
		return nmNomeRapFiscale;
	}



	public void setNmNomeRapFiscale(String nmNomeRapFiscale) {
		this.nmNomeRapFiscale = nmNomeRapFiscale;
	}



	public String getNmNomeRapFiscaleCes() {
		return nmNomeRapFiscaleCes;
	}



	public void setNmNomeRapFiscaleCes(String nmNomeRapFiscaleCes) {
		this.nmNomeRapFiscaleCes = nmNomeRapFiscaleCes;
	}



	public String getNmNomeTerzoInt() {
		return nmNomeTerzoInt;
	}



	public void setNmNomeTerzoInt(String nmNomeTerzoInt) {
		this.nmNomeTerzoInt = nmNomeTerzoInt;
	}



	public String getNmNomeXmlFirmato() {
		return nmNomeXmlFirmato;
	}



	public void setNmNomeXmlFirmato(String nmNomeXmlFirmato) {
		this.nmNomeXmlFirmato = nmNomeXmlFirmato;
	}



	public String getNmNomeXmlNonFirmato() {
		return nmNomeXmlNonFirmato;
	}



	public void setNmNomeXmlNonFirmato(String nmNomeXmlNonFirmato) {
		this.nmNomeXmlNonFirmato = nmNomeXmlNonFirmato;
	}



	public String getNmPecDestinatario() {
		return nmPecDestinatario;
	}



	public void setNmPecDestinatario(String nmPecDestinatario) {
		this.nmPecDestinatario = nmPecDestinatario;
	}



	public String getNmTicketConservazione() {
		return nmTicketConservazione;
	}



	public void setNmTicketConservazione(String nmTicketConservazione) {
		this.nmTicketConservazione = nmTicketConservazione;
	}



	public String getNmTitoloCedente() {
		return nmTitoloCedente;
	}



	public void setNmTitoloCedente(String nmTitoloCedente) {
		this.nmTitoloCedente = nmTitoloCedente;
	}



	public String getNmTitoloCessionario() {
		return nmTitoloCessionario;
	}



	public void setNmTitoloCessionario(String nmTitoloCessionario) {
		this.nmTitoloCessionario = nmTitoloCessionario;
	}



	public String getNmTitoloRapFiscale() {
		return nmTitoloRapFiscale;
	}



	public void setNmTitoloRapFiscale(String nmTitoloRapFiscale) {
		this.nmTitoloRapFiscale = nmTitoloRapFiscale;
	}



	public String getNmTitoloTerzoInt() {
		return nmTitoloTerzoInt;
	}



	public void setNmTitoloTerzoInt(String nmTitoloTerzoInt) {
		this.nmTitoloTerzoInt = nmTitoloTerzoInt;
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



	public BigDecimal getPgVersioneLotto() {
		return pgVersioneLotto;
	}



	public void setPgVersioneLotto(BigDecimal pgVersioneLotto) {
		this.pgVersioneLotto = pgVersioneLotto;
	}



	public BigDecimal getQtSizeXmlFirmato() {
		return qtSizeXmlFirmato;
	}



	public void setQtSizeXmlFirmato(BigDecimal qtSizeXmlFirmato) {
		this.qtSizeXmlFirmato = qtSizeXmlFirmato;
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



	public Boolean getFlLottoEu() {
		return flLottoEu;
	}



	public void setFlLottoEu(Boolean flLottoEu) {
		this.flLottoEu = flLottoEu;
	}



	public Long getIdDizSocioUnicoCedente() {
		return idDizSocioUnicoCedente;
	}



	public void setIdDizSocioUnicoCedente(Long idDizSocioUnicoCedente) {
		this.idDizSocioUnicoCedente = idDizSocioUnicoCedente;
	}



	public Long getIdDizSoggettoEmittente() {
		return idDizSoggettoEmittente;
	}



	public void setIdDizSoggettoEmittente(Long idDizSoggettoEmittente) {
		this.idDizSoggettoEmittente = idDizSoggettoEmittente;
	}



	public Long getIdDizStatoLiquidazCedente() {
		return idDizStatoLiquidazCedente;
	}



	public void setIdDizStatoLiquidazCedente(Long idDizStatoLiquidazCedente) {
		this.idDizStatoLiquidazCedente = idDizStatoLiquidazCedente;
	}



	public Long getIdDizStatoLottoFattura() {
		return idDizStatoLottoFattura;
	}



	public void setIdDizStatoLottoFattura(Long idDizStatoLottoFattura) {
		this.idDizStatoLottoFattura = idDizStatoLottoFattura;
	}



	public Long getIdDizTipologiaDestinatario() {
		return idDizTipologiaDestinatario;
	}



	public void setIdDizTipologiaDestinatario(Long idDizTipologiaDestinatario) {
		this.idDizTipologiaDestinatario = idDizTipologiaDestinatario;
	}



	public Long getIdEsitoInvio() {
		return idEsitoInvio;
	}



	public void setIdEsitoInvio(Long idEsitoInvio) {
		this.idEsitoInvio = idEsitoInvio;
	}



	public Long getIdRegimeFiscaleCedente() {
		return idRegimeFiscaleCedente;
	}



	public void setIdRegimeFiscaleCedente(Long idRegimeFiscaleCedente) {
		this.idRegimeFiscaleCedente = idRegimeFiscaleCedente;
	}



	public Long getIdAdesione() {
		return idAdesione;
	}



	public void setIdAdesione(Long idAdesione) {
		this.idAdesione = idAdesione;
	}
	
//	private List<FatTLottoArchivio> listLottoArchivio;
//
//	
//	private List<FatTLottoRicEstrUff> listLottoRicEstrUff;
//
//	
//	private List<FatTLottoStor> listLottoStor;
//
//	
//	private List<FatTMail> listMail;
//
//	
//	private List<FatTMonitorInvioSdi> listMonitorInvioSdi;
//
//	
//	private List<FatTNotifica> listNotifica;
//
//	private List<FatTVerifFirmaLotto> listVerifFirmaLotto;
//	
//	private List<FatALottoSupportoFtp> listLottoSupportoFtp;
//
//	private List<FatAStatoLottoFattura> listStatoLottoFattura;
//
//	private List<FatTAssegnazione> listAssegnazione;
//
//	private List<FatTCompilazioneSezione> listCompilazioneSezione;
//
//	private List<FatTExcelFattura> listExcelFattura;
//
//	private List<FatTFattura> listFattura;
//
//	private List<FatTFattura> listFatturaRifiutata;
//
//	private List<FatTFatturaStor> listFatturaStor;
	
	
	


}
