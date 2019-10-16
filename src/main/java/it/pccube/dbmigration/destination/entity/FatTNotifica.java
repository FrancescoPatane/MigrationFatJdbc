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
 * The persistent class for the FAT_T_NOTIFICA database table.
 * 
 */
@Entity
@Table(name="FAT_T_NOTIFICA")
public class FatTNotifica implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_NOTIFICA_IDNOTIFICA_GENERATOR", sequenceName = "SEQ_ID_NOTIFICA", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_NOTIFICA_IDNOTIFICA_GENERATOR")
	@Column(name="ID_NOTIFICA")
	
	private Long idNotifica;

	@Column(name="CD_CODICE_DESTINATARIO")
	
	private String cdCodiceDestinatario;

	@Column(name="CD_ESITO")
	
	private String cdEsito;

	@Column(name="CD_HASH_FILE_ORIGINALE")
	
	private String cdHashFileOriginale;

	@Column(name="CD_IDENTIFICATIVO_SDI_ARCHIVIO")
	
	private String cdIdentificativoSdiArchivio;

	@Column(name="CD_IDENTIFICATIVO_SDI_LOTTO")
	
	private String cdIdentificativoSdiLotto;

	@Column(name="CD_IDENTIFICATIVO_SDI_NOTIFICA")
	
	private String cdIdentificativoSdiNotifica;

	@Column(name="CD_NUMERO_FATTURA_ESITO")
	
	private String cdNumeroFatturaEsito;

	@Column(name="CD_VERSIONE_NOTIFICA")
	
	private String cdVersioneNotifica;

	@Column(name="CD_VERSIONE_NOTIFICA_ESITO")
	
	private String cdVersioneNotificaEsito;

	@Column(name="DS_DESCRIZIONE_DESTINATARIO")
	
	private String dsDescrizioneDestinatario;

	@Column(name="DS_DESCRIZIONE_NOTIFICA")
	
	private String dsDescrizioneNotifica;

	@Column(name="CD_MESSAGE_ID_COMMITTENTE")
	
	private String cdMessageIdCommittente;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_CONSEGNA")
	
	private Date dtDataOraConsegna;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_RICEZIONE")
	
	private Date dtDataOraRicezione;

	@Column(name="FL_ERRORE")
	
	private Boolean flErrore;

	@Column(name="ID_SDI_ESITO_COMMITTENTE")
	private Long idSdiEsitoCommittente;

	@Column(name="NM_INTERMEDIARIO_DUPLICE_RUOLO")
	
	private String nmIntermediarioDupliceRuolo;

	@Column(name="CD_MESSAGE_ID")
	
	private String cdMessageId;

	@Column(name="NM_NOME_FILE_ARCHIVIO")
	
	private String nmNomeFileArchivio;

	@Column(name="NM_NOME_FILE_LOTTO")
	
	private String nmNomeFileLotto;

	@Column(name="NM_NOME_FILE_NOTIFICA")
	
	private String nmNomeFileNotifica;

	@Column(name="NM_PEC_MESSAGE_ID")
	
	private String nmPecMessageId;

	@Column(name="NM_TICKET_CONSERVAZIONE")
	
	private String nmTicketConservazione;

	@Column(name="NM_UTENTE_INSERIMENTO")
	
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	
	private String nmUtenteUltimaModifica;

	@Column(name="NR_ANNO_FATTURA_ESITO")
	
	private BigDecimal nrAnnoFatturaEsito;

	@Column(name="NR_POSIZIONE_FATTURA_ESITO")
	
	private BigDecimal nrPosizioneFatturaEsito;

	@Lob
	@Column(name="OJ_LOG_ECCEZIONI")
	
	private String ojLogEccezioni;

	@Column(name="ID_XML_NOTIFICA")
	
	private String idXmlNotifica;

	@Column(name="ID_ZIP_NOTIFICA")
	
	private String idZipNotifica;

	@Column(name="PG_VERSIONE_LOTTO")
	
	private BigDecimal pgVersioneLotto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	
	private Date tsUltimaModifica;

	@Column(name="TX_NOTE")
	
	private String txNote;

	//bi-directional many-to-one association to FatANotificaSupportoFtp
	@OneToMany(mappedBy="notifica")
	private List<FatANotificaSupportoFtp> listNotificaSupportoFtps;

	//bi-directional many-to-one association to FatAStatoLottoFattura
	@OneToMany(mappedBy="notifica")
	private List<FatAStatoLottoFattura> listStatoLottoFattura;

	//bi-directional many-to-one association to FatTErroreNotifica
	@OneToMany(mappedBy="notifica")
	private List<FatTErroreNotifica> listErroreNotifica;

	//bi-directional many-to-one association to FatTDizTipologiaNotifica
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_TIPO_NOTIFICA")
	private FatTDizTipologiaNotifica dizTipologiaNotifica;

	//bi-directional many-to-one association to FatTArchivio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ARCHIVIO")
	private FatTArchivio archivio;

	//bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FATTURA")
	private FatTFattura fattura;

	//bi-directional many-to-one association to FatTLottoBckup
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_LOTTO")
	private FatTLotto lotto;

	//bi-directional many-to-one association to FatTVerifFirmaNotifica
	@OneToMany(mappedBy="notifica")
	private List<FatTVerifFirmaNotifica> listVerifFirmaNotifica;

	public FatTNotifica() {
	}

	public Long getIdNotifica() {
		return this.idNotifica;
	}

	public void setIdNotifica(long idNotifica) {
		this.idNotifica = idNotifica;
	}

	public String getCdCodiceDestinatario() {
		return this.cdCodiceDestinatario;
	}

	public void setCdCodiceDestinatario(String cdCodiceDestinatario) {
		this.cdCodiceDestinatario = cdCodiceDestinatario;
	}

	public String getCdEsito() {
		return this.cdEsito;
	}

	public void setCdEsito(String cdEsito) {
		this.cdEsito = cdEsito;
	}

	public String getCdHashFileOriginale() {
		return this.cdHashFileOriginale;
	}

	public void setCdHashFileOriginale(String cdHashFileOriginale) {
		this.cdHashFileOriginale = cdHashFileOriginale;
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

	public String getCdIdentificativoSdiNotifica() {
		return this.cdIdentificativoSdiNotifica;
	}

	public void setCdIdentificativoSdiNotifica(String cdIdentificativoSdiNotifica) {
		this.cdIdentificativoSdiNotifica = cdIdentificativoSdiNotifica;
	}

	public String getCdNumeroFatturaEsito() {
		return this.cdNumeroFatturaEsito;
	}

	public void setCdNumeroFatturaEsito(String cdNumeroFatturaEsito) {
		this.cdNumeroFatturaEsito = cdNumeroFatturaEsito;
	}

	public String getCdVersioneNotifica() {
		return this.cdVersioneNotifica;
	}

	public void setCdVersioneNotifica(String cdVersioneNotifica) {
		this.cdVersioneNotifica = cdVersioneNotifica;
	}

	public String getCdVersioneNotificaEsito() {
		return this.cdVersioneNotificaEsito;
	}

	public void setCdVersioneNotificaEsito(String cdVersioneNotificaEsito) {
		this.cdVersioneNotificaEsito = cdVersioneNotificaEsito;
	}

	public String getDsDescrizioneDestinatario() {
		return this.dsDescrizioneDestinatario;
	}

	public void setDsDescrizioneDestinatario(String dsDescrizioneDestinatario) {
		this.dsDescrizioneDestinatario = dsDescrizioneDestinatario;
	}

	public String getDsDescrizioneNotifica() {
		return this.dsDescrizioneNotifica;
	}

	public void setDsDescrizioneNotifica(String dsDescrizioneNotifica) {
		this.dsDescrizioneNotifica = dsDescrizioneNotifica;
	}

	public Date getDtDataOraConsegna() {
		return this.dtDataOraConsegna;
	}

	public void setDtDataOraConsegna(Date dtDataOraConsegna) {
		this.dtDataOraConsegna = dtDataOraConsegna;
	}

	public Date getDtDataOraRicezione() {
		return this.dtDataOraRicezione;
	}

	public void setDtDataOraRicezione(Date dtDataOraRicezione) {
		this.dtDataOraRicezione = dtDataOraRicezione;
	}

	public Boolean getFlErrore() {
		return this.flErrore;
	}

	public void setFlErrore(Boolean flErrore) {
		this.flErrore = flErrore;
	}

	public Long getIdSdiEsitoCommittente() {
		return this.idSdiEsitoCommittente;
	}

	public void setIdSdiEsitoCommittente(Long idSdiEsitoCommittente) {
		this.idSdiEsitoCommittente = idSdiEsitoCommittente;
	}

	public String getNmIntermediarioDupliceRuolo() {
		return this.nmIntermediarioDupliceRuolo;
	}

	public void setNmIntermediarioDupliceRuolo(String nmIntermediarioDupliceRuolo) {
		this.nmIntermediarioDupliceRuolo = nmIntermediarioDupliceRuolo;
	}

	public String getNmNomeFileArchivio() {
		return this.nmNomeFileArchivio;
	}

	public void setNmNomeFileArchivio(String nmNomeFileArchivio) {
		this.nmNomeFileArchivio = nmNomeFileArchivio;
	}

	public String getNmNomeFileLotto() {
		return this.nmNomeFileLotto;
	}

	public void setNmNomeFileLotto(String nmNomeFileLotto) {
		this.nmNomeFileLotto = nmNomeFileLotto;
	}

	public String getNmNomeFileNotifica() {
		return this.nmNomeFileNotifica;
	}

	public void setNmNomeFileNotifica(String nmNomeFileNotifica) {
		this.nmNomeFileNotifica = nmNomeFileNotifica;
	}

	public String getNmPecMessageId() {
		return this.nmPecMessageId;
	}

	public void setNmPecMessageId(String nmPecMessageId) {
		this.nmPecMessageId = nmPecMessageId;
	}

	public String getNmTicketConservazione() {
		return this.nmTicketConservazione;
	}

	public void setNmTicketConservazione(String nmTicketConservazione) {
		this.nmTicketConservazione = nmTicketConservazione;
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

	public BigDecimal getNrAnnoFatturaEsito() {
		return this.nrAnnoFatturaEsito;
	}

	public void setNrAnnoFatturaEsito(BigDecimal nrAnnoFatturaEsito) {
		this.nrAnnoFatturaEsito = nrAnnoFatturaEsito;
	}

	public BigDecimal getNrPosizioneFatturaEsito() {
		return this.nrPosizioneFatturaEsito;
	}

	public void setNrPosizioneFatturaEsito(BigDecimal nrPosizioneFatturaEsito) {
		this.nrPosizioneFatturaEsito = nrPosizioneFatturaEsito;
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

	public String getTxNote() {
		return this.txNote;
	}

	public void setTxNote(String txNote) {
		this.txNote = txNote;
	}

	public List<FatANotificaSupportoFtp> getListNotificaSupportoFtps() {
		return this.listNotificaSupportoFtps;
	}

	public void setListNotificaSupportoFtps(List<FatANotificaSupportoFtp> listNotificaSupportoFtps) {
		this.listNotificaSupportoFtps = listNotificaSupportoFtps;
	}

	public FatANotificaSupportoFtp addFatANotificaSupportoFtp(FatANotificaSupportoFtp fatANotificaSupportoFtp) {
		getListNotificaSupportoFtps().add(fatANotificaSupportoFtp);
		fatANotificaSupportoFtp.setNotifica(this);

		return fatANotificaSupportoFtp;
	}

	public FatANotificaSupportoFtp removeFatANotificaSupportoFtp(FatANotificaSupportoFtp fatANotificaSupportoFtp) {
		getListNotificaSupportoFtps().remove(fatANotificaSupportoFtp);
		fatANotificaSupportoFtp.setNotifica(null);

		return fatANotificaSupportoFtp;
	}

	public List<FatAStatoLottoFattura> getListStatoLottoFatturas() {
		return this.listStatoLottoFattura;
	}

	public void setFatAStatoLottoFatturas(List<FatAStatoLottoFattura> listStatoLottoFattura) {
		this.listStatoLottoFattura = listStatoLottoFattura;
	}

	public FatAStatoLottoFattura addFatAStatoLottoFattura(FatAStatoLottoFattura fatAStatoLottoFattura) {
		getListStatoLottoFatturas().add(fatAStatoLottoFattura);
		fatAStatoLottoFattura.setNotifica(this);

		return fatAStatoLottoFattura;
	}

	public FatAStatoLottoFattura removeFatAStatoLottoFattura(FatAStatoLottoFattura fatAStatoLottoFattura) {
		getListStatoLottoFatturas().remove(fatAStatoLottoFattura);
		fatAStatoLottoFattura.setNotifica(null);

		return fatAStatoLottoFattura;
	}

	public List<FatTErroreNotifica> getListErroreNotificas() {
		return this.listErroreNotifica;
	}

	public void setListErroreNotificas(List<FatTErroreNotifica> listErroreNotifica) {
		this.listErroreNotifica = listErroreNotifica;
	}

	public FatTErroreNotifica addFatTErroreNotifica(FatTErroreNotifica fatTErroreNotifica) {
		getListErroreNotificas().add(fatTErroreNotifica);
		fatTErroreNotifica.setNotifica(this);

		return fatTErroreNotifica;
	}

	public FatTErroreNotifica removeFatTErroreNotifica(FatTErroreNotifica fatTErroreNotifica) {
		getListErroreNotificas().remove(fatTErroreNotifica);
		fatTErroreNotifica.setNotifica(null);

		return fatTErroreNotifica;
	}

	public FatTDizTipologiaNotifica getDizTipologiaNotifica() {
		return this.dizTipologiaNotifica;
	}

	public void setDizTipologiaNotifica(FatTDizTipologiaNotifica dizTipologiaNotifica) {
		this.dizTipologiaNotifica = dizTipologiaNotifica;
	}

	public FatTArchivio getArchivio() {
		return this.archivio;
	}

	public void setArchivio(FatTArchivio archivio) {
		this.archivio = archivio;
	}

	public FatTFattura getFattura() {
		return this.fattura;
	}

	public void setFattura(FatTFattura fattura) {
		this.fattura = fattura;
	}

	public FatTLotto getLotto() {
		return this.lotto;
	}

	public void setLotto(FatTLotto lotto) {
		this.lotto = lotto;
	}

	public String getCdMessageIdCommittente() {
		return cdMessageIdCommittente;
	}

	public void setCdMessageIdCommittente(String cdMessageIdCommittente) {
		this.cdMessageIdCommittente = cdMessageIdCommittente;
	}

	public String getCdMessageId() {
		return cdMessageId;
	}

	public void setCdMessageId(String cdMessageId) {
		this.cdMessageId = cdMessageId;
	}

	public List<FatAStatoLottoFattura> getListStatoLottoFattura() {
		return listStatoLottoFattura;
	}

	public void setListStatoLottoFattura(List<FatAStatoLottoFattura> listStatoLottoFattura) {
		this.listStatoLottoFattura = listStatoLottoFattura;
	}

	public List<FatTErroreNotifica> getListErroreNotifica() {
		return listErroreNotifica;
	}

	public void setListErroreNotifica(List<FatTErroreNotifica> listErroreNotifica) {
		this.listErroreNotifica = listErroreNotifica;
	}

	public List<FatTVerifFirmaNotifica> getListVerifFirmaNotifica() {
		return listVerifFirmaNotifica;
	}

	public void setListVerifFirmaNotifica(List<FatTVerifFirmaNotifica> listVerifFirmaNotifica) {
		this.listVerifFirmaNotifica = listVerifFirmaNotifica;
	}

	public void setIdNotifica(Long idNotifica) {
		this.idNotifica = idNotifica;
	}

	public List<FatTVerifFirmaNotifica> getListVerifFirmaNotificas() {
		return this.listVerifFirmaNotifica;
	}

	public void setListVerifFirmaNotificas(List<FatTVerifFirmaNotifica> listVerifFirmaNotifica) {
		this.listVerifFirmaNotifica = listVerifFirmaNotifica;
	}

	public FatTVerifFirmaNotifica addFatTVerifFirmaNotifica(FatTVerifFirmaNotifica fatTVerifFirmaNotifica) {
		getListVerifFirmaNotificas().add(fatTVerifFirmaNotifica);
		fatTVerifFirmaNotifica.setNotifica(this);

		return fatTVerifFirmaNotifica;
	}

	public FatTVerifFirmaNotifica removeFatTVerifFirmaNotifica(FatTVerifFirmaNotifica fatTVerifFirmaNotifica) {
		getListVerifFirmaNotificas().remove(fatTVerifFirmaNotifica);
		fatTVerifFirmaNotifica.setNotifica(null);

		return fatTVerifFirmaNotifica;
	}

	public Serializable getPrimaryKey() {
		return this.idNotifica;
	}


	public String getOjLogEccezioni() {
		return ojLogEccezioni;
	}

	public void setOjLogEccezioni(String ojLogEccezioni) {
		this.ojLogEccezioni = ojLogEccezioni;
	}

	public String getIdXmlNotifica() {
		return idXmlNotifica;
	}

	public void setIdXmlNotifica(String idXmlNotifica) {
		this.idXmlNotifica = idXmlNotifica;
	}

	public String getIdZipNotifica() {
		return idZipNotifica;
	}

	public void setIdZipNotifica(String idZipNotifica) {
		this.idZipNotifica = idZipNotifica;
	}

}