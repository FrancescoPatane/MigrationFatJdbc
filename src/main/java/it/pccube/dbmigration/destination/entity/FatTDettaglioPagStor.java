package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_DETTAGLIO_PAG_STOR database table.
 * 
 */
@Entity
@Table(name="FAT_T_DETTAGLIO_PAG_STOR")
public class FatTDettaglioPagStor implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_DETTAGLIO_PAG_STOR_IDDETTAGLIOPAGSTOR_GENERATOR",sequenceName="SEQ_ID_DETTAGLIO_PAG_STO",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_DETTAGLIO_PAG_STOR_IDDETTAGLIOPAGSTOR_GENERATOR")
	@Column(name="ID_DETTAGLIO_PAG_STOR")
	private Long idDettaglioPagStor;

	@Column(name="CD_ABI")
	
	private String cdAbi;

	@Column(name="CD_BIC")
	
	private String cdBic;

	@Column(name="CD_CAB")
	
	private String cdCab;

	@Column(name="CD_CF_QUIETANZANTE")
	
	private String cdCfQuietanzante;

	@Column(name="CD_COD_UFFICIO_POSTALE")
	
	private String cdCodUfficioPostale;

	@Column(name="CD_CODICE_PAGAMENTO")
	
	private String cdCodicePagamento;

	@Column(name="CD_IBAN")
	
	private String cdIban;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_DECORRENZA_PENALE")
	
	private Date dtDataDecorrenzaPenale;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_LIMITE_PAGAMENTO_ANT")
	
	private Date dtDataLimitePagamentoAnt;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_RIF_TERMINI_PAGAMENTO")
	
	private Date dtDataRifTerminiPagamento;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_SCADENZA_PAGAMENTO")
	
	private Date dtDataScadenzaPagamento;

	@Column(name="ID_DATI_PAGAMENTO")
	
	private Long idDatiPagamento;

	@Column(name="ID_DETTAGLIO_PAGAMENTO")
	private Long idDettaglioPagamento;

	@Column(name="IM_IMPORTO_PAGAMENTO")
	
	private BigDecimal imImportoPagamento;

	@Column(name="IM_PENALITA_PAGAMENTI_RIT")
	
	private BigDecimal imPenalitaPagamentiRit;

	@Column(name="IM_SCONTO_PAGAMENTO_ANTICIPATO")
	
	private BigDecimal imScontoPagamentoAnticipato;

	@Column(name="NM_BENEFICIARIO")
	
	private String nmBeneficiario;

	@Column(name="NM_COGNOME_QUIETANZANTE")
	
	private String nmCognomeQuietanzante;

	@Column(name="NM_ISTITUTO_FINANZIARIO")
	
	private String nmIstitutoFinanziario;

	@Column(name="NM_NOME_QUIETANZANTE")
	
	private String nmNomeQuietanzante;

	@Column(name="NM_TITOLO_QUIETANZANTE")
	
	private String nmTitoloQuietanzante;

	@Column(name="NM_UTENTE_INSERIMENTO")
	
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	
	private String nmUtenteUltimaModifica;

	@Column(name="NR_GIORNI_TERMINI_PAGAMENTO")
	
	private BigDecimal nrGiorniTerminiPagamento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTDatiPagamentoStor
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DATI_PAGAMENTO_STOR")
	private FatTDatiPagamentoStor datiPagamentoStor;

	//bi-directional many-to-one association to FatTDizModalitaPagamento
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_MODALITA_PAGAMENTO")
	private FatTDizModalitaPagamento dizModalitaPagamento;

	public FatTDettaglioPagStor() {
	}

	public Long getIdDettaglioPagStor() {
		return this.idDettaglioPagStor;
	}

	public void setIdDettaglioPagStor(Long idDettaglioPagStor) {
		this.idDettaglioPagStor = idDettaglioPagStor;
	}

	public String getCdAbi() {
		return this.cdAbi;
	}

	public void setCdAbi(String cdAbi) {
		this.cdAbi = cdAbi;
	}

	public String getCdBic() {
		return this.cdBic;
	}

	public void setCdBic(String cdBic) {
		this.cdBic = cdBic;
	}

	public String getCdCab() {
		return this.cdCab;
	}

	public void setCdCab(String cdCab) {
		this.cdCab = cdCab;
	}

	public String getCdCfQuietanzante() {
		return this.cdCfQuietanzante;
	}

	public void setCdCfQuietanzante(String cdCfQuietanzante) {
		this.cdCfQuietanzante = cdCfQuietanzante;
	}

	public String getCdCodUfficioPostale() {
		return this.cdCodUfficioPostale;
	}

	public void setCdCodUfficioPostale(String cdCodUfficioPostale) {
		this.cdCodUfficioPostale = cdCodUfficioPostale;
	}

	public String getCdCodicePagamento() {
		return this.cdCodicePagamento;
	}

	public void setCdCodicePagamento(String cdCodicePagamento) {
		this.cdCodicePagamento = cdCodicePagamento;
	}

	public String getCdIban() {
		return this.cdIban;
	}

	public void setCdIban(String cdIban) {
		this.cdIban = cdIban;
	}

	public Date getDtDataDecorrenzaPenale() {
		return this.dtDataDecorrenzaPenale;
	}

	public void setDtDataDecorrenzaPenale(Date dtDataDecorrenzaPenale) {
		this.dtDataDecorrenzaPenale = dtDataDecorrenzaPenale;
	}

	public Date getDtDataLimitePagamentoAnt() {
		return this.dtDataLimitePagamentoAnt;
	}

	public void setDtDataLimitePagamentoAnt(Date dtDataLimitePagamentoAnt) {
		this.dtDataLimitePagamentoAnt = dtDataLimitePagamentoAnt;
	}

	public Date getDtDataRifTerminiPagamento() {
		return this.dtDataRifTerminiPagamento;
	}

	public void setDtDataRifTerminiPagamento(Date dtDataRifTerminiPagamento) {
		this.dtDataRifTerminiPagamento = dtDataRifTerminiPagamento;
	}

	public Date getDtDataScadenzaPagamento() {
		return this.dtDataScadenzaPagamento;
	}

	public void setDtDataScadenzaPagamento(Date dtDataScadenzaPagamento) {
		this.dtDataScadenzaPagamento = dtDataScadenzaPagamento;
	}

	public Long getIdDatiPagamento() {
		return this.idDatiPagamento;
	}

	public void setIdDatiPagamento(Long idDatiPagamento) {
		this.idDatiPagamento = idDatiPagamento;
	}

	public Long getIdDettaglioPagamento() {
		return this.idDettaglioPagamento;
	}

	public void setIdDettaglioPagamento(Long idDettaglioPagamento) {
		this.idDettaglioPagamento = idDettaglioPagamento;
	}

	public BigDecimal getImImportoPagamento() {
		return this.imImportoPagamento;
	}

	public void setImImportoPagamento(BigDecimal imImportoPagamento) {
		this.imImportoPagamento = imImportoPagamento;
	}

	public BigDecimal getImPenalitaPagamentiRit() {
		return this.imPenalitaPagamentiRit;
	}

	public void setImPenalitaPagamentiRit(BigDecimal imPenalitaPagamentiRit) {
		this.imPenalitaPagamentiRit = imPenalitaPagamentiRit;
	}

	public BigDecimal getImScontoPagamentoAnticipato() {
		return this.imScontoPagamentoAnticipato;
	}

	public void setImScontoPagamentoAnticipato(BigDecimal imScontoPagamentoAnticipato) {
		this.imScontoPagamentoAnticipato = imScontoPagamentoAnticipato;
	}

	public String getNmBeneficiario() {
		return this.nmBeneficiario;
	}

	public void setNmBeneficiario(String nmBeneficiario) {
		this.nmBeneficiario = nmBeneficiario;
	}

	public String getNmCognomeQuietanzante() {
		return this.nmCognomeQuietanzante;
	}

	public void setNmCognomeQuietanzante(String nmCognomeQuietanzante) {
		this.nmCognomeQuietanzante = nmCognomeQuietanzante;
	}

	public String getNmIstitutoFinanziario() {
		return this.nmIstitutoFinanziario;
	}

	public void setNmIstitutoFinanziario(String nmIstitutoFinanziario) {
		this.nmIstitutoFinanziario = nmIstitutoFinanziario;
	}

	public String getNmNomeQuietanzante() {
		return this.nmNomeQuietanzante;
	}

	public void setNmNomeQuietanzante(String nmNomeQuietanzante) {
		this.nmNomeQuietanzante = nmNomeQuietanzante;
	}

	public String getNmTitoloQuietanzante() {
		return this.nmTitoloQuietanzante;
	}

	public void setNmTitoloQuietanzante(String nmTitoloQuietanzante) {
		this.nmTitoloQuietanzante = nmTitoloQuietanzante;
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

	public BigDecimal getNrGiorniTerminiPagamento() {
		return this.nrGiorniTerminiPagamento;
	}

	public void setNrGiorniTerminiPagamento(BigDecimal nrGiorniTerminiPagamento) {
		this.nrGiorniTerminiPagamento = nrGiorniTerminiPagamento;
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

	public FatTDatiPagamentoStor getDatiPagamentoStor() {
		return this.datiPagamentoStor;
	}

	public void setDatiPagamentoStor(FatTDatiPagamentoStor fatTDatiPagamentoStor) {
		this.datiPagamentoStor = fatTDatiPagamentoStor;
	}

	public FatTDizModalitaPagamento getDizModalitaPagamento() {
		return this.dizModalitaPagamento;
	}

	public void setDizModalitaPagamento(FatTDizModalitaPagamento fatTDizModalitaPagamento) {
		this.dizModalitaPagamento = fatTDizModalitaPagamento;
	}

	public Serializable getPrimaryKey() {
		return this.idDettaglioPagStor;
	}

}