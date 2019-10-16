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
 * The persistent class for the FAT_T_DIZ_REGIME_FISCALE database table.
 * 
 */
@Entity
@Table(name = "FAT_T_DIZ_REGIME_FISCALE")
public class FatTDizRegimeFiscale implements EntityInterface {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_DIZ_REGIME_FISCALE")
	private Long idDizRegimeFiscale;

	
	@Column(name = "CD_CODICE")
	private String cdCodice;

	
	@Column(name = "DS_DESCRIZIONE")
	private String dsDescrizione;

	
	@Column(name = "FL_VISIBILE")
	private Boolean flVisibile;

	
	@Column(name = "PG_ORDINAMENTO")
	private Long pgOrdinamento;

	@Column(name = "NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name = "NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	// bi-directional many-to-one association to FatTAdesione
	@OneToMany(mappedBy = "dizRegimeFiscale")
	private List<FatTAdesione> listAdesione;

	// bi-directional many-to-one association to FatTLotto
	 @OneToMany(mappedBy="dizRegimeFiscale")
	 private List<FatTLotto> listLotto;

	// bi-directional many-to-one association to FatTLottoStor
	 @OneToMany(mappedBy="dizRegimeFiscale")
	 private List<FatTLottoStor> listLottoStor;

	public FatTDizRegimeFiscale() {
		super();
	}

	public Long getIdDizRegimeFiscale() {
		return this.idDizRegimeFiscale;
	}

	public void setIdDizRegimeFiscale(Long idDizRegimeFiscale) {
		this.idDizRegimeFiscale = idDizRegimeFiscale;
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

	public Boolean getFlVisibile() {
		return this.flVisibile;
	}

	public void setFlVisibile(Boolean flVisibile) {
		this.flVisibile = flVisibile;
	}

	public Long getPgOrdinamento() {
		return pgOrdinamento;
	}

	public void setPgOrdinamento(Long pgOrdinamento) {
		this.pgOrdinamento = pgOrdinamento;
	}

	public String getNmUtenteInserimento() {
		return nmUtenteInserimento;
	}

	public void setNmUtenteInserimento(String nmUtenteInserimento) {
		this.nmUtenteInserimento = nmUtenteInserimento;
	}

	public String getNmUtenteUltimaModifica() {
		return nmUtenteUltimaModifica;
	}

	public void setNmUtenteUltimaModifica(String nmUtenteUltimaModifica) {
		this.nmUtenteUltimaModifica = nmUtenteUltimaModifica;
	}

	public Date getTsInserimento() {
		return tsInserimento;
	}

	public void setTsInserimento(Date tsInserimento) {
		this.tsInserimento = tsInserimento;
	}

	public Date getTsUltimaModifica() {
		return tsUltimaModifica;
	}

	public void setTsUltimaModifica(Date tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}

	public List<FatTAdesione> getListAdesione() {
		return this.listAdesione;
	}

	public void setListAdesione(List<FatTAdesione> fatTAdesiones) {
		this.listAdesione = fatTAdesiones;
	}

	public FatTAdesione addFatTAdesione(FatTAdesione fatTAdesione) {
		getListAdesione().add(fatTAdesione);
		fatTAdesione.setDizRegimeFiscale(this);

		return fatTAdesione;
	}

	public FatTAdesione removeFatTAdesione(FatTAdesione fatTAdesione) {
		getListAdesione().remove(fatTAdesione);
		fatTAdesione.setDizRegimeFiscale(null);

		return fatTAdesione;
	}

	
	public Serializable getPrimaryKey() {
		return this.idDizRegimeFiscale;
	}

	public List<FatTLotto> getListLotto() {
		return this.listLotto;
	}

	public void setListLotto(List<FatTLotto> listLotto) {
		this.listLotto = listLotto;
	}

	public FatTLotto addFatTLotto(FatTLotto fatTLotto) {
		getListLotto().add(fatTLotto);
		fatTLotto.setDizRegimeFiscale(this);

		return fatTLotto;
	}

	public FatTLotto removeFatTLotto(FatTLotto fatTLotto) {
		getListLotto().remove(fatTLotto);
		fatTLotto.setDizRegimeFiscale(null);

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
		fatTLottoStor.setDizRegimeFiscale(this);

		return fatTLottoStor;
	}

	public FatTLottoStor removeFatTLottoStor(FatTLottoStor fatTLottoStor) {
		getListLottoStor().remove(fatTLottoStor);
		fatTLottoStor.setDizRegimeFiscale(null);

		return fatTLottoStor;
	}

}