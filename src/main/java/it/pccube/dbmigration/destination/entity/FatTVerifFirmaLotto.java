package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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



/**
 * The persistent class for the FAT_T_VERIF_FIRMA_LOTTO database table.
 * 
 */
@Entity
@Table(name="FAT_T_VERIF_FIRMA_LOTTO")
public class FatTVerifFirmaLotto implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_VERIF_FIRMA_LOTTO_IDVERIFFIRMALOTTO_GENERATOR", sequenceName="SEQ_ID_VERIF_FIRMA_LOTTO", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_VERIF_FIRMA_LOTTO_IDVERIFFIRMALOTTO_GENERATOR")
	@Column(name="ID_VERIF_FIRMA_LOTTO")
	private Long idVerifFirmaLotto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_DATA_VERIFICA")
	
	private Date dtDataVerifica;

	@Column(name="FL_CHECK_HASH_DOCUMENTO")
	
	private BigDecimal flCheckHashDocumento;

	@Column(name="NM_UTENTE_INSERIMENTO")
	
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	
	private String nmUtenteUltimaModifica;

	@Column(name = "ID_PDF_ESITO")
	private String idPdfEsito;

	@Column(name="PG_VERSIONE_LOTTO")
	
	private BigDecimal pgVersioneLotto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTDizRispostaCodFiscale
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_RISPOSTA_COD_FISCALE")
	private FatTDizRispostaCodFiscale dizRispostaCodFiscale;

	//bi-directional many-to-one association to FatTDizRispostaWsFirma
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_RISPOSTA_WS_FIRMA")
	private FatTDizRispostaWsFirma dizRispostaWsFirma;

	//bi-directional many-to-one association to FatTLotto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_LOTTO")
	private FatTLotto lotto;

	//bi-directional many-to-one association to FatTVerifFirmServLotto
	@OneToMany(mappedBy="verifFirmaLotto")
	
	private List<FatTVerifFirmServLotto> listVerifFirmServLotto;

	public FatTVerifFirmaLotto() {
	}

	public Long getIdVerifFirmaLotto() {
		return this.idVerifFirmaLotto;
	}

	public void setIdVerifFirmaLotto(Long idVerifFirmaLotto) {
		this.idVerifFirmaLotto = idVerifFirmaLotto;
	}

	public Date getDtDataVerifica() {
		return this.dtDataVerifica;
	}

	public void setDtDataVerifica(Date dtDataVerifica) {
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

	public BigDecimal getPgVersioneLotto() {
		return this.pgVersioneLotto;
	}

	public void setPgVersioneLotto(BigDecimal pgVersioneLotto) {
		this.pgVersioneLotto = pgVersioneLotto;
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

	public FatTLotto getLotto() {
		return this.lotto;
	}

	public void setLotto(FatTLotto lotto) {
		this.lotto = lotto;
	}

	public List<FatTVerifFirmServLotto> getListVerifFirmServLotto() {
		return this.listVerifFirmServLotto;
	}

	public void getListVerifFirmServLotto(List<FatTVerifFirmServLotto> listVerifFirmServLotto) {
		this.listVerifFirmServLotto = listVerifFirmServLotto;
	}

	public FatTVerifFirmServLotto addFatTVerifFirmServLotto(FatTVerifFirmServLotto fatTVerifFirmServLotto) {
		getListVerifFirmServLotto().add(fatTVerifFirmServLotto);
		fatTVerifFirmServLotto.setVerifFirmaLotto(this);

		return fatTVerifFirmServLotto;
	}

	public FatTVerifFirmServLotto removeFatTVerifFirmServLotto(FatTVerifFirmServLotto fatTVerifFirmServLotto) {
		getListVerifFirmServLotto().remove(fatTVerifFirmServLotto);
		fatTVerifFirmServLotto.setVerifFirmaLotto(null);

		return fatTVerifFirmServLotto;
	}

	
	public String getIdPdfEsito() {
		return idPdfEsito;
	}

	public void setIdPdfEsito(String idPdfEsito) {
		this.idPdfEsito = idPdfEsito;
	}

	public Serializable getPrimaryKey() {
		return this.idVerifFirmaLotto;
	}

}