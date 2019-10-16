package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_DIZ_STATO_EXCEL_FATTURA database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_STATO_EXCEL_FATTURA")
public class FatTDizStatoExcelFattura implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_STATO_EXCEL_FATTURA")
	private Long idDizStatoExcelFattura;

	
	@Column(name="DS_DESCRIZIONE")
	private String dsDescrizione;

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

	//bi-directional many-to-one association to FatAStatoExcelFattura
	@OneToMany(mappedBy="dizStatoExcelFattura")
	private List<FatAStatoExcelFattura> listStatoExcelFattura;

	//bi-directional many-to-one association to FatTExcelFattura
	@OneToMany(mappedBy="dizStatoExcelFattura")
	private List<FatTExcelFattura> listExcelFattura;

	public FatTDizStatoExcelFattura() {
	}

	public Long getIdDizStatoExcelFattura() {
		return this.idDizStatoExcelFattura;
	}

	public void setIdDizStatoExcelFattura(Long idDizStatoExcelFattura) {
		this.idDizStatoExcelFattura = idDizStatoExcelFattura;
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

	public List<FatAStatoExcelFattura> getListStatoExcelFattura() {
		return this.listStatoExcelFattura;
	}

	public void setListStatoExcelFattura(List<FatAStatoExcelFattura> listStatoExcelFattura) {
		this.listStatoExcelFattura = listStatoExcelFattura;
	}

	public FatAStatoExcelFattura addFatAStatoExcelFattura(FatAStatoExcelFattura fatAStatoExcelFattura) {
		getListStatoExcelFattura().add(fatAStatoExcelFattura);
		fatAStatoExcelFattura.setDizStatoExcelFattura(this);

		return fatAStatoExcelFattura;
	}

	public FatAStatoExcelFattura removeFatAStatoExcelFattura(FatAStatoExcelFattura fatAStatoExcelFattura) {
		getListStatoExcelFattura().remove(fatAStatoExcelFattura);
		fatAStatoExcelFattura.setDizStatoExcelFattura(null);

		return fatAStatoExcelFattura;
	}

	public List<FatTExcelFattura> getListExcelFattura() {
		return this.listExcelFattura;
	}

	public void setListExcelFattura(List<FatTExcelFattura> listExcelFattura) {
		this.listExcelFattura = listExcelFattura;
	}

	public FatTExcelFattura addFatTExcelFattura(FatTExcelFattura fatTExcelFattura) {
		getListExcelFattura().add(fatTExcelFattura);
		fatTExcelFattura.setDizStatoExcelFattura(this);

		return fatTExcelFattura;
	}

	public FatTExcelFattura removeFatTExcelFattura(FatTExcelFattura fatTExcelFattura) {
		getListExcelFattura().remove(fatTExcelFattura);
		fatTExcelFattura.setDizStatoExcelFattura(null);

		return fatTExcelFattura;
	}

	public Serializable getPrimaryKey() {
		return this.idDizStatoExcelFattura;
	}

}