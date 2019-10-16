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
 * The persistent class for the FAT_T_DIZ_STATO_ESITO_FTP database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_STATO_ESITO_FTP")
public class FatTDizStatoEsitoFtp implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_STATO_ESITO_FTP")
	private Long idDizStatoEsitoFtp;

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

	//bi-directional many-to-one association to FatAStatoEsitoFtp
	@OneToMany(mappedBy="dizStatoEsitoFtp")
	private List<FatAStatoEsitoFtp> listStatoEsitoFtp;

	public FatTDizStatoEsitoFtp() {
	}

	public Long getIdDizStatoEsitoFtp() {
		return this.idDizStatoEsitoFtp;
	}

	public void setIdDizStatoEsitoFtp(Long idDizStatoEsitoFtp) {
		this.idDizStatoEsitoFtp = idDizStatoEsitoFtp;
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

	public List<FatAStatoEsitoFtp> getListStatoEsitoFtp() {
		return this.listStatoEsitoFtp;
	}

	public void setListStatoEsitoFtp(List<FatAStatoEsitoFtp> listStatoEsitoFtp) {
		this.listStatoEsitoFtp = listStatoEsitoFtp;
	}

	public FatAStatoEsitoFtp addFatAStatoEsitoFtp(FatAStatoEsitoFtp fatAStatoEsitoFtp) {
		getListStatoEsitoFtp().add(fatAStatoEsitoFtp);
		fatAStatoEsitoFtp.setDizStatoEsitoFtp(this);

		return fatAStatoEsitoFtp;
	}

	public FatAStatoEsitoFtp removeFatAStatoEsitoFtp(FatAStatoEsitoFtp fatAStatoEsitoFtp) {
		getListStatoEsitoFtp().remove(fatAStatoEsitoFtp);
		fatAStatoEsitoFtp.setDizStatoEsitoFtp(null);

		return fatAStatoEsitoFtp;
	}

	public Serializable getPrimaryKey() {
		return this.idDizStatoEsitoFtp;
	}

}