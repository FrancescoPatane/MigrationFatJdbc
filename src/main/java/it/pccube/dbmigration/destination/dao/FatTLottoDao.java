package it.pccube.dbmigration.destination.dao;

import org.springframework.stereotype.Repository;

import it.pccube.dbmigration.destination.model.FatTLotto;

@Repository
public class FatTLottoDao extends DestinationDao{
	
	
	public void insert(FatTLotto entity){
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO ");
		sb.append(FatTLotto.TABLE_NAME);
		sb.append(" (");
		sb.append("cd_cap_sede_cedente, ");
		sb.append("cd_cap_sede_cessionario, ");
		sb.append("cd_cap_stabile_cedente, ");
		sb.append("cd_cap_stabile_cessionario, ");
		sb.append("cd_cf_cedente, ");
		sb.append("cd_civico_stabile_cessionario, ");
		sb.append("cd_cod_eori_cedente, ");
		sb.append("cd_cod_eori_cessionario, ");
		sb.append("cd_cod_eori_rap_fiscale, ");
		sb.append("cd_cod_eori_terzo_int, ");
		sb.append("cd_codice_cedente, ");
		sb.append("cd_codice_cessionario, ");
		sb.append("cd_codice_destinatario, ");
		sb.append("cd_codice_fiscale_cessionario, ");
		sb.append("cd_codice_fiscale_rap_fiscale, ");
		sb.append("cd_codice_fiscale_terzo_int, ");
		sb.append("cd_codice_rap_fiscale, ");
		sb.append("cd_codice_terzo_int, ");
		sb.append("cd_codice_trasmittente, ");
		sb.append("cd_cod_rap_fiscale_ces, ");
		sb.append("cd_fax_cedente, ");
		sb.append("cd_formato_trasmissione, ");
		sb.append("cd_hash_xml_firmato, ");
		sb.append("cd_identificativo_sdi_lotto, ");
		sb.append("cd_num_civico_sede_cessionario, ");
		sb.append("cd_num_civico_stabile_cedente, ");
		sb.append("cd_numero_civico_sede_cedente, ");
		sb.append("cd_numero_rea_cedente, ");
		sb.append("cd_num_iscrizione_albo_cedente, ");
		sb.append("cd_paese_trasmittente, ");
		sb.append("cd_progressivo_invio, ");
		sb.append("cd_rif_amministrazione_cedente, ");
		sb.append("cd_telefono_cedente, ");
		sb.append("cd_telefono_trasmittente, ");
		sb.append("dt_data_iscr_albo_cedente, ");
		sb.append("dt_data_ora_prima_creazione, ");
		sb.append("dt_data_ora_ricezione, ");
		sb.append("dt_data_ora_ultima_modifica, ");
		sb.append("dt_data_ora_ultimo_invio_sdi, ");
		sb.append("fl_da_storicizzare, ");
		sb.append("fl_esito_verifica_firma, ");
		sb.append("fl_ftp, ");
		sb.append("fl_lotto_eu, ");
		sb.append("fl_verifica_firma, ");
		sb.append("id_adesione, ");
		sb.append("id_comune_sede_cedente, ");
		sb.append("id_comune_sede_cessionario, ");
		sb.append("id_comune_stabile_cedente, ");
		sb.append("id_comune_stabile_cessionario, ");
		sb.append("id_diz_socio_unico_cedente, ");
		sb.append("id_diz_soggetto_emittente, ");
		sb.append("id_diz_stato_liquidaz_cedente, ");
		sb.append("id_diz_stato_lotto_fattura, ");
		sb.append("id_diz_tipologia_destinatario, ");
		sb.append("id_esito_invio, ");
		sb.append("id_lotto, ");
		sb.append("id_nazione_sede_cedente, ");
		sb.append("id_nazione_sede_cessionario, ");
		sb.append("id_nazione_stabile_cedente, ");
		sb.append("id_nazione_stabile_cessionario, ");
		sb.append("id_paese_cedente, ");
		sb.append("id_paese_cessionario, ");
		sb.append("id_paese_rap_fiscale, ");
		sb.append("id_paese_rap_fiscale_ces, ");
		sb.append("id_paese_terzo_int, ");
		sb.append("id_provincia_albo_cedente, ");
		sb.append("id_provincia_sede_cedente, ");
		sb.append("id_provincia_sede_cessionario, ");
		sb.append("id_provincia_stabile_cedente, ");
		sb.append("id_provincia_stabile_ces, ");
		sb.append("id_regime_fiscale_cedente, ");
		sb.append("id_regione_albo_cedente, ");
		sb.append("id_regione_rea_cedente, ");
		sb.append("id_regione_sede_cedente, ");
		sb.append("id_regione_sede_cessionario, ");
		sb.append("id_regione_stabile_cedente, ");
		sb.append("id_regione_stabile_cessionario, ");
		sb.append("id_sedia_assegnatario, ");
		sb.append("id_sedia_creatore, ");
		sb.append("id_sedia_ultima_mod, ");
		sb.append("id_ufficio_rea_cedente, ");
		sb.append("id_xml_firmato, ");
		sb.append("id_xml_non_firmato, ");
		sb.append("im_capitale_sociale_cedente, ");
		sb.append("nm_albo_professionale_cedente, ");
		sb.append("nm_cognome_cedente, ");
		sb.append("nm_cognome_cessionario, ");
		sb.append("nm_cognome_rap_fiscale, ");
		sb.append("nm_cognome_rap_fiscale_ces, ");
		sb.append("nm_cognome_terzo_int, ");
		sb.append("nm_comune_sede_cedente_est, ");
		sb.append("nm_comune_sede_cessionario_est, ");
		sb.append("nm_comune_stabile_cedente_est, ");
		sb.append("nm_comune_stabile_ces_est, ");
		sb.append("nm_content_type_xml_firmato, ");
		sb.append("nm_denominazione_cedente, ");
		sb.append("nm_denominazione_cessionario, ");
		sb.append("nm_denominazione_rap_fiscale, ");
		sb.append("nm_denominazione_rap_fisc_ces, ");
		sb.append("nm_denominazione_terzo_int, ");
		sb.append("nm_email_cedente, ");
		sb.append("nm_email_trasmittente, ");
		sb.append("nm_indiriz_stabile_cessionario, ");
		sb.append("nm_indirizzo_sede_cedente, ");
		sb.append("nm_indirizzo_sede_cessionario, ");
		sb.append("nm_indirizzo_stabile_cedente, ");
		sb.append("nm_nome_cedente, ");
		sb.append("nm_nome_cessionario, ");
		sb.append("nm_nome_rap_fiscale, ");
		sb.append("nm_nome_rap_fiscale_ces, ");
		sb.append("nm_nome_terzo_int, ");
		sb.append("nm_nome_xml_firmato, ");
		sb.append("nm_nome_xml_non_firmato, ");
		sb.append("nm_pec_destinatario, ");
		sb.append("nm_ticket_conservazione, ");
		sb.append("nm_titolo_cedente, ");
		sb.append("nm_titolo_cessionario, ");
		sb.append("nm_titolo_rap_fiscale, ");
		sb.append("nm_titolo_terzo_int, ");
		sb.append("nm_utente_inserimento, ");
		sb.append("nm_utente_ultima_modifica, ");
		sb.append("pg_versione_lotto, ");
		sb.append("qt_size_xml_firmato, ");
		sb.append("ts_inserimento, ");
		sb.append("ts_ultima_modifica");
		sb.append(") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
		this.jdbcTemplate.update(sb.toString(), 
				entity.getCdCapSedeCedente(),
				entity.getCdCapSedeCessionario(),
				entity.getCdCapStabileCedente(),
				entity.getCdCapStabileCessionario(),
				entity.getCdCfCedente(),
				entity.getCdCivicoStabileCessionario(),
				entity.getCdCodEoriCedente(),
				entity.getCdCodEoriCessionario(),
				entity.getCdCodEoriRapFiscale(),
				entity.getCdCodEoriTerzoInt(),
				entity.getCdCodiceCedente(),
				entity.getCdCodiceCessionario(),
				entity.getCdCodiceDestinatario(),
				entity.getCdCodiceFiscaleCessionario(),
				entity.getCdCodiceFiscaleRapFiscale(),
				entity.getCdCodiceFiscaleTerzoInt(),
				entity.getCdCodiceRapFiscale(),
				entity.getCdCodiceTerzoInt(),
				entity.getCdCodiceTrasmittente(),
				entity.getCdCodRapFiscaleCes(),
				entity.getCdFaxCedente(),
				entity.getCdFormatoTrasmissione(),
				entity.getCdHashXmlFirmato(),
				entity.getCdIdentificativoSdiLotto(),
				entity.getCdNumCivicoSedeCessionario(),
				entity.getCdNumCivicoStabileCedente(),
				entity.getCdNumeroCivicoSedeCedente(),
				entity.getCdNumeroReaCedente(),
				entity.getCdNumIscrizioneAlboCedente(),
				entity.getCdPaeseTrasmittente(),
				entity.getCdProgressivoInvio(),
				entity.getCdRifAmministrazioneCedente(),
				entity.getCdTelefonoCedente(),
				entity.getCdTelefonoTrasmittente(),
				entity.getDtDataIscrAlboCedente(),
				entity.getDtDataOraPrimaCreazione(),
				entity.getDtDataOraRicezione(),
				entity.getDtDataOraUltimaModifica(),
				entity.getDtDataOraUltimoInvioSdi(),
				entity.getFlDaStoricizzare(),
				entity.getFlEsitoVerificaFirma(),
				entity.getFlFtp(),
				entity.getFlLottoEu(),
				entity.getFlVerificaFirma(),
				entity.getIdAdesione(),
				entity.getIdComuneSedeCedente(),
				entity.getIdComuneSedeCessionario(),
				entity.getIdComuneStabileCedente(),
				entity.getIdComuneStabileCessionario(),
				entity.getIdDizSocioUnicoCedente(),
				entity.getIdDizSoggettoEmittente(),
				entity.getIdDizStatoLiquidazCedente(),
				entity.getIdDizStatoLottoFattura(),
				entity.getIdDizTipologiaDestinatario(),
				entity.getIdEsitoInvio(),
				entity.getIdLotto(),
				entity.getIdNazioneSedeCedente(),
				entity.getIdNazioneSedeCessionario(),
				entity.getIdNazioneStabileCedente(),
				entity.getIdNazioneStabileCessionario(),
				entity.getIdPaeseCedente(),
				entity.getIdPaeseCessionario(),
				entity.getIdPaeseRapFiscale(),
				entity.getIdPaeseRapFiscaleCes(),
				entity.getIdPaeseTerzoInt(),
				entity.getIdProvinciaAlboCedente(),
				entity.getIdProvinciaSedeCedente(),
				entity.getIdProvinciaSedeCessionario(),
				entity.getIdProvinciaStabileCedente(),
				entity.getIdProvinciaStabileCes(),
				entity.getIdRegimeFiscaleCedente(),
				entity.getIdRegioneAlboCedente(),
				entity.getIdRegioneReaCedente(),
				entity.getIdRegioneSedeCedente(),
				entity.getIdRegioneSedeCessionario(),
				entity.getIdRegioneStabileCedente(),
				entity.getIdRegioneStabileCessionario(),
				entity.getIdSediaAssegnatario(),
				entity.getIdSediaCreatore(),
				entity.getIdSediaUltimaMod(),
				entity.getIdUfficioReaCedente(),
				entity.getIdXmlFirmato(),
				entity.getIdXmlNonFirmato(),
				entity.getImCapitaleSocialeCedente(),
				entity.getNmAlboProfessionaleCedente(),
				entity.getNmCognomeCedente(),
				entity.getNmCognomeCessionario(),
				entity.getNmCognomeRapFiscale(),
				entity.getNmCognomeRapFiscaleCes(),
				entity.getNmCognomeTerzoInt(),
				entity.getNmComuneSedeCedenteEst(),
				entity.getNmComuneSedeCessionarioEst(),
				entity.getNmComuneStabileCedenteEst(),
				entity.getNmComuneStabileCesEst(),
				entity.getNmContentTypeXmlFirmato(),
				entity.getNmDenominazioneCedente(),
				entity.getNmDenominazioneCessionario(),
				entity.getNmDenominazioneRapFiscale(),
				entity.getNmDenominazioneRapFiscCes(),
				entity.getNmDenominazioneTerzoInt(),
				entity.getNmEmailCedente(),
				entity.getNmEmailTrasmittente(),
				entity.getNmIndirizStabileCessionario(),
				entity.getNmIndirizzoSedeCedente(),
				entity.getNmIndirizzoSedeCessionario(),
				entity.getNmIndirizzoStabileCedente(),
				entity.getNmNomeCedente(),
				entity.getNmNomeCessionario(),
				entity.getNmNomeRapFiscale(),
				entity.getNmNomeRapFiscaleCes(),
				entity.getNmNomeTerzoInt(),
				entity.getNmNomeXmlFirmato(),
				entity.getNmNomeXmlNonFirmato(),
				entity.getNmPecDestinatario(),
				entity.getNmTicketConservazione(),
				entity.getNmTitoloCedente(),
				entity.getNmTitoloCessionario(),
				entity.getNmTitoloRapFiscale(),
				entity.getNmTitoloTerzoInt(),
				entity.getNmUtenteInserimento(),
				entity.getNmUtenteUltimaModifica(),
				entity.getPgVersioneLotto(),
				entity.getQtSizeXmlFirmato(),
				entity.getTsInserimento(),
				entity.getTsUltimaModifica()
				);
	}
	

}
