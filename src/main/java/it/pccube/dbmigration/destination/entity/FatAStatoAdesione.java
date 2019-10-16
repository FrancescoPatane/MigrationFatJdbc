package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
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
 * The persistent class for the FAT_A_STATO_ADESIONE database table.
 * 
 */
@Entity
@Table(name="FAT_A_STATO_ADESIONE")
public class FatAStatoAdesione implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_STATO_ADESIONE")
	@SequenceGenerator(name = "SEQ_ID_STATO_ADESIONE", sequenceName = "SEQ_ID_STATO_ADESIONE", allocationSize = 1)
	@Column(name="ID_STATO_ADESIONE")
	private Long idStatoAdesione;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_FINE")
	private Date dtDataFine;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_INIZIO")
	private Date dtDataInizio;

	@Column(name="FL_ATTUALE")
	private Boolean flAttuale;

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

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_STATO_ADESIONE")
	private FatTDizStatoAdesione dizStatoAdesione;
	
	//bi-directional many-to-one association to FatTAdesione
	@ManyToOne
	@JoinColumn(name="ID_ADESIONE")
	private FatTAdesione adesione;

	//bi-directional many-to-one association to FatAStatoAdesione
	@ManyToOne
	@JoinColumn(name="ID_STATO_ADESIONE_PREC")
	private FatAStatoAdesione statoAdesionePrec;

	//bi-directional many-to-one association to FatAStatoAdesione
	@OneToMany(mappedBy="statoAdesionePrec")
	private List<FatAStatoAdesione> listStatoAdesione;

	public FatAStatoAdesione() {
	}

	public Long getIdStatoAdesione() {
		return this.idStatoAdesione;
	}

	public void setIdStatoAdesione(Long idStatoAdesione) {
		this.idStatoAdesione = idStatoAdesione;
	}

	public Date getDtDataFine() {
		return this.dtDataFine;
	}

	public void setDtDataFine(Date dtDataFine) {
		this.dtDataFine = dtDataFine;
	}

	public Date getDtDataInizio() {
		return this.dtDataInizio;
	}

	public void setDtDataInizio(Date dtDataInizio) {
		this.dtDataInizio = dtDataInizio;
	}

	public Boolean getFlAttuale() {
		return this.flAttuale;
	}

	public void setFlAttuale(Boolean flAttuale) {
		this.flAttuale = flAttuale;
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

	public void setAdesione(FatTAdesione adesione) {
		this.adesione = adesione;
	}

	public FatAStatoAdesione getStatoAdesionePrec() {
		return this.statoAdesionePrec;
	}

	public void setStatoAdesionePrec(FatAStatoAdesione statoAdesionePrec) {
		this.statoAdesionePrec = statoAdesionePrec;
	}

	public FatTDizStatoAdesione getDizStatoAdesione() {
		return dizStatoAdesione;
	}

	public void setDizStatoAdesione(FatTDizStatoAdesione dizStatoAdesione) {
		this.dizStatoAdesione = dizStatoAdesione;
	}
	
	public List<FatAStatoAdesione> getListStatoAdesione() {
		return this.listStatoAdesione;
	}

	public void setListStatoAdesione(List<FatAStatoAdesione> listStatoAdesione) {
		this.listStatoAdesione = listStatoAdesione;
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
	
	public FatAStatoAdesione addFatAStatoAdesione(FatAStatoAdesione fatAStatoAdesione) {
		getListStatoAdesione().add(fatAStatoAdesione);
		fatAStatoAdesione.setStatoAdesionePrec(this);

		return fatAStatoAdesione;
	}

	public FatAStatoAdesione removeFatAStatoAdesione(FatAStatoAdesione fatAStatoAdesione) {
		getListStatoAdesione().remove(fatAStatoAdesione);
		fatAStatoAdesione.setStatoAdesionePrec(null);

		return fatAStatoAdesione;
	}

	public Serializable getPrimaryKey() {
		return this.idStatoAdesione;
	}

}