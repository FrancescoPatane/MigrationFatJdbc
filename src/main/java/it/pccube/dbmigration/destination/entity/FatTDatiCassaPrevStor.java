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
 * The persistent class for the FAT_T_DATI_CASSA_PREV_STOR database table.
 * 
 */
@Entity
@Table(name="FAT_T_DATI_CASSA_PREV_STOR")
public class FatTDatiCassaPrevStor implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_DATI_CASSA_PREV_STOR_IDDATICASSAPREVSTOR_GENERATOR",sequenceName="SEQ_ID_DATI_CASSA_PREV_STO",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_DATI_CASSA_PREV_STOR_IDDATICASSAPREVSTOR_GENERATOR")
	@Column(name="ID_DATI_CASSA_PREV_STOR")
	private Long idDatiCassaPrevStor;

	@Column(name="CD_RIFERIMENTO_AMMINISTRAZIONE")
	private String cdRiferimentoAmministrazione;

	@Column(name="ID_DATI_CASSA_PREVIDENZIALE")
	private Long idDatiCassaPrevidenziale;

	@Column(name="ID_FATTURA")
	private Long idFattura;

	@Column(name="IM_ARROTONDAMENTO")
	private BigDecimal imArrotondamento;

	@Column(name="IM_IMPONIBILE_CASSA")
	private BigDecimal imImponibileCassa;

	@Column(name="IM_IMPORTO_CONTRIBUTO_CASSA")
	private BigDecimal imImportoContributoCassa;

	@Column(name="NM_NUMERO_SEZIONE")
	private BigDecimal nmNumeroSezione;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Column(name="PC_AL_CASSA")
	private BigDecimal pcAlCassa;

	@Column(name="PC_ALIQUOTA_IVA")
	private BigDecimal pcAliquotaIva;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTDizTipoCassa
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_TIPO_CASSA")
	private FatTDizTipoCassa dizTipoCassa;

	//bi-directional many-to-one association to FatTDizNatura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_NATURA")
	private FatTDizNatura dizNatura;

	//bi-directional many-to-one association to FatTDizRitenuta
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_RITENUTA")
	private FatTDizRitenuta dizRitenuta;

	//bi-directional many-to-one association to FatTDizEsigibilitaIva
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_ESIGIBILITA_IVA")
	private FatTDizEsigibilitaIva dizEsigibilitaIva;

	//bi-directional many-to-one association to FatTFatturaStor
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FATTURA_STOR")
	private FatTFatturaStor fatturaStor;

	public FatTDatiCassaPrevStor() {
	}

	public Long getIdDatiCassaPrevStor() {
		return this.idDatiCassaPrevStor;
	}

	public void setIdDatiCassaPrevStor(Long idDatiCassaPrevStor) {
		this.idDatiCassaPrevStor = idDatiCassaPrevStor;
	}

	public String getCdRiferimentoAmministrazione() {
		return this.cdRiferimentoAmministrazione;
	}

	public void setCdRiferimentoAmministrazione(String cdRiferimentoAmministrazione) {
		this.cdRiferimentoAmministrazione = cdRiferimentoAmministrazione;
	}

	public Long getIdDatiCassaPrevidenziale() {
		return this.idDatiCassaPrevidenziale;
	}

	public void setIdDatiCassaPrevidenziale(Long idDatiCassaPrevidenziale) {
		this.idDatiCassaPrevidenziale = idDatiCassaPrevidenziale;
	}

	public Long getIdFattura() {
		return this.idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public BigDecimal getImArrotondamento() {
		return this.imArrotondamento;
	}

	public void setImArrotondamento(BigDecimal imArrotondamento) {
		this.imArrotondamento = imArrotondamento;
	}

	public BigDecimal getImImponibileCassa() {
		return this.imImponibileCassa;
	}

	public void setImImponibileCassa(BigDecimal imImponibileCassa) {
		this.imImponibileCassa = imImponibileCassa;
	}

	public BigDecimal getImImportoContributoCassa() {
		return this.imImportoContributoCassa;
	}

	public void setImImportoContributoCassa(BigDecimal imImportoContributoCassa) {
		this.imImportoContributoCassa = imImportoContributoCassa;
	}

	public BigDecimal getNmNumeroSezione() {
		return this.nmNumeroSezione;
	}

	public void setNmNumeroSezione(BigDecimal nmNumeroSezione) {
		this.nmNumeroSezione = nmNumeroSezione;
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

	public BigDecimal getPcAlCassa() {
		return this.pcAlCassa;
	}

	public void setPcAlCassa(BigDecimal pcAlCassa) {
		this.pcAlCassa = pcAlCassa;
	}

	public BigDecimal getPcAliquotaIva() {
		return this.pcAliquotaIva;
	}

	public void setPcAliquotaIva(BigDecimal pcAliquotaIva) {
		this.pcAliquotaIva = pcAliquotaIva;
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

	public FatTDizTipoCassa getDizTipoCassa() {
		return this.dizTipoCassa;
	}

	public void setDizTipoCassa(FatTDizTipoCassa dizTipoCassa) {
		this.dizTipoCassa = dizTipoCassa;
	}

	public FatTDizNatura getDizNatura() {
		return this.dizNatura;
	}

	public void setDizNatura(FatTDizNatura dizNatura) {
		this.dizNatura = dizNatura;
	}

	public FatTDizRitenuta getDizRitenuta() {
		return this.dizRitenuta;
	}

	public void setDizRitenuta(FatTDizRitenuta dizRitenuta) {
		this.dizRitenuta = dizRitenuta;
	}

	public FatTDizEsigibilitaIva getDizEsigibilitaIva() {
		return this.dizEsigibilitaIva;
	}

	public void setDizEsigibilitaIva(FatTDizEsigibilitaIva dizEsigibilitaIva) {
		this.dizEsigibilitaIva = dizEsigibilitaIva;
	}

	public FatTFatturaStor getFatturaStor() {
		return this.fatturaStor;
	}

	public void setFatturaStor(FatTFatturaStor fatturaStor) {
		this.fatturaStor = fatturaStor;
	}

	public Serializable getPrimaryKey() {
		return this.idDatiCassaPrevStor;
	}

}