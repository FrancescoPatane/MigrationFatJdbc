package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;



/**
 * The persistent class for the FAT_T_ADESIONE database table.
 * 
 */
@Entity
@Table(name="FAT_T_ADESIONE")
public class FatTAdesione implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_ADESIONE")
	@SequenceGenerator(name = "SEQ_ID_ADESIONE", sequenceName = "SEQ_ID_ADESIONE", allocationSize = 1)
	@Column(name="ID_ADESIONE")
	private Long idAdesione;

	@Column(name="CD_CAP_SEDE")
	
	private String cdCapSede;

	@Column(name="CD_CAP_STABILE")
	
	private String cdCapStabile;

	@Column(name="CD_CODICE_FISCALE")
	
	private String cdCodiceFiscale;

	@Column(name="CD_FAX_SEDE")
	
	private String cdFaxSede;

	@Column(name="CD_FAX_STABILE")
	
	private String cdFaxStabile;

//	@Column(name="CD_HASH_FILE_FIRMATO")
//	
//	private String cdHashFileFirmato;

	@Column(name="CD_NUMERO_CIVICO_SEDE")
	
	private String cdNumeroCivicoSede;

	@Column(name="CD_NUMERO_CIVICO_STABILE")
	
	private String cdNumeroCivicoStabile;

	@Column(name="CD_NUMERO_ISCRIZIONE_ALBO")
	
	private String cdNumeroIscrizioneAlbo;

	@Column(name="CD_NUMERO_REA")
	
	private String cdNumeroRea;

	@Column(name="CD_TELEFONO_SEDE")
	
	private String cdTelefonoSede;

	@Column(name="CD_TELEFONO_STABILE")
	
	private String cdTelefonoStabile;

	@Column(name="DS_TIPOLOGIA_SOCIETARIA")
	
	private String dsTipologiaSocietaria;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_DECADENZA_ADE")
	
	private Date dtDataDecadenzaAde;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_FINE_VALIDITA")
	
	private Date dtDataFineValidita;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_INIZIO_VALIDITA")
	
	private Date dtDataInizioValidita;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ISCRIZIONE_ALBO")
	
	private Date dtDataIscrizioneAlbo;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_SOSPENSIONE_ADE")
	
	private Date dtDataSospensioneAde;

	@Column(name="FL_ATTUALE")
	
	private Boolean flAttuale;

	@Column(name="FL_PMI_DIPENDENTI")
	
	private Boolean flPmiDipendenti;

	@Column(name="FL_PMI_RACCOMANDAZIONE")
	
	private Boolean flPmiRaccomandazione;

	@Column(name="FL_PMI_TOTALE_BILANCIO")
	
	private Boolean flPmiTotaleBilancio;

	@Column(name="FL_PMI_ULTIMO_BILANCIO")
	
	private Boolean flPmiUltimoBilancio;

//	@Column(name="FL_VERIFICA_FIRMA")
//	
//	private Boolean flVerificaFirma;

	@Column(name="CD_CODICE")
	
	private String cdCodice;

	@Column(name="ID_COMUNE_SEDE")
	private Long idComuneSede;

	@Column(name="ID_COMUNE_STABILE")
	private Long idComuneStabile;

	@Column(name="ID_NAZIONE_STABILE")
	private Long idNazioneStabile;

	@Column(name="ID_PAESE")
	private Long idPaese;

	@Column(name="ID_PROVINCIA_ALBO")
	private Long idProvinciaAlbo;

	@Column(name="ID_PROVINCIA_SEDE")
	private Long idProvinciaSede;

	@Column(name="ID_PROVINCIA_STABILE")
	private Long idProvinciaStabile;

	@Column(name="ID_REGIONE_ALBO")
	private Long idRegioneAlbo;

	@Column(name="ID_REGIONE_REA")
	private Long idRegioneRea;

	@Column(name="ID_REGIONE_SEDE")
	private Long idRegioneSede;

	@Column(name="ID_REGIONE_STABILE")
	private Long idRegioneStabile;

	@Column(name="ID_SEDIA")
	private Long idSedia;

	@Column(name="ID_UFFICIO_REA")
	private Long idUfficioRea;

	@Column(name="IM_CAPITALE_SOCIALE")
	
	private BigDecimal imCapitaleSociale;

	@Column(name="NM_ALBO_PROFESSIONALE")
	
	private String nmAlboProfessionale;

	@Column(name="NM_COMUNE_SEDE_EST")
	
	private String nmComuneSedeEst;

	@Column(name="NM_COMUNE_STABILE_EST")
	
	private String nmComuneStabileEst;

