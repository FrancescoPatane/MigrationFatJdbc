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
 * The persistent class for the FAT_T_SCONTO_MAGGIORAZIONE database table.
 * 
 */
@Entity
@Table(name="FAT_T_SCONTO_MAGGIORAZIONE")
public class FatTScontoMaggiorazione implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_SCONTO_MAGGIORAZIONE_IDSCONTOMAGGIORAZIONE_GENERATOR",sequenceName="SEQ_ID_SCONTO_MAGGIORAZIONE",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_SCONTO_MAGGIORAZIONE_IDSCONTOMAGGIORAZIONE_GENERATOR")
	@Column(name="ID_SCONTO_MAGGIORAZIONE")
	private Long idScontoMaggiorazione;

	@Column(name="IM_IMPORTO")
	
	private BigDecimal imImporto;

	@Column(name="NM_UTENTE_INSERIMENTO")
	
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	
	private String nmUtenteUltimaModifica;

	@Column(name="PC_PERCENTUALE")
	
	private BigDecimal pcPercentuale;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTDizTipoScontoMag
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_TIPO_SCONTO_MAGG")
	private FatTDizTipoScontoMag dizTipoScontoMag;

	//bi-directional many-to-one association to FatTDettaglioLinea
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DETTAGLIO_LINEA")
	private FatTDettaglioLinea dettaglioLinea;

	//bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FATTURA")
	private FatTFattura fattura;

	public FatTScontoMaggiorazione() {
	}

	public Long getIdScontoMaggiorazione() {
		return this.idScontoMaggiorazione;
	}

	public void setIdScontoMaggiorazione(Long idScontoMaggiorazione) {
		this.idScontoMaggiorazione = idScontoMaggiorazione;
	}

	public BigDecimal getImImporto() {
		return this.imImporto;
	}

	public void setImImporto(BigDecimal imImporto) {
		this.imImporto = imImporto;
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

	public BigDecimal getPcPercentuale() {
		return this.pcPercentuale;
	}

	public void setPcPercentuale(BigDecimal pcPercentuale) {
		this.pcPercentuale = pcPercentuale;
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

	public FatTDizTipoScontoMag getDizTipoScontoMag() {
		return this.dizTipoScontoMag;
	}

	public void setDizTipoScontoMag(FatTDizTipoScontoMag dizTipoScontoMag) {
		this.dizTipoScontoMag = dizTipoScontoMag;
	}

	public FatTDettaglioLinea getDettaglioLinea() {
		return this.dettaglioLinea;
	}

	public void setDettaglioLinea(FatTDettaglioLinea dettaglioLinea) {
		this.dettaglioLinea = dettaglioLinea;
	}

	public FatTFattura getFattura() {
		return this.fattura;
	}

	public void setFattura(FatTFattura fattura) {
		this.fattura = fattura;
	}

	public Serializable getPrimaryKey() {
		return this.idScontoMaggiorazione;
	}

}