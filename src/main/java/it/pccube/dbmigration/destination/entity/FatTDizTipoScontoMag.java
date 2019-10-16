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
 * The persistent class for the FAT_T_DIZ_TIPO_SCONTO_MAG database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_TIPO_SCONTO_MAG")
public class FatTDizTipoScontoMag implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_TIPO_SCONTO_MAG")
	private Long idDizTipoScontoMag;

	
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

	//bi-directional many-to-one association to FatTScontoMaggiorazione
	@OneToMany(mappedBy="dizTipoScontoMag")
	private List<FatTScontoMaggiorazione> listScontoMaggiorazione;

	//bi-directional many-to-one association to FatTScontoMagStor
	@OneToMany(mappedBy="dizTipoScontoMag")
	private List<FatTScontoMagStor> listScontoMagStor;

	public FatTDizTipoScontoMag() {
	}

	public Long getIdDizTipoScontoMag() {
		return this.idDizTipoScontoMag;
	}

	public void setIdDizTipoScontoMag(Long idDizTipoScontoMag) {
		this.idDizTipoScontoMag = idDizTipoScontoMag;
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

	public List<FatTScontoMaggiorazione> getListScontoMaggiorazione() {
		return this.listScontoMaggiorazione;
	}

	public void setListScontoMaggiorazione(List<FatTScontoMaggiorazione> listScontoMaggiorazione) {
		this.listScontoMaggiorazione = listScontoMaggiorazione;
	}

	public FatTScontoMaggiorazione addFatTScontoMaggiorazione(FatTScontoMaggiorazione fatTScontoMaggiorazione) {
		getListScontoMaggiorazione().add(fatTScontoMaggiorazione);
		fatTScontoMaggiorazione.setDizTipoScontoMag(this);

		return fatTScontoMaggiorazione;
	}

	public FatTScontoMaggiorazione removeFatTScontoMaggiorazione(FatTScontoMaggiorazione fatTScontoMaggiorazione) {
		getListScontoMaggiorazione().remove(fatTScontoMaggiorazione);
		fatTScontoMaggiorazione.setDizTipoScontoMag(null);

		return fatTScontoMaggiorazione;
	}

	public List<FatTScontoMagStor> getListScontoMagStor() {
		return this.listScontoMagStor;
	}

	public void setListScontoMagStor(List<FatTScontoMagStor> listScontoMagStor) {
		this.listScontoMagStor = listScontoMagStor;
	}

	public FatTScontoMagStor addFatTScontoMagStor(FatTScontoMagStor fatTScontoMagStor) {
		getListScontoMagStor().add(fatTScontoMagStor);
		fatTScontoMagStor.setDizTipoScontoMag(this);

		return fatTScontoMagStor;
	}

	public FatTScontoMagStor removeFatTScontoMagStor(FatTScontoMagStor fatTScontoMagStor) {
		getListScontoMagStor().remove(fatTScontoMagStor);
		fatTScontoMagStor.setDizTipoScontoMag(null);

		return fatTScontoMagStor;
	}

	public Serializable getPrimaryKey() {
		return this.idDizTipoScontoMag;
	}

}