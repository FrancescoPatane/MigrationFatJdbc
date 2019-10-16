package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 * The persistent class for the FAT_T_COMP_SEZIONE_STOR database table.
 * 
 */
@Entity
@Table(name="FAT_T_COMP_SEZIONE_STOR")
public class FatTCompSezioneStor implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_COMP_SEZIONE_STOR_IDCOMPSEZIONESTOR_GENERATOR",sequenceName="SEQ_ID_COMP_SEZIONE_STORICO",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_COMP_SEZIONE_STOR_IDCOMPSEZIONESTOR_GENERATOR")
	@Column(name="ID_COMP_SEZIONE_STOR")
	private Long idCompSezioneStor;

	@Column(name="ID_COMPILAZIONE_SEZIONE")
	private Long idCompilazioneSezione;
	
	@Column(name="ID_DETTAGLIO_LINEA")
	private Long idDettaglioLinea;

	@Column(name="ID_FATTURA")
	private Long idFattura;

	@Column(name="ID_LOTTO")
	private Long idLotto;

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
	
	@Column(name="PG_VERSIONE_LOTTO")
	private BigDecimal pgVersioneLotto;

	//bi-directional many-to-one association to FatTDettaglioLineaStor
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DETTAGLIO_LINEA_STOR")
	private FatTDettaglioLineaStor dettaglioLineaStor;

	//bi-directional many-to-one association to FatTMacrosezAppCfg
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_CONFIG_MACROSEZ_APP")
	private FatTMacrosezAppCfg macrosezAppCfg;

	//bi-directional many-to-one association to FatTDizStatoCompilazione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_STATO_COMPILAZIONE")
	private FatTDizStatoCompilazione dizStatoCompilazione;

	//bi-directional many-to-one association to FatTFatturaStor
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FATTURA_STOR")
	private FatTFatturaStor fatturaStor;

//	bi-directional many-to-one association to FatTLottoStor
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PG_VERSIONE_LOTTO", insertable=false, updatable=false)
	private FatTLottoStor lottoStor;

	public FatTCompSezioneStor() {
	}

	public Long getIdCompSezioneStor() {
		return this.idCompSezioneStor;
	}

	public void setIdCompSezioneStor(Long idCompSezioneStor) {
		this.idCompSezioneStor = idCompSezioneStor;
	}

	public Long getIdCompilazioneSezione() {
		return this.idCompilazioneSezione;
	}

	public void setIdCompilazioneSezione(Long idCompilazioneSezione) {
		this.idCompilazioneSezione = idCompilazioneSezione;
	}

	public Long getIdDettaglioLinea() {
		return this.idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
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

	public FatTDettaglioLineaStor getDettaglioLineaStor() {
		return this.dettaglioLineaStor;
	}

	public void setDettaglioLineaStor(FatTDettaglioLineaStor dettaglioLineaStor) {
		this.dettaglioLineaStor = dettaglioLineaStor;
	}

	public FatTMacrosezAppCfg getMacrosezAppCfg() {
		return this.macrosezAppCfg;
	}

	public void setMacrosezAppCfg(FatTMacrosezAppCfg macrosezAppCfg) {
		this.macrosezAppCfg = macrosezAppCfg;
	}

	public FatTDizStatoCompilazione getDizStatoCompilazione() {
		return this.dizStatoCompilazione;
	}

	public void setDizStatoCompilazione(FatTDizStatoCompilazione dizStatoCompilazione) {
		this.dizStatoCompilazione = dizStatoCompilazione;
	}

	public FatTFatturaStor getFatturaStor() {
		return this.fatturaStor;
	}

	public void setFatturaStor(FatTFatturaStor fatturaStor) {
		this.fatturaStor = fatturaStor;
	}

	public FatTLottoStor getLottoStor() {
		return this.lottoStor;
	}

	public void setLottoStor(FatTLottoStor lottoStor) {
		this.lottoStor = lottoStor;
	}

	public Serializable getPrimaryKey() {
		return this.idCompSezioneStor;
	}

	public BigDecimal getPgVersioneLotto() {
		return pgVersioneLotto;
	}

	public void setPgVersioneLotto(BigDecimal pgVersioneLotto) {
		this.pgVersioneLotto = pgVersioneLotto;
	}


}