package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
 * The persistent class for the FAT_T_IMPRESE_COLLEG_ASSOC database table.
 * 
 */
@Entity
@Table(name = "FAT_T_IMPRESE_COLLEG_ASSOC")
public class FatTImpreseCollegAssoc implements EntityInterface {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FAT_T_IMPRESE_COLLEG_ASSOC_IDIMPRESECOLLEGASSOC_GENERATOR", sequenceName = "SEQ_ID_IMPRESE_COLLEG_ASSOC", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAT_T_IMPRESE_COLLEG_ASSOC_IDIMPRESECOLLEGASSOC_GENERATOR")
	@Column(name = "ID_IMPRESE_COLLEG_ASSOC")
	private Long idImpreseCollegAssoc;

	@Column(name = "CD_CODICE_FISCALE")
	
	private String cdCodiceFiscale;

	@Column(name = "CD_NUMERO_REA")
	
	private String cdNumeroRea;

	@Column(name = "CD_PARTITA_IVA")
	
	private String cdPartitaIva;

	@Column(name = "NM_DENOMINAZIONE")
	
	private String nmDenominazione;

	@Column(name = "NM_UTENTE_INSERIMENTO")
	
	private String nmUtenteInserimento;

	@Column(name = "NM_UTENTE_ULTIMA_MODIFICA")
	
	private String nmUtenteUltimaModifica;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TS_INSERIMENTO")
	
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TS_ULTIMA_MODIFICA")
	
	private Date tsUltimaModifica;

	// bi-directional many-to-one association to FatTAdesione
	@ManyToOne
	@JoinColumn(name = "ID_DIZ_TIPOLOGIA")
	private FatTDizImpreseCollegAssoc dizImpreseCollegAssoc;
	
	// bi-directional many-to-one association to FatTAdesione
	@ManyToOne
	@JoinColumn(name = "ID_ADESIONE")
	private FatTAdesione adesione;

	public FatTImpreseCollegAssoc() {
		super();
	}

	public Long getIdImpreseCollegAssoc() {
		return this.idImpreseCollegAssoc;
	}

	public void setIdImpreseCollegAssoc(Long idImpreseCollegAssoc) {
		this.idImpreseCollegAssoc = idImpreseCollegAssoc;
	}

	public String getCdCodiceFiscale() {
		return this.cdCodiceFiscale;
	}

	public void setCdCodiceFiscale(String cdCodiceFiscale) {
		this.cdCodiceFiscale = cdCodiceFiscale;
	}

	public String getCdNumeroRea() {
		return this.cdNumeroRea;
	}

	public void setCdNumeroRea(String cdNumeroRea) {
		this.cdNumeroRea = cdNumeroRea;
	}

	public String getCdPartitaIva() {
		return this.cdPartitaIva;
	}

	public void setCdPartitaIva(String cdPartitaIva) {
		this.cdPartitaIva = cdPartitaIva;
	}

	public String getNmDenominazione() {
		return this.nmDenominazione;
	}

	public void setNmDenominazione(String nmDenominazione) {
		this.nmDenominazione = nmDenominazione;
	}

	public Date getTsInserimento() {
		return this.tsInserimento;
	}

	public void setTsInserimento(Date tsInserimento) {
		this.tsInserimento = tsInserimento;
	}

	public FatTAdesione getAdesione() {
		return this.adesione;
	}

	public void setAdesione(FatTAdesione fatTAdesione) {
		this.adesione = fatTAdesione;
	}

	public FatTDizImpreseCollegAssoc getDizImpreseCollegAssoc() {
		return dizImpreseCollegAssoc;
	}

	public void setDizImpreseCollegAssoc(FatTDizImpreseCollegAssoc dizImpreseCollegAssoc) {
		this.dizImpreseCollegAssoc = dizImpreseCollegAssoc;
	}
	
	public String getNmUtenteInserimento() {
		return nmUtenteInserimento;
	}

	public void setNmUtenteInserimento(String nmUtenteInserimento) {
		this.nmUtenteInserimento = nmUtenteInserimento;
	}

	public String getNmUtenteUltimaModifica() {
		return nmUtenteUltimaModifica;
	}

	public void setNmUtenteUltimaModifica(String nmUtenteUltimaModifica) {
		this.nmUtenteUltimaModifica = nmUtenteUltimaModifica;
	}

	public Date getTsUltimaModifica() {
		return tsUltimaModifica;
	}

	public void setTsUltimaModifica(Date tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}
	
	public Serializable getPrimaryKey() {
		return this.idImpreseCollegAssoc;
	}

}