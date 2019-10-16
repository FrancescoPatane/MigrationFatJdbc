package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the FAT_T_VERIF_FIRMA_ADE database table.
 * 
 */
@Entity
@Table(name = "FAT_T_VERIF_FIRMA_ADE")
public class FatTVerifFirmaAde implements EntityInterface {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FAT_T_VERIF_FIRMA_ADE_IDVERIFFIRMAADE_GENERATOR", sequenceName = "SEQ_ID_VERIF_FIRMA_ADE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAT_T_VERIF_FIRMA_ADE_IDVERIFFIRMAADE_GENERATOR")
	@Column(name = "ID_VERIF_FIRMA_ADE")
	private Long idVerifFirmaAde;

	@Column(name = "CD_DIZ_RISPOSTA_COD_FISCALE")
	private String cdDizRispostaCodFiscale;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_DATA_VERIFICA")
	private Date dtDataVerifica;

	@Column(name = "FL_CHECK_HASH_DOCUMENTO")
	private Boolean flCheckHashDocumento;

	@Column(name = "ID_PDF_ESITO")
	private String idPdfEsito;

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
	@ManyToOne
	@JoinColumn(name = "ID_DIZ_RISPOSTA_COD_FISCALE")
	private FatTDizRispostaCodFiscale dizRispostaCodFiscale;

	// bi-directional many-to-one association to FatTAdesione
	@ManyToOne
	@JoinColumn(name = "ID_DIZ_RISPOSTA_WS_FIRMA")
	private FatTDizRispostaWsFirma dizRispostaWsFirma;

	// bi-directional many-to-one association to FatTAdesione
	@ManyToOne
	@JoinColumn(name = "ID_ADESIONE")
	private FatTAdesione adesione;

	// bi-directional many-to-one association to FatTVerifFirmaServAde
	// @OneToMany(mappedBy = "verifFirmaAde")
	// private List<FatTVerifFirmaServAde> listVerifFirmaServAde;

	public FatTVerifFirmaAde() {
		super();
	}

	public Long getIdVerifFirmaAde() {
		return this.idVerifFirmaAde;
	}

	public void setIdVerifFirmaAde(Long idVerifFirmaAde) {
		this.idVerifFirmaAde = idVerifFirmaAde;
	}

	public String getCdDizRispostaCodFiscale() {
		return this.cdDizRispostaCodFiscale;
	}

	public void setCdDizRispostaCodFiscale(String cdDizRispostaCodFiscale) {
		this.cdDizRispostaCodFiscale = cdDizRispostaCodFiscale;
	}

	public Date getDtDataVerifica() {
		return this.dtDataVerifica;
	}

	public void setDtDataVerifica(Date dtDataVerifica) {
		this.dtDataVerifica = dtDataVerifica;
	}

	public Boolean getFlCheckHashDocumento() {
		return this.flCheckHashDocumento;
	}

	public void setFlCheckHashDocumento(Boolean flCheckHashDocumento) {
		this.flCheckHashDocumento = flCheckHashDocumento;
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
	 * @param nmUtenteInserimento
	 *            the nmUtenteInserimento to set
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
	 * @param nmUtenteUltimaModifica
	 *            the nmUtenteUltimaModifica to set
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
	 * @param tsUltimaModifica
	 *            the tsUltimaModifica to set
	 */
	public void setTsUltimaModifica(Date tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}

	public FatTAdesione getAdesione() {
		return this.adesione;
	}

	public void setAdesione(FatTAdesione fatTAdesione) {
		this.adesione = fatTAdesione;
	}

	public FatTDizRispostaCodFiscale getDizRispostaCodFiscale() {
		return dizRispostaCodFiscale;
	}

	public void setDizRispostaCodFiscale(FatTDizRispostaCodFiscale dizRispostaCodFiscale) {
		this.dizRispostaCodFiscale = dizRispostaCodFiscale;
	}

	public FatTDizRispostaWsFirma getDizRispostaWsFirma() {
		return dizRispostaWsFirma;
	}

	public void setDizRispostaWsFirma(FatTDizRispostaWsFirma dizRispostaWsFirma) {
		this.dizRispostaWsFirma = dizRispostaWsFirma;
	}

	// public List<FatTVerifFirmaServAde> getListVerifFirmaServAdes() {
	// return this.listVerifFirmaServAde;
	// }
	//
	// public void setListVerifFirmaServAdes(List<FatTVerifFirmaServAde>
	// fatTVerifFirmaServAdes) {
	// this.listVerifFirmaServAde = fatTVerifFirmaServAdes;
	// }
	//
	// public FatTVerifFirmaServAde addVerifFirmaServAde(FatTVerifFirmaServAde
	// fatTVerifFirmaServAde) {
	// getListVerifFirmaServAde().add(fatTVerifFirmaServAde);
	// fatTVerifFirmaServAde.setVerifFirmaAde(this);
	//
	// return fatTVerifFirmaServAde;
	// }
	//
	// public FatTVerifFirmaServAde
	// removeVerifFirmaServAde(FatTVerifFirmaServAde fatTVerifFirmaServAde) {
	// getListVerifFirmaServAde().remove(fatTVerifFirmaServAde);
	// fatTVerifFirmaServAde.setVerifFirmaAde(null);
	//
	// return fatTVerifFirmaServAde;
	// }

	public String getIdPdfEsito() {
		return idPdfEsito;
	}

	public void setIdPdfEsito(String idPdfEsito) {
		this.idPdfEsito = idPdfEsito;
	}

	public Serializable getPrimaryKey() {
		return this.idVerifFirmaAde;
	}

}