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
 * The persistent class for the FAT_T_DIZ_STATO_SUPPORTO_FTP database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_STATO_SUPPORTO_FTP")
public class FatTDizStatoSupportoFtp implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_STATO_SUPPORTO_FTP")
	private Long idDizStatoSupportoFtp;

	@Column(name="CD_DA_SDI_VERSO_SDI")
	private String cdDaSdiVersoSdi;

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

	//bi-directional many-to-one association to FatAStatoSupportoFtp
	@OneToMany(mappedBy="dizStatoSupportoFtp")
	private List<FatAStatoSupportoFtp> listStatoSupportoFtp;

	//bi-directional many-to-one association to FatTSupportoFtp
	@OneToMany(mappedBy="dizStatoSupportoFtp")
	private List<FatTSupportoFtp> listSupportoFtp;

	public FatTDizStatoSupportoFtp() {
	}

	public Long getIdDizStatoSupportoFtp() {
		return this.idDizStatoSupportoFtp;
	}

	public void setIdDizStatoSupportoFtp(Long idDizStatoSupportoFtp) {
		this.idDizStatoSupportoFtp = idDizStatoSupportoFtp;
	}

	public String getCdDaSdiVersoSdi() {
		return this.cdDaSdiVersoSdi;
	}

	public void setCdDaSdiVersoSdi(String cdDaSdiVersoSdi) {
		this.cdDaSdiVersoSdi = cdDaSdiVersoSdi;
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

	public List<FatAStatoSupportoFtp> getListStatoSupportoFtp() {
		return this.listStatoSupportoFtp;
	}

	public void setListStatoSupportoFtp(List<FatAStatoSupportoFtp> listStatoSupportoFtp) {
		this.listStatoSupportoFtp = listStatoSupportoFtp;
	}

	public FatAStatoSupportoFtp addFatAStatoSupportoFtp(FatAStatoSupportoFtp fatAStatoSupportoFtp) {
		getListStatoSupportoFtp().add(fatAStatoSupportoFtp);
		fatAStatoSupportoFtp.setDizStatoSupportoFtp(this);

		return fatAStatoSupportoFtp;
	}

	public FatAStatoSupportoFtp removeFatAStatoSupportoFtp(FatAStatoSupportoFtp fatAStatoSupportoFtp) {
		getListStatoSupportoFtp().remove(fatAStatoSupportoFtp);
		fatAStatoSupportoFtp.setDizStatoSupportoFtp(null);

		return fatAStatoSupportoFtp;
	}

	public List<FatTSupportoFtp> getListSupportoFtp() {
		return this.listSupportoFtp;
	}

	public void setListSupportoFtp(List<FatTSupportoFtp> listSupportoFtp) {
		this.listSupportoFtp = listSupportoFtp;
	}

	public FatTSupportoFtp addFatTSupportoFtp(FatTSupportoFtp fatTSupportoFtp) {
		getListSupportoFtp().add(fatTSupportoFtp);
		fatTSupportoFtp.setDizStatoSupportoFtp(this);

		return fatTSupportoFtp;
	}

	public FatTSupportoFtp removeFatTSupportoFtp(FatTSupportoFtp fatTSupportoFtp) {
		getListSupportoFtp().remove(fatTSupportoFtp);
		fatTSupportoFtp.setDizStatoSupportoFtp(null);

		return fatTSupportoFtp;
	}

	public Serializable getPrimaryKey() {
		return this.idDizStatoSupportoFtp;
	}

}