package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import it.pccube.dbmigration.destination.entity.id.FatAFatturaInzPK;



/**
 * The persistent class for the FAT_A_FATTURA_INZ database table.
 * 
 */
@Entity
@Table(name="FAT_A_FATTURA_INZ")
public class FatAFatturaInz implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FatAFatturaInzPK id;

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

	//bi-directional many-to-one association to FatTDizTipoIniziativa
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_TIPO_INIZIATIVA")
	private FatTDizTipoIniziativa dizTipoIniziativa;

	//bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FATTURA", insertable=false, updatable=false)
	private FatTFattura fattura;

	public FatAFatturaInz() {
	}

	public FatAFatturaInzPK getId() {
		return this.id;
	}

	public void setId(FatAFatturaInzPK id) {
		this.id = id;
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

	public FatTDizTipoIniziativa getDizTipoIniziativa() {
		return this.dizTipoIniziativa;
	}

	public void setDizTipoIniziativa(FatTDizTipoIniziativa dizTipoIniziativa) {
		this.dizTipoIniziativa = dizTipoIniziativa;
	}

	public FatTFattura getFattura() {
		return this.fattura;
	}

	public void setFattura(FatTFattura fattura) {
		this.fattura = fattura;
	}

	public Serializable getPrimaryKey() {
		return this.id;
	}

}