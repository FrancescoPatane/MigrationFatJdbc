package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_VERIF_FIRMA_SUPP_FTP database table.
 * 
 */
@Entity
@Table(name="FAT_T_VERIF_FIRMA_SUPP_FTP")
public class FatTVerifFirmaSuppFtp implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_VERIF_FIRMA_SUPP_FTP_IDVERIFFIRMASUPPORTOFTP_GENERATOR", sequenceName="SEQ_ID_VERIF_FIRMA_SUP_FTP", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_VERIF_FIRMA_SUPP_FTP_IDVERIFFIRMASUPPORTOFTP_GENERATOR")
	@Column(name="ID_VERIF_FIRMA_SUPPORTO_FTP")
	private Long idVerifFirmaSupportoFtp;

	@Column(name="FL_CHECK_HASH_DOCUMENTO")
	private Boolean flCheckHashDocumento;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_DATA_VERIFICA")
	private Date tsDataVerifica;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTSupportoFtp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_SUPPORTO_FTP")
	private FatTSupportoFtp supportoFtp;

	//bi-directional many-to-one association to FatTDizRispostaCodFiscale
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_RISPOSTA_COD_FISCALE")
	private FatTDizRispostaCodFiscale dizRispostaCodFiscale;

	//bi-directional many-to-one association to FatTDizRispostaWsFirma
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_RISPOSTA_WS_FIRMA")
	private FatTDizRispostaWsFirma dizRispostaWsFirma;

	//bi-directional one-to-one association to FatTVerFirmServSupFtp
	@OneToOne(mappedBy="verifFirmaSuppFtp", fetch=FetchType.LAZY)
	private FatTVerFirmServSupFtp verFirmServSupFtp;

	public FatTVerifFirmaSuppFtp() {
	}

	public Long getIdVerifFirmaSupportoFtp() {
		return this.idVerifFirmaSupportoFtp;
	}

	public void setIdVerifFirmaSupportoFtp(Long idVerifFirmaSupportoFtp) {
		this.idVerifFirmaSupportoFtp = idVerifFirmaSupportoFtp;
	}

	public Boolean getFlCheckHashDocumento() {
		return this.flCheckHashDocumento;
	}

	public void setFlCheckHashDocumento(Boolean flCheckHashDocumento) {
		this.flCheckHashDocumento = flCheckHashDocumento;
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

	public Date getTsDataVerifica() {
		return this.tsDataVerifica;
	}

	public void setTsDataVerifica(Date tsDataVerifica) {
		this.tsDataVerifica = tsDataVerifica;
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

	public FatTSupportoFtp getSupportoFtp() {
		return this.supportoFtp;
	}

	public void setSupportoFtp(FatTSupportoFtp supportoFtp) {
		this.supportoFtp = supportoFtp;
	}

	public FatTDizRispostaCodFiscale getDizRispostaCodFiscale() {
		return this.dizRispostaCodFiscale;
	}

	public void setDizRispostaCodFiscale(FatTDizRispostaCodFiscale dizRispostaCodFiscale) {
		this.dizRispostaCodFiscale = dizRispostaCodFiscale;
	}

	public FatTDizRispostaWsFirma getDizRispostaWsFirma() {
		return this.dizRispostaWsFirma;
	}

	public void setDizRispostaWsFirma(FatTDizRispostaWsFirma dizRispostaWsFirma) {
		this.dizRispostaWsFirma = dizRispostaWsFirma;
	}

	public FatTVerFirmServSupFtp getVerFirmServSupFtp() {
		return this.verFirmServSupFtp;
	}

	public void setVerFirmServSupFtp(FatTVerFirmServSupFtp verFirmServSupFtp) {
		this.verFirmServSupFtp = verFirmServSupFtp;
	}

	public Serializable getPrimaryKey() {
		return this.idVerifFirmaSupportoFtp;
	}

}