//	@Column(name="NM_CONTENT_TYPE_FILE_FIRMATO")
//	
//	private String nmContentTypeFileFirmato;

	@Column(name="NM_EMAIL")
	
	private String nmEmail;

	@Column(name="NM_INDIRIZZO_SEDE")
	
	private String nmIndirizzoSede;

	@Column(name="NM_INDIRIZZO_STABILE")
	
	private String nmIndirizzoStabile;

//	@Column(name="NM_NOME_FILE_FIRMATO")
//	
//	private String nmNomeFileFirmato;
//
//	@Column(name="NM_NOME_FILE_NON_FIRMATO")
//	
//	private String nmNomeFileNonFirmato;

	@Column(name="NM_RAGIONE_SOCIALE")
	
	private String nmRagioneSociale;

	@Column(name="NM_REGIONE_SEDE_EST")
	
	private String nmRegioneSedeEst;

	@Column(name="NM_RIFERIMENTO_AMMINISTRAZIONE")
	
	private String nmRiferimentoAmministrazione;

	@Column(name="NM_UTENTE_INSERIMENTO")
	
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	
	private String nmUtenteUltimaModifica;

	@Column(name="NR_NUM_GIORNI_CATALOG_DISAT")
	
	private Long nrNumGiorniCatalogDisat;

//	@Column(name="NR_SIZE_FILE_FIRMATO")
//	
//	private Long nrSizeFileFirmato;

//	@Column(name="ID_FILE_FIRMATO")
//	
//	private String idFileFirmato;
//
//	@Column(name="ID_FILE_NON_FIRMATO")
//	
//	private String idFileNonFirmato;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatAStatoAdesione
	@OneToMany(mappedBy="adesione")
	private List<FatAStatoAdesione> listStatoAdesione;

	//bi-directional many-to-one association to dizSocioUnico
	@ManyToOne
	@JoinColumn(name="ID_DIZ_SOCIO_UNICO")
	private FatTDizSocioUnico dizSocioUnico;
	
	//bi-directional many-to-one association to dizStatoAdesione
	@ManyToOne
	@JoinColumn(name="ID_DIZ_STATO_ADESIONE", nullable=false)
	private FatTDizStatoAdesione dizStatoAdesione;

	//bi-directional many-to-one association to dizStatoLiquidazione
	@ManyToOne
	@JoinColumn(name="ID_DIZ_STATO_LIQUIDAZIONE")
	private FatTDizStatoLiquidazione dizStatoLiquidazione;
	
	//bi-directional many-to-one association to dizRegimeFiscale
	@ManyToOne
	@JoinColumn(name="ID_REGIME_FISCALE")
	private FatTDizRegimeFiscale dizRegimeFiscale;
	
	@ManyToOne
	@JoinColumn(name="ID_ADESIONE_PREC")
	private FatTAdesione adesionePrecedente;

	@OneToMany(mappedBy="adesionePrecedente")
	private List<FatTAdesione> listAdesione;
	
	//bi-directional many-to-one association to FatTAdesioneNotifica
	@OneToMany(mappedBy="adesione")
	private List<FatTAdesioneNotifica> listAdesioneNotifica;

	//bi-directional many-to-one association to FatTImpreseCollegAssoc
	@OneToMany(mappedBy="adesione")
	@Cascade({CascadeType.SAVE_UPDATE, CascadeType.PERSIST, CascadeType.DELETE})
	private List<FatTImpreseCollegAssoc> listImpreseCollegAssoc;

	//bi-directional many-to-one association to FatTLottoStor
	@OneToMany(mappedBy="adesione")
	private List<FatTLottoStor> listLottoStor;
	
	//bi-directional many-to-one association to FatTLottoStor
	@OneToMany(mappedBy="adesione")
	private List<FatTLotto> listLotto;

	//bi-directional many-to-one association to FatTMail
	@OneToMany(mappedBy="adesione")
	private List<FatTMail> listMail;

	//bi-directional many-to-one association to FatTVerifFirmaAde
	@OneToMany(mappedBy="adesione")
	private List<FatTVerifFirmaAde> listVerifFirmaAde;

	public FatTAdesione() {
		super();
	}

	public Long getIdAdesione() {
		return this.idAdesione;
	}

	public void setIdAdesione(Long idAdesione) {
		this.idAdesione = idAdesione;
	}

	public String getCdCapSede() {
		return this.cdCapSede;
	}

	public void setCdCapSede(String cdCapSede) {
		this.cdCapSede = cdCapSede;
	}

	public String getCdCapStabile() {
		return this.cdCapStabile;
	}

	public void setCdCapStabile(String cdCapStabile) {
		this.cdCapStabile = cdCapStabile;
	}

	public String getCdCodiceFiscale() {
		return this.cdCodiceFiscale;
	}

	public void setCdCodiceFiscale(String cdCodiceFiscale) {
		this.cdCodiceFiscale = cdCodiceFiscale;
	}

	public String getCdFaxSede() {
		return this.cdFaxSede;
	}

	public void setCdFaxSede(String cdFaxSede) {
		this.cdFaxSede = cdFaxSede;
	}

	public String getCdFaxStabile() {
		return this.cdFaxStabile;
	}

	public void setCdFaxStabile(String cdFaxStabile) {
		this.cdFaxStabile = cdFaxStabile;
	}

