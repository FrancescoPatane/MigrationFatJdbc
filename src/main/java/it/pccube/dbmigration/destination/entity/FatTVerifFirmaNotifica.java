package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import javax.persistence.*;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FAT_T_VERIF_FIRMA_NOTIFICA database table.
 * 
 */
@Entity
@Table(name="FAT_T_VERIF_FIRMA_NOTIFICA")
public class FatTVerifFirmaNotifica implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_VERIF_FIRMA_NOTIFICA_IDVERIFFIRMANOTIFICA_GENERATOR", sequenceName="SEQ_ID_VERIF_FIRMA_NOTIFICA", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_VERIF_FIRMA_NOTIFICA_IDVERIFFIRMANOTIFICA_GENERATOR")
	@Column(name="ID_VERIF_FIRMA_NOTIFICA")
	private Long idVerifFirmaNotifica;

	@Column(name="DT_DATA_VERIFICA")
	private Timestamp dtDataVerifica;

	@Column(name="FL_CHECK_HASH_DOCUMENTO")
	private BigDecimal flCheckHashDocumento;

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

	//bi-directional many-to-one association to FatTNotifica
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_NOTIFICA")
	private FatTNotifica notifica;

	//bi-directional many-to-one association to FatTDizRispostaCodFiscale
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_RISPOSTA_COD_FISCALE")
	private FatTDizRispostaCodFiscale dizRispostaCodFiscale;

	//bi-directional many-to-one association to FatTDizRispostaWsFirma
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_RISPOSTA_WS_FIRMA")
	private FatTDizRispostaWsFirma dizRispostaWsFirma;

	//bi-directional many-to-one association to FatTVerifFirmServNotif
	@OneToMany(mappedBy="verifFirmaNotifica")
	private List<FatTVerifFirmServNotif> listVerifFirmServNotif;

	public FatTVerifFirmaNotifica() {
	}

	public Long getIdVerifFirmaNotifica() {
		return this.idVerifFirmaNotifica;
	}

	public void setIdVerifFirmaNotifica(Long idVerifFirmaNotifica) {
		this.idVerifFirmaNotifica = idVerifFirmaNotifica;
	}

	public Timestamp getDtDataVerifica() {
		return this.dtDataVerifica;
	}

	public void setDtDataVerifica(Timestamp dtDataVerifica) {
		this.dtDataVerifica = dtDataVerifica;
	}

	public BigDecimal getFlCheckHashDocumento() {
		return this.flCheckHashDocumento;
	}

	public void setFlCheckHashDocumento(BigDecimal flCheckHashDocumento) {
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

	public FatTNotifica getNotifica() {
		return this.notifica;
	}

	public void setNotifica(FatTNotifica notifica) {
		this.notifica = notifica;
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

	public List<FatTVerifFirmServNotif> getListVerifFirmServNotif() {
		return this.listVerifFirmServNotif;
	}

	public void setListVerifFirmServNotif(List<FatTVerifFirmServNotif> listVerifFirmServNotif) {
		this.listVerifFirmServNotif = listVerifFirmServNotif;
	}

	public FatTVerifFirmServNotif addFatTVerifFirmServNotif(FatTVerifFirmServNotif fatTVerifFirmServNotif) {
		getListVerifFirmServNotif().add(fatTVerifFirmServNotif);
		fatTVerifFirmServNotif.setVerifFirmaNotifica(this);

		return fatTVerifFirmServNotif;
	}

	public FatTVerifFirmServNotif removeFatTVerifFirmServNotif(FatTVerifFirmServNotif fatTVerifFirmServNotif) {
		getListVerifFirmServNotif().remove(fatTVerifFirmServNotif);
		fatTVerifFirmServNotif.setVerifFirmaNotifica(null);

		return fatTVerifFirmServNotif;
	}

	public Serializable getPrimaryKey() {
		return this.idVerifFirmaNotifica;
	}

}