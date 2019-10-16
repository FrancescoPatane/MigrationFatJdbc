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
 * The persistent class for the FAT_T_IPA database table.
 * 
 */
@Entity
@Table(name = "FAT_T_IPA")
public class FatTIpa implements EntityInterface {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FAT_T_IPA_IDIPA_GENERATOR", sequenceName = "SEQ_ID_IPA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAT_T_IPA_IDIPA_GENERATOR")
	@Column(name = "ID_IPA")
	private Long idIpa;

	@Column(name = "CD_CAP")
	
	private String cdCap;

	@Column(name = "CD_CODICE_FISCALE_FE")
	
	private String cdCodiceFiscaleFe;

	@Column(name = "CD_CODICE_IPA")
	
	private String cdCodiceIpa;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_DATA_AVVIO_FE")
	
	private Date dtDataAvvioFe;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_DATA_VERIFICA_CF_FE")
	
	private Date dtDataVerificaCfFe;

	@Column(name = "FL_UFFICIO_CENTRALE_FE")
	
	private Boolean flUfficioCentraleFe;

	@Column(name = "NM_COMUNE")
	
	private String nmComune;

	@Column(name = "NM_INDIRIZZO")
	
	private String nmIndirizzo;

	@Column(name = "NM_PROVINCIA")
	
	private String nmProvincia;

	@Column(name = "NM_REGIONE")
	
	private String nmRegione;

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

	@Column(name = "TX_DESCRIZIONE")
	
	private String txDescrizione;

	@Column(name = "TX_DESCRIZIONE_COMPLETA")
	
	private String txDescrizioneCompleta;

	// bi-directional many-to-one association to FatTDizTipoElementoIpa
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DIZ_TIPO_ELEMENTO_IPA")
	private FatTDizTipoElementoIpa dizTipoElementoIpa;

	// bi-directional many-to-one association to FatTIpa
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_IPA_PADRE")
	private FatTIpa ipaPadre;

	// bi-directional many-to-one association to FatTIpa
	@OneToMany(mappedBy = "ipaPadre")
	private List<FatTIpa> listIpaChildren;

	public FatTIpa() {
	}

	public Long getIdIpa() {
		return this.idIpa;
	}

	public void setIdIpa(Long idIpa) {
		this.idIpa = idIpa;
	}

	public String getCdCap() {
		return this.cdCap;
	}

	public void setCdCap(String cdCap) {
		this.cdCap = cdCap;
	}

	public String getCdCodiceFiscaleFe() {
		return this.cdCodiceFiscaleFe;
	}

	public void setCdCodiceFiscaleFe(String cdCodiceFiscaleFe) {
		this.cdCodiceFiscaleFe = cdCodiceFiscaleFe;
	}

	public String getCdCodiceIpa() {
		return this.cdCodiceIpa;
	}

	public void setCdCodiceIpa(String cdCodiceIpa) {
		this.cdCodiceIpa = cdCodiceIpa;
	}

	public Date getDtDataAvvioFe() {
		return this.dtDataAvvioFe;
	}

	public void setDtDataAvvioFe(Date dtDataAvvioFe) {
		this.dtDataAvvioFe = dtDataAvvioFe;
	}

	public Date getDtDataVerificaCfFe() {
		return this.dtDataVerificaCfFe;
	}

	public void setDtDataVerificaCfFe(Date dtDataVerificaCfFe) {
		this.dtDataVerificaCfFe = dtDataVerificaCfFe;
	}

	public Boolean getFlUfficioCentraleFe() {
		return this.flUfficioCentraleFe;
	}

	public void setFlUfficioCentraleFe(Boolean flUfficioCentraleFe) {
		this.flUfficioCentraleFe = flUfficioCentraleFe;
	}

	public String getNmComune() {
		return this.nmComune;
	}

	public void setNmComune(String nmComune) {
		this.nmComune = nmComune;
	}

	public String getNmIndirizzo() {
		return this.nmIndirizzo;
	}

	public void setNmIndirizzo(String nmIndirizzo) {
		this.nmIndirizzo = nmIndirizzo;
	}

	public String getNmProvincia() {
		return this.nmProvincia;
	}

	public void setNmProvincia(String nmProvincia) {
		this.nmProvincia = nmProvincia;
	}

	public String getNmRegione() {
		return this.nmRegione;
	}

	public void setNmRegione(String nmRegione) {
		this.nmRegione = nmRegione;
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

	public String getTxDescrizione() {
		return this.txDescrizione;
	}

	public void setTxDescrizione(String txDescrizione) {
		this.txDescrizione = txDescrizione;
	}

	public String getTxDescrizioneCompleta() {
		return this.txDescrizioneCompleta;
	}

	public void setTxDescrizioneCompleta(String txDescrizioneCompleta) {
		this.txDescrizioneCompleta = txDescrizioneCompleta;
	}

	public FatTDizTipoElementoIpa getDizTipoElementoIpa() {
		return this.dizTipoElementoIpa;
	}

	public void setDizTipoElementoIpa(FatTDizTipoElementoIpa dizTipoElementoIpa) {
		this.dizTipoElementoIpa = dizTipoElementoIpa;
	}

	public FatTIpa getIpaPadre() {
		return ipaPadre;
	}

	public void setIpaPadre(FatTIpa ipaPadre) {
		this.ipaPadre = ipaPadre;
	}

	public List<FatTIpa> getListIpaChildren() {
		return listIpaChildren;
	}

	public void setListIpaChildren(List<FatTIpa> listIpaChildren) {
		this.listIpaChildren = listIpaChildren;
	}

	public FatTIpa addFatTIpa(FatTIpa fatTIpa) {
		getListIpaChildren().add(fatTIpa);
		fatTIpa.setIpaPadre(this);

		return fatTIpa;
	}

	public FatTIpa removeFatTIpa(FatTIpa fatTIpa) {
		getListIpaChildren().remove(fatTIpa);
		fatTIpa.setIpaPadre(null);

		return fatTIpa;
	}

	public Serializable getPrimaryKey() {
		return this.idIpa;
	}

}