//	public String getCdHashFileFirmato() {
//		return this.cdHashFileFirmato;
//	}
//
//	public void setCdHashFileFirmato(String cdHashFileFirmato) {
//		this.cdHashFileFirmato = cdHashFileFirmato;
//	}

	public String getCdNumeroCivicoSede() {
		return this.cdNumeroCivicoSede;
	}

	public void setCdNumeroCivicoSede(String cdNumeroCivicoSede) {
		this.cdNumeroCivicoSede = cdNumeroCivicoSede;
	}

	public String getCdNumeroCivicoStabile() {
		return this.cdNumeroCivicoStabile;
	}

	public void setCdNumeroCivicoStabile(String cdNumeroCivicoStabile) {
		this.cdNumeroCivicoStabile = cdNumeroCivicoStabile;
	}

	public String getCdNumeroIscrizioneAlbo() {
		return this.cdNumeroIscrizioneAlbo;
	}

	public void setCdNumeroIscrizioneAlbo(String cdNumeroIscrizioneAlbo) {
		this.cdNumeroIscrizioneAlbo = cdNumeroIscrizioneAlbo;
	}

	public String getCdNumeroRea() {
		return this.cdNumeroRea;
	}

	public void setCdNumeroRea(String cdNumeroRea) {
		this.cdNumeroRea = cdNumeroRea;
	}

	public String getCdTelefonoSede() {
		return this.cdTelefonoSede;
	}

	public void setCdTelefonoSede(String cdTelefonoSede) {
		this.cdTelefonoSede = cdTelefonoSede;
	}

	public String getCdTelefonoStabile() {
		return this.cdTelefonoStabile;
	}

	public void setCdTelefonoStabile(String cdTelefonoStabile) {
		this.cdTelefonoStabile = cdTelefonoStabile;
	}

	public String getDsTipologiaSocietaria() {
		return dsTipologiaSocietaria;
	}

	public void setDsTipologiaSocietaria(String dsTipologiaSocietaria) {
		this.dsTipologiaSocietaria = dsTipologiaSocietaria;
	}

	public Date getDtDataDecadenzaAde() {
		return this.dtDataDecadenzaAde;
	}

	public void setDtDataDecadenzaAde(Date dtDataDecadenzaAde) {
		this.dtDataDecadenzaAde = dtDataDecadenzaAde;
	}

	public Date getDtDataFineValidita() {
		return this.dtDataFineValidita;
	}

	public void setDtDataFineValidita(Date dtDataFineValidita) {
		this.dtDataFineValidita = dtDataFineValidita;
	}

	public Date getDtDataInizioValidita() {
		return this.dtDataInizioValidita;
	}

	public void setDtDataInizioValidita(Date dtDataInizioValidita) {
		this.dtDataInizioValidita = dtDataInizioValidita;
	}

	public Date getDtDataIscrizioneAlbo() {
		return this.dtDataIscrizioneAlbo;
	}

	public void setDtDataIscrizioneAlbo(Date dtDataIscrizioneAlbo) {
		this.dtDataIscrizioneAlbo = dtDataIscrizioneAlbo;
	}

	public Date getDtDataSospensioneAde() {
		return this.dtDataSospensioneAde;
	}

	public void setDtDataSospensioneAde(Date dtDataSospensioneAde) {
		this.dtDataSospensioneAde = dtDataSospensioneAde;
	}

	public Boolean getFlAttuale() {
		return this.flAttuale;
	}

	public void setFlAttuale(Boolean flAttuale) {
		this.flAttuale = flAttuale;
	}

	public Boolean getFlPmiDipendenti() {
		return this.flPmiDipendenti;
	}

	public void setFlPmiDipendenti(Boolean flPmiDipendenti) {
		this.flPmiDipendenti = flPmiDipendenti;
	}

	public Boolean getFlPmiRaccomandazione() {
		return this.flPmiRaccomandazione;
	}

	public void setFlPmiRaccomandazione(Boolean flPmiRaccomandazione) {
		this.flPmiRaccomandazione = flPmiRaccomandazione;
	}

	public Boolean getFlPmiTotaleBilancio() {
		return this.flPmiTotaleBilancio;
	}

	public void setFlPmiTotaleBilancio(Boolean flPmiTotaleBilancio) {
		this.flPmiTotaleBilancio = flPmiTotaleBilancio;
	}

	public Boolean getFlPmiUltimoBilancio() {
		return this.flPmiUltimoBilancio;
	}

	public void setFlPmiUltimoBilancio(Boolean flPmiUltimoBilancio) {
		this.flPmiUltimoBilancio = flPmiUltimoBilancio;
	}

