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
 * The persistent class for the FAT_A_STATO_SUPPORTO_FTP database table.
 * 
 */
@Entity
@Table(name="FAT_A_STATO_SUPPORTO_FTP")
public class FatAStatoSupportoFtp implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_A_STATO_SUPPORTO_FTP_IDSTATOSUPPORTOFTP_GENERATOR", sequenceName="SEQ_ID_STATO_SUPPORTO_FTP", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_A_STATO_SUPPORTO_FTP_IDSTATOSUPPORTOFTP_GENERATOR")
	@Column(name="ID_STATO_SUPPORTO_FTP")
	private Long idStatoSupportoFtp;

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

	//bi-directional many-to-one association to FatAStatoSupportoFtp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_STATO_SUPPORTO_FTP_PREC")
	private FatAStatoSupportoFtp statoSupportoFtp;

	//bi-directional many-to-one association to FatAStatoSupportoFtp
	@OneToMany(mappedBy="statoSupportoFtp")
	private List<FatAStatoSupportoFtp> listStatoSupportoFtp;

	//bi-directional many-to-one association to FatTSupportoFtp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_SUPPORTO_FTP")
	private FatTSupportoFtp supportoFtp;

	//bi-directional many-to-one association to FatTDizStatoSupportoFtp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_STATO_SUPPORTO_FTP")
	private FatTDizStatoSupportoFtp dizStatoSupportoFtp;

	public FatAStatoSupportoFtp() {
	}

	public Long getIdStatoSupportoFtp() {
		return this.idStatoSupportoFtp;
	}

	public void setIdStatoSupportoFtp(Long idStatoSupportoFtp) {
		this.idStatoSupportoFtp = idStatoSupportoFtp;
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

	public FatAStatoSupportoFtp getStatoSupportoFtp() {
		return this.statoSupportoFtp;
	}

	public void setStatoSupportoFtp(FatAStatoSupportoFtp statoSupportoFtp) {
		this.statoSupportoFtp = statoSupportoFtp;
	}

	public List<FatAStatoSupportoFtp> getListStatoSupportoFtp() {
		return this.listStatoSupportoFtp;
	}

	public void setListStatoSupportoFtp(List<FatAStatoSupportoFtp> listStatoSupportoFtp) {
		this.listStatoSupportoFtp = listStatoSupportoFtp;
	}

	public FatAStatoSupportoFtp addFatAStatoSupportoFtp(FatAStatoSupportoFtp fatAStatoSupportoFtp) {
		getListStatoSupportoFtp().add(fatAStatoSupportoFtp);
		fatAStatoSupportoFtp.setStatoSupportoFtp(this);

		return fatAStatoSupportoFtp;
	}

	public FatAStatoSupportoFtp removeFatAStatoSupportoFtp(FatAStatoSupportoFtp fatAStatoSupportoFtp) {
		getListStatoSupportoFtp().remove(fatAStatoSupportoFtp);
		fatAStatoSupportoFtp.setStatoSupportoFtp(null);

		return fatAStatoSupportoFtp;
	}

	public FatTSupportoFtp getSupportoFtp() {
		return this.supportoFtp;
	}

	public void setSupportoFtp(FatTSupportoFtp supportoFtp) {
		this.supportoFtp = supportoFtp;
	}

	public FatTDizStatoSupportoFtp getDizStatoSupportoFtp() {
		return this.dizStatoSupportoFtp;
	}

	public void setDizStatoSupportoFtp(FatTDizStatoSupportoFtp dizStatoSupportoFtp) {
		this.dizStatoSupportoFtp = dizStatoSupportoFtp;
	}

	public Serializable getPrimaryKey() {
		return this.idStatoSupportoFtp;
	}

}