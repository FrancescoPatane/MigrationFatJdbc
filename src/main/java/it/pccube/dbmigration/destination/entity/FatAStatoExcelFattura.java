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
 * The persistent class for the FAT_A_STATO_EXCEL_FATTURA database table.
 * 
 */
@Entity
@Table(name="FAT_A_STATO_EXCEL_FATTURA")
public class FatAStatoExcelFattura implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_A_STATO_EXCEL_FATTURA_IDSTATOEXCELFATTURA_GENERATOR", sequenceName="SEQ_ID_STATO_EXCEL_FATTURA", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_A_STATO_EXCEL_FATTURA_IDSTATOEXCELFATTURA_GENERATOR")
	@Column(name="ID_STATO_EXCEL_FATTURA")
	private Long idStatoExcelFattura;

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

	//bi-directional many-to-one association to FatTExcelFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_EXCEL_FATTURA")
	private FatTExcelFattura excelFattura;

	//bi-directional many-to-one association to FatTDizStatoExcelFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_STATO_EXCEL_FATTURA")
	private FatTDizStatoExcelFattura dizStatoExcelFattura;

	//bi-directional many-to-one association to FatAStatoExcelFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_STATO_EXCEL_FATTURA_PREC")
	private FatAStatoExcelFattura statoExcelFatturaPrec;

	//bi-directional many-to-one association to FatAStatoExcelFattura
	@OneToMany(mappedBy="statoExcelFatturaPrec")
	private List<FatAStatoExcelFattura> listStatoExcelFatturaPrec;

	public FatAStatoExcelFattura() {
	}

	public Long getIdStatoExcelFattura() {
		return this.idStatoExcelFattura;
	}

	public void setIdStatoExcelFattura(Long idStatoExcelFattura) {
		this.idStatoExcelFattura = idStatoExcelFattura;
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

	public FatTExcelFattura getExcelFattura() {
		return this.excelFattura;
	}

	public void setExcelFattura(FatTExcelFattura excelFattura) {
		this.excelFattura = excelFattura;
	}

	public FatTDizStatoExcelFattura getDizStatoExcelFattura() {
		return this.dizStatoExcelFattura;
	}

	public void setDizStatoExcelFattura(FatTDizStatoExcelFattura dizStatoExcelFattura) {
		this.dizStatoExcelFattura = dizStatoExcelFattura;
	}

	public FatAStatoExcelFattura getStatoExcelFatturaPrec() {
		return this.statoExcelFatturaPrec;
	}

	public void setStatoExcelFatturaPrec(FatAStatoExcelFattura statoExcelFattura) {
		this.statoExcelFatturaPrec = statoExcelFattura;
	}

	public List<FatAStatoExcelFattura> getListStatoExcelFatturaPrec() {
		return this.listStatoExcelFatturaPrec;
	}

	public void setListStatoExcelFatturaPrec(List<FatAStatoExcelFattura> listStatoExcelFattura) {
		this.listStatoExcelFatturaPrec = listStatoExcelFattura;
	}

	public FatAStatoExcelFattura addFatAStatoExcelFatturaPrec(FatAStatoExcelFattura fatAStatoExcelFattura) {
		getListStatoExcelFatturaPrec().add(fatAStatoExcelFattura);
		fatAStatoExcelFattura.setStatoExcelFatturaPrec(this);

		return fatAStatoExcelFattura;
	}

	public FatAStatoExcelFattura removeFatAStatoExcelFatturaPrec(FatAStatoExcelFattura fatAStatoExcelFattura) {
		getListStatoExcelFatturaPrec().remove(fatAStatoExcelFattura);
		fatAStatoExcelFattura.setStatoExcelFatturaPrec(null);

		return fatAStatoExcelFattura;
	}

	public Serializable getPrimaryKey() {
		return this.idStatoExcelFattura;
	}

}