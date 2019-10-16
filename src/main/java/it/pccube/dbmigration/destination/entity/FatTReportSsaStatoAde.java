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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_REPORT_SSA_STATO_ADE database table.
 * 
 */
@Entity
@Table(name="FAT_T_REPORT_SSA_STATO_ADE")
public class FatTReportSsaStatoAde implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_REPORT_SSA_STATO_ADE_IDREPORTSSASTATOADE_GENERATOR", sequenceName="SEQ_ID_REPORT_SSA_STATO_ADE", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_REPORT_SSA_STATO_ADE_IDREPORTSSASTATOADE_GENERATOR")
	@Column(name="ID_REPORT_SSA_STATO_ADE")
	private Long idReportSsaStatoAde;

	@Column(name="CD_PARTITA_IVA_FORN")
	private String cdPartitaIvaForn;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ADESIONE_A")
	private Date dtDataAdesioneA;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ADESIONE_DA")
	private Date dtDataAdesioneDa;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_MODIFICA_ADESIONE_A")
	private Date dtDataModificaAdesioneA;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_MODIFICA_ADESIONE_DA")
	private Date dtDataModificaAdesioneDa;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_RICHIESTA")
	private Date dtDataRichiesta;

	@Column(name="NM_COGNOME_FORN")
	private String nmCognomeForn;

	@Column(name="NM_DENOMINAZIONE_FORN")
	private String nmDenominazioneForn;

	@Column(name="NM_NOME_FORN")
	private String nmNomeForn;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Column(name="ID_REPORT")
	private String idReport;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTDizStatoAdesione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_STATO_ADESIONE")
	private FatTDizStatoAdesione dizStatoAdesione;

	//bi-directional many-to-one association to FatTDizStatoReport
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_STATO_RICHIESTA")
	private FatTDizStatoReport dizStatoReport;

	public FatTReportSsaStatoAde() {
	}

	public Long getIdReportSsaStatoAde() {
		return this.idReportSsaStatoAde;
	}

	public void setIdReportSsaStatoAde(Long idReportSsaStatoAde) {
		this.idReportSsaStatoAde = idReportSsaStatoAde;
	}

	public String getCdPartitaIvaForn() {
		return this.cdPartitaIvaForn;
	}

	public void setCdPartitaIvaForn(String cdPartitaIvaForn) {
		this.cdPartitaIvaForn = cdPartitaIvaForn;
	}

	public Date getDtDataAdesioneA() {
		return this.dtDataAdesioneA;
	}

	public void setDtDataAdesioneA(Date dtDataAdesioneA) {
		this.dtDataAdesioneA = dtDataAdesioneA;
	}

	public Date getDtDataAdesioneDa() {
		return this.dtDataAdesioneDa;
	}

	public void setDtDataAdesioneDa(Date dtDataAdesioneDa) {
		this.dtDataAdesioneDa = dtDataAdesioneDa;
	}

	public Date getDtDataModificaAdesioneA() {
		return this.dtDataModificaAdesioneA;
	}

	public void setDtDataModificaAdesioneA(Date dtDataModificaAdesioneA) {
		this.dtDataModificaAdesioneA = dtDataModificaAdesioneA;
	}

	public Date getDtDataModificaAdesioneDa() {
		return this.dtDataModificaAdesioneDa;
	}

	public void setDtDataModificaAdesioneDa(Date dtDataModificaAdesioneDa) {
		this.dtDataModificaAdesioneDa = dtDataModificaAdesioneDa;
	}

	public Date getDtDataRichiesta() {
		return this.dtDataRichiesta;
	}

	public void setDtDataRichiesta(Date dtDataRichiesta) {
		this.dtDataRichiesta = dtDataRichiesta;
	}

	public String getNmCognomeForn() {
		return this.nmCognomeForn;
	}

	public void setNmCognomeForn(String nmCognomeForn) {
		this.nmCognomeForn = nmCognomeForn;
	}

	public String getNmDenominazioneForn() {
		return this.nmDenominazioneForn;
	}

	public void setNmDenominazioneForn(String nmDenominazioneForn) {
		this.nmDenominazioneForn = nmDenominazioneForn;
	}

	public String getNmNomeForn() {
		return this.nmNomeForn;
	}

	public void setNmNomeForn(String nmNomeForn) {
		this.nmNomeForn = nmNomeForn;
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

	public FatTDizStatoAdesione getDizStatoAdesione() {
		return this.dizStatoAdesione;
	}

	public void setDizStatoAdesione(FatTDizStatoAdesione dizStatoAdesione) {
		this.dizStatoAdesione = dizStatoAdesione;
	}

	public FatTDizStatoReport getDizStatoReport() {
		return this.dizStatoReport;
	}

	public void setDizStatoReport(FatTDizStatoReport dizStatoReport) {
		this.dizStatoReport = dizStatoReport;
	}

	public Serializable getPrimaryKey() {
		return this.idReportSsaStatoAde;
	}

	public String getIdReport() {
		return idReport;
	}

	public void setIdReport(String idReport) {
		this.idReport = idReport;
	}

}