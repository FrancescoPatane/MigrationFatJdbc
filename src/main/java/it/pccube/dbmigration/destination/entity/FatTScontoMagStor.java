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
 * The persistent class for the FAT_T_SCONTO_MAG_STOR database table.
 * 
 */
@Entity
@Table(name="FAT_T_SCONTO_MAG_STOR")
public class FatTScontoMagStor implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_SCONTO_MAG_STOR_IDSCONTOMAGSTOR_GENERATOR",sequenceName="SEQ_ID_SCONTO_MAG_STO",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_SCONTO_MAG_STOR_IDSCONTOMAGSTOR_GENERATOR")
	@Column(name="ID_SCONTO_MAG_STOR")
	private Long idScontoMagStor;

	@Column(name="ID_DETTAGLIO_LINEA")
	private Long idDettaglioLinea;

	@Column(name="ID_FATTURA")
	private Long idFattura;

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

	//bi-directional many-to-one association to FatTDettaglioLineaStor
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DETTAGLIO_LINEA_STOR")
	private FatTDettaglioLineaStor dettaglioLineaStor;

	//bi-directional many-to-one association to FatTFatturaStor
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FATTURA_STOR")
	private FatTFatturaStor fatturaStor;

	public FatTScontoMagStor() {
	}

	public Long getIdScontoMagStor() {
		return this.idScontoMagStor;
	}

	public void setIdScontoMagStor(Long idScontoMagStor) {
		this.idScontoMagStor = idScontoMagStor;
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

	public FatTDettaglioLineaStor getDettaglioLineaStor() {
		return this.dettaglioLineaStor;
	}

	public void setDettaglioLineaStor(FatTDettaglioLineaStor dettaglioLineaStor) {
		this.dettaglioLineaStor = dettaglioLineaStor;
	}

	public FatTFatturaStor getFatturaStor() {
		return this.fatturaStor;
	}

	public void setFatturaStor(FatTFatturaStor fatturaStor) {
		this.fatturaStor = fatturaStor;
	}

	public Serializable getPrimaryKey() {
		return this.idScontoMagStor;
	}

}