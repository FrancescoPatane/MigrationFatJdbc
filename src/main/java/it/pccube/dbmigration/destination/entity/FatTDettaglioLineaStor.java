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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_DETTAGLIO_LINEA_STOR database table.
 * 
 */
@Entity
@Table(name="FAT_T_DETTAGLIO_LINEA_STOR")
public class FatTDettaglioLineaStor implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_DETTAGLIO_LINEA_STOR_IDDETTAGLIOLINEASTOR_GENERATOR",sequenceName="SEQ_ID_DETTAGLIO_LINEA_STO",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_DETTAGLIO_LINEA_STOR_IDDETTAGLIOLINEASTOR_GENERATOR")
	@Column(name="ID_DETTAGLIO_LINEA_STOR")
	private Long idDettaglioLineaStor;

	@Column(name="CD_RIFERIMENTO_AMMINISTRAZIONE")
	private String cdRiferimentoAmministrazione;

	@Column(name="CD_UNITA_MISURA")
	private String cdUnitaMisura;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_FINE_PERIODO")
	private Date dtDataFinePeriodo;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_INIZIO_PERIODO")
	private Date dtDataInizioPeriodo;

	@Column(name="ID_ARTICOLO")
	private Long idArticolo;

	@Column(name="ID_DETTAGLIO_LINEA")
	private Long idDettaglioLinea;

	@Column(name="ID_FATTURA")
	private Long idFattura;

	@Column(name="IM_ARROTONDAMENTO")
	private BigDecimal imArrotondamento;

	@Column(name="IM_PREZZO_TOTALE")
	private BigDecimal imPrezzoTotale;

	@Column(name="IM_PREZZO_UNITARIO")
	private BigDecimal imPrezzoUnitario;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Column(name="PC_ALIQUOTA_IVA")
	private BigDecimal pcAliquotaIva;

	@Column(name="PG_NUMERO_LINEA")
	private BigDecimal pgNumeroLinea;

	@Column(name="QT_QUANTITA")
	private BigDecimal qtQuantita;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	@Column(name="TX_DESCRIZIONE")
	private String txDescrizione;

	//bi-directional many-to-one association to FatARifLineaStor
	@OneToMany(mappedBy="dettaglioLineaStor")
	private List<FatARifLineaStor> listRifLineaStor;

	//bi-directional many-to-one association to FatTAltroDatoGestStor
	@OneToMany(mappedBy="dettaglioLineaStor")
	private List<FatTAltroDatoGestStor> listAltroDatoGestStor;

	//bi-directional many-to-one association to FatTArticoloStor
	@OneToMany(mappedBy="dettaglioLineaStor")
	private List<FatTArticoloStor> listArticoloStor;

	//bi-directional many-to-one association to FatTCompSezioneStor
	@OneToMany(mappedBy="dettaglioLineaStor")
	private List<FatTCompSezioneStor> listCompSezioneStor;

	//bi-directional many-to-one association to FatTFatturaStor
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FATTURA_STOR")
	private FatTFatturaStor fatturaStor;

	//bi-directional many-to-one association to FatTDizEsigibilitaIva
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_ESIGIBILITA_IVA")
	private FatTDizEsigibilitaIva dizEsigibilitaIva;

	//bi-directional many-to-one association to FatTDizTipoCessionePrest
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_TIPO_CESSIONE_PREST")
	private FatTDizTipoCessionePrest dizTipoCessionePrest;

	//bi-directional many-to-one association to FatTDizRitenuta
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_RITENUTA")
	private FatTDizRitenuta dizRitenuta;

	//bi-directional many-to-one association to FatTDizNatura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_NATURA")
	private FatTDizNatura dizNatura;

	//bi-directional many-to-one association to FatTScontoMagStor
	@OneToMany(mappedBy="dettaglioLineaStor")
	private List<FatTScontoMagStor> listScontoMagStor;

	public FatTDettaglioLineaStor() {
	}

	public Long getIdDettaglioLineaStor() {
		return this.idDettaglioLineaStor;
	}

	public void setIdDettaglioLineaStor(Long idDettaglioLineaStor) {
		this.idDettaglioLineaStor = idDettaglioLineaStor;
	}

	public String getCdRiferimentoAmministrazione() {
		return this.cdRiferimentoAmministrazione;
	}

	public void setCdRiferimentoAmministrazione(String cdRiferimentoAmministrazione) {
		this.cdRiferimentoAmministrazione = cdRiferimentoAmministrazione;
	}

	public String getCdUnitaMisura() {
		return this.cdUnitaMisura;
	}

	public void setCdUnitaMisura(String cdUnitaMisura) {
		this.cdUnitaMisura = cdUnitaMisura;
	}

	public Date getDtDataFinePeriodo() {
		return this.dtDataFinePeriodo;
	}

	public void setDtDataFinePeriodo(Date dtDataFinePeriodo) {
		this.dtDataFinePeriodo = dtDataFinePeriodo;
	}

	public Date getDtDataInizioPeriodo() {
		return this.dtDataInizioPeriodo;
	}

	public void setDtDataInizioPeriodo(Date dtDataInizioPeriodo) {
		this.dtDataInizioPeriodo = dtDataInizioPeriodo;
	}

	public Long getIdArticolo() {
		return this.idArticolo;
	}

	public void setIdArticolo(Long idArticolo) {
		this.idArticolo = idArticolo;
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

	public BigDecimal getImArrotondamento() {
		return this.imArrotondamento;
	}

	public void setImArrotondamento(BigDecimal imArrotondamento) {
		this.imArrotondamento = imArrotondamento;
	}

	public BigDecimal getImPrezzoTotale() {
		return this.imPrezzoTotale;
	}

	public void setImPrezzoTotale(BigDecimal imPrezzoTotale) {
		this.imPrezzoTotale = imPrezzoTotale;
	}

	public BigDecimal getImPrezzoUnitario() {
		return this.imPrezzoUnitario;
	}

	public void setImPrezzoUnitario(BigDecimal imPrezzoUnitario) {
		this.imPrezzoUnitario = imPrezzoUnitario;
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

	public BigDecimal getPcAliquotaIva() {
		return this.pcAliquotaIva;
	}

	public void setPcAliquotaIva(BigDecimal pcAliquotaIva) {
		this.pcAliquotaIva = pcAliquotaIva;
	}

	public BigDecimal getPgNumeroLinea() {
		return this.pgNumeroLinea;
	}

	public void setPgNumeroLinea(BigDecimal pgNumeroLinea) {
		this.pgNumeroLinea = pgNumeroLinea;
	}

	public BigDecimal getQtQuantita() {
		return this.qtQuantita;
	}

	public void setQtQuantita(BigDecimal qtQuantita) {
		this.qtQuantita = qtQuantita;
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

	public String getTxDescrizione() {
		return this.txDescrizione;
	}

	public void setTxDescrizione(String txDescrizione) {
		this.txDescrizione = txDescrizione;
	}

	public List<FatARifLineaStor> getListRifLineaStor() {
		return this.listRifLineaStor;
	}

	public void setListRifLineaStor(List<FatARifLineaStor> listRifLineaStor) {
		this.listRifLineaStor = listRifLineaStor;
	}

	public FatARifLineaStor addFatARifLineaStor(FatARifLineaStor fatARifLineaStor) {
		getListRifLineaStor().add(fatARifLineaStor);
		fatARifLineaStor.setDettaglioLineaStor(this);

		return fatARifLineaStor;
	}

	public FatARifLineaStor removeFatARifLineaStor(FatARifLineaStor fatARifLineaStor) {
		getListRifLineaStor().remove(fatARifLineaStor);
		fatARifLineaStor.setDettaglioLineaStor(null);

		return fatARifLineaStor;
	}

	public List<FatTAltroDatoGestStor> getListAltroDatoGestStor() {
		return this.listAltroDatoGestStor;
	}

	public void setListAltroDatoGestStor(List<FatTAltroDatoGestStor> listAltroDatoGestStor) {
		this.listAltroDatoGestStor = listAltroDatoGestStor;
	}

	public FatTAltroDatoGestStor addFatTAltroDatoGestStor(FatTAltroDatoGestStor fatTAltroDatoGestStor) {
		getListAltroDatoGestStor().add(fatTAltroDatoGestStor);
		fatTAltroDatoGestStor.setDettaglioLineaStor(this);

		return fatTAltroDatoGestStor;
	}

	public FatTAltroDatoGestStor removeFatTAltroDatoGestStor(FatTAltroDatoGestStor fatTAltroDatoGestStor) {
		getListAltroDatoGestStor().remove(fatTAltroDatoGestStor);
		fatTAltroDatoGestStor.setDettaglioLineaStor(null);

		return fatTAltroDatoGestStor;
	}

	public List<FatTArticoloStor> getListArticoloStor() {
		return this.listArticoloStor;
	}

	public void setListArticoloStor(List<FatTArticoloStor> listArticoloStor) {
		this.listArticoloStor = listArticoloStor;
	}

	public FatTArticoloStor addFatTArticoloStor(FatTArticoloStor fatTArticoloStor) {
		getListArticoloStor().add(fatTArticoloStor);
		fatTArticoloStor.setDettaglioLineaStor(this);

		return fatTArticoloStor;
	}

	public FatTArticoloStor removeFatTArticoloStor(FatTArticoloStor fatTArticoloStor) {
		getListArticoloStor().remove(fatTArticoloStor);
		fatTArticoloStor.setDettaglioLineaStor(null);

		return fatTArticoloStor;
	}

	public List<FatTCompSezioneStor> getListCompSezioneStor() {
		return this.listCompSezioneStor;
	}

	public void setListCompSezioneStor(List<FatTCompSezioneStor> listCompSezioneStor) {
		this.listCompSezioneStor = listCompSezioneStor;
	}

	public FatTCompSezioneStor addFatTCompSezioneStor(FatTCompSezioneStor fatTCompSezioneStor) {
		getListCompSezioneStor().add(fatTCompSezioneStor);
		fatTCompSezioneStor.setDettaglioLineaStor(this);

		return fatTCompSezioneStor;
	}

	public FatTCompSezioneStor removeFatTCompSezioneStor(FatTCompSezioneStor fatTCompSezioneStor) {
		getListCompSezioneStor().remove(fatTCompSezioneStor);
		fatTCompSezioneStor.setDettaglioLineaStor(null);

		return fatTCompSezioneStor;
	}

	public FatTFatturaStor getFatturaStor() {
		return this.fatturaStor;
	}

	public void setFatturaStor(FatTFatturaStor fatturaStor) {
		this.fatturaStor = fatturaStor;
	}

	public FatTDizEsigibilitaIva getDizEsigibilitaIva() {
		return this.dizEsigibilitaIva;
	}

	public void setDizEsigibilitaIva(FatTDizEsigibilitaIva dizEsigibilitaIva) {
		this.dizEsigibilitaIva = dizEsigibilitaIva;
	}

	public FatTDizTipoCessionePrest getDizTipoCessionePrest() {
		return this.dizTipoCessionePrest;
	}

	public void setDizTipoCessionePrest(FatTDizTipoCessionePrest dizTipoCessionePrest) {
		this.dizTipoCessionePrest = dizTipoCessionePrest;
	}

	public FatTDizRitenuta getDizRitenuta() {
		return this.dizRitenuta;
	}

	public void setDizRitenuta(FatTDizRitenuta dizRitenuta) {
		this.dizRitenuta = dizRitenuta;
	}

	public FatTDizNatura getDizNatura() {
		return this.dizNatura;
	}

	public void setDizNatura(FatTDizNatura dizNatura) {
		this.dizNatura = dizNatura;
	}

	public List<FatTScontoMagStor> getListScontoMagStor() {
		return this.listScontoMagStor;
	}

	public void setListScontoMagStor(List<FatTScontoMagStor> listScontoMagStor) {
		this.listScontoMagStor = listScontoMagStor;
	}

	public FatTScontoMagStor addFatTScontoMagStor(FatTScontoMagStor fatTScontoMagStor) {
		getListScontoMagStor().add(fatTScontoMagStor);
		fatTScontoMagStor.setDettaglioLineaStor(this);

		return fatTScontoMagStor;
	}

	public FatTScontoMagStor removeFatTScontoMagStor(FatTScontoMagStor fatTScontoMagStor) {
		getListScontoMagStor().remove(fatTScontoMagStor);
		fatTScontoMagStor.setDettaglioLineaStor(null);

		return fatTScontoMagStor;
	}

	public Serializable getPrimaryKey() {
		return this.idDettaglioLineaStor;
	}

}