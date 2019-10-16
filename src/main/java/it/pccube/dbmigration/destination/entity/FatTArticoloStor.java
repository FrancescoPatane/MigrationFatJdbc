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
 * The persistent class for the FAT_T_ARTICOLO_STOR database table.
 * 
 */
@Entity
@Table(name="FAT_T_ARTICOLO_STOR")
public class FatTArticoloStor implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_ARTICOLO_STOR_IDARTICOLOSTOR_GENERATOR",sequenceName="SEQ_ID_ARTICOLO_STO",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_ARTICOLO_STOR_IDARTICOLOSTOR_GENERATOR")
	@Column(name="ID_ARTICOLO_STOR")
	private Long idArticoloStor;

	@Column(name="CD_CODICE_TIPO")
	private String cdCodiceTipo;

	@Column(name="CD_CODICE_VALORE")
	private String cdCodiceValore;

	@Column(name="ID_ARTICOLO")
	private Long idArticolo;

	@Column(name="ID_DETTAGLIO_LINEA")
	private Long idDettaglioLinea;

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

	//bi-directional many-to-one association to FatTDettaglioLineaStor
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DETTAGLIO_LINEA_STOR")
	private FatTDettaglioLineaStor dettaglioLineaStor;

	public FatTArticoloStor() {
	}

	public Long getIdArticoloStor() {
		return this.idArticoloStor;
	}

	public void setIdArticoloStor(Long idArticoloStor) {
		this.idArticoloStor = idArticoloStor;
	}

	public String getCdCodiceTipo() {
		return this.cdCodiceTipo;
	}

	public void setCdCodiceTipo(String cdCodiceTipo) {
		this.cdCodiceTipo = cdCodiceTipo;
	}

	public String getCdCodiceValore() {
		return this.cdCodiceValore;
	}

	public void setCdCodiceValore(String cdCodiceValore) {
		this.cdCodiceValore = cdCodiceValore;
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

	public Serializable getPrimaryKey() {
		return this.idArticoloStor;
	}

}