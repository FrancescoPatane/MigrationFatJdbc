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
 * The persistent class for the FAT_T_DIZ_SOGGETTO_EMITTENTE database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_SOGGETTO_EMITTENTE")
public class FatTDizSoggettoEmittente implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_SOGGETTO_EMITTENTE")
	private Long idDizSoggettoEmittente;

	
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

	//bi-directional many-to-one association to FatTLotto
	@OneToMany(mappedBy="dizSoggettoEmittente")
	private List<FatTLotto> listLotto;

	//bi-directional many-to-one association to FatTLottoStor
	@OneToMany(mappedBy="dizSoggettoEmittente")
	private List<FatTLottoStor> listLottoStor;

	public FatTDizSoggettoEmittente() {
	}

	public Long getIdDizSoggettoEmittente() {
		return this.idDizSoggettoEmittente;
	}

	public void setIdDizSoggettoEmittente(Long idDizSoggettoEmittente) {
		this.idDizSoggettoEmittente = idDizSoggettoEmittente;
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

	public List<FatTLotto> getListLotto() {
		return this.listLotto;
	}

	public void setListLotto(List<FatTLotto> listLotto) {
		this.listLotto = listLotto;
	}

	public FatTLotto addFatTLotto(FatTLotto fatTLotto) {
		getListLotto().add(fatTLotto);
		fatTLotto.setDizSoggettoEmittente(this);

		return fatTLotto;
	}

	public FatTLotto removeFatTLotto(FatTLotto fatTLotto) {
		getListLotto().remove(fatTLotto);
		fatTLotto.setDizSoggettoEmittente(null);

		return fatTLotto;
	}

	public List<FatTLottoStor> getListLottoStor() {
		return this.listLottoStor;
	}

	public void setListLottoStor(List<FatTLottoStor> listLottoStor) {
		this.listLottoStor = listLottoStor;
	}

	public FatTLottoStor addFatTLottoStor(FatTLottoStor fatTLottoStor) {
		getListLottoStor().add(fatTLottoStor);
		fatTLottoStor.setDizSoggettoEmittente(this);

		return fatTLottoStor;
	}

	public FatTLottoStor removeFatTLottoStor(FatTLottoStor fatTLottoStor) {
		getListLottoStor().remove(fatTLottoStor);
		fatTLottoStor.setDizSoggettoEmittente(null);

		return fatTLottoStor;
	}

	public Serializable getPrimaryKey() {
		return this.idDizSoggettoEmittente;
	}

}