//	public Boolean getFlVerificaFirma() {
//		return this.flVerificaFirma;
//	}
//
//	public void setFlVerificaFirma(Boolean flVerificaFirma) {
//		this.flVerificaFirma = flVerificaFirma;
//	}

	public String getCdCodice() {
		return this.cdCodice;
	}

	public void setCdCodice(String cdCodice) {
		this.cdCodice = cdCodice;
	}

	public Long getIdComuneSede() {
		return this.idComuneSede;
	}

	public void setIdComuneSede(Long idComuneSede) {
		this.idComuneSede = idComuneSede;
	}

	public Long getIdComuneStabile() {
		return this.idComuneStabile;
	}

	public void setIdComuneStabile(Long idComuneStabile) {
		this.idComuneStabile = idComuneStabile;
	}

	public Long getIdNazioneStabile() {
		return this.idNazioneStabile;
	}

	public void setIdNazioneStabile(Long idNazioneStabile) {
		this.idNazioneStabile = idNazioneStabile;
	}

	public Long getIdPaese() {
		return this.idPaese;
	}

	public void setIdPaese(Long idPaese) {
		this.idPaese = idPaese;
	}

	public Long getIdProvinciaAlbo() {
		return this.idProvinciaAlbo;
	}

	public void setIdProvinciaAlbo(Long idProvinciaAlbo) {
		this.idProvinciaAlbo = idProvinciaAlbo;
	}

	public Long getIdProvinciaSede() {
		return this.idProvinciaSede;
	}

	public void setIdProvinciaSede(Long idProvinciaSede) {
		this.idProvinciaSede = idProvinciaSede;
	}

	public Long getIdProvinciaStabile() {
		return this.idProvinciaStabile;
	}

	public void setIdProvinciaStabile(Long idProvinciaStabile) {
		this.idProvinciaStabile = idProvinciaStabile;
	}

	public Long getIdRegioneAlbo() {
		return this.idRegioneAlbo;
	}

	public void setIdRegioneAlbo(Long idRegioneAlbo) {
		this.idRegioneAlbo = idRegioneAlbo;
	}

	public Long getIdRegioneRea() {
		return this.idRegioneRea;
	}

	public void setIdRegioneRea(Long idRegioneRea) {
		this.idRegioneRea = idRegioneRea;
	}

	public Long getIdRegioneSede() {
		return this.idRegioneSede;
	}

	public void setIdRegioneSede(Long idRegioneSede) {
		this.idRegioneSede = idRegioneSede;
	}

	public Long getIdRegioneStabile() {
		return this.idRegioneStabile;
	}

	public void setIdRegioneStabile(Long idRegioneStabile) {
		this.idRegioneStabile = idRegioneStabile;
	}

	public Long getIdSedia() {
		return this.idSedia;
	}

	public void setIdSedia(Long idSedia) {
		this.idSedia = idSedia;
	}

	public Long getIdUfficioRea() {
		return this.idUfficioRea;
	}

	public void setIdUfficioRea(Long idUfficioRea) {
		this.idUfficioRea = idUfficioRea;
	}

	public BigDecimal getImCapitaleSociale() {
		return this.imCapitaleSociale;
	}

	public void setImCapitaleSociale(BigDecimal imCapitaleSociale) {
		this.imCapitaleSociale = imCapitaleSociale;
	}

	public String getNmAlboProfessionale() {
		return this.nmAlboProfessionale;
	}

	public void setNmAlboProfessionale(String nmAlboProfessionale) {
		this.nmAlboProfessionale = nmAlboProfessionale;
	}

	public String getNmComuneSedeEst() {
		return this.nmComuneSedeEst;
	}

	public void setNmComuneSedeEst(String nmComuneSedeEst) {
		this.nmComuneSedeEst = nmComuneSedeEst;
	}

	public String getNmComuneStabileEst() {
		return this.nmComuneStabileEst;
	}

	public void setNmComuneStabileEst(String nmComuneStabileEst) {
		this.nmComuneStabileEst = nmComuneStabileEst;
	}

