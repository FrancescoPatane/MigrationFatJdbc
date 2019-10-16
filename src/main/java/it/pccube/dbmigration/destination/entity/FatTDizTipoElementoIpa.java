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
 * The persistent class for the FAT_T_DIZ_TIPO_ELEMENTO_IPA database table.
 * 
 */
@Entity
@Table(name = "FAT_T_DIZ_TIPO_ELEMENTO_IPA")
public class FatTDizTipoElementoIpa implements EntityInterface {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_DIZ_TIPO_ELEMENTO_IPA")
	private Long idDizTipoElementoIpa;
	
	
	@Column(name = "TY_TIPO")
	private String tyTipo;

	
	@Column(name = "TY_TIPO_ESTESO")
	private String tyTipoEsteso;

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

	// bi-directional many-to-one association to FatTIpa
	@OneToMany(mappedBy = "dizTipoElementoIpa")
	private List<FatTIpa> listIpa;

	public FatTDizTipoElementoIpa() {
	}

	public Long getIdDizTipoElementoIpa() {
		return this.idDizTipoElementoIpa;
	}

	public void setIdDizTipoElementoIpa(Long idDizTipoElementoIpa) {
		this.idDizTipoElementoIpa = idDizTipoElementoIpa;
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

	public String getTyTipo() {
		return this.tyTipo;
	}

	public void setTyTipo(String tyTipo) {
		this.tyTipo = tyTipo;
	}

	public String getTyTipoEsteso() {
		return this.tyTipoEsteso;
	}

	public void setTyTipoEsteso(String tyTipoEsteso) {
		this.tyTipoEsteso = tyTipoEsteso;
	}

	public List<FatTIpa> getListIpa() {
		return this.listIpa;
	}

	public void setListIpa(List<FatTIpa> listIpa) {
		this.listIpa = listIpa;
	}

	public FatTIpa addFatTIpa(FatTIpa fatTIpa) {
		getListIpa().add(fatTIpa);
		fatTIpa.setDizTipoElementoIpa(this);

		return fatTIpa;
	}

	public FatTIpa removeFatTIpa(FatTIpa fatTIpa) {
		getListIpa().remove(fatTIpa);
		fatTIpa.setDizTipoElementoIpa(null);

		return fatTIpa;
	}

	public Serializable getPrimaryKey() {
		return this.idDizTipoElementoIpa;
	}

}