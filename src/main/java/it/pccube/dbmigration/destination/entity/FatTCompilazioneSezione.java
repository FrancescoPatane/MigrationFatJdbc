package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
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
 * The persistent class for the FAT_T_COMPILAZIONE_SEZIONE database table.
 * 
 */
@Entity
@Table(name="FAT_T_COMPILAZIONE_SEZIONE")
public class FatTCompilazioneSezione implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_COMPILAZIONE_SEZIONE_IDCOMPILAZIONESEZIONE_GENERATOR", sequenceName="SEQ_ID_COMPILAZIONE_SEZIONE", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_COMPILAZIONE_SEZIONE_IDCOMPILAZIONESEZIONE_GENERATOR")
	@Column(name="ID_COMPILAZIONE_SEZIONE")
	private Long idCompilazioneSezione;

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

	//bi-directional many-to-one association to FatTDettaglioLinea
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DETTAGLIO_LINEA")
	private FatTDettaglioLinea dettaglioLinea;

	//bi-directional many-to-one association to FatTDizStatoCompilazione
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ID_DIZ_STATO_COMPILAZIONE")
	private FatTDizStatoCompilazione dizStatoCompilazione;

	//bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FATTURA")
	private FatTFattura fattura;

	//bi-directional many-to-one association to FatTLotto
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ID_LOTTO")
	private FatTLotto lotto;

	//bi-directional many-to-one association to FatTMacrosezAppCfg
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ID_CONFIG_MACROSEZ_APP")
	private FatTMacrosezAppCfg macrosezAppCfg;

	public FatTCompilazioneSezione() {
	}

	public Long getIdCompilazioneSezione() {
		return this.idCompilazioneSezione;
	}

	public void setIdCompilazioneSezione(long idCompilazioneSezione) {
		this.idCompilazioneSezione = idCompilazioneSezione;
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

	public FatTDettaglioLinea getDettaglioLinea() {
		return this.dettaglioLinea;
	}

	public void setDettaglioLinea(FatTDettaglioLinea dettaglioLinea) {
		this.dettaglioLinea = dettaglioLinea;
	}

	public FatTDizStatoCompilazione getDizStatoCompilazione() {
		return this.dizStatoCompilazione;
	}

	public void setDizStatoCompilazione(FatTDizStatoCompilazione dizStatoCompilazione) {
		this.dizStatoCompilazione = dizStatoCompilazione;
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

	public FatTMacrosezAppCfg getMacrosezAppCfg() {
		return this.macrosezAppCfg;
	}

	public void setMacrosezAppCfg(FatTMacrosezAppCfg macrosezAppCfg) {
		this.macrosezAppCfg = macrosezAppCfg;
	}

	public Serializable getPrimaryKey() {
		return this.idCompilazioneSezione;
	}

}