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
 * The persistent class for the FAT_T_DIZ_TIPO_RITENUTA database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_TIPO_RITENUTA")
public class FatTDizTipoRitenuta implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_TIPO_RITENUTA")
	private Long idDizTipoRitenuta;

	
	@Column(name="CD_CODICE")
	private String cdCodice;

	
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

	//bi-directional many-to-one association to FatTFattura
	@OneToMany(mappedBy="dizTipoRitenuta")
	private List<FatTFattura> listFattura;

	//bi-directional many-to-one association to FatTFatturaStor
	@OneToMany(mappedBy="dizTipoRitenuta")
	private List<FatTFatturaStor> listFatturaStor;

	public FatTDizTipoRitenuta() {
	}

	public Long getIdDizTipoRitenuta() {
		return this.idDizTipoRitenuta;
	}

	public void setIdDizTipoRitenuta(Long idDizTipoRitenuta) {
		this.idDizTipoRitenuta = idDizTipoRitenuta;
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

	public List<FatTFattura> getListFattura() {
		return this.listFattura;
	}

	public void setListFattura(List<FatTFattura> fatTFatturas) {
		this.listFattura = fatTFatturas;
	}

	public FatTFattura addFatTFattura(FatTFattura fatTFattura) {
		getListFattura().add(fatTFattura);
		fatTFattura.setDizTipoRitenuta(this);

		return fatTFattura;
	}

	public FatTFattura removeFatTFattura(FatTFattura fatTFattura) {
		getListFattura().remove(fatTFattura);
		fatTFattura.setDizTipoRitenuta(null);

		return fatTFattura;
	}

	public List<FatTFatturaStor> getListFatturaStor() {
		return this.listFatturaStor;
	}

	public void setListFatturaStor(List<FatTFatturaStor> listFatturaStor) {
		this.listFatturaStor = listFatturaStor;
	}

	public FatTFatturaStor addFatTFatturaStor(FatTFatturaStor fatTFatturaStor) {
		getListFatturaStor().add(fatTFatturaStor);
		fatTFatturaStor.setDizTipoRitenuta(this);

		return fatTFatturaStor;
	}

	public FatTFatturaStor removeFatTFatturaStor(FatTFatturaStor fatTFatturaStor) {
		getListFatturaStor().remove(fatTFatturaStor);
		fatTFatturaStor.setDizTipoRitenuta(null);

		return fatTFatturaStor;
	}

	public Serializable getPrimaryKey() {
		return this.idDizTipoRitenuta;
	}

}