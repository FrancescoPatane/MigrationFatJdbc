package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;



/**
 * The persistent class for the FAT_T_ARCHIVIO database table.
 * 
 */
@Entity
@Table(name="FAT_T_ARCHIVIO")
public class FatTArchivio implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_ARCHIVIO_IDARCHIVIO_GENERATOR", sequenceName="SEQ_ID_ARCHIVIO", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_ARCHIVIO_IDARCHIVIO_GENERATOR")
	@Column(name="ID_ARCHIVIO")
	private Long idArchivio;

	@Column(name="CD_IDENTIFICATIVO_SDI_ARCHIVIO")
	private String cdIdentificativoSdiArchivio;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_CREAZIONE")
	private Date dtDataOraCreazione;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_INVIO_SDI")
	private Date dtDataOraInvioSdi;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_RICEZIONE")
	private Date dtDataOraRicezione;

	@Column(name="ID_DIZ_STATO_ARCHIVIO")
	private Long idDizStatoArchivio;

	@Column(name="ID_SEDIA_CREATORE")
	private Long idSediaCreatore;

	@Column(name="NM_NOME_FILE")
	private String nmNomeFile;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Column(name="ID_FILE_ARCHIVIO")
	private String idFileArchivio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatAStatoArchivio
	@OneToMany(mappedBy="archivio", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatAStatoArchivio> listStatoArchivio;

	//bi-directional many-to-one association to FatTDizEsitoInvio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ESITO_INVIO")
	private FatTDizEsitoInvio dizEsitoInvio;

	//bi-directional many-to-one association to FatTLottoArchivio
	@OneToMany(mappedBy="archivio", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatTLottoArchivio> listLottoArchivio;

	//bi-directional many-to-one association to FatTMonitorInvioSdi
	@OneToMany(mappedBy="archivio", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatTMonitorInvioSdi> listMonitorInvioSdi;

	//bi-directional many-to-one association to FatTNotifica
	@OneToMany(mappedBy="archivio", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatTNotifica> listNotifica;

	public FatTArchivio() {
	}

	public Long getIdArchivio() {
		return this.idArchivio;
	}

	public void setIdArchivio(Long idArchivio) {
		this.idArchivio = idArchivio;
	}

	public String getCdIdentificativoSdiArchivio() {
		return this.cdIdentificativoSdiArchivio;
	}

	public void setCdIdentificativoSdiArchivio(String cdIdentificativoSdiArchivio) {
		this.cdIdentificativoSdiArchivio = cdIdentificativoSdiArchivio;
	}

	public Date getDtDataOraCreazione() {
		return this.dtDataOraCreazione;
	}

	public void setDtDataOraCreazione(Date dtDataOraCreazione) {
		this.dtDataOraCreazione = dtDataOraCreazione;
	}

	public Date getDtDataOraInvioSdi() {
		return this.dtDataOraInvioSdi;
	}

	public void setDtDataOraInvioSdi(Date dtDataOraInvioSdi) {
		this.dtDataOraInvioSdi = dtDataOraInvioSdi;
	}

	public Date getDtDataOraRicezione() {
		return this.dtDataOraRicezione;
	}

	public void setDtDataOraRicezione(Date dtDataOraRicezione) {
		this.dtDataOraRicezione = dtDataOraRicezione;
	}

	public Long getIdDizStatoArchivio() {
		return this.idDizStatoArchivio;
	}

	public void setIdDizStatoArchivio(Long idDizStatoArchivio) {
		this.idDizStatoArchivio = idDizStatoArchivio;
	}

	public Long getIdSediaCreatore() {
		return this.idSediaCreatore;
	}

	public void setIdSediaCreatore(Long idSediaCreatore) {
		this.idSediaCreatore = idSediaCreatore;
	}

	public String getNmNomeFile() {
		return this.nmNomeFile;
	}

	public void setNmNomeFile(String nmNomeFile) {
		this.nmNomeFile = nmNomeFile;
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

	public List<FatAStatoArchivio> getListStatoArchivio() {
		return this.listStatoArchivio;
	}

	public void setListStatoArchivio(List<FatAStatoArchivio> listStatoArchivio) {
		this.listStatoArchivio = listStatoArchivio;
	}

	public FatAStatoArchivio addFatAStatoArchivio(FatAStatoArchivio fatAStatoArchivio) {
		getListStatoArchivio().add(fatAStatoArchivio);
		fatAStatoArchivio.setArchivio(this);

		return fatAStatoArchivio;
	}

	public FatAStatoArchivio removeFatAStatoArchivio(FatAStatoArchivio fatAStatoArchivio) {
		getListStatoArchivio().remove(fatAStatoArchivio);
		fatAStatoArchivio.setArchivio(null);

		return fatAStatoArchivio;
	}

	public FatTDizEsitoInvio getDizEsitoInvio() {
		return this.dizEsitoInvio;
	}

	public void setDizEsitoInvio(FatTDizEsitoInvio dizEsitoInvio) {
		this.dizEsitoInvio = dizEsitoInvio;
	}

	public List<FatTLottoArchivio> getListLottoArchivio() {
		return this.listLottoArchivio;
	}

	public void setListLottoArchivio(List<FatTLottoArchivio> listLottoArchivio) {
		this.listLottoArchivio = listLottoArchivio;
	}

	public FatTLottoArchivio addFatTLottoArchivio(FatTLottoArchivio fatTLottoArchivio) {
		getListLottoArchivio().add(fatTLottoArchivio);
		fatTLottoArchivio.setArchivio(this);

		return fatTLottoArchivio;
	}

	public FatTLottoArchivio removeFatTLottoArchivio(FatTLottoArchivio fatTLottoArchivio) {
		getListLottoArchivio().remove(fatTLottoArchivio);
		fatTLottoArchivio.setArchivio(null);

		return fatTLottoArchivio;
	}

	public List<FatTMonitorInvioSdi> getListMonitorInvioSdi() {
		return this.listMonitorInvioSdi;
	}

	public void setListMonitorInvioSdi(List<FatTMonitorInvioSdi> listMonitorInvioSdi) {
		this.listMonitorInvioSdi = listMonitorInvioSdi;
	}

	public FatTMonitorInvioSdi addFatTMonitorInvioSdi(FatTMonitorInvioSdi fatTMonitorInvioSdi) {
		getListMonitorInvioSdi().add(fatTMonitorInvioSdi);
		fatTMonitorInvioSdi.setArchivio(this);

		return fatTMonitorInvioSdi;
	}

	public FatTMonitorInvioSdi removeFatTMonitorInvioSdi(FatTMonitorInvioSdi fatTMonitorInvioSdi) {
		getListMonitorInvioSdi().remove(fatTMonitorInvioSdi);
		fatTMonitorInvioSdi.setArchivio(null);

		return fatTMonitorInvioSdi;
	}

	public List<FatTNotifica> getListNotifica() {
		return this.listNotifica;
	}

	public void setListNotifica(List<FatTNotifica> listNotifica) {
		this.listNotifica = listNotifica;
	}

	public FatTNotifica addFatTNotifica(FatTNotifica fatTNotifica) {
		getListNotifica().add(fatTNotifica);
		fatTNotifica.setArchivio(this);

		return fatTNotifica;
	}

	public FatTNotifica removeFatTNotifica(FatTNotifica fatTNotifica) {
		getListNotifica().remove(fatTNotifica);
		fatTNotifica.setArchivio(null);

		return fatTNotifica;
	}

	public Serializable getPrimaryKey() {
		return this.idArchivio;
	}

	public String getIdFileArchivio() {
		return idFileArchivio;
	}

	public void setIdFileArchivio(String idFileArchivio) {
		this.idFileArchivio = idFileArchivio;
	}
	
	

}