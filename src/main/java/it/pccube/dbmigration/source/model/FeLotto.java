package it.pccube.dbmigration.source.model;


import java.math.BigDecimal;
import java.util.Date;

public class FeLotto  {

	public static final String TABLE_NAME = "FE_LOTTO";

	public FeLotto() {
		super();
	}

	private Date dataIscrizioneAlboCedente;
	
	
	private Boolean flagDaStoricizzare;

	private Date dataOraRicezione;

	private Date dataOraUltimoInvioSdi;

	private Date dataOraUltimaModifica;

	private Date dataOraPrimaCreazione;

	private Long statoLiquidazioneCedente;

	private Long soggettoEmittente;

	private Boolean esitoVerificaFirma;

	private Long nazioneSedeCedente;

	private Long comuneStabileCedente;

	private Long provinciaStabileCedente;

	private Long nazioneStabileCedente;

	private Long provinciaSedeCedente;

	private Long comuneSedeCedente;

	private Long idPaeseCedente;

	private Long nazioneSedeCessionario;

	private Long regioneStabileCedente;

	private Long regioneSedeCessionario;

	private Long idUtenteAziendaAssegnatario;

	private Long idUtenteAziendaUltimaMod;

	private Long idUtenteAziendaCreatore;

	private Long idPaeseTerzoInt;

	private Long regioneSedeCedente;

	private Long provinciaSedeCessionario;

	private Long paeseRapFiscale;

	private Long idPaeseCessionario;

	private Long comuneSedeCessionario;

	private Long identificativoSdiLotto;

	private BigDecimal capitaleSocialeCedente;


	private Long idLotto;

	private Long esitoInvio;

	private Long stato;

	private Long socioUnicoCedente;

	private Long regimeFiscaleCedente;

	private Date tmstUltimoAggiornamento;

	private Date tmstInserimento;

	private String titoloRapFiscale;

	private String progressivoInvio;

	private String titoloTerzoInt;

	private String titoloCessionario;

	private String titoloCedente;

	private String telefonoTrasmittente;

	private String faxCedente;

	private String telefonoCedente;

	private String codiceFiscaleCedente;

	private String codiceFiscaleTerzoInt;

	private String codiceFiscaleCessionario;

	private String codiceFiscaleRapFiscale;

	private String codEoriCedente;

	private String codEoriTerzoInt;

	private String codEoriCessionario;

	private String codEoriRapFiscale;

	private String idPaeseTrasmittente;

	private String rifAmministrazioneCedente;

	private String numeroReaCedente;
	private String ticketConservazione;

	private String emailCedente;

	private String emailTrasmittente;

	private String idCodiceTerzoInt;

	private String idCodiceCedente;

	private String idCodiceRapFiscale;

	private String idCodiceCessionario;

	private String idCodiceTrasmittente;

	private String useridInserimento;

	private String useridUltimoAggiornamento;

	private String formatoTrasmissione;

	private String capStabileCedente;

	private String capSedeCedente;

	private String capSedeCessionario;

	private String nomeXmlFirmato;

	private String nomeXmlNonFirmato;

	private String codiceDestinatario;

	private String nomeCedente;

	private String nomeTerzoInt;

	private String comuneSedeCessionarioEst;

	private String indirizzoSedeCessionario;

	private String cognomeCessionario;

	private String nomeCessionario;

	private String cognomeRapFiscale;

	private String cognomeTerzoInt;

	private String cognomeCedente;

	private String alboProfessionaleCedente;

	private String numIscrizioneAlboCedente;

	private String indirizzoSedeCedente;

	private String comuneSedeCedenteEst;

	private String indirizzoStabileCedente;

	private String comuneStabileCedenteEst;

	private String nomeRapFiscale;

	private String numeroCivicoSedeCedente;

	private String numCivicoStabileCedente;

	private String numCivicoSedeCessionario;

	private String denominazioneRapFiscale;

	private String denominazioneCessionario;

	private String denominazioneTerzoInt;

	private String denominazioneCedente;

	private Long regioneAlboCedente;
	
	private Long provinciaAlboCedente;
	
	private Long regioneReaCedente;
	
	private Long ufficioReaCedente;
	
	private Long versioneLotto;

	private Long sizeXmlFirmato;
	
	private String hashXmlFirmato;
	
	private String contentTypeXmlFirmato;
	
	
	private Boolean flagVerificaFirma;
	
