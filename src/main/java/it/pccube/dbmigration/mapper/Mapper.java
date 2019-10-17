package it.pccube.dbmigration.mapper;

import java.math.BigDecimal;
import java.util.Base64;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.pccube.dbmigration.destination.model.FatTLotto;
import it.pccube.dbmigration.ext.doc.DocumentaleService;
import it.pccube.dbmigration.ext.doc.OutputDocumentale;
import it.pccube.dbmigration.source.model.FeDizTipoCassa;
import it.pccube.dbmigration.source.model.FeLotto;

@Component
public class Mapper {
	
	private static final Logger logger = LoggerFactory.getLogger(DocumentaleService.class);

	
	private static final String BATCH_USER = "MIGRATION_BATCH_PROCESS";
	
	@Autowired
	private DocumentaleService docService;
	
//	public FatTDizTipoCassa mapFatTDizTipoCassa(FeDizTipoCassa bean){
//		FatTDizTipoCassa entity = new FatTDizTipoCassa();
//		entity.setIdDizTipoCassa(bean.getIdDizTipoCassa());
//		entity.setCdCodice(bean.getCodice());
//		entity.setDsDescrizione(bean.getDescrizione());
//		entity.setNmUtenteInserimento(BATCH_USER);
//		entity.setNmUtenteUltimaModifica(BATCH_USER);
//		entity.setTsInserimento(new Date());
//		entity.setTsUltimaModifica(new Date());
//		return entity;
//	}
	
