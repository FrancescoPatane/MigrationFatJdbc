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
 * The persistent class for the FAT_T_DIZ_TIPO_RESA database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_TIPO_RESA")
public class FatTDizTipoResa implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_TIPO_RESA")
	private Long idDizTipoResa;

	
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
	@OneToMany(mappedBy="dizTipoResa")
	private List<FatTFattura> listFattura;

	//bi-directional many-to-one association to FatTFatturaStor
	@OneToMany(mappedBy="dizTipoResa")
	private List<FatTFatturaStor> listFatturaStor;

	public FatTDizTipoResa() {
	}

	public Long getIdDizTipoResa() {
		return this.idDizTipoResa;
	}

	public void setIdDizTipoResa(Long idDizTipoResa) {
		this.idDizTipoResa = idDizTipoResa;
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

	public void setListFattura(List<FatTFattura> listFattura) {
		this.listFattura = listFattura;
	}

	public FatTFattura addFatTFattura(FatTFattura fatTFattura) {
		getListFattura().add(fatTFattura);
		fatTFattura.setDizTipoResa(this);

		return fatTFattura;
	}

	public FatTFattura removeFatTFattura(FatTFattura fatTFattura) {
		getListFattura().remove(fatTFattura);
		fatTFattura.setDizTipoResa(null);

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
		fatTFatturaStor.setDizTipoResa(this);

		return fatTFatturaStor;
	}

	public FatTFatturaStor removeFatTFatturaStor(FatTFatturaStor fatTFatturaStor) {
		getListFatturaStor().remove(fatTFatturaStor);
		fatTFatturaStor.setDizTipoResa(null);

		return fatTFatturaStor;
	}

	public Serializable getPrimaryKey() {
		return this.idDizTipoResa;
	}

}