	private Boolean flagLottoEu;
	
	private String userIdFlgLottoEu;
	
	private Date tmstFlgLottoEu;
	private Boolean flagFtp;
	
	
	private String pecDestinatario;

	private Long nazioneStabileCessionario;
	private Long provinciaStabileCessionario;
	private Long comuneStabileCessionario;
	private String capStabileCessionario;
	private String indirizzoStabileCessionario;
	private String numCivicoStabileCessionario;
	private String comuneStabileCessionarioEst;
	private Long regioneStabileCessionario;

	private Long idPaeseRapFiscaleCes;
	private String idCodiceRapFiscaleCes;
	private String cognomeRapFiscaleCes;
	private String nomeRapFiscaleCes;
	private String denominazioneRapFiscaleCes;

	private Long idDizTipologiaDestinatario;
	private Long idAdesione;
	private byte[] xmlFirmato;
	private byte[] xmlNonFirmato;


	public Long getIdLotto() {
		return idLotto;
	}
	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}
	public Date getDataIscrizioneAlboCedente() {
		return dataIscrizioneAlboCedente;
	}
	public void setDataIscrizioneAlboCedente(Date dataIscrizioneAlboCedente) {
		this.dataIscrizioneAlboCedente = dataIscrizioneAlboCedente;
	}
	public Boolean getFlagDaStoricizzare() {
		return flagDaStoricizzare;
	}
	public void setFlagDaStoricizzare(Boolean flagDaStoricizzare) {
		this.flagDaStoricizzare = flagDaStoricizzare;
	}
	public Date getDataOraRicezione() {
		return dataOraRicezione;
	}
	public void setDataOraRicezione(Date dataOraRicezione) {
		this.dataOraRicezione = dataOraRicezione;
	}
	public Date getDataOraUltimoInvioSdi() {
		return dataOraUltimoInvioSdi;
	}
	public void setDataOraUltimoInvioSdi(Date dataOraUltimoInvioSdi) {
		this.dataOraUltimoInvioSdi = dataOraUltimoInvioSdi;
	}
	public Date getDataOraUltimaModifica() {
		return dataOraUltimaModifica;
	}
	public void setDataOraUltimaModifica(Date dataOraUltimaModifica) {
		this.dataOraUltimaModifica = dataOraUltimaModifica;
	}
	public Date getDataOraPrimaCreazione() {
		return dataOraPrimaCreazione;
	}
	public void setDataOraPrimaCreazione(Date dataOraPrimaCreazione) {
		this.dataOraPrimaCreazione = dataOraPrimaCreazione;
	}
	public Long getStatoLiquidazioneCedente() {
		return statoLiquidazioneCedente;
	}
	public void setStatoLiquidazioneCedente(Long statoLiquidazioneCedente) {
		this.statoLiquidazioneCedente = statoLiquidazioneCedente;
	}
	public Long getSoggettoEmittente() {
		return soggettoEmittente;
	}
	public void setSoggettoEmittente(Long soggettoEmittente) {
		this.soggettoEmittente = soggettoEmittente;
	}
	public Boolean getEsitoVerificaFirma() {
		return esitoVerificaFirma;
	}
	public void setEsitoVerificaFirma(Boolean esitoVerificaFirma) {
		this.esitoVerificaFirma = esitoVerificaFirma;
	}
	public Long getNazioneSedeCedente() {
		return nazioneSedeCedente;
	}
	public void setNazioneSedeCedente(Long nazioneSedeCedente) {
		this.nazioneSedeCedente = nazioneSedeCedente;
	}
	public Long getComuneStabileCedente() {
		return comuneStabileCedente;
	}
	public void setComuneStabileCedente(Long comuneStabileCedente) {
		this.comuneStabileCedente = comuneStabileCedente;
	}
	public Long getProvinciaStabileCedente() {
		return provinciaStabileCedente;
	}
	public void setProvinciaStabileCedente(Long provinciaStabileCedente) {
		this.provinciaStabileCedente = provinciaStabileCedente;
	}
	public Long getNazioneStabileCedente() {
		return nazioneStabileCedente;
	}
	public void setNazioneStabileCedente(Long nazioneStabileCedente) {
		this.nazioneStabileCedente = nazioneStabileCedente;
	}
	public Long getProvinciaSedeCedente() {
		return provinciaSedeCedente;
	}
	public void setProvinciaSedeCedente(Long provinciaSedeCedente) {
		this.provinciaSedeCedente = provinciaSedeCedente;
	}
	public Long getComuneSedeCedente() {
		return comuneSedeCedente;
	}
	public void setComuneSedeCedente(Long comuneSedeCedente) {
		this.comuneSedeCedente = comuneSedeCedente;
	}
	public Long getIdPaeseCedente() {
		return idPaeseCedente;
	}
	public void setIdPaeseCedente(Long idPaeseCedente) {
		this.idPaeseCedente = idPaeseCedente;
	}
	public Long getNazioneSedeCessionario() {
		return nazioneSedeCessionario;
	}
	public void setNazioneSedeCessionario(Long nazioneSedeCessionario) {
		this.nazioneSedeCessionario = nazioneSedeCessionario;
	}
	public Long getRegioneStabileCedente() {
		return regioneStabileCedente;
	}
	public void setRegioneStabileCedente(Long regioneStabileCedente) {
		this.regioneStabileCedente = regioneStabileCedente;
	}
	public Long getRegioneSedeCessionario() {
		return regioneSedeCessionario;
	}
	public void setRegioneSedeCessionario(Long regioneSedeCessionario) {
		this.regioneSedeCessionario = regioneSedeCessionario;
	}
	public Long getIdUtenteAziendaAssegnatario() {
		return idUtenteAziendaAssegnatario;
	}
	public void setIdUtenteAziendaAssegnatario(Long idUtenteAziendaAssegnatario) {
		this.idUtenteAziendaAssegnatario = idUtenteAziendaAssegnatario;
	}
	public Long getIdUtenteAziendaUltimaMod() {
		return idUtenteAziendaUltimaMod;
	}
	public void setIdUtenteAziendaUltimaMod(Long idUtenteAziendaUltimaMod) {
		this.idUtenteAziendaUltimaMod = idUtenteAziendaUltimaMod;
	}
	public Long getIdUtenteAziendaCreatore() {
		return idUtenteAziendaCreatore;
	}
	public void setIdUtenteAziendaCreatore(Long idUtenteAziendaCreatore) {
		this.idUtenteAziendaCreatore = idUtenteAziendaCreatore;
	}
	public Long getIdPaeseTerzoInt() {
		return idPaeseTerzoInt;
	}
	public void setIdPaeseTerzoInt(Long idPaeseTerzoInt) {
		this.idPaeseTerzoInt = idPaeseTerzoInt;
	}
	public Long getRegioneSedeCedente() {
		return regioneSedeCedente;
	}
	public void setRegioneSedeCedente(Long regioneSedeCedente) {
		this.regioneSedeCedente = regioneSedeCedente;
	}
	public Long getProvinciaSedeCessionario() {
		return provinciaSedeCessionario;
	}
	public void setProvinciaSedeCessionario(Long provinciaSedeCessionario) {
		this.provinciaSedeCessionario = provinciaSedeCessionario;
	}
	public Long getPaeseRapFiscale() {
		return paeseRapFiscale;
	}
	public void setPaeseRapFiscale(Long paeseRapFiscale) {
		this.paeseRapFiscale = paeseRapFiscale;
	}
	public Long getIdPaeseCessionario() {
		return idPaeseCessionario;
	}
	public void setIdPaeseCessionario(Long idPaeseCessionario) {
		this.idPaeseCessionario = idPaeseCessionario;
	}
	public Long getComuneSedeCessionario() {
		return comuneSedeCessionario;
	}
	public void setComuneSedeCessionario(Long comuneSedeCessionario) {
		this.comuneSedeCessionario = comuneSedeCessionario;
	}
	public Long getIdentificativoSdiLotto() {
		return identificativoSdiLotto;
	}
	public void setIdentificativoSdiLotto(Long identificativoSdiLotto) {
		this.identificativoSdiLotto = identificativoSdiLotto;
	}
	public BigDecimal getCapitaleSocialeCedente() {
		return capitaleSocialeCedente;
	}
	public void setCapitaleSocialeCedente(BigDecimal capitaleSocialeCedente) {
		this.capitaleSocialeCedente = capitaleSocialeCedente;
	}
	public Long getEsitoInvio() {
		return esitoInvio;
	}
	public void setEsitoInvio(Long esitoInvio) {
		this.esitoInvio = esitoInvio;
	}
	public Long getStato() {
		return stato;
	}
	public void setStato(Long stato) {
		this.stato = stato;
	}
	public Long getSocioUnicoCedente() {
		return socioUnicoCedente;
	}
	public void setSocioUnicoCedente(Long socioUnicoCedente) {
		this.socioUnicoCedente = socioUnicoCedente;
	}
	public Long getRegimeFiscaleCedente() {
		return regimeFiscaleCedente;
	}
	public void setRegimeFiscaleCedente(Long regimeFiscaleCedente) {
		this.regimeFiscaleCedente = regimeFiscaleCedente;
	}
	public Date getTmstUltimoAggiornamento() {
		return tmstUltimoAggiornamento;
	}
	public void setTmstUltimoAggiornamento(Date tmstUltimoAggiornamento) {
		this.tmstUltimoAggiornamento = tmstUltimoAggiornamento;
	}
	public Date getTmstInserimento() {
		return tmstInserimento;
	}
	public void setTmstInserimento(Date tmstInserimento) {
		this.tmstInserimento = tmstInserimento;
	}
	public String getTitoloRapFiscale() {
		return titoloRapFiscale;
	}
	public void setTitoloRapFiscale(String titoloRapFiscale) {
		this.titoloRapFiscale = titoloRapFiscale;
	}
	public String getProgressivoInvio() {
		return progressivoInvio;
	}
	public void setProgressivoInvio(String progressivoInvio) {
		this.progressivoInvio = progressivoInvio;
	}
	public String getTitoloTerzoInt() {
		return titoloTerzoInt;
	}
	public void setTitoloTerzoInt(String titoloTerzoInt) {
		this.titoloTerzoInt = titoloTerzoInt;
	}
	public String getTitoloCessionario() {
		return titoloCessionario;
	}
	public void setTitoloCessionario(String titoloCessionario) {
		this.titoloCessionario = titoloCessionario;
	}
	public String getTitoloCedente() {
		return titoloCedente;
	}
	public void setTitoloCedente(String titoloCedente) {
		this.titoloCedente = titoloCedente;
	}
	public String getTelefonoTrasmittente() {
		return telefonoTrasmittente;
	}
	public void setTelefonoTrasmittente(String telefonoTrasmittente) {
		this.telefonoTrasmittente = telefonoTrasmittente;
	}
	public String getFaxCedente() {
		return faxCedente;
	}
	public void setFaxCedente(String faxCedente) {
		this.faxCedente = faxCedente;
	}
	public String getTelefonoCedente() {
		return telefonoCedente;
	}
	public void setTelefonoCedente(String telefonoCedente) {
		this.telefonoCedente = telefonoCedente;
	}
	public String getCodiceFiscaleCedente() {
		return codiceFiscaleCedente;
	}
	public void setCodiceFiscaleCedente(String codiceFiscaleCedente) {
		this.codiceFiscaleCedente = codiceFiscaleCedente;
	}
	public String getCodiceFiscaleTerzoInt() {
		return codiceFiscaleTerzoInt;
	}
	public void setCodiceFiscaleTerzoInt(String codiceFiscaleTerzoInt) {
		this.codiceFiscaleTerzoInt = codiceFiscaleTerzoInt;
	}
	public String getCodiceFiscaleCessionario() {
		return codiceFiscaleCessionario;
	}
	public void setCodiceFiscaleCessionario(String codiceFiscaleCessionario) {
		this.codiceFiscaleCessionario = codiceFiscaleCessionario;
	}
	public String getCodiceFiscaleRapFiscale() {
		return codiceFiscaleRapFiscale;
	}
	public void setCodiceFiscaleRapFiscale(String codiceFiscaleRapFiscale) {
		this.codiceFiscaleRapFiscale = codiceFiscaleRapFiscale;
	}
	public String getCodEoriCedente() {
		return codEoriCedente;
	}
	public void setCodEoriCedente(String codEoriCedente) {
		this.codEoriCedente = codEoriCedente;
	}
	public String getCodEoriTerzoInt() {
		return codEoriTerzoInt;
	}
	public void setCodEoriTerzoInt(String codEoriTerzoInt) {
		this.codEoriTerzoInt = codEoriTerzoInt;
	}
	public String getCodEoriCessionario() {
		return codEoriCessionario;
	}
	public void setCodEoriCessionario(String codEoriCessionario) {
		this.codEoriCessionario = codEoriCessionario;
	}
	public String getCodEoriRapFiscale() {
		return codEoriRapFiscale;
	}
	public void setCodEoriRapFiscale(String codEoriRapFiscale) {
		this.codEoriRapFiscale = codEoriRapFiscale;
	}
	public String getRifAmministrazioneCedente() {
		return rifAmministrazioneCedente;
	}
	public void setRifAmministrazioneCedente(String rifAmministrazioneCedente) {
		this.rifAmministrazioneCedente = rifAmministrazioneCedente;
	}
	public String getNumeroReaCedente() {
		return numeroReaCedente;
	}
	public void setNumeroReaCedente(String numeroReaCedente) {
		this.numeroReaCedente = numeroReaCedente;
	}
	public String getTicketConservazione() {
		return ticketConservazione;
	}
	public void setTicketConservazione(String ticketConservazione) {
		this.ticketConservazione = ticketConservazione;
	}
	public String getEmailCedente() {
		return emailCedente;
	}
	public void setEmailCedente(String emailCedente) {
		this.emailCedente = emailCedente;
	}
	public String getEmailTrasmittente() {
		return emailTrasmittente;
	}
	public void setEmailTrasmittente(String emailTrasmittente) {
		this.emailTrasmittente = emailTrasmittente;
	}
	public String getIdCodiceTerzoInt() {
		return idCodiceTerzoInt;
	}
	public void setIdCodiceTerzoInt(String idCodiceTerzoInt) {
		this.idCodiceTerzoInt = idCodiceTerzoInt;
	}
	public String getIdCodiceCedente() {
		return idCodiceCedente;
	}
	public void setIdCodiceCedente(String idCodiceCedente) {
		this.idCodiceCedente = idCodiceCedente;
	}
	public String getIdCodiceRapFiscale() {
		return idCodiceRapFiscale;
	}
	public void setIdCodiceRapFiscale(String idCodiceRapFiscale) {
		this.idCodiceRapFiscale = idCodiceRapFiscale;
	}
	public String getIdCodiceCessionario() {
		return idCodiceCessionario;
	}
	public void setIdCodiceCessionario(String idCodiceCessionario) {
		this.idCodiceCessionario = idCodiceCessionario;
	}
	public String getIdCodiceTrasmittente() {
		return idCodiceTrasmittente;
	}
	public void setIdCodiceTrasmittente(String idCodiceTrasmittente) {
		this.idCodiceTrasmittente = idCodiceTrasmittente;
	}
	public String getUseridInserimento() {
		return useridInserimento;
	}
	public void setUseridInserimento(String useridInserimento) {
		this.useridInserimento = useridInserimento;
	}
	public String getUseridUltimoAggiornamento() {
		return useridUltimoAggiornamento;
	}
	public void setUseridUltimoAggiornamento(String useridUltimoAggiornamento) {
		this.useridUltimoAggiornamento = useridUltimoAggiornamento;
	}
	public String getFormatoTrasmissione() {
		return formatoTrasmissione;
	}
	public void setFormatoTrasmissione(String formatoTrasmissione) {
		this.formatoTrasmissione = formatoTrasmissione;
	}
	public String getCapStabileCedente() {
		return capStabileCedente;
	}
	public void setCapStabileCedente(String capStabileCedente) {
		this.capStabileCedente = capStabileCedente;
	}
	public String getIdPaeseTrasmittente() {
		return idPaeseTrasmittente;
	}
	public void setIdPaeseTrasmittente(String idPaeseTrasmittente) {
		this.idPaeseTrasmittente = idPaeseTrasmittente;
	}
	public String getCapSedeCedente() {
		return capSedeCedente;
	}
	public void setCapSedeCedente(String capSedeCedente) {
		this.capSedeCedente = capSedeCedente;
	}
	public String getCapSedeCessionario() {
		return capSedeCessionario;
	}
	public void setCapSedeCessionario(String capSedeCessionario) {
		this.capSedeCessionario = capSedeCessionario;
	}
	public String getNomeXmlFirmato() {
		return nomeXmlFirmato;
	}
	public void setNomeXmlFirmato(String nomeXmlFirmato) {
		this.nomeXmlFirmato = nomeXmlFirmato;
	}
	public String getNomeXmlNonFirmato() {
		return nomeXmlNonFirmato;
	}
	public void setNomeXmlNonFirmato(String nomeXmlNonFirmato) {
		this.nomeXmlNonFirmato = nomeXmlNonFirmato;
	}
	public String getCodiceDestinatario() {
		return codiceDestinatario;
	}
	public void setCodiceDestinatario(String codiceDestinatario) {
		this.codiceDestinatario = codiceDestinatario;
	}
	public String getNomeCedente() {
		return nomeCedente;
	}
	public void setNomeCedente(String nomeCedente) {
		this.nomeCedente = nomeCedente;
	}
	public String getNomeTerzoInt() {
		return nomeTerzoInt;
	}
	public void setNomeTerzoInt(String nomeTerzoInt) {
		this.nomeTerzoInt = nomeTerzoInt;
	}
	public String getComuneSedeCessionarioEst() {
		return comuneSedeCessionarioEst;
	}
	public void setComuneSedeCessionarioEst(String comuneSedeCessionarioEst) {
		this.comuneSedeCessionarioEst = comuneSedeCessionarioEst;
	}
	public String getIndirizzoSedeCessionario() {
		return indirizzoSedeCessionario;
	}
	public void setIndirizzoSedeCessionario(String indirizzoSedeCessionario) {
		this.indirizzoSedeCessionario = indirizzoSedeCessionario;
	}
	public String getCognomeCessionario() {
		return cognomeCessionario;
	}
	public void setCognomeCessionario(String cognomeCessionario) {
		this.cognomeCessionario = cognomeCessionario;
	}
	public String getNomeCessionario() {
		return nomeCessionario;
	}
	public void setNomeCessionario(String nomeCessionario) {
		this.nomeCessionario = nomeCessionario;
	}
	public String getCognomeRapFiscale() {
		return cognomeRapFiscale;
	}
	public void setCognomeRapFiscale(String cognomeRapFiscale) {
		this.cognomeRapFiscale = cognomeRapFiscale;
	}
	public String getCognomeTerzoInt() {
		return cognomeTerzoInt;
	}
	public void setCognomeTerzoInt(String cognomeTerzoInt) {
		this.cognomeTerzoInt = cognomeTerzoInt;
	}
	public String getCognomeCedente() {
		return cognomeCedente;
	}
	public void setCognomeCedente(String cognomeCedente) {
		this.cognomeCedente = cognomeCedente;
	}
	public String getAlboProfessionaleCedente() {
		return alboProfessionaleCedente;
	}
	public void setAlboProfessionaleCedente(String alboProfessionaleCedente) {
		this.alboProfessionaleCedente = alboProfessionaleCedente;
	}
	public String getNumIscrizioneAlboCedente() {
		return numIscrizioneAlboCedente;
	}
	public void setNumIscrizioneAlboCedente(String numIscrizioneAlboCedente) {
		this.numIscrizioneAlboCedente = numIscrizioneAlboCedente;
	}
	public String getIndirizzoSedeCedente() {
		return indirizzoSedeCedente;
	}
	public void setIndirizzoSedeCedente(String indirizzoSedeCedente) {
		this.indirizzoSedeCedente = indirizzoSedeCedente;
	}
	public String getComuneSedeCedenteEst() {
		return comuneSedeCedenteEst;
	}
	public void setComuneSedeCedenteEst(String comuneSedeCedenteEst) {
		this.comuneSedeCedenteEst = comuneSedeCedenteEst;
	}
	public String getIndirizzoStabileCedente() {
		return indirizzoStabileCedente;
	}
	public void setIndirizzoStabileCedente(String indirizzoStabileCedente) {
		this.indirizzoStabileCedente = indirizzoStabileCedente;
	}
	public String getComuneStabileCedenteEst() {
		return comuneStabileCedenteEst;
	}
	public void setComuneStabileCedenteEst(String comuneStabileCedenteEst) {
		this.comuneStabileCedenteEst = comuneStabileCedenteEst;
	}
	public String getNomeRapFiscale() {
		return nomeRapFiscale;
	}
	public void setNomeRapFiscale(String nomeRapFiscale) {
		this.nomeRapFiscale = nomeRapFiscale;
	}
	public String getNumeroCivicoSedeCedente() {
		return numeroCivicoSedeCedente;
	}
	public void setNumeroCivicoSedeCedente(String numeroCivicoSedeCedente) {
		this.numeroCivicoSedeCedente = numeroCivicoSedeCedente;
	}
	public String getNumCivicoStabileCedente() {
		return numCivicoStabileCedente;
	}
	public void setNumCivicoStabileCedente(String numCivicoStabileCedente) {
		this.numCivicoStabileCedente = numCivicoStabileCedente;
	}
	public String getNumCivicoSedeCessionario() {
		return numCivicoSedeCessionario;
	}
	public void setNumCivicoSedeCessionario(String numCivicoSedeCessionario) {
		this.numCivicoSedeCessionario = numCivicoSedeCessionario;
	}
	public String getDenominazioneRapFiscale() {
		return denominazioneRapFiscale;
	}
	public void setDenominazioneRapFiscale(String denominazioneRapFiscale) {
		this.denominazioneRapFiscale = denominazioneRapFiscale;
	}
	public String getDenominazioneCessionario() {
		return denominazioneCessionario;
	}
	public void setDenominazioneCessionario(String denominazioneCessionario) {
		this.denominazioneCessionario = denominazioneCessionario;
	}
	public String getDenominazioneTerzoInt() {
		return denominazioneTerzoInt;
	}
	public void setDenominazioneTerzoInt(String denominazioneTerzoInt) {
		this.denominazioneTerzoInt = denominazioneTerzoInt;
	}
	public String getDenominazioneCedente() {
		return denominazioneCedente;
	}
	public void setDenominazioneCedente(String denominazioneCedente) {
		this.denominazioneCedente = denominazioneCedente;
	}
	public Long getRegioneAlboCedente() {
		return regioneAlboCedente;
	}
	public void setRegioneAlboCedente(Long regioneAlboCedente) {
		this.regioneAlboCedente = regioneAlboCedente;
	}
	public Long getProvinciaAlboCedente() {
		return provinciaAlboCedente;
	}
	public void setProvinciaAlboCedente(Long provinciaAlboCedente) {
		this.provinciaAlboCedente = provinciaAlboCedente;
	}
	public Long getRegioneReaCedente() {
		return regioneReaCedente;
	}
	public void setRegioneReaCedente(Long regioneReaCedente) {
		this.regioneReaCedente = regioneReaCedente;
	}
	public Long getUfficioReaCedente() {
		return ufficioReaCedente;
	}
	public void setUfficioReaCedente(Long ufficioReaCedente) {
		this.ufficioReaCedente = ufficioReaCedente;
	}
	public Long getVersioneLotto() {
		return versioneLotto;
	}
	public void setVersioneLotto(Long versioneLotto) {
		this.versioneLotto = versioneLotto;
	}
	public Long getSizeXmlFirmato() {
		return sizeXmlFirmato;
	}
	public void setSizeXmlFirmato(Long sizeXmlFirmato) {
		this.sizeXmlFirmato = sizeXmlFirmato;
	}
	public String getHashXmlFirmato() {
		return hashXmlFirmato;
	}
	public void setHashXmlFirmato(String hashXmlFirmato) {
		this.hashXmlFirmato = hashXmlFirmato;
	}
	public String getContentTypeXmlFirmato() {
		return contentTypeXmlFirmato;
	}
	public void setContentTypeXmlFirmato(String contentTypeXmlFirmato) {
		this.contentTypeXmlFirmato = contentTypeXmlFirmato;
	}
	public Boolean getFlagVerificaFirma() {
		return flagVerificaFirma;
	}
	public void setFlagVerificaFirma(Boolean flagVerificaFirma) {
		this.flagVerificaFirma = flagVerificaFirma;
	}
	public Boolean getFlagLottoEu() {
		return flagLottoEu;
	}
	public void setFlagLottoEu(Boolean flagLottoEu) {
		this.flagLottoEu = flagLottoEu;
	}
	public String getUserIdFlgLottoEu() {
		return userIdFlgLottoEu;
	}
	public void setUserIdFlgLottoEu(String userIdFlgLottoEu) {
		this.userIdFlgLottoEu = userIdFlgLottoEu;
	}
	public Date getTmstFlgLottoEu() {
		return tmstFlgLottoEu;
	}
	public void setTmstFlgLottoEu(Date tmstFlgLottoEu) {
		this.tmstFlgLottoEu = tmstFlgLottoEu;
	}
	public Boolean getFlagFtp() {
		return flagFtp;
	}
	public void setFlagFtp(Boolean flagFtp) {
		this.flagFtp = flagFtp;
	}
	public String getPecDestinatario() {
		return pecDestinatario;
	}
	public void setPecDestinatario(String pecDestinatario) {
		this.pecDestinatario = pecDestinatario;
	}
	public Long getNazioneStabileCessionario() {
		return nazioneStabileCessionario;
	}
	public void setNazioneStabileCessionario(Long nazioneStabileCessionario) {
		this.nazioneStabileCessionario = nazioneStabileCessionario;
	}
	public Long getProvinciaStabileCessionario() {
		return provinciaStabileCessionario;
	}
	public void setProvinciaStabileCessionario(Long provinciaStabileCessionario) {
		this.provinciaStabileCessionario = provinciaStabileCessionario;
	}
	public Long getComuneStabileCessionario() {
		return comuneStabileCessionario;
	}
	public void setComuneStabileCessionario(Long comuneStabileCessionario) {
		this.comuneStabileCessionario = comuneStabileCessionario;
	}
	public String getCapStabileCessionario() {
		return capStabileCessionario;
	}
	public void setCapStabileCessionario(String capStabileCessionario) {
		this.capStabileCessionario = capStabileCessionario;
	}
	public String getIndirizzoStabileCessionario() {
		return indirizzoStabileCessionario;
	}
	public void setIndirizzoStabileCessionario(String indirizzoStabileCessionario) {
		this.indirizzoStabileCessionario = indirizzoStabileCessionario;
	}
	public String getNumCivicoStabileCessionario() {
		return numCivicoStabileCessionario;
	}
	public void setNumCivicoStabileCessionario(String numCivicoStabileCessionario) {
		this.numCivicoStabileCessionario = numCivicoStabileCessionario;
	}
	public String getComuneStabileCessionarioEst() {
		return comuneStabileCessionarioEst;
	}
	public void setComuneStabileCessionarioEst(String comuneStabileCessionarioEst) {
		this.comuneStabileCessionarioEst = comuneStabileCessionarioEst;
	}
	public Long getRegioneStabileCessionario() {
		return regioneStabileCessionario;
	}
	public void setRegioneStabileCessionario(Long regioneStabileCessionario) {
		this.regioneStabileCessionario = regioneStabileCessionario;
	}
	public Long getIdPaeseRapFiscaleCes() {
		return idPaeseRapFiscaleCes;
	}
	public void setIdPaeseRapFiscaleCes(Long idPaeseRapFiscaleCes) {
		this.idPaeseRapFiscaleCes = idPaeseRapFiscaleCes;
	}
	public String getIdCodiceRapFiscaleCes() {
		return idCodiceRapFiscaleCes;
	}
	public void setIdCodiceRapFiscaleCes(String idCodiceRapFiscaleCes) {
		this.idCodiceRapFiscaleCes = idCodiceRapFiscaleCes;
	}
	public String getCognomeRapFiscaleCes() {
		return cognomeRapFiscaleCes;
	}
	public void setCognomeRapFiscaleCes(String cognomeRapFiscaleCes) {
		this.cognomeRapFiscaleCes = cognomeRapFiscaleCes;
	}
	public String getNomeRapFiscaleCes() {
		return nomeRapFiscaleCes;
	}
	public void setNomeRapFiscaleCes(String nomeRapFiscaleCes) {
		this.nomeRapFiscaleCes = nomeRapFiscaleCes;
	}
	public String getDenominazioneRapFiscaleCes() {
		return denominazioneRapFiscaleCes;
	}
	public void setDenominazioneRapFiscaleCes(String denominazioneRapFiscaleCes) {
		this.denominazioneRapFiscaleCes = denominazioneRapFiscaleCes;
	}
	public Long getIdDizTipologiaDestinatario() {
		return idDizTipologiaDestinatario;
	}
	public void setIdDizTipologiaDestinatario(Long idDizTipologiaDestinatario) {
		this.idDizTipologiaDestinatario = idDizTipologiaDestinatario;
	}
	public Long getIdAdesione() {
		return idAdesione;
	}
	public void setIdAdesione(Long idAdesione) {
		this.idAdesione = idAdesione;
	}
	public byte[] getXmlFirmato() {
		return xmlFirmato;
	}
	public void setXmlFirmato(byte[] xmlFirmato) {
		this.xmlFirmato = xmlFirmato;
	}
	public byte[] getXmlNonFirmato() {
		return xmlNonFirmato;
	}
	public void setXmlNonFirmato(byte[] xmlNonFirmato) {
		this.xmlNonFirmato = xmlNonFirmato;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}