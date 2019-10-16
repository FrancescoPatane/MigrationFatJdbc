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

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;



/**
 * The persistent class for the FAT_T_DETTAGLIO_LINEA database table.
 * 
 */
@Entity
@Table(name="FAT_T_DETTAGLIO_LINEA")
public class FatTDettaglioLinea implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_DETTAGLIO_LINEA_IDDETTAGLIOLINEA_GENERATOR", sequenceName="SEQ_ID_DETTAGLIO_LINEA", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_DETTAGLIO_LINEA_IDDETTAGLIOLINEA_GENERATOR")
	@Column(name="ID_DETTAGLIO_LINEA")
	private Long idDettaglioLinea;

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
	
	private Long pgNumeroLinea;

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

	//bi-directional many-to-one association to FatARiferimentoLinea
	@OneToMany(mappedBy="dettaglioLinea", orphanRemoval = true)
	@Cascade({CascadeType.DELETE, CascadeType.REMOVE, CascadeType.DETACH, CascadeType.EVICT})
	private List<FatARiferimentoLinea> listRiferimentoLinea;

	//bi-directional many-to-one association to FatTAltroDatoGestionale
	@OneToMany(mappedBy="dettaglioLinea", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatTAltroDatoGestionale> listAltroDatoGestionale;

	//bi-directional many-to-one association to FatTArticolo
	@OneToMany(mappedBy="dettaglioLinea", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatTArticolo> listArticolo;

	//bi-directional many-to-one association to FatTCompilazioneSezione
	@OneToMany(mappedBy="dettaglioLinea", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatTCompilazioneSezione> listCompilazioneSezione;
	
	//bi-directional many-to-one association to FatTScontoMaggiorazione
	@OneToMany(mappedBy="dettaglioLinea", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatTScontoMaggiorazione> listScontoMaggiorazione;

	//bi-directional many-to-one association to FatTDizTipoCessionePrest
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_TIPO_CESSIONE_PREST")
	private FatTDizTipoCessionePrest dizTipoCessionePrest;

	//bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FATTURA")
	private FatTFattura fattura;

	//bi-directional many-to-one association to FatTDizEsigibilitaIva
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_ESIGIBILITA_IVA")
	private FatTDizEsigibilitaIva dizEsigibilitaIva;

	//bi-directional many-to-one association to FatTDizNatura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_NATURA")
	private FatTDizNatura dizNatura;

	//bi-directional many-to-one association to FatTDizRitenuta
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_RITENUTA")
	private FatTDizRitenuta dizRitenuta;


	public FatTDettaglioLinea() {
	}

	public Long getIdDettaglioLinea() {
		return this.idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
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

	public Long getPgNumeroLinea() {
		return this.pgNumeroLinea;
	}

	public void setPgNumeroLinea(Long pgNumeroLinea) {
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

	public List<FatARiferimentoLinea> getListRiferimentoLinea() {
		return this.listRiferimentoLinea;
	}

	public void setListRiferimentoLinea(List<FatARiferimentoLinea> listRiferimentoLinea) {
		this.listRiferimentoLinea = listRiferimentoLinea;
	}

	public FatARiferimentoLinea addFatARiferimentoLinea(FatARiferimentoLinea fatARiferimentoLinea) {
		getListRiferimentoLinea().add(fatARiferimentoLinea);
		fatARiferimentoLinea.setDettaglioLinea(this);

		return fatARiferimentoLinea;
	}

	public FatARiferimentoLinea removeFatARiferimentoLinea(FatARiferimentoLinea fatARiferimentoLinea) {
		getListRiferimentoLinea().remove(fatARiferimentoLinea);
		fatARiferimentoLinea.setDettaglioLinea(null);

		return fatARiferimentoLinea;
	}

	public List<FatTAltroDatoGestionale> getListAltroDatoGestionale() {
		return this.listAltroDatoGestionale;
	}

	public void setListAltroDatoGestionale(List<FatTAltroDatoGestionale> listAltroDatoGestionale) {
		this.listAltroDatoGestionale = listAltroDatoGestionale;
	}

	public FatTAltroDatoGestionale addFatTAltroDatoGestionale(FatTAltroDatoGestionale fatTAltroDatoGestionale) {
		getListAltroDatoGestionale().add(fatTAltroDatoGestionale);
		fatTAltroDatoGestionale.setDettaglioLinea(this);

		return fatTAltroDatoGestionale;
	}

	public FatTAltroDatoGestionale removeFatTAltroDatoGestionale(FatTAltroDatoGestionale fatTAltroDatoGestionale) {
		getListAltroDatoGestionale().remove(fatTAltroDatoGestionale);
		fatTAltroDatoGestionale.setDettaglioLinea(null);

		return fatTAltroDatoGestionale;
	}

	public List<FatTArticolo> getListArticolo() {
		return this.listArticolo;
	}

	public void setListArticolo(List<FatTArticolo> listArticolo) {
		this.listArticolo = listArticolo;
	}

	public FatTArticolo addFatTArticolo(FatTArticolo fatTArticolo) {
		getListArticolo().add(fatTArticolo);
		fatTArticolo.setDettaglioLinea(this);

		return fatTArticolo;
	}

	public FatTArticolo removeFatTArticolo(FatTArticolo fatTArticolo) {
		getListArticolo().remove(fatTArticolo);
		fatTArticolo.setDettaglioLinea(null);

		return fatTArticolo;
	}

	public List<FatTCompilazioneSezione> getListCompilazioneSezione() {
		return this.listCompilazioneSezione;
	}

	public void setListCompilazioneSezione(List<FatTCompilazioneSezione> listCompilazioneSezione) {
		this.listCompilazioneSezione = listCompilazioneSezione;
	}

	public FatTCompilazioneSezione addFatTCompilazioneSezione(FatTCompilazioneSezione fatTCompilazioneSezione) {
		getListCompilazioneSezione().add(fatTCompilazioneSezione);
		fatTCompilazioneSezione.setDettaglioLinea(this);

		return fatTCompilazioneSezione;
	}

	public FatTCompilazioneSezione removeFatTCompilazioneSezione(FatTCompilazioneSezione fatTCompilazioneSezione) {
		getListCompilazioneSezione().remove(fatTCompilazioneSezione);
		fatTCompilazioneSezione.setDettaglioLinea(null);

		return fatTCompilazioneSezione;
	}

	public FatTDizTipoCessionePrest getDizTipoCessionePrest() {
		return this.dizTipoCessionePrest;
	}

	public void setDizTipoCessionePrest(FatTDizTipoCessionePrest dizTipoCessionePrest) {
		this.dizTipoCessionePrest = dizTipoCessionePrest;
	}

	public FatTFattura getFattura() {
		return this.fattura;
	}

	public void setFattura(FatTFattura fattura) {
		this.fattura = fattura;
	}

	public FatTDizEsigibilitaIva getDizEsigibilitaIva() {
		return this.dizEsigibilitaIva;
	}

	public void setDizEsigibilitaIva(FatTDizEsigibilitaIva dizEsigibilitaIva) {
		this.dizEsigibilitaIva = dizEsigibilitaIva;
	}

	public FatTDizNatura getDizNatura() {
		return this.dizNatura;
	}

	public void setDizNatura(FatTDizNatura dizNatura) {
		this.dizNatura = dizNatura;
	}

	public FatTDizRitenuta getDizRitenuta() {
		return this.dizRitenuta;
	}

	public void setDizRitenuta(FatTDizRitenuta dizRitenuta) {
		this.dizRitenuta = dizRitenuta;
	}

	public List<FatTScontoMaggiorazione> getListScontoMaggiorazione() {
		return this.listScontoMaggiorazione;
	}

	public void setListScontoMaggiorazione(List<FatTScontoMaggiorazione> listScontoMaggiorazione) {
		this.listScontoMaggiorazione = listScontoMaggiorazione;
	}

	public FatTScontoMaggiorazione addFatTScontoMaggiorazione(FatTScontoMaggiorazione fatTScontoMaggiorazione) {
		getListScontoMaggiorazione().add(fatTScontoMaggiorazione);
		fatTScontoMaggiorazione.setDettaglioLinea(this);

		return fatTScontoMaggiorazione;
	}

	public FatTScontoMaggiorazione removeFatTScontoMaggiorazione(FatTScontoMaggiorazione fatTScontoMaggiorazione) {
		getListScontoMaggiorazione().remove(fatTScontoMaggiorazione);
		fatTScontoMaggiorazione.setDettaglioLinea(null);

		return fatTScontoMaggiorazione;
	}

	public Serializable getPrimaryKey() {
		return this.idDettaglioLinea;
	}

}