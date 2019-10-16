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
 * The persistent class for the FAT_T_SUPPORTO_FTP database table.
 * 
 */
@Entity
@Table(name="FAT_T_SUPPORTO_FTP")
public class FatTSupportoFtp implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FAT_T_SUPPORTO_GENERATOR", sequenceName = "SEQ_ID_SUPPORTO_FTP", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAT_T_SUPPORTO_GENERATOR")
	@Column(name="ID_SUPPORTO_FTP")
	private Long idSupportoFtp;

	@Column(name="CD_NUM_ATTESTAZ_TRASM_FATTURA")
	
	private String cdNumAttestazTrasmFattura;

	@Column(name="CD_NUM_DECORRENZA_TERMINI")
	
	private String cdNumDecorrenzaTermini;

	@Column(name="CD_NUM_ESITO")
	
	private String cdNumEsito;

	@Column(name="CD_NUM_ESITO_COMMITTENTE")
	
	private String cdNumEsitoCommittente;

	@Column(name="CD_NUM_FATTURE")
	
	private String cdNumFatture;

	@Column(name="CD_NUM_MANCATA_CONSEGNA")
	
	private String cdNumMancataConsegna;

	@Column(name="CD_NUM_METADATI_INVIO_FILE")
	
	private String cdNumMetadatiInvioFile;

	@Column(name="CD_NUM_RICEVUTA_CONSEGNA")
	
	private String cdNumRicevutaConsegna;

	@Column(name="CD_NUM_SCARTO")
	
	private String cdNumScarto;

	@Column(name="CD_NUM_SCARTO_ESIT_COMMITTENTE")
	
	private String cdNumScartoEsitCommittente;

	@Column(name="CD_VERSIONE_QUADRATURA")
	
	private String cdVersioneQuadratura;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_CREAZ_FILE_QUAD")
	
	private Date dtDataOraCreazFileQuad;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_CREAZIONE_SUPPORTO")
	
	private Date dtDataOraCreazioneSupporto;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_INVIO")
	
	private Date dtDataOraInvio;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_RICEZIONE_SUPPORTO")
	
	private Date dtDataOraRicezioneSupporto;

	@Column(name="FL_ERRORE_CONTROLLI_FILE")
	
	private Boolean flErroreControlliFile;

	@Column(name="FL_ERRORE_STATO")
	
	private Boolean flErroreStato;

	@Column(name="FL_VERSO_SDI")
	
	private Boolean flVersoSdi;

	@Column(name="NM_IDENTIFICATIVO_NODO")
	
	private String nmIdentificativoNodo;

	@Column(name="NM_LOG_ERRORE_CONTROLLI_FILE")
	
	private String nmLogErroreControlliFile;

	@Column(name="NM_NOME_FILE_QUADRATURA")
	
	private String nmNomeFileQuadratura;

	@Column(name="NM_NOME_FILE_SUPPORTO")
	
	private String nmNomeFileSupporto;

	@Column(name="NM_UTENTE_INSERIMENTO")
	
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	
	private String nmUtenteUltimaModifica;

	@Column(name="NR_NUM_DATI_FATTURA")
	
	private BigDecimal nrNumDatiFattura;

	@Column(name="NR_NUM_ESITO_DATI_FATTURA")
	
	private BigDecimal nrNumEsitoDatiFattura;

	
	@Column(name="ID_FILE_CIFRATO")
	
	private String idFileCifrato;

	@Column(name="ID_FILE_FIRMATO")
	
	private String idFileFirmato;

	@Column(name="ID_FILE_NON_FIRMATO")
	
	private String idFileNonFirmato;

	@Column(name="ID_FILE_QUADRATURA")
	
	private String idFileQuadratura;

	@Column(name="PG_NUMERO_SEQUENZIALE")
	
	private String pgNumeroSequenziale;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatALottoSupportoFtp
	@OneToMany(mappedBy="supportoFtp")
	private List<FatALottoSupportoFtp> listLottoSupportoFtp;

	//bi-directional many-to-one association to FatANotificaSupportoFtp
	@OneToMany(mappedBy="supportoFtp")
	private List<FatANotificaSupportoFtp> listNotificaSupportoFtp;

	//bi-directional many-to-one association to FatAStatoSupportoFtp
	@OneToMany(mappedBy="supportoFtp")
	private List<FatAStatoSupportoFtp> listStatoSupportoFtp;

	//bi-directional many-to-one association to FatTEsitoFtp
	@OneToMany(mappedBy="supportoFtp")
	private List<FatTEsitoFtp> listEsitoFtp;

	//bi-directional many-to-one association to FatTDizStatoSupportoFtp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_STATO_SUPPORTO_FTP")
	private FatTDizStatoSupportoFtp dizStatoSupportoFtp;

	//bi-directional many-to-one association to FatTVerifFirmaSuppFtp
	@OneToMany(mappedBy="supportoFtp")
	private List<FatTVerifFirmaSuppFtp> listVerifFirmaSuppFtp;

	public FatTSupportoFtp() {
	}

	public Long getIdSupportoFtp() {
		return this.idSupportoFtp;
	}

	public void setIdSupportoFtp(Long idSupportoFtp) {
		this.idSupportoFtp = idSupportoFtp;
	}

	public String getCdNumAttestazTrasmFattura() {
		return this.cdNumAttestazTrasmFattura;
	}

	public void setCdNumAttestazTrasmFattura(String cdNumAttestazTrasmFattura) {
		this.cdNumAttestazTrasmFattura = cdNumAttestazTrasmFattura;
	}

	public String getCdNumDecorrenzaTermini() {
		return this.cdNumDecorrenzaTermini;
	}

	public void setCdNumDecorrenzaTermini(String cdNumDecorrenzaTermini) {
		this.cdNumDecorrenzaTermini = cdNumDecorrenzaTermini;
	}

	public String getCdNumEsito() {
		return this.cdNumEsito;
	}

	public void setCdNumEsito(String cdNumEsito) {
		this.cdNumEsito = cdNumEsito;
	}

	public String getCdNumEsitoCommittente() {
		return this.cdNumEsitoCommittente;
	}

	public void setCdNumEsitoCommittente(String cdNumEsitoCommittente) {
		this.cdNumEsitoCommittente = cdNumEsitoCommittente;
	}

	public String getCdNumFatture() {
		return this.cdNumFatture;
	}

	public void setCdNumFatture(String cdNumFatture) {
		this.cdNumFatture = cdNumFatture;
	}

	public String getCdNumMancataConsegna() {
		return this.cdNumMancataConsegna;
	}

	public void setCdNumMancataConsegna(String cdNumMancataConsegna) {
		this.cdNumMancataConsegna = cdNumMancataConsegna;
	}

	public String getCdNumMetadatiInvioFile() {
		return this.cdNumMetadatiInvioFile;
	}

	public void setCdNumMetadatiInvioFile(String cdNumMetadatiInvioFile) {
		this.cdNumMetadatiInvioFile = cdNumMetadatiInvioFile;
	}

	public String getCdNumRicevutaConsegna() {
		return this.cdNumRicevutaConsegna;
	}

	public void setCdNumRicevutaConsegna(String cdNumRicevutaConsegna) {
		this.cdNumRicevutaConsegna = cdNumRicevutaConsegna;
	}

	public String getCdNumScarto() {
		return this.cdNumScarto;
	}

	public void setCdNumScarto(String cdNumScarto) {
		this.cdNumScarto = cdNumScarto;
	}

	public String getCdNumScartoEsitCommittente() {
		return this.cdNumScartoEsitCommittente;
	}

	public void setCdNumScartoEsitCommittente(String cdNumScartoEsitCommittente) {
		this.cdNumScartoEsitCommittente = cdNumScartoEsitCommittente;
	}

	public String getCdVersioneQuadratura() {
		return this.cdVersioneQuadratura;
	}

	public void setCdVersioneQuadratura(String cdVersioneQuadratura) {
		this.cdVersioneQuadratura = cdVersioneQuadratura;
	}

	public Date getDtDataOraCreazFileQuad() {
		return this.dtDataOraCreazFileQuad;
	}

	public void setDtDataOraCreazFileQuad(Date dtDataOraCreazFileQuad) {
		this.dtDataOraCreazFileQuad = dtDataOraCreazFileQuad;
	}

	public Date getDtDataOraCreazioneSupporto() {
		return this.dtDataOraCreazioneSupporto;
	}

	public void setDtDataOraCreazioneSupporto(Date dtDataOraCreazioneSupporto) {
		this.dtDataOraCreazioneSupporto = dtDataOraCreazioneSupporto;
	}

	public Date getDtDataOraInvio() {
		return this.dtDataOraInvio;
	}

	public void setDtDataOraInvio(Date dtDataOraInvio) {
		this.dtDataOraInvio = dtDataOraInvio;
	}

	public Date getDtDataOraRicezioneSupporto() {
		return this.dtDataOraRicezioneSupporto;
	}

	public void setDtDataOraRicezioneSupporto(Date dtDataOraRicezioneSupporto) {
		this.dtDataOraRicezioneSupporto = dtDataOraRicezioneSupporto;
	}

	public Boolean getFlErroreControlliFile() {
		return this.flErroreControlliFile;
	}

	public void setFlErroreControlliFile(Boolean flErroreControlliFile) {
		this.flErroreControlliFile = flErroreControlliFile;
	}

	public Boolean getFlErroreStato() {
		return this.flErroreStato;
	}

	public void setFlErroreStato(Boolean flErroreStato) {
		this.flErroreStato = flErroreStato;
	}

	public Boolean getFlVersoSdi() {
		return this.flVersoSdi;
	}

	public void setFlVersoSdi(Boolean flVersoSdi) {
		this.flVersoSdi = flVersoSdi;
	}

	public String getNmIdentificativoNodo() {
		return this.nmIdentificativoNodo;
	}

	public void setNmIdentificativoNodo(String nmIdentificativoNodo) {
		this.nmIdentificativoNodo = nmIdentificativoNodo;
	}

	public String getNmLogErroreControlliFile() {
		return this.nmLogErroreControlliFile;
	}

	public void setNmLogErroreControlliFile(String nmLogErroreControlliFile) {
		this.nmLogErroreControlliFile = nmLogErroreControlliFile;
	}

	public String getNmNomeFileQuadratura() {
		return this.nmNomeFileQuadratura;
	}

	public void setNmNomeFileQuadratura(String nmNomeFileQuadratura) {
		this.nmNomeFileQuadratura = nmNomeFileQuadratura;
	}

	public String getNmNomeFileSupporto() {
		return this.nmNomeFileSupporto;
	}

	public void setNmNomeFileSupporto(String nmNomeFileSupporto) {
		this.nmNomeFileSupporto = nmNomeFileSupporto;
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

	public BigDecimal getNrNumDatiFattura() {
		return this.nrNumDatiFattura;
	}

	public void setNrNumDatiFattura(BigDecimal nrNumDatiFattura) {
		this.nrNumDatiFattura = nrNumDatiFattura;
	}

	public BigDecimal getNrNumEsitoDatiFattura() {
		return this.nrNumEsitoDatiFattura;
	}

	public void setNrNumEsitoDatiFattura(BigDecimal nrNumEsitoDatiFattura) {
		this.nrNumEsitoDatiFattura = nrNumEsitoDatiFattura;
	}


	public String getPgNumeroSequenziale() {
		return this.pgNumeroSequenziale;
	}

	public void setPgNumeroSequenziale(String pgNumeroSequenziale) {
		this.pgNumeroSequenziale = pgNumeroSequenziale;
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

	public List<FatALottoSupportoFtp> getListLottoSupportoFtp() {
		return this.listLottoSupportoFtp;
	}

	public void setListLottoSupportoFtps(List<FatALottoSupportoFtp> listLottoSupportoFtps) {
		this.listLottoSupportoFtp = listLottoSupportoFtps;
	}

	public FatALottoSupportoFtp addFatALottoSupportoFtp(FatALottoSupportoFtp fatALottoSupportoFtp) {
		getListLottoSupportoFtp().add(fatALottoSupportoFtp);
		fatALottoSupportoFtp.setSupportoFtp(this);

		return fatALottoSupportoFtp;
	}

	public FatALottoSupportoFtp removeFatALottoSupportoFtp(FatALottoSupportoFtp fatALottoSupportoFtp) {
		getListLottoSupportoFtp().remove(fatALottoSupportoFtp);
		fatALottoSupportoFtp.setSupportoFtp(null);

		return fatALottoSupportoFtp;
	}

	public List<FatANotificaSupportoFtp> getListNotificaSupportoFtp() {
		return this.listNotificaSupportoFtp;
	}

	public void setListNotificaSupportoFtp(List<FatANotificaSupportoFtp> listNotificaSupportoFtps) {
		this.listNotificaSupportoFtp = listNotificaSupportoFtps;
	}

	public FatANotificaSupportoFtp addFatANotificaSupportoFtp(FatANotificaSupportoFtp fatANotificaSupportoFtp) {
		getListNotificaSupportoFtp().add(fatANotificaSupportoFtp);
		fatANotificaSupportoFtp.setSupportoFtp(this);

		return fatANotificaSupportoFtp;
	}

	public FatANotificaSupportoFtp removeFatANotificaSupportoFtp(FatANotificaSupportoFtp fatANotificaSupportoFtp) {
		getListNotificaSupportoFtp().remove(fatANotificaSupportoFtp);
		fatANotificaSupportoFtp.setSupportoFtp(null);

		return fatANotificaSupportoFtp;
	}

	public List<FatAStatoSupportoFtp> getListStatoSupportoFtp() {
		return this.listStatoSupportoFtp;
	}

	public void setListStatoSupportoFtp(List<FatAStatoSupportoFtp> listStatoSupportoFtps) {
		this.listStatoSupportoFtp = listStatoSupportoFtps;
	}

	public FatAStatoSupportoFtp addFatAStatoSupportoFtp(FatAStatoSupportoFtp fatAStatoSupportoFtp) {
		getListStatoSupportoFtp().add(fatAStatoSupportoFtp);
		fatAStatoSupportoFtp.setSupportoFtp(this);

		return fatAStatoSupportoFtp;
	}

	public FatAStatoSupportoFtp removeFatAStatoSupportoFtp(FatAStatoSupportoFtp fatAStatoSupportoFtp) {
		getListStatoSupportoFtp().remove(fatAStatoSupportoFtp);
		fatAStatoSupportoFtp.setSupportoFtp(null);

		return fatAStatoSupportoFtp;
	}

	public List<FatTEsitoFtp> getListEsitoFtp() {
		return this.listEsitoFtp;
	}

	public void setListEsitoFtp(List<FatTEsitoFtp> listEsitoFtps) {
		this.listEsitoFtp = listEsitoFtps;
	}

	public FatTEsitoFtp addFatTEsitoFtp(FatTEsitoFtp fatTEsitoFtp) {
		getListEsitoFtp().add(fatTEsitoFtp);
		fatTEsitoFtp.setSupportoFtp(this);

		return fatTEsitoFtp;
	}

	public FatTEsitoFtp removeFatTEsitoFtp(FatTEsitoFtp fatTEsitoFtp) {
		getListEsitoFtp().remove(fatTEsitoFtp);
		fatTEsitoFtp.setSupportoFtp(null);

		return fatTEsitoFtp;
	}

	public FatTDizStatoSupportoFtp getDizStatoSupportoFtp() {
		return this.dizStatoSupportoFtp;
	}

	public void setDizStatoSupportoFtp(FatTDizStatoSupportoFtp dizStatoSupportoFtp) {
		this.dizStatoSupportoFtp = dizStatoSupportoFtp;
	}

	public List<FatTVerifFirmaSuppFtp> getListVerifFirmaSuppFtp() {
		return this.listVerifFirmaSuppFtp;
	}

	public void setListVerifFirmaSuppFtp(List<FatTVerifFirmaSuppFtp> listVerifFirmaSuppFtps) {
		this.listVerifFirmaSuppFtp = listVerifFirmaSuppFtps;
	}

	public FatTVerifFirmaSuppFtp addFatTVerifFirmaSuppFtp(FatTVerifFirmaSuppFtp fatTVerifFirmaSuppFtp) {
		getListVerifFirmaSuppFtp().add(fatTVerifFirmaSuppFtp);
		fatTVerifFirmaSuppFtp.setSupportoFtp(this);

		return fatTVerifFirmaSuppFtp;
	}

	public FatTVerifFirmaSuppFtp removeFatTVerifFirmaSuppFtp(FatTVerifFirmaSuppFtp fatTVerifFirmaSuppFtp) {
		getListVerifFirmaSuppFtp().remove(fatTVerifFirmaSuppFtp);
		fatTVerifFirmaSuppFtp.setSupportoFtp(null);

		return fatTVerifFirmaSuppFtp;
	}

	public Serializable getPrimaryKey() {
		return this.idSupportoFtp;
	}

	public String getIdFileCifrato() {
		return idFileCifrato;
	}

	public void setIdFileCifrato(String idFileCifrato) {
		this.idFileCifrato = idFileCifrato;
	}

	public String getIdFileFirmato() {
		return idFileFirmato;
	}

	public void setIdFileFirmato(String idFileFirmato) {
		this.idFileFirmato = idFileFirmato;
	}

	public String getIdFileNonFirmato() {
		return idFileNonFirmato;
	}

	public void setIdFileNonFirmato(String idFileNonFirmato) {
		this.idFileNonFirmato = idFileNonFirmato;
	}

	public String getIdFileQuadratura() {
		return idFileQuadratura;
	}

	public void setIdFileQuadratura(String idFileQuadratura) {
		this.idFileQuadratura = idFileQuadratura;
	}


}