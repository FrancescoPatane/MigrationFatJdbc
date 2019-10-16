package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the FAT_T_GENERALE_CFG database table.
 * 
 */
@Entity
@Table(name = "FAT_T_GENERALE_CFG")
public class FatTGeneraleCfg implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FAT_T_GENERALE_CFG_IDCONFIGGENERALE_GENERATOR", sequenceName = "SEQ_ID_CONFIG_GENERALE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAT_T_GENERALE_CFG_IDCONFIGGENERALE_GENERATOR")
	@Column(name = "ID_CONFIG_GENERALE")
	private Long idConfigGenerale;

	@Column(name = "CD_CODICE")
	private String cdCodice;

	@Column(name = "DS_DESCRIZIONE")
	private String dsDescrizione;

	@Column(name = "DS_VALORE")
	private String dsValore;

	
	@Column(name = "ID_VALORE_BLOB")
	private String idValoreBlob;
	
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

	
	public FatTGeneraleCfg() {
		super();
	}

	
	public Long getIdConfigGenerale() {
		return this.idConfigGenerale;
	}

	public void setIdConfigGenerale(Long idConfigGenerale) {
		this.idConfigGenerale = idConfigGenerale;
	}

	public String getCdCodice() {
		return this.cdCodice;
	}

	public void setCdCodice(String cdCodice) {
		this.cdCodice = cdCodice;
	}

	public String getDsDescrizione() {
		return this.dsDescrizione;
	}

	public void setDsDescrizione(String dsDescrizione) {
		this.dsDescrizione = dsDescrizione;
	}

	public String getDsValore() {
		return this.dsValore;
	}

	public void setDsValore(String dsValore) {
		this.dsValore = dsValore;
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
		return this.idConfigGenerale;
	}


	public String getIdValoreBlob() {
		return idValoreBlob;
	}


	public void setIdValoreBlob(String idValoreBlob) {
		this.idValoreBlob = idValoreBlob;
	}

	
}