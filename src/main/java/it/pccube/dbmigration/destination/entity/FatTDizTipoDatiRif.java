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
 * The persistent class for the FAT_T_DIZ_TIPO_DATI_RIF database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_TIPO_DATI_RIF")
public class FatTDizTipoDatiRif implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_TIPO_DATI_RIF")
	private Long idDizTipoDatiRif;

	
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

	//bi-directional many-to-one association to FatTDatiRiferimento
	@OneToMany(mappedBy="dizTipoDatiRif")
	private List<FatTDatiRiferimento> listDatiRiferimento;

	//bi-directional many-to-one association to FatTDatiRiferimentoStor
	@OneToMany(mappedBy="dizTipoDatiRif")
	private List<FatTDatiRiferimentoStor> listDatiRiferimentoStor;

	public FatTDizTipoDatiRif() {
	}

	public Long getIdDizTipoDatiRif() {
		return this.idDizTipoDatiRif;
	}

	public void setIdDizTipoDatiRif(Long idDizTipoDatiRif) {
		this.idDizTipoDatiRif = idDizTipoDatiRif;
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

	public List<FatTDatiRiferimento> getListDatiRiferimento() {
		return this.listDatiRiferimento;
	}

	public void setListDatiRiferimento(List<FatTDatiRiferimento> listDatiRiferimento) {
		this.listDatiRiferimento = listDatiRiferimento;
	}

	public FatTDatiRiferimento addFatTDatiRiferimento(FatTDatiRiferimento fatTDatiRiferimento) {
		getListDatiRiferimento().add(fatTDatiRiferimento);
		fatTDatiRiferimento.setDizTipoDatiRif(this);

		return fatTDatiRiferimento;
	}

	public FatTDatiRiferimento removeFatTDatiRiferimento(FatTDatiRiferimento fatTDatiRiferimento) {
		getListDatiRiferimento().remove(fatTDatiRiferimento);
		fatTDatiRiferimento.setDizTipoDatiRif(null);

		return fatTDatiRiferimento;
	}

	public List<FatTDatiRiferimentoStor> getListDatiRiferimentoStor() {
		return this.listDatiRiferimentoStor;
	}

	public void setListDatiRiferimentoStor(List<FatTDatiRiferimentoStor> listDatiRiferimentoStor) {
		this.listDatiRiferimentoStor = listDatiRiferimentoStor;
	}

	public FatTDatiRiferimentoStor addFatTDatiRiferimentoStor(FatTDatiRiferimentoStor fatTDatiRiferimentoStor) {
		getListDatiRiferimentoStor().add(fatTDatiRiferimentoStor);
		fatTDatiRiferimentoStor.setDizTipoDatiRif(this);

		return fatTDatiRiferimentoStor;
	}

	public FatTDatiRiferimentoStor removeFatTDatiRiferimentoStor(FatTDatiRiferimentoStor fatTDatiRiferimentoStor) {
		getListDatiRiferimentoStor().remove(fatTDatiRiferimentoStor);
		fatTDatiRiferimentoStor.setDizTipoDatiRif(null);

		return fatTDatiRiferimentoStor;
	}

	public Serializable getPrimaryKey() {
		return this.idDizTipoDatiRif;
	}

}