//	public String getNmContentTypeFileFirmato() {
//		return this.nmContentTypeFileFirmato;
//	}
//
//	public void setNmContentTypeFileFirmato(String nmContentTypeFileFirmato) {
//		this.nmContentTypeFileFirmato = nmContentTypeFileFirmato;
//	}

	public String getNmEmail() {
		return this.nmEmail;
	}

	public void setNmEmail(String nmEmail) {
		this.nmEmail = nmEmail;
	}

	public String getNmIndirizzoSede() {
		return this.nmIndirizzoSede;
	}

	public void setNmIndirizzoSede(String nmIndirizzoSede) {
		this.nmIndirizzoSede = nmIndirizzoSede;
	}

	public String getNmIndirizzoStabile() {
		return this.nmIndirizzoStabile;
	}

	public void setNmIndirizzoStabile(String nmIndirizzoStabile) {
		this.nmIndirizzoStabile = nmIndirizzoStabile;
	}

//	public String getNmNomeFileFirmato() {
//		return this.nmNomeFileFirmato;
//	}
//
//	public void setNmNomeFileFirmato(String nmNomeFileFirmato) {
//		this.nmNomeFileFirmato = nmNomeFileFirmato;
//	}
//
//	public String getNmNomeFileNonFirmato() {
//		return this.nmNomeFileNonFirmato;
//	}
//
//	public void setNmNomeFileNonFirmato(String nmNomeFileNonFirmato) {
//		this.nmNomeFileNonFirmato = nmNomeFileNonFirmato;
//	}

	public String getNmRagioneSociale() {
		return this.nmRagioneSociale;
	}

	public void setNmRagioneSociale(String nmRagioneSociale) {
		this.nmRagioneSociale = nmRagioneSociale;
	}

	public String getNmRegioneSedeEst() {
		return this.nmRegioneSedeEst;
	}

	public void setNmRegioneSedeEst(String nmRegioneSedeEst) {
		this.nmRegioneSedeEst = nmRegioneSedeEst;
	}

	public String getNmRiferimentoAmministrazione() {
		return this.nmRiferimentoAmministrazione;
	}

	public void setNmRiferimentoAmministrazione(String nmRiferimentoAmministrazione) {
		this.nmRiferimentoAmministrazione = nmRiferimentoAmministrazione;
	}

	public Long getNrNumGiorniCatalogDisat() {
		return this.nrNumGiorniCatalogDisat;
	}

	public void setNrNumGiorniCatalogDisat(Long nrNumGiorniCatalogDisat) {
		this.nrNumGiorniCatalogDisat = nrNumGiorniCatalogDisat;
	}

