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
 * The persistent class for the FAT_T_ALTRO_DATO_GEST_STOR database table.
 * 
 */
@Entity
@Table(name="FAT_T_ALTRO_DATO_GEST_STOR")
public class FatTAltroDatoGestStor implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_ALTRO_DATO_GEST_STOR_IDALTRODATOGESTSTOR_GENERATOR", sequenceName="SEQ_ID_ALTRO_DATO_GEST_STO", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_ALTRO_DATO_GEST_STOR_IDALTRODATOGESTSTOR_GENERATOR")
	@Column(name="ID_ALTRO_DATO_GEST_STOR")
	private Long idAltroDatoGestStor;

	@Column(name="CD_RIFERIMENTO_TESTO")
	private String cdRiferimentoTesto;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_RIFERIMENTO_DATA")
	private Date dtDataRiferimentoData;

	@Column(name="ID_ALTRO_DATO_GESTIONALE")
	private BigDecimal idAltroDatoGestionale;

	@Column(name="ID_DETTAGLIO_LINEA")
	private BigDecimal idDettaglioLinea;

	@Column(name="NM_TIPO_DATO")
	private String nmTipoDato;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Column(name="NR_RIFERIMENTO_NUMERO")
	private BigDecimal nrRiferimentoNumero;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTDettaglioLineaStor
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DETTAGLIO_LINEA_STOR")
	private FatTDettaglioLineaStor dettaglioLineaStor;

	public FatTAltroDatoGestStor() {
	}

	public Long getIdAltroDatoGestStor() {
		return this.idAltroDatoGestStor;
	}

	public void setIdAltroDatoGestStor(Long idAltroDatoGestStor) {
		this.idAltroDatoGestStor = idAltroDatoGestStor;
	}

	public String getCdRiferimentoTesto() {
		return this.cdRiferimentoTesto;
	}

	public void setCdRiferimentoTesto(String cdRiferimentoTesto) {
		this.cdRiferimentoTesto = cdRiferimentoTesto;
	}

	public Date getDtDataRiferimentoData() {
		return this.dtDataRiferimentoData;
	}

	public void setDtDataRiferimentoData(Date dtDataRiferimentoData) {
		this.dtDataRiferimentoData = dtDataRiferimentoData;
	}

	public BigDecimal getIdAltroDatoGestionale() {
		return this.idAltroDatoGestionale;
	}

	public void setIdAltroDatoGestionale(BigDecimal idAltroDatoGestionale) {
		this.idAltroDatoGestionale = idAltroDatoGestionale;
	}

	public BigDecimal getIdDettaglioLinea() {
		return this.idDettaglioLinea;
	}

	public void setIdDettaglioLinea(BigDecimal idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}

	public String getNmTipoDato() {
		return this.nmTipoDato;
	}

	public void setNmTipoDato(String nmTipoDato) {
		this.nmTipoDato = nmTipoDato;
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

	public BigDecimal getNrRiferimentoNumero() {
		return this.nrRiferimentoNumero;
	}

	public void setNrRiferimentoNumero(BigDecimal nrRiferimentoNumero) {
		this.nrRiferimentoNumero = nrRiferimentoNumero;
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

	public Serializable getPrimaryKey() {
		return this.idAltroDatoGestStor;
	}

}