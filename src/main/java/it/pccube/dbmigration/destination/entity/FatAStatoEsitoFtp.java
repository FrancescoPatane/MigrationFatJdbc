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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_A_STATO_ESITO_FTP database table.
 * 
 */
@Entity
@Table(name="FAT_A_STATO_ESITO_FTP")
public class FatAStatoEsitoFtp implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_A_STATO_ESITO_FTP_IDSTATOESITOFTP_GENERATOR",sequenceName="SEQ_ID_STATO_ESITO_FTP", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_A_STATO_ESITO_FTP_IDSTATOESITOFTP_GENERATOR")
	@Column(name="ID_STATO_ESITO_FTP")
	private Long idStatoEsitoFtp;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_FINE")
	private Date dtDataFine;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_INIZIO")
	private Date dtDataInizio;

	@Column(name="FL_ATTUALE")
	private Boolean flAttuale;

	@Column(name="FL_ERRORE_CONTROLLI_FILE")
	private Boolean flErroreControlliFile;

	@Column(name="NM_LOG_ERRORE_CONTROLLI_FILE")
	private String nmLogErroreControlliFile;

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

	//bi-directional many-to-one association to FatTEsitoFtp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ESITO_FTP")
	private FatTEsitoFtp esitoFtp;

	//bi-directional many-to-one association to FatTDizStatoEsitoFtp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_STATO_ESITO_FTP")
	private FatTDizStatoEsitoFtp dizStatoEsitoFtp;

	//bi-directional many-to-one association to FatAStatoEsitoFtp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_STATO_ESITO_FTP_PREC")
	private FatAStatoEsitoFtp statoEsitoFtp;

	//bi-directional many-to-one association to FatAStatoEsitoFtp
	@OneToMany(mappedBy="statoEsitoFtp")
	private List<FatAStatoEsitoFtp> listStatoEsitoFtp;

	public FatAStatoEsitoFtp() {
	}

	public Long getIdStatoEsitoFtp() {
		return this.idStatoEsitoFtp;
	}

	public void setIdStatoEsitoFtp(Long idStatoEsitoFtp) {
		this.idStatoEsitoFtp = idStatoEsitoFtp;
	}

	public Date getDtDataFine() {
		return this.dtDataFine;
	}

	public void setDtDataFine(Date dtDataFine) {
		this.dtDataFine = dtDataFine;
	}

	public Date getDtDataInizio() {
		return this.dtDataInizio;
	}

	public void setDtDataInizio(Date dtDataInizio) {
		this.dtDataInizio = dtDataInizio;
	}

	public Boolean getFlAttuale() {
		return this.flAttuale;
	}

	public void setFlAttuale(Boolean flAttuale) {
		this.flAttuale = flAttuale;
	}

	public Boolean getFlErroreControlliFile() {
		return this.flErroreControlliFile;
	}

	public void setFlErroreControlliFile(Boolean flErroreControlliFile) {
		this.flErroreControlliFile = flErroreControlliFile;
	}

	public String getNmLogErroreControlliFile() {
		return this.nmLogErroreControlliFile;
	}

	public void setNmLogErroreControlliFile(String nmLogErroreControlliFile) {
		this.nmLogErroreControlliFile = nmLogErroreControlliFile;
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

	public FatTEsitoFtp getEsitoFtp() {
		return this.esitoFtp;
	}

	public void setEsitoFtp(FatTEsitoFtp esitoFtp) {
		this.esitoFtp = esitoFtp;
	}

	public FatTDizStatoEsitoFtp getDizStatoEsitoFtp() {
		return this.dizStatoEsitoFtp;
	}

	public void setDizStatoEsitoFtp(FatTDizStatoEsitoFtp dizStatoEsitoFtp) {
		this.dizStatoEsitoFtp = dizStatoEsitoFtp;
	}

	public FatAStatoEsitoFtp getStatoEsitoFtp() {
		return this.statoEsitoFtp;
	}

	public void setStatoEsitoFtp(FatAStatoEsitoFtp statoEsitoFtp) {
		this.statoEsitoFtp = statoEsitoFtp;
	}

	public List<FatAStatoEsitoFtp> getListStatoEsitoFtp() {
		return this.listStatoEsitoFtp;
	}

	public void setListStatoEsitoFtp(List<FatAStatoEsitoFtp> listStatoEsitoFtp) {
		this.listStatoEsitoFtp = listStatoEsitoFtp;
	}

	public FatAStatoEsitoFtp addFatAStatoEsitoFtp(FatAStatoEsitoFtp fatAStatoEsitoFtp) {
		getListStatoEsitoFtp().add(fatAStatoEsitoFtp);
		fatAStatoEsitoFtp.setStatoEsitoFtp(this);

		return fatAStatoEsitoFtp;
	}

	public FatAStatoEsitoFtp removeFatAStatoEsitoFtp(FatAStatoEsitoFtp fatAStatoEsitoFtp) {
		getListStatoEsitoFtp().remove(fatAStatoEsitoFtp);
		fatAStatoEsitoFtp.setStatoEsitoFtp(null);

		return fatAStatoEsitoFtp;
	}

	public Serializable getPrimaryKey() {
		return this.idStatoEsitoFtp;
	}

}