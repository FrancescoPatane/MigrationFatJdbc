package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the FAT_T_DIZ_IMPRESE_COLLEG_ASSOC database table.
 * 
 */
@Entity
@Table(name = "FAT_T_DIZ_IMPRESE_COLLEG_ASSOC")
public class FatTDizImpreseCollegAssoc implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_DIZ_IMPRESE_COLLEG_ASSOC")
	private Long idDizImpreseCollegAssoc;

	@Column(name = "DS_DESCRIZIONE")
	private String dsDescrizione;

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

	public FatTDizImpreseCollegAssoc() {
	}

	public Long getIdDizImpreseCollegAssoc() {
		return this.idDizImpreseCollegAssoc;
	}

	public void setIdDizImpreseCollegAssoc(Long idDizImpreseCollegAssoc) {
		this.idDizImpreseCollegAssoc = idDizImpreseCollegAssoc;
	}

	public String getDsDescrizione() {
		return this.dsDescrizione;
	}

	public void setDsDescrizione(String dsDescrizione) {
		this.dsDescrizione = dsDescrizione;
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

	public Date getTsInserimento() {
		return tsInserimento;
	}

	public void setTsInserimento(Date tsInserimento) {
		this.tsInserimento = tsInserimento;
	}

	public Date getTsUltimaModifica() {
		return tsUltimaModifica;
	}

	public void setTsUltimaModifica(Date tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}

	
	public Serializable getPrimaryKey() {
		return this.idDizImpreseCollegAssoc;
	}

}