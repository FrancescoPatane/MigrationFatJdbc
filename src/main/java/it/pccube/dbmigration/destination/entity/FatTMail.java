package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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



/**
 * The persistent class for the FAT_T_MAIL database table.
 * 
 */
@Entity
@Table(name="FAT_T_MAIL")
public class FatTMail implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_MAIL")
	@SequenceGenerator(name = "SEQ_ID_MAIL", sequenceName = "SEQ_ID_MAIL", allocationSize = 1)
	@Column(name="ID_MAIL")
	private Long idMail;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_DECADENZA")
	private Date dtDataDecadenza;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_INVIO")
	private Date dtDataOraInvio;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_SOSPENSIONE")
	private Date dtDataSospensione;

	@Column(name="ID_SEDIA_DEST")
	private Long idSediaDest;

	@Column(name="NM_INDIRIZZO_DESTINATARIO")
	private String nmIndirizzoDestinatario;

	@Column(name="NR_GIORNI_MANCANTI_DECADENZA")
	private Long nrGiorniMancantiDecadenza;

	@Column(name="NR_GIORNI_MANCANTI_SOSPENSIONE")
	private Long nrGiorniMancantiSospensione;

	@Column(name="NR_UTENTE_INVIO")
	private Long nrUtenteInvio;

	// TODO capire cosa bisogna fare
	@Lob
	@Column(name="OJ_TESTO")
	private byte[] ojTesto;

	@Column(name="PG_VERSIONE_LOTTO")
	private Long pgVersioneLotto;

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

	//bi-directional many-to-one association to FatTAdesione
	@ManyToOne
	@JoinColumn(name="ID_ADESIONE")
	private FatTAdesione adesione;

	//bi-directional many-to-one association to FatTFattura
	@ManyToOne
	@JoinColumn(name="ID_FATTURA")
	private FatTFattura fattura;

