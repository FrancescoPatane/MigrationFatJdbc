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
 * The persistent class for the FAT_T_DIZ_STATO_LOTTO_FATTURA database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_STATO_LOTTO_FATTURA")
public class FatTDizStatoLottoFattura implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_STATO_LOTTO_FATTURA")
	private Long idDizStatoLottoFattura;

	
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

	//bi-directional many-to-one association to FatAStatoLottoFattura
	@OneToMany(mappedBy="dizStatoLottoFattura")
	private List<FatAStatoLottoFattura> listStatoLottoFattura;

	//bi-directional many-to-one association to FatTLotto
	@OneToMany(mappedBy="dizStatoLottoFattura")
	private List<FatTLotto> listLotto;

	//bi-directional many-to-one association to FatTLottoStor
	@OneToMany(mappedBy="dizStatoLottoFattura")
	private List<FatTLottoStor> listLottoStor;

	public FatTDizStatoLottoFattura() {
	}

	public Long getIdDizStatoLottoFattura() {
		return this.idDizStatoLottoFattura;
	}

	public void setIdDizStatoLottoFattura(Long idDizStatoLottoFattura) {
		this.idDizStatoLottoFattura = idDizStatoLottoFattura;
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

	public List<FatAStatoLottoFattura> getListStatoLottoFattura() {
		return this.listStatoLottoFattura;
	}

	public void setListStatoLottoFattura(List<FatAStatoLottoFattura> listStatoLottoFattura) {
		this.listStatoLottoFattura = listStatoLottoFattura;
	}

	public FatAStatoLottoFattura addFatAStatoLottoFattura(FatAStatoLottoFattura fatAStatoLottoFattura) {
		getListStatoLottoFattura().add(fatAStatoLottoFattura);
		fatAStatoLottoFattura.setDizStatoLottoFattura(this);

		return fatAStatoLottoFattura;
	}

	public FatAStatoLottoFattura removeFatAStatoLottoFattura(FatAStatoLottoFattura fatAStatoLottoFattura) {
		getListStatoLottoFattura().remove(fatAStatoLottoFattura);
		fatAStatoLottoFattura.setDizStatoLottoFattura(null);

		return fatAStatoLottoFattura;
	}

	public List<FatTLotto> getListLotto() {
		return this.listLotto;
	}

	public void setListLotto(List<FatTLotto> listLotto) {
		this.listLotto = listLotto;
	}

	public FatTLotto addFatTLotto(FatTLotto fatTLotto) {
		getListLotto().add(fatTLotto);
		fatTLotto.setDizStatoLottoFattura(this);

		return fatTLotto;
	}

	public FatTLotto removeFatTLotto(FatTLotto fatTLotto) {
		getListLotto().remove(fatTLotto);
		fatTLotto.setDizStatoLottoFattura(null);

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
		fatTLottoStor.setDizStatoLottoFattura(this);

		return fatTLottoStor;
	}

	public FatTLottoStor removeFatTLottoStor(FatTLottoStor fatTLottoStor) {
		getListLottoStor().remove(fatTLottoStor);
		fatTLottoStor.setDizStatoLottoFattura(null);

		return fatTLottoStor;
	}

	public Serializable getPrimaryKey() {
		return this.idDizStatoLottoFattura;
	}

}