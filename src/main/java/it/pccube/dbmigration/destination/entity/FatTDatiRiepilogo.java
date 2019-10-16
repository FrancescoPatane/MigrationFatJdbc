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
 * The persistent class for the FAT_T_DATI_RIEPILOGO database table.
 * 
 */
@Entity
@Table(name="FAT_T_DATI_RIEPILOGO")
public class FatTDatiRiepilogo implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_DATI_RIEPILOGO_IDDATIRIEPILOGO_GENERATOR",sequenceName="SEQ_ID_DATI_RIEPILOGO",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_DATI_RIEPILOGO_IDDATIRIEPILOGO_GENERATOR")
	@Column(name="ID_DATI_RIEPILOGO")
	private Long idDatiRiepilogo;

	@Column(name="DS_RIFERIMENTO_NORMATIVO")
	private String dsRiferimentoNormativo;

	@Column(name="IM_ARROTONDAMENTO")
	private BigDecimal imArrotondamento;

	@Column(name="IM_IMPONIBILE_IMPORTO")
	private BigDecimal imImponibileImporto;

	@Column(name="IM_SPESE_ACCESSORIE")
	private BigDecimal imSpeseAccessorie;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Column(name="PC_ALIQUOTA_IVA")
	private BigDecimal pcAliquotaIva;

	@Column(name="PC_IMPOSTA")
	private BigDecimal pcImposta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTDizEsigibilitaIva
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_ESIGIBILITA_IVA")
	private FatTDizEsigibilitaIva dizEsigibilitaIva;

	//bi-directional many-to-one association to FatTDizNatura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_NATURA")
	private FatTDizNatura dizNatura;

	//bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ID_FATTURA")
	private FatTFattura fattura;

	public FatTDatiRiepilogo() {
	}

	public Long getIdDatiRiepilogo() {
		return this.idDatiRiepilogo;
	}

	public void setIdDatiRiepilogo(Long idDatiRiepilogo) {
		this.idDatiRiepilogo = idDatiRiepilogo;
	}

	public String getDsRiferimentoNormativo() {
		return this.dsRiferimentoNormativo;
	}

	public void setDsRiferimentoNormativo(String dsRiferimentoNormativo) {
		this.dsRiferimentoNormativo = dsRiferimentoNormativo;
	}

	public BigDecimal getImArrotondamento() {
		return this.imArrotondamento;
	}

	public void setImArrotondamento(BigDecimal imArrotondamento) {
		this.imArrotondamento = imArrotondamento;
	}

	public BigDecimal getImImponibileImporto() {
		return this.imImponibileImporto;
	}

	public void setImImponibileImporto(BigDecimal imImponibileImporto) {
		this.imImponibileImporto = imImponibileImporto;
	}

	public BigDecimal getImSpeseAccessorie() {
		return this.imSpeseAccessorie;
	}

	public void setImSpeseAccessorie(BigDecimal imSpeseAccessorie) {
		this.imSpeseAccessorie = imSpeseAccessorie;
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

	public BigDecimal getPcAliquotaIva() {
		return this.pcAliquotaIva;
	}

	public void setPcAliquotaIva(BigDecimal pcAliquotaIva) {
		this.pcAliquotaIva = pcAliquotaIva;
	}

	public BigDecimal getPcImposta() {
		return this.pcImposta;
	}

	public void setPcImposta(BigDecimal pcImposta) {
		this.pcImposta = pcImposta;
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

	public FatTDizEsigibilitaIva getDizEsigibilitaIva() {
		return this.dizEsigibilitaIva;
	}

	public void setDizEsigibilitaIva(FatTDizEsigibilitaIva dizEsigibilitaIva) {
		this.dizEsigibilitaIva = dizEsigibilitaIva;
	}

	public FatTDizNatura getDizNatura() {
		return this.dizNatura;
	}

	public void setDizNatura(FatTDizNatura dizNatura) {
		this.dizNatura = dizNatura;
	}

	public FatTFattura getFattura() {
		return this.fattura;
	}

	public void setFattura(FatTFattura fattura) {
		this.fattura = fattura;
	}

	public Serializable getPrimaryKey() {
		return this.idDatiRiepilogo;
	}

}