//	public Long getNrSizeFileFirmato() {
//		return this.nrSizeFileFirmato;
//	}
//
//	public void setNrSizeFileFirmato(Long nrSizeFileFirmato) {
//		this.nrSizeFileFirmato = nrSizeFileFirmato;
//	}


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

	public Date getTsUltimaModifica() {
		return tsUltimaModifica;
	}

	public void setTsUltimaModifica(Date tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}

	public List<FatTAdesione> getListAdesione() {
		return listAdesione;
	}

	public void setListAdesione(List<FatTAdesione> listAdesione) {
		this.listAdesione = listAdesione;
	}

	public Date getTsInserimento() {
		return this.tsInserimento;
	}

	public void setTsInserimento(Date tsInserimento) {
		this.tsInserimento = tsInserimento;
	}

	public List<FatAStatoAdesione> getListStatoAdesione() {
		return this.listStatoAdesione;
	}

	public void setListStatoAdesione(List<FatAStatoAdesione> listStatoAdesione) {
		this.listStatoAdesione = listStatoAdesione;
	}

	public FatAStatoAdesione addFatAStatoAdesione(FatAStatoAdesione fatAStatoAdesione) {
		getListStatoAdesione().add(fatAStatoAdesione);
		fatAStatoAdesione.setAdesione(this);

		return fatAStatoAdesione;
	}

	public FatAStatoAdesione removeFatAStatoAdesione(FatAStatoAdesione fatAStatoAdesione) {
		getListStatoAdesione().remove(fatAStatoAdesione);
		fatAStatoAdesione.setAdesione(null);

		return fatAStatoAdesione;
	}

	public FatTDizRegimeFiscale getDizRegimeFiscale() {
		return this.dizRegimeFiscale;
	}

	public void setDizRegimeFiscale(FatTDizRegimeFiscale dizRegimeFiscale) {
		this.dizRegimeFiscale = dizRegimeFiscale;
	}

	public List<FatTAdesioneNotifica> getListAdesioneNotifica() {
		return this.listAdesioneNotifica;
	}

	public void setListAdesioneNotifica(List<FatTAdesioneNotifica> listAdesioneNotifica) {
		this.listAdesioneNotifica = listAdesioneNotifica;
	}

	public FatTAdesioneNotifica addFatTAdesioneNotifica(FatTAdesioneNotifica fatTAdesioneNotifica) {
		getListAdesioneNotifica().add(fatTAdesioneNotifica);
		fatTAdesioneNotifica.setAdesione(this);

		return fatTAdesioneNotifica;
	}

	public FatTAdesioneNotifica removeFatTAdesioneNotifica(FatTAdesioneNotifica fatTAdesioneNotifica) {
		getListAdesioneNotifica().remove(fatTAdesioneNotifica);
		fatTAdesioneNotifica.setAdesione(null);

		return fatTAdesioneNotifica;
	}

	public FatTDizSocioUnico getDizSocioUnico() {
		return dizSocioUnico;
	}

	public void setDizSocioUnico(FatTDizSocioUnico dizSocioUnico) {
		this.dizSocioUnico = dizSocioUnico;
	}

	public FatTDizStatoAdesione getDizStatoAdesione() {
		return dizStatoAdesione;
	}

	public void setDizStatoAdesione(FatTDizStatoAdesione dizStatoAdesione) {
		this.dizStatoAdesione = dizStatoAdesione;
	}

	public FatTDizStatoLiquidazione getDizStatoLiquidazione() {
		return dizStatoLiquidazione;
	}

	public void setDizStatoLiquidazione(FatTDizStatoLiquidazione dizStatoLiquidazione) {
		this.dizStatoLiquidazione = dizStatoLiquidazione;
	}
	
	public List<FatTImpreseCollegAssoc> getListImpreseCollegAssoc() {
		return this.listImpreseCollegAssoc;
	}

	public void setListImpreseCollegAssoc(List<FatTImpreseCollegAssoc> listImpreseCollegAssoc) {
		this.listImpreseCollegAssoc = listImpreseCollegAssoc;
	}

	public FatTImpreseCollegAssoc addFatTImpreseCollegAssoc(FatTImpreseCollegAssoc fatTImpreseCollegAssoc) {
		getListImpreseCollegAssoc().add(fatTImpreseCollegAssoc);
		fatTImpreseCollegAssoc.setAdesione(this);

		return fatTImpreseCollegAssoc;
	}

	public FatTImpreseCollegAssoc removeFatTImpreseCollegAssoc(FatTImpreseCollegAssoc fatTImpreseCollegAssoc) {
		getListImpreseCollegAssoc().remove(fatTImpreseCollegAssoc);
		fatTImpreseCollegAssoc.setAdesione(null);

		return fatTImpreseCollegAssoc;
	}

	public List<FatTLottoStor> getListLottoStor() {
		return this.listLottoStor;
	}

	public void setListLottoStor(List<FatTLottoStor> listLottoStor) {
		this.listLottoStor = listLottoStor;
	}

	public FatTLottoStor addFatTLottoStor(FatTLottoStor fatTLottoStor) {
		getListLottoStor().add(fatTLottoStor);
		fatTLottoStor.setAdesione(this);

		return fatTLottoStor;
	}

	public FatTLottoStor removeFatTLottoStor(FatTLottoStor fatTLottoStor) {
		getListLottoStor().remove(fatTLottoStor);
		fatTLottoStor.setAdesione(null);

		return fatTLottoStor;
	}

	public List<FatTLotto> getListLotto() {
		return this.listLotto;
	}

	public void setListLotto(List<FatTLotto> listLotto) {
		this.listLotto = listLotto;
	}

	public FatTLotto addFatTLottoStor(FatTLotto listLotto) {
		getListLotto().add(listLotto);
		listLotto.setAdesione(this);

		return listLotto;
	}

	public FatTLotto removeFatTLottoStor(FatTLotto listLotto) {
		getListLotto().remove(listLotto);
		listLotto.setAdesione(null);

		return listLotto;
	}
	
	public List<FatTMail> getListMail() {
		return this.listMail;
	}

	public void setListMail(List<FatTMail> listMail) {
		this.listMail = listMail;
	}

	public FatTMail addFatTMail(FatTMail fatTMail) {
		getListMail().add(fatTMail);
		fatTMail.setAdesione(this);

		return fatTMail;
	}

	public FatTMail removeFatTMail(FatTMail fatTMail) {
		getListMail().remove(fatTMail);
		fatTMail.setAdesione(null);

		return fatTMail;
	}

	public List<FatTVerifFirmaAde> getListVerifFirmaAde() {
		return this.listVerifFirmaAde;
	}

	public void setListVerifFirmaAde(List<FatTVerifFirmaAde> listVerifFirmaAde) {
		this.listVerifFirmaAde = listVerifFirmaAde;
	}

	public FatTVerifFirmaAde addFatTVerifFirmaAde(FatTVerifFirmaAde fatTVerifFirmaAde) {
		getListVerifFirmaAde().add(fatTVerifFirmaAde);
		fatTVerifFirmaAde.setAdesione(this);

		return fatTVerifFirmaAde;
	}

	public FatTVerifFirmaAde removeFatTVerifFirmaAde(FatTVerifFirmaAde fatTVerifFirmaAde) {
		getListVerifFirmaAde().remove(fatTVerifFirmaAde);
		fatTVerifFirmaAde.setAdesione(null);

		return fatTVerifFirmaAde;
	}

	public FatTAdesione getAdesionePrecedente() {
		return adesionePrecedente;
	}

	public void setAdesionePrecedente(FatTAdesione adesionePrecedente) {
		this.adesionePrecedente = adesionePrecedente;
	}

	
	public Serializable getPrimaryKey() {
		return this.idAdesione;
	}

//	public String getIdFileFirmato() {
//		return idFileFirmato;
//	}
//
//	public void setIdFileFirmato(String idFileFirmato) {
//		this.idFileFirmato = idFileFirmato;
//	}
//
//	public String getIdFileNonFirmato() {
//		return idFileNonFirmato;
//	}
//
//	public void setIdFileNonFirmato(String idFileNonFirmato) {
//		this.idFileNonFirmato = idFileNonFirmato;
//	}
	
	

}