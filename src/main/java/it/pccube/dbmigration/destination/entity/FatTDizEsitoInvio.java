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
 * The persistent class for the FAT_T_DIZ_ESITO_INVIO database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_ESITO_INVIO")
public class FatTDizEsitoInvio implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_ESITO_INVIO")
	private Long idDizEsitoInvio;

	
	@Column(name="CD_CODICE")
	private String cdCodice;

	
	@Column(name="DS_DESCRIZIONE")
	private String dsDescrizione;

	
	@Column(name="FL_REINVIO")
	private Boolean flReinvio;

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

	//bi-directional many-to-one association to FatTArchivio
	@OneToMany(mappedBy="dizEsitoInvio")
	private List<FatTArchivio> listArchivio;

	//bi-directional many-to-one association to FatTLotto
	@OneToMany(mappedBy="dizEsitoInvio")
	private List<FatTLotto> listLotto;

	//bi-directional many-to-one association to FatTLottoStor
	@OneToMany(mappedBy="dizEsitoInvio")
	private List<FatTLottoStor> listLottoStor;

	//bi-directional many-to-one association to FatTMonitorInvioSdi
	@OneToMany(mappedBy="dizEsitoInvio")
	private List<FatTMonitorInvioSdi> listMonitorInvioSdi;

	//bi-directional many-to-one association to FatTReportSsaInviiSdi
	@OneToMany(mappedBy="dizEsitoInvio")
	private List<FatTReportSsaInviiSdi> listReportSsaInviiSdi;

	public FatTDizEsitoInvio() {
	}

	public Long getIdDizEsitoInvio() {
		return this.idDizEsitoInvio;
	}

	public void setIdDizEsitoInvio(Long idDizEsitoInvio) {
		this.idDizEsitoInvio = idDizEsitoInvio;
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

	public Boolean getFlReinvio() {
		return this.flReinvio;
	}

	public void setFlReinvio(Boolean flReinvio) {
		this.flReinvio = flReinvio;
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

	public List<FatTArchivio> getListArchivio() {
		return this.listArchivio;
	}

	public void setListArchivio(List<FatTArchivio> listArchivio) {
		this.listArchivio = listArchivio;
	}

	public FatTArchivio addFatTArchivio(FatTArchivio fatTArchivio) {
		getListArchivio().add(fatTArchivio);
		fatTArchivio.setDizEsitoInvio(this);

		return fatTArchivio;
	}

	public FatTArchivio removeFatTArchivio(FatTArchivio fatTArchivio) {
		getListArchivio().remove(fatTArchivio);
		fatTArchivio.setDizEsitoInvio(null);

		return fatTArchivio;
	}

	public List<FatTLotto> getListLotto() {
		return this.listLotto;
	}

	public void setListLotto(List<FatTLotto> listLotto) {
		this.listLotto = listLotto;
	}

	public FatTLotto addFatTLotto(FatTLotto fatTLotto) {
		getListLotto().add(fatTLotto);
		fatTLotto.setDizEsitoInvio(this);

		return fatTLotto;
	}

	public FatTLotto removeFatTLotto(FatTLotto fatTLotto) {
		getListLotto().remove(fatTLotto);
		fatTLotto.setDizEsitoInvio(null);

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
		fatTLottoStor.setDizEsitoInvio(this);

		return fatTLottoStor;
	}

	public FatTLottoStor removeFatTLottoStor(FatTLottoStor fatTLottoStor) {
		getListLottoStor().remove(fatTLottoStor);
		fatTLottoStor.setDizEsitoInvio(null);

		return fatTLottoStor;
	}

	public List<FatTMonitorInvioSdi> getListMonitorInvioSdi() {
		return this.listMonitorInvioSdi;
	}

	public void setListMonitorInvioSdi(List<FatTMonitorInvioSdi> listMonitorInvioSdi) {
		this.listMonitorInvioSdi = listMonitorInvioSdi;
	}

	public FatTMonitorInvioSdi addFatTMonitorInvioSdi(FatTMonitorInvioSdi fatTMonitorInvioSdi) {
		getListMonitorInvioSdi().add(fatTMonitorInvioSdi);
		fatTMonitorInvioSdi.setDizEsitoInvio(this);

		return fatTMonitorInvioSdi;
	}

	public FatTMonitorInvioSdi removeFatTMonitorInvioSdi(FatTMonitorInvioSdi fatTMonitorInvioSdi) {
		getListMonitorInvioSdi().remove(fatTMonitorInvioSdi);
		fatTMonitorInvioSdi.setDizEsitoInvio(null);

		return fatTMonitorInvioSdi;
	}

	public List<FatTReportSsaInviiSdi> getListReportSsaInviiSdi() {
		return this.listReportSsaInviiSdi;
	}

	public void setListReportSsaInviiSdi(List<FatTReportSsaInviiSdi> listReportSsaInviiSdi) {
		this.listReportSsaInviiSdi = listReportSsaInviiSdi;
	}

	public FatTReportSsaInviiSdi addFatTReportSsaInviiSdi(FatTReportSsaInviiSdi fatTReportSsaInviiSdi) {
		getListReportSsaInviiSdi().add(fatTReportSsaInviiSdi);
		fatTReportSsaInviiSdi.setDizEsitoInvio(this);

		return fatTReportSsaInviiSdi;
	}

	public FatTReportSsaInviiSdi removeFatTReportSsaInviiSdi(FatTReportSsaInviiSdi fatTReportSsaInviiSdi) {
		getListReportSsaInviiSdi().remove(fatTReportSsaInviiSdi);
		fatTReportSsaInviiSdi.setDizEsitoInvio(null);

		return fatTReportSsaInviiSdi;
	}

	public Serializable getPrimaryKey() {
		return this.idDizEsitoInvio;
	}

}