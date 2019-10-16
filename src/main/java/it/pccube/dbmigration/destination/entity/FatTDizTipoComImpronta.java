package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 * The persistent class for the FAT_T_DIZ_TIPO_COM_IMPRONTA database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_TIPO_COM_IMPRONTA")
public class FatTDizTipoComImpronta implements EntityInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_TIPO_COM_IMPRONTA")
	private Long idDizTipoComImpronta;

	@Column(name="DS_DESCRIZIONE")
	private String dsDescrizione;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTRicImprontaArchivio
	@OneToMany(mappedBy="dizTipoComImpronta")
	private List<FatTRicImprontaArchivio> listRicImprontaArchivio;

	public FatTDizTipoComImpronta() {
	}

	public Long getIdDizTipoComImpronta() {
		return this.idDizTipoComImpronta;
	}

	public void setIdDizTipoComImpronta(Long idDizTipoComImpronta) {
		this.idDizTipoComImpronta = idDizTipoComImpronta;
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

	public List<FatTRicImprontaArchivio> getListRicImprontaArchivios() {
		return this.listRicImprontaArchivio;
	}

	public void setListRicImprontaArchivios(List<FatTRicImprontaArchivio> fatTRicImprontaArchivios) {
		this.listRicImprontaArchivio = fatTRicImprontaArchivios;
	}

	public FatTRicImprontaArchivio addFatTRicImprontaArchivio(FatTRicImprontaArchivio fatTRicImprontaArchivio) {
		getListRicImprontaArchivios().add(fatTRicImprontaArchivio);
		fatTRicImprontaArchivio.setDizTipoComImpronta(this);

		return fatTRicImprontaArchivio;
	}

	public FatTRicImprontaArchivio removeFatTRicImprontaArchivio(FatTRicImprontaArchivio fatTRicImprontaArchivio) {
		getListRicImprontaArchivios().remove(fatTRicImprontaArchivio);
		fatTRicImprontaArchivio.setDizTipoComImpronta(null);

		return fatTRicImprontaArchivio;
	}

	public Serializable getPrimaryKey() {
		return this.idDizTipoComImpronta;
	}

}