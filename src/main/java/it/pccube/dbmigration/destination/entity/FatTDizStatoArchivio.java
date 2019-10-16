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
 * The persistent class for the FAT_T_DIZ_STATO_ARCHIVIO database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_STATO_ARCHIVIO")
public class FatTDizStatoArchivio implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_STATO_ARCHIVIO")
	private Long idDizStatoArchivio;

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

	//bi-directional many-to-one association to FatAStatoArchivio
	@OneToMany(mappedBy="dizStatoArchivio")
	private List<FatAStatoArchivio> listStatoArchivio;

	public FatTDizStatoArchivio() {
	}

	public Long getIdDizStatoArchivio() {
		return this.idDizStatoArchivio;
	}

	public void setIdDizStatoArchivio(Long idDizStatoArchivio) {
		this.idDizStatoArchivio = idDizStatoArchivio;
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

	public List<FatAStatoArchivio> getListStatoArchivio() {
		return this.listStatoArchivio;
	}

	public void setListStatoArchivio(List<FatAStatoArchivio> listStatoArchivio) {
		this.listStatoArchivio = listStatoArchivio;
	}

	public FatAStatoArchivio addFatAStatoArchivio(FatAStatoArchivio fatAStatoArchivio) {
		getListStatoArchivio().add(fatAStatoArchivio);
		fatAStatoArchivio.setDizStatoArchivio(this);

		return fatAStatoArchivio;
	}

	public FatAStatoArchivio removeFatAStatoArchivio(FatAStatoArchivio fatAStatoArchivio) {
		getListStatoArchivio().remove(fatAStatoArchivio);
		fatAStatoArchivio.setDizStatoArchivio(null);

		return fatAStatoArchivio;
	}

	public Serializable getPrimaryKey() {
		return this.idDizStatoArchivio;
	}

}