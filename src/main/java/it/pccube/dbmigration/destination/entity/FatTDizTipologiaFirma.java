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
 * The persistent class for the FAT_T_DIZ_TIPOLOGIA_FIRMA database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_TIPOLOGIA_FIRMA")
public class FatTDizTipologiaFirma implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_TIPOLOGIA_FIRMA")
	private Long idDizTipologiaFirma;

	
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

	//bi-directional many-to-one association to FatTVerifFirmaServAde
	@OneToMany(mappedBy="dizTipologiaFirma")
	private List<FatTVerifFirmaServAde> listVerifFirmaServAde;

	//bi-directional many-to-one association to FatTVerifFirmServLotto
	@OneToMany(mappedBy="dizTipologiaFirma")
	private List<FatTVerifFirmServLotto> listVerifFirmServLotto;

	//bi-directional many-to-one association to FatTVerifFirmServNotif
	@OneToMany(mappedBy="dizTipologiaFirma")
	private List<FatTVerifFirmServNotif> listVerifFirmServNotif;

	//bi-directional many-to-one association to FatTVerFirmServEsiFtp
	@OneToMany(mappedBy="dizTipologiaFirma")
	private List<FatTVerFirmServEsiFtp> listVerFirmServEsiFtp;

	//bi-directional many-to-one association to FatTVerFirmServSupFtp
	@OneToMany(mappedBy="dizTipologiaFirma")
	private List<FatTVerFirmServSupFtp> listVerFirmServSupFtp;

	public FatTDizTipologiaFirma() {
	}

	public Long getIdDizTipologiaFirma() {
		return this.idDizTipologiaFirma;
	}

	public void setIdDizTipologiaFirma(Long idDizTipologiaFirma) {
		this.idDizTipologiaFirma = idDizTipologiaFirma;
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

	public List<FatTVerifFirmaServAde> getListVerifFirmaServAde() {
		return this.listVerifFirmaServAde;
	}

	public void setListVerifFirmaServAde(List<FatTVerifFirmaServAde> listVerifFirmaServAde) {
		this.listVerifFirmaServAde = listVerifFirmaServAde;
	}

	public FatTVerifFirmaServAde addFatTVerifFirmaServAde(FatTVerifFirmaServAde fatTVerifFirmaServAde) {
		getListVerifFirmaServAde().add(fatTVerifFirmaServAde);
		fatTVerifFirmaServAde.setDizTipologiaFirma(this);

		return fatTVerifFirmaServAde;
	}

	public FatTVerifFirmaServAde removeFatTVerifFirmaServAde(FatTVerifFirmaServAde fatTVerifFirmaServAde) {
		getListVerifFirmaServAde().remove(fatTVerifFirmaServAde);
		fatTVerifFirmaServAde.setDizTipologiaFirma(null);

		return fatTVerifFirmaServAde;
	}

	public List<FatTVerifFirmServLotto> getListVerifFirmServLotto() {
		return this.listVerifFirmServLotto;
	}

	public void setListVerifFirmServLotto(List<FatTVerifFirmServLotto> listVerifFirmServLotto) {
		this.listVerifFirmServLotto = listVerifFirmServLotto;
	}

	public FatTVerifFirmServLotto addFatTVerifFirmServLotto(FatTVerifFirmServLotto fatTVerifFirmServLotto) {
		getListVerifFirmServLotto().add(fatTVerifFirmServLotto);
		fatTVerifFirmServLotto.setDizTipologiaFirma(this);

		return fatTVerifFirmServLotto;
	}

	public FatTVerifFirmServLotto removeFatTVerifFirmServLotto(FatTVerifFirmServLotto fatTVerifFirmServLotto) {
		getListVerifFirmServLotto().remove(fatTVerifFirmServLotto);
		fatTVerifFirmServLotto.setDizTipologiaFirma(null);

		return fatTVerifFirmServLotto;
	}

	public List<FatTVerifFirmServNotif> getListVerifFirmServNotif() {
		return this.listVerifFirmServNotif;
	}

	public void getListVerifFirmServNotif(List<FatTVerifFirmServNotif> listVerifFirmServNotif) {
		this.listVerifFirmServNotif = listVerifFirmServNotif;
	}

	public FatTVerifFirmServNotif addFatTVerifFirmServNotif(FatTVerifFirmServNotif fatTVerifFirmServNotif) {
		getListVerifFirmServNotif().add(fatTVerifFirmServNotif);
		fatTVerifFirmServNotif.setDizTipologiaFirma(this);

		return fatTVerifFirmServNotif;
	}

	public FatTVerifFirmServNotif removeFatTVerifFirmServNotif(FatTVerifFirmServNotif fatTVerifFirmServNotif) {
		getListVerifFirmServNotif().remove(fatTVerifFirmServNotif);
		fatTVerifFirmServNotif.setDizTipologiaFirma(null);

		return fatTVerifFirmServNotif;
	}

	public List<FatTVerFirmServEsiFtp> getListVerFirmServEsiFtp() {
		return this.listVerFirmServEsiFtp;
	}

	public void setListVerFirmServEsiFtp(List<FatTVerFirmServEsiFtp> listVerFirmServEsiFtp) {
		this.listVerFirmServEsiFtp = listVerFirmServEsiFtp;
	}

	public FatTVerFirmServEsiFtp addFatTVerFirmServEsiFtp(FatTVerFirmServEsiFtp fatTVerFirmServEsiFtp) {
		getListVerFirmServEsiFtp().add(fatTVerFirmServEsiFtp);
		fatTVerFirmServEsiFtp.setDizTipologiaFirma(this);

		return fatTVerFirmServEsiFtp;
	}

	public FatTVerFirmServEsiFtp removeFatTVerFirmServEsiFtp(FatTVerFirmServEsiFtp fatTVerFirmServEsiFtp) {
		getListVerFirmServEsiFtp().remove(fatTVerFirmServEsiFtp);
		fatTVerFirmServEsiFtp.setDizTipologiaFirma(null);

		return fatTVerFirmServEsiFtp;
	}

	public List<FatTVerFirmServSupFtp> getListVerFirmServSupFtps() {
		return this.listVerFirmServSupFtp;
	}

	public void setListVerFirmServSupFtps(List<FatTVerFirmServSupFtp> listVerFirmServSupFtp) {
		this.listVerFirmServSupFtp = listVerFirmServSupFtp;
	}

	public FatTVerFirmServSupFtp addFatTVerFirmServSupFtp(FatTVerFirmServSupFtp fatTVerFirmServSupFtp) {
		getListVerFirmServSupFtps().add(fatTVerFirmServSupFtp);
		fatTVerFirmServSupFtp.setDizTipologiaFirma(this);

		return fatTVerFirmServSupFtp;
	}

	public FatTVerFirmServSupFtp removeFatTVerFirmServSupFtp(FatTVerFirmServSupFtp fatTVerFirmServSupFtp) {
		getListVerFirmServSupFtps().remove(fatTVerFirmServSupFtp);
		fatTVerFirmServSupFtp.setDizTipologiaFirma(null);

		return fatTVerFirmServSupFtp;
	}

	public Serializable getPrimaryKey() {
		return this.idDizTipologiaFirma;
	}

}