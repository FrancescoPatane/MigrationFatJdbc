package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import javax.persistence.*;


import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the FAT_T_DIZ_STATO_REPORT database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_STATO_REPORT")
public class FatTDizStatoReport implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_STATO_REPORT")
	private Long idDizStatoReport;

	@Column(name="DS_DESCRIZIONE")
	private String dsDescrizione;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Column(name="TS_INSERIMENTO")
	private Timestamp tsInserimento;

	@Column(name="TS_ULTIMA_MODIFICA")
	private Timestamp tsUltimaModifica;

	//bi-directional many-to-one association to FatTReportSsaInviiSdi
	@OneToMany(mappedBy="dizStatoReport")
	private List<FatTReportSsaInviiSdi> listReportSsaInviiSdi;

	//bi-directional many-to-one association to FatTReportSsaStatoAde
	@OneToMany(mappedBy="dizStatoReport")
	private List<FatTReportSsaStatoAde> listReportSsaStatoAde;

	public FatTDizStatoReport() {
	}

	public Long getIdDizStatoReport() {
		return this.idDizStatoReport;
	}

	public void setIdDizStatoReport(Long idDizStatoReport) {
		this.idDizStatoReport = idDizStatoReport;
	}

	public String getDsDescrizione() {
		return this.dsDescrizione;
	}

	public void setDsDescrizione(String dsDescrizione) {
		this.dsDescrizione = dsDescrizione;
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

	public Timestamp getTsInserimento() {
		return this.tsInserimento;
	}

	public void setTsInserimento(Timestamp tsInserimento) {
		this.tsInserimento = tsInserimento;
	}

	public Timestamp getTsUltimaModifica() {
		return this.tsUltimaModifica;
	}

	public void setTsUltimaModifica(Timestamp tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}

	public List<FatTReportSsaInviiSdi> getListReportSsaInviiSdi() {
		return this.listReportSsaInviiSdi;
	}

	public void setListReportSsaInviiSdi(List<FatTReportSsaInviiSdi> listReportSsaInviiSdi) {
		this.listReportSsaInviiSdi = listReportSsaInviiSdi;
	}

	public FatTReportSsaInviiSdi addFatTReportSsaInviiSdi(FatTReportSsaInviiSdi fatTReportSsaInviiSdi) {
		getListReportSsaInviiSdi().add(fatTReportSsaInviiSdi);
		fatTReportSsaInviiSdi.setDizStatoReport(this);

		return fatTReportSsaInviiSdi;
	}

	public FatTReportSsaInviiSdi removeFatTReportSsaInviiSdi(FatTReportSsaInviiSdi fatTReportSsaInviiSdi) {
		getListReportSsaInviiSdi().remove(fatTReportSsaInviiSdi);
		fatTReportSsaInviiSdi.setDizStatoReport(null);

		return fatTReportSsaInviiSdi;
	}

	public List<FatTReportSsaStatoAde> getListReportSsaStatoAde() {
		return this.listReportSsaStatoAde;
	}

	public void setListReportSsaStatoAde(List<FatTReportSsaStatoAde> listReportSsaStatoAde) {
		this.listReportSsaStatoAde = listReportSsaStatoAde;
	}

	public FatTReportSsaStatoAde addFatTReportSsaStatoAde(FatTReportSsaStatoAde fatTReportSsaStatoAde) {
		getListReportSsaStatoAde().add(fatTReportSsaStatoAde);
		fatTReportSsaStatoAde.setDizStatoReport(this);

		return fatTReportSsaStatoAde;
	}

	public FatTReportSsaStatoAde removeFatTReportSsaStatoAde(FatTReportSsaStatoAde fatTReportSsaStatoAde) {
		getListReportSsaStatoAde().remove(fatTReportSsaStatoAde);
		fatTReportSsaStatoAde.setDizStatoReport(null);

		return fatTReportSsaStatoAde;
	}

	public Serializable getPrimaryKey() {
		return this.idDizStatoReport;
	}

}