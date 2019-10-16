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
 * The persistent class for the FAT_T_DIZ_TIPOLOGIA_NOTIFICA database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_TIPOLOGIA_NOTIFICA")
public class FatTDizTipologiaNotifica implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_TIPOLOGIA_NOTIFICA")
	private Long idDizTipologiaNotifica;

	
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

	//bi-directional many-to-one association to FatANotificaSupportoFtp
	@OneToMany(mappedBy="dizTipologiaNotifica")
	private List<FatANotificaSupportoFtp> listNotificaSupportoFtp;

	//bi-directional many-to-one association to FatTNotifica
	@OneToMany(mappedBy="dizTipologiaNotifica")
	private List<FatTNotifica> listNotifica;

	public FatTDizTipologiaNotifica() {
	}

	public Long getIdDizTipologiaNotifica() {
		return this.idDizTipologiaNotifica;
	}

	public void setIdDizTipologiaNotifica(Long idDizTipologiaNotifica) {
		this.idDizTipologiaNotifica = idDizTipologiaNotifica;
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

	public List<FatANotificaSupportoFtp> getListNotificaSupportoFtp() {
		return this.listNotificaSupportoFtp;
	}

	public void setListNotificaSupportoFtp(List<FatANotificaSupportoFtp> listNotificaSupportoFtp) {
		this.listNotificaSupportoFtp = listNotificaSupportoFtp;
	}

	public FatANotificaSupportoFtp addFatANotificaSupportoFtp(FatANotificaSupportoFtp fatANotificaSupportoFtp) {
		getListNotificaSupportoFtp().add(fatANotificaSupportoFtp);
		fatANotificaSupportoFtp.setDizTipologiaNotifica(this);

		return fatANotificaSupportoFtp;
	}

	public FatANotificaSupportoFtp removeFatANotificaSupportoFtp(FatANotificaSupportoFtp fatANotificaSupportoFtp) {
		getListNotificaSupportoFtp().remove(fatANotificaSupportoFtp);
		fatANotificaSupportoFtp.setDizTipologiaNotifica(null);

		return fatANotificaSupportoFtp;
	}

	public List<FatTNotifica> getListNotifica() {
		return this.listNotifica;
	}

	public void setListNotifica(List<FatTNotifica> listNotifica) {
		this.listNotifica = listNotifica;
	}

	public FatTNotifica addFatTNotifica(FatTNotifica fatTNotifica) {
		getListNotifica().add(fatTNotifica);
		fatTNotifica.setDizTipologiaNotifica(this);

		return fatTNotifica;
	}

	public FatTNotifica removeFatTNotifica(FatTNotifica fatTNotifica) {
		getListNotifica().remove(fatTNotifica);
		fatTNotifica.setDizTipologiaNotifica(null);

		return fatTNotifica;
	}

	public Serializable getPrimaryKey() {
		return this.idDizTipologiaNotifica;
	}

}