//	//bi-directional many-to-one association to FatTLottoBckup
	@ManyToOne
	@JoinColumn(name="ID_LOTTO")
	private FatTLotto lotto;

	//bi-directional many-to-one association to FatTAdesione
	@ManyToOne
	@JoinColumn(name="ID_DIZ_TIPOLOGIA_EMAIL")
	private FatTDizTipologiaMail dizTipologiaMail;
	
	//bi-directional many-to-one association to FatTAdesione
	@ManyToOne
	@JoinColumn(name="ID_DIZ_TIPOLOGIA_UTENTE_INVIO")
	private FatTDizUtenteInvioMail dizUtenteInvioMail;
	
	//bi-directional many-to-one association to FatTMail
	@ManyToOne
	@JoinColumn(name = "ID_MAIL_PRINCIPALE")
	private FatTMail mail;

	//bi-directional many-to-one association to FatTMail
	@OneToMany(mappedBy="mail")
	private List<FatTMail> listMail;

	public FatTMail() {
		super();
	}

	public Long getIdMail() {
		return this.idMail;
	}

	public void setIdMail(Long idMail) {
		this.idMail = idMail;
	}

	public Date getDtDataDecadenza() {
		return this.dtDataDecadenza;
	}

	public void setDtDataDecadenza(Date dtDataDecadenza) {
		this.dtDataDecadenza = dtDataDecadenza;
	}

	public Date getDtDataOraInvio() {
		return this.dtDataOraInvio;
	}

	public void setDtDataOraInvio(Date dtDataOraInvio) {
		this.dtDataOraInvio = dtDataOraInvio;
	}

	public Date getDtDataSospensione() {
		return this.dtDataSospensione;
	}

	public void setDtDataSospensione(Date dtDataSospensione) {
		this.dtDataSospensione = dtDataSospensione;
	}

	public Long getIdSediaDest() {
		return this.idSediaDest;
	}

	public void setIdSediaDest(Long idSediaDest) {
		this.idSediaDest = idSediaDest;
	}

	public String getNmIndirizzoDestinatario() {
		return this.nmIndirizzoDestinatario;
	}

	public void setNmIndirizzoDestinatario(String nmIndirizzoDestinatario) {
		this.nmIndirizzoDestinatario = nmIndirizzoDestinatario;
	}

	public Long getNrGiorniMancantiDecadenza() {
		return this.nrGiorniMancantiDecadenza;
	}

	public void setNrGiorniMancantiDecadenza(Long nrGiorniMancantiDecadenza) {
		this.nrGiorniMancantiDecadenza = nrGiorniMancantiDecadenza;
	}

	public Long getNrGiorniMancantiSospensione() {
		return this.nrGiorniMancantiSospensione;
	}

	public void setNrGiorniMancantiSospensione(Long nrGiorniMancantiSospensione) {
		this.nrGiorniMancantiSospensione = nrGiorniMancantiSospensione;
	}

	public Long getNrUtenteInvio() {
		return this.nrUtenteInvio;
	}

	public void setNrUtenteInvio(Long nrUtenteInvio) {
		this.nrUtenteInvio = nrUtenteInvio;
	}

	public byte[] getOjTesto() {
		return this.ojTesto;
	}

	public void setOjTesto(byte[] ojTesto) {
		this.ojTesto = ojTesto;
	}

	public Long getPgVersioneLotto() {
		return this.pgVersioneLotto;
	}

	public void setPgVersioneLotto(Long pgVersioneLotto) {
		this.pgVersioneLotto = pgVersioneLotto;
	}

	public Date getTsInserimento() {
		return this.tsInserimento;
	}

	public void setTsInserimento(Date tsInserimento) {
		this.tsInserimento = tsInserimento;
	}

	/**
	 * @return the nmUtenteInserimento
	 */
	public String getNmUtenteInserimento() {
		return nmUtenteInserimento;
	}

	/**
	 * @param nmUtenteInserimento the nmUtenteInserimento to set
	 */
	public void setNmUtenteInserimento(String nmUtenteInserimento) {
		this.nmUtenteInserimento = nmUtenteInserimento;
	}

	/**
	 * @return the nmUtenteUltimaModifica
	 */
	public String getNmUtenteUltimaModifica() {
		return nmUtenteUltimaModifica;
	}

	/**
	 * @param nmUtenteUltimaModifica the nmUtenteUltimaModifica to set
	 */
	public void setNmUtenteUltimaModifica(String nmUtenteUltimaModifica) {
		this.nmUtenteUltimaModifica = nmUtenteUltimaModifica;
	}

	/**
	 * @return the tsUltimaModifica
	 */
	public Date getTsUltimaModifica() {
		return tsUltimaModifica;
	}

	/**
	 * @param tsUltimaModifica the tsUltimaModifica to set
	 */
	public void setTsUltimaModifica(Date tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}

	public FatTAdesione getAdesione() {
		return this.adesione;
	}

	public void setAdesione(FatTAdesione adesione) {
		this.adesione = adesione;
	}

	public FatTFattura getFattura() {
		return this.fattura;
	}

	public void setFattura(FatTFattura fattura) {
		this.fattura = fattura;
	}

	public FatTLotto getLotto() {
		return this.lotto;
	}

	public void setLotto(FatTLotto lotto) {
		this.lotto = lotto;
	}

	public FatTDizTipologiaMail getDizTipologiaMail() {
		return dizTipologiaMail;
	}

	public void setDizTipologiaMail(FatTDizTipologiaMail dizTipologiaMail) {
		this.dizTipologiaMail = dizTipologiaMail;
	}

	public FatTDizUtenteInvioMail getDizUtenteInvioMail() {
		return dizUtenteInvioMail;
	}

	public void setDizUtenteInvioMail(FatTDizUtenteInvioMail dizUtenteInvioMail) {
		this.dizUtenteInvioMail = dizUtenteInvioMail;
	}
	
	public FatTMail getMail() {
		return this.mail;
	}

	public void setMail(FatTMail mail) {
		this.mail = mail;
	}

	public List<FatTMail> getListMail() {
		return this.listMail;
	}

	public void setListMail(List<FatTMail> listMail) {
		this.listMail = listMail;
	}

	public FatTMail addFatTMail(FatTMail fatTMail) {
		getListMail().add(fatTMail);
		fatTMail.setMail(this);

		return fatTMail;
	}

	public FatTMail removeFatTMail(FatTMail fatTMail) {
		getListMail().remove(fatTMail);
		fatTMail.setMail(null);

		return fatTMail;
	}

	
	public Serializable getPrimaryKey() {
		return this.idMail;
	}

}