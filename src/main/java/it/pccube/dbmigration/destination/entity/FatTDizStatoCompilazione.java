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
 * The persistent class for the FAT_T_DIZ_STATO_COMPILAZIONE database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_STATO_COMPILAZIONE")
public class FatTDizStatoCompilazione implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_STATO_COMPILAZIONE")
	private Long idDizStatoCompilazione;

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

	//bi-directional many-to-one association to FatTCompilazioneSezione
	@OneToMany(mappedBy="dizStatoCompilazione")
	private List<FatTCompilazioneSezione> listCompilazioneSezione;

	//bi-directional many-to-one association to FatTCompSezioneStor
	@OneToMany(mappedBy="dizStatoCompilazione")
	private List<FatTCompSezioneStor> listCompSezioneStor;

	public FatTDizStatoCompilazione() {
	}

	public Long getIdDizStatoCompilazione() {
		return this.idDizStatoCompilazione;
	}

	public void setIdDizStatoCompilazione(Long idDizStatoCompilazione) {
		this.idDizStatoCompilazione = idDizStatoCompilazione;
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

	public List<FatTCompilazioneSezione> getListCompilazioneSezione() {
		return this.listCompilazioneSezione;
	}

	public void setListCompilazioneSezione(List<FatTCompilazioneSezione> listCompilazioneSezione) {
		this.listCompilazioneSezione = listCompilazioneSezione;
	}

	public FatTCompilazioneSezione addFatTCompilazioneSezione(FatTCompilazioneSezione fatTCompilazioneSezione) {
		getListCompilazioneSezione().add(fatTCompilazioneSezione);
		fatTCompilazioneSezione.setDizStatoCompilazione(this);

		return fatTCompilazioneSezione;
	}

	public FatTCompilazioneSezione removeFatTCompilazioneSezione(FatTCompilazioneSezione fatTCompilazioneSezione) {
		getListCompilazioneSezione().remove(fatTCompilazioneSezione);
		fatTCompilazioneSezione.setDizStatoCompilazione(null);

		return fatTCompilazioneSezione;
	}

	public List<FatTCompSezioneStor> getListCompSezioneStor() {
		return this.listCompSezioneStor;
	}

	public void setListCompSezioneStor(List<FatTCompSezioneStor> listCompSezioneStor) {
		this.listCompSezioneStor = listCompSezioneStor;
	}

	public FatTCompSezioneStor addFatTCompSezioneStor(FatTCompSezioneStor fatTCompSezioneStor) {
		getListCompSezioneStor().add(fatTCompSezioneStor);
		fatTCompSezioneStor.setDizStatoCompilazione(this);

		return fatTCompSezioneStor;
	}

	public FatTCompSezioneStor removeFatTCompSezioneStor(FatTCompSezioneStor fatTCompSezioneStor) {
		getListCompSezioneStor().remove(fatTCompSezioneStor);
		fatTCompSezioneStor.setDizStatoCompilazione(null);

		return fatTCompSezioneStor;
	}

	public Serializable getPrimaryKey() {
		return this.idDizStatoCompilazione;
	}

}