	public FatTLotto mapFatTLotto(FeLotto bean){
		FatTLotto entity = new FatTLotto();
		entity.setIdAdesione(bean.getIdAdesione());
		entity.setCdCapSedeCedente(bean.getCapSedeCedente());
		entity.setCdCapSedeCessionario(bean.getCapSedeCessionario());
		entity.setCdCapStabileCedente(bean.getCapStabileCedente());
		entity.setCdCapStabileCessionario(bean.getCapStabileCessionario());
		entity.setCdCfCedente(bean.getCodiceFiscaleCedente());
		entity.setCdCivicoStabileCessionario(bean.getIndirizzoStabileCessionario());
		entity.setCdCodEoriCedente(bean.getCodEoriCedente());
		entity.setCdCodEoriCessionario(bean.getCodEoriCessionario());
		entity.setCdCodEoriRapFiscale(bean.getCodiceFiscaleRapFiscale());
		entity.setCdCodEoriTerzoInt(bean.getCodEoriTerzoInt());
		entity.setCdCodiceCedente(bean.getIdCodiceCedente());
		entity.setCdCodiceCessionario(bean.getIdCodiceCessionario());
		entity.setCdCodiceDestinatario(bean.getCodiceDestinatario());
		entity.setCdCodiceFiscaleCessionario(bean.getCodiceFiscaleCessionario());
		entity.setCdCodiceFiscaleRapFiscale(bean.getCodiceFiscaleRapFiscale());
		entity.setCdCodiceFiscaleTerzoInt(bean.getCodiceFiscaleTerzoInt());
		entity.setCdCodiceRapFiscale(bean.getIdCodiceRapFiscale());
		entity.setCdCodiceTerzoInt(bean.getIdCodiceTerzoInt());
		entity.setCdCodiceTrasmittente(bean.getIdCodiceTrasmittente());
		entity.setCdCodRapFiscaleCes(bean.getIdCodiceRapFiscaleCes());
		entity.setCdFaxCedente(bean.getFaxCedente());
		entity.setCdFormatoTrasmissione(bean.getFormatoTrasmissione());
		entity.setCdHashXmlFirmato(bean.getHashXmlFirmato());
		if (bean.getIdentificativoSdiLotto() != null)
			entity.setCdIdentificativoSdiLotto(bean.getIdentificativoSdiLotto().toString());
		entity.setCdNumCivicoSedeCessionario(bean.getNumCivicoSedeCessionario());
		entity.setCdNumCivicoStabileCedente(bean.getNumCivicoStabileCedente());
		entity.setCdNumeroCivicoSedeCedente(bean.getNumeroCivicoSedeCedente());
		entity.setCdNumeroReaCedente(bean.getNumeroReaCedente());
		entity.setCdNumIscrizioneAlboCedente(bean.getNumIscrizioneAlboCedente());
		entity.setCdPaeseTrasmittente(bean.getIdPaeseTrasmittente());
		entity.setCdProgressivoInvio(bean.getProgressivoInvio());
		entity.setCdRifAmministrazioneCedente(bean.getRifAmministrazioneCedente());
		entity.setCdTelefonoCedente(bean.getTelefonoCedente());
		entity.setCdTelefonoTrasmittente(bean.getTelefonoTrasmittente());
		entity.setDtDataIscrAlboCedente(bean.getDataIscrizioneAlboCedente());
		entity.setDtDataOraPrimaCreazione(bean.getDataOraPrimaCreazione());
		entity.setDtDataOraRicezione(bean.getDataOraRicezione());
		entity.setDtDataOraUltimaModifica(bean.getDataOraUltimaModifica());
		entity.setDtDataOraUltimoInvioSdi(bean.getDataOraUltimoInvioSdi());
		entity.setFlDaStoricizzare(bean.getFlagDaStoricizzare());
		entity.setFlEsitoVerificaFirma(bean.getEsitoVerificaFirma());
		entity.setFlFtp(bean.getFlagFtp());
		entity.setFlLottoEu(bean.getFlagLottoEu());
		entity.setFlVerificaFirma(bean.getFlagVerificaFirma());
		entity.setIdAdesione(bean.getIdAdesione());
		entity.setIdComuneSedeCedente(bean.getComuneSedeCedente());
		entity.setIdComuneSedeCessionario(bean.getComuneSedeCessionario());
		entity.setIdComuneStabileCedente(bean.getComuneStabileCedente());
		entity.setIdComuneStabileCessionario(bean.getComuneStabileCessionario());
		entity.setIdDizSocioUnicoCedente(bean.getSocioUnicoCedente());
		entity.setIdDizSoggettoEmittente(bean.getSoggettoEmittente());
		entity.setIdDizStatoLiquidazCedente(bean.getStatoLiquidazioneCedente());
		entity.setIdDizStatoLottoFattura(bean.getStato());
		entity.setIdDizTipologiaDestinatario(bean.getIdDizTipologiaDestinatario());
		entity.setIdEsitoInvio(bean.getEsitoInvio());
		entity.setIdLotto(bean.getIdLotto());
		entity.setIdNazioneSedeCedente(bean.getNazioneSedeCedente());
		entity.setIdNazioneSedeCessionario(bean.getNazioneSedeCessionario());
		entity.setIdNazioneStabileCedente(bean.getNazioneStabileCedente());
		entity.setIdNazioneStabileCessionario(bean.getNazioneStabileCessionario());
		entity.setIdPaeseCedente(bean.getIdPaeseCedente());
		entity.setIdPaeseCessionario(bean.getIdPaeseCessionario());
		entity.setIdPaeseRapFiscale(bean.getPaeseRapFiscale());
		entity.setIdPaeseRapFiscaleCes(bean.getIdPaeseRapFiscaleCes());
		entity.setIdPaeseTerzoInt(bean.getIdPaeseTerzoInt());
		entity.setIdProvinciaAlboCedente(bean.getProvinciaAlboCedente());
		entity.setIdProvinciaSedeCedente(bean.getProvinciaSedeCedente());
		entity.setIdProvinciaSedeCessionario(bean.getProvinciaSedeCessionario());
		entity.setIdProvinciaStabileCedente(bean.getProvinciaStabileCedente());
		entity.setIdProvinciaStabileCes(bean.getProvinciaStabileCessionario());
		entity.setIdRegimeFiscaleCedente(bean.getRegimeFiscaleCedente());
		entity.setIdRegioneAlboCedente(bean.getRegioneAlboCedente());
		entity.setIdRegioneReaCedente(bean.getRegioneReaCedente());
		entity.setIdRegioneSedeCedente(bean.getRegioneSedeCedente());
		entity.setIdRegioneSedeCessionario(bean.getRegioneSedeCessionario());
		entity.setIdRegioneStabileCedente(bean.getRegioneStabileCedente());
		entity.setIdRegioneStabileCessionario(bean.getRegioneStabileCessionario());
//TODO
//		entity.setIdSediaAssegnatario(idSediaAssegnatario);
//		entity.setIdSediaCreatore(idSediaCreatore);
//		entity.setIdSediaUltimaMod(idSediaUltimaMod);
		entity.setIdUfficioReaCedente(bean.getUfficioReaCedente());
		
		
		if (bean.getXmlFirmato() != null){
			String base64String = Base64.getEncoder().encodeToString(bean.getXmlFirmato());
			logger.info("Tentativo chiamata documentale per salvataggion documento XmlFirmato tabella FeLotto con id: " + bean.getIdLotto());
			OutputDocumentale doc = docService.uploadDocumento(base64String, bean.getNomeXmlFirmato());
			entity.setIdXmlFirmato(doc.getId());
		}
		if (bean.getXmlNonFirmato() != null){
			logger.info("Tentativo chiamata documentale per salvataggion documento XmlNonFirmato tabella FeLotto con id: " + bean.getIdLotto());
			String base64String = Base64.getEncoder().encodeToString(bean.getXmlNonFirmato());
			OutputDocumentale doc = docService.uploadDocumento(base64String, bean.getNomeXmlNonFirmato());
			entity.setIdXmlNonFirmato(doc.getId());
		}
		
		entity.setImCapitaleSocialeCedente(bean.getCapitaleSocialeCedente());
		entity.setNmAlboProfessionaleCedente(bean.getAlboProfessionaleCedente());
		entity.setNmCognomeCedente(bean.getCognomeCedente());
		entity.setNmCognomeCessionario(bean.getCognomeCessionario());
		entity.setNmCognomeRapFiscale(bean.getCognomeRapFiscale());
		entity.setNmCognomeRapFiscaleCes(bean.getCognomeRapFiscaleCes());
		entity.setNmCognomeTerzoInt(bean.getCognomeTerzoInt());
		entity.setNmComuneSedeCedenteEst(bean.getComuneSedeCedenteEst());
		entity.setNmComuneSedeCessionarioEst(bean.getComuneSedeCessionarioEst());
		entity.setNmComuneStabileCedenteEst(bean.getComuneStabileCessionarioEst());
		entity.setNmComuneStabileCesEst(bean.getComuneStabileCessionarioEst());
		entity.setNmContentTypeXmlFirmato(bean.getContentTypeXmlFirmato());
		entity.setNmDenominazioneCedente(bean.getDenominazioneCedente());
		entity.setNmDenominazioneCessionario(bean.getDenominazioneCessionario());
		entity.setNmDenominazioneRapFiscale(bean.getDenominazioneRapFiscale());
		entity.setNmDenominazioneRapFiscCes(bean.getDenominazioneRapFiscaleCes());
		entity.setNmDenominazioneTerzoInt(bean.getDenominazioneTerzoInt());
		entity.setNmEmailCedente(bean.getEmailCedente());
		entity.setNmEmailTrasmittente(bean.getEmailTrasmittente());
		entity.setNmIndirizStabileCessionario(bean.getIndirizzoStabileCedente());
		entity.setNmIndirizzoSedeCedente(bean.getIndirizzoSedeCedente());
		entity.setNmIndirizzoSedeCessionario(bean.getIndirizzoSedeCessionario());
		entity.setNmIndirizzoStabileCedente(bean.getIndirizzoStabileCedente());
		entity.setNmNomeCedente(bean.getNomeCedente());
		entity.setNmNomeCessionario(bean.getNomeCessionario());
		entity.setNmNomeRapFiscale(bean.getNomeRapFiscale());
		entity.setNmNomeTerzoInt(bean.getNomeTerzoInt());
		entity.setNmNomeXmlFirmato(bean.getNomeXmlFirmato());
		entity.setNmNomeXmlNonFirmato(bean.getNomeXmlNonFirmato());
		entity.setNmPecDestinatario(bean.getPecDestinatario());
		entity.setNmTicketConservazione(bean.getTicketConservazione());
		entity.setNmTitoloCedente(bean.getTitoloCedente());
		entity.setNmTitoloCessionario(bean.getTitoloCessionario());
		entity.setNmTitoloRapFiscale(bean.getTitoloRapFiscale());
		entity.setNmTitoloTerzoInt(bean.getTitoloTerzoInt());
		entity.setNmUtenteInserimento(bean.getUseridInserimento());
		entity.setNmUtenteUltimaModifica(bean.getUseridUltimoAggiornamento());
		if (bean.getVersioneLotto() != null)
			entity.setPgVersioneLotto(BigDecimal.valueOf(bean.getVersioneLotto()));
		if (bean.getSizeXmlFirmato() != null)
			entity.setQtSizeXmlFirmato(BigDecimal.valueOf(bean.getSizeXmlFirmato()));
		entity.setTsInserimento(bean.getTmstInserimento());
		entity.setTsUltimaModifica(bean.getTmstUltimoAggiornamento());
		return entity;
	}

}
