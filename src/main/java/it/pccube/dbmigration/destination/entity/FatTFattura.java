package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
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
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


/**
 * The persistent class for the FAT_T_FATTURA database table.
 * 
 */
@Entity
@Table(name = "FAT_T_FATTURA")
public class FatTFattura implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FAT_T_FATTURA_IDFATTURA_GENERATOR", sequenceName = "SEQ_ID_FATTURA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAT_T_FATTURA_IDFATTURA_GENERATOR")
	@Column(name = "ID_FATTURA")
	private Long idFattura;

	@Column(name = "CD_BOLLO_VIRTUALE")
	
	private String cdBolloVirtuale;

	@Column(name = "CD_CAP_RESA")
	
	private String cdCapResa;

	@Column(name = "CD_COD_EORI_VETTORE")
	
	private String cdCodEoriVettore;

	@Column(name = "CD_CODICE_FISCALE_VETTORE")
	
	private String cdCodiceFiscaleVettore;

	@Column(name = "CD_CODICE_VETTORE")
	
	private String cdCodiceVettore;

	@Column(name = "CD_NORMA_DI_RIFERIMENTO")
	
	private String cdNormaDiRiferimento;

	@Column(name = "CD_NUM_LICENZA_GUIDA_VETTORE")
	
	private String cdNumLicenzaGuidaVettore;

	@Column(name = "CD_NUMERO")
	
	private String cdNumero;

	@Column(name = "CD_NUMERO_BOLLO")
	
	private String cdNumeroBollo;

	@Column(name = "CD_NUMERO_CIVICO_RESA")
	
	private String cdNumeroCivicoResa;

	@Column(name = "CD_NUMERO_FATTURA_PRINCIPALE")
	
	private String cdNumeroFatturaPrincipale;

	@Column(name = "CD_UNITA_MISURA_PESO")
	
	private String cdUnitaMisuraPeso;

	@Column(name = "DS_CAUSALE")
	
	private String dsCausale;

	@Column(name = "DS_CAUSALE_TRASPORTO")
	
	private String dsCausaleTrasporto;

	@Column(name = "DS_DESCRIZIONE")
	
	private String dsDescrizione;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_DATA")
	
	private Date dtData;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_DATA_FATTURA_PRINCIPALE")
	
	private Date dtDataFatturaPrincipale;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_DATA_IMMAT_VEICOLO")
	
	private Date dtDataImmatVeicolo;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_DATA_INIZIO_TRASPORTO")
	
	private Date dtDataInizioTrasporto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_DATA_ORA_CONSEGNA")
	
	private Date dtDataOraConsegna;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_DATA_ORA_RITIRO")
	
	private Date dtDataOraRitiro;

	@Column(name = "ID_COMUNE_RESA")
	private Long idComuneResa;

	@Column(name = "ID_NAZIONE_RESA")
	private Long idNazioneResa;

	@Column(name = "ID_PAESE_VETTORE")
	private Long idPaeseVettore;

	@Column(name = "ID_PROVINCIA_RESA")
	private Long idProvinciaResa;

	@Column(name = "ID_REGIONE_RESA")
	private Long idRegioneResa;

	@Column(name = "IM_ARROTONDAMENTO")
	
	private BigDecimal imArrotondamento;

	@Column(name = "IM_IMPORTO_BOLLO")
	
	private BigDecimal imImportoBollo;

	@Column(name = "IM_IMPORTO_RITENUTA")
	
	private BigDecimal imImportoRitenuta;

	@Column(name = "IM_IMPORTO_TOTALE_DOCUMENTO")
	
	private BigDecimal imImportoTotaleDocumento;

	@Column(name = "NM_COGNOME_VETTORE")
	
	private String nmCognomeVettore;

	@Column(name = "NM_COMUNE_RESA_EST")
	
	private String nmComuneResaEst;

	@Column(name = "NM_DENOMINAZIONE_VETTORE")
	
	private String nmDenominazioneVettore;

	@Column(name = "NM_INDIRIZZO_RESA")
	
	private String nmIndirizzoResa;

	@Column(name = "NM_MEZZO_TRASPORTO")
	
	private String nmMezzoTrasporto;

	@Column(name = "NM_NOME_VETTORE")
	
	private String nmNomeVettore;

	@Column(name = "NM_TITOLO_VETTORE")
	
	private String nmTitoloVettore;

	@Column(name = "NM_UTENTE_INSERIMENTO")
	
	private String nmUtenteInserimento;

	@Column(name = "NM_UTENTE_ULTIMA_MODIFICA")
	
	private String nmUtenteUltimaModifica;

	@Column(name = "PC_ALIQUOTA_RITENUTA")
	
	private BigDecimal pcAliquotaRitenuta;

	@Column(name = "PG_VERSIONE_LOTTO_FAT_RIFIUT")
	
	private BigDecimal pgVersioneLottoFatRifiut;

	@Column(name = "QT_NUMERO_COLLI")
	
	private BigDecimal qtNumeroColli;

	@Column(name = "QT_PESO_LORDO")
	
	private BigDecimal qtPesoLordo;

	@Column(name = "QT_PESO_NETTO")
	
	private BigDecimal qtPesoNetto;

	@Column(name = "QT_TOTALE_PERCORSO_VEICOLO")
	
	private String qtTotalePercorsoVeicolo;

	@Column(name = "ID_XML_EU_UPLOADED")
	
	private String idXmlEuUploaded;

	@Column(name = "ID_XML_EU_GENERATED")
	
	private String idXmlEuGenerated;

	@Column(name = "NM_XML_EU_UPLOADED_NAME")
	
	private String nmXmlEuUploadedName;

	@Column(name = "NM_XML_EU_GENERATED_NAME")
	
	private String nmXmlEuGeneratedName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TS_INSERIMENTO")
	
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TS_ULTIMA_MODIFICA")
	
	private Date tsUltimaModifica;

	// bi-directional many-to-one association to FatAFatturaInz
	@OneToMany(mappedBy = "fattura", orphanRemoval = true)
	private List<FatAFatturaInz> listFatturaInz;

	// bi-directional many-to-one association to FatAStatoLottoFattura
	@OneToMany(mappedBy = "fattura", orphanRemoval = true)
	private List<FatAStatoLottoFattura> listStatoLottoFattura;

	// bi-directional many-to-one association to FatTAllegato
	@OneToMany(mappedBy = "fattura", orphanRemoval = true)
	private List<FatTAllegato> listAllegato;

	// bi-directional many-to-one association to FatTCausaleFattura
	@OneToMany(mappedBy = "fattura", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatTCausaleFattura> listCausaleFattura;

	// bi-directional many-to-one association to FatTCompilazioneSezione
	@OneToMany(mappedBy = "fattura", fetch = FetchType.LAZY, orphanRemoval = true)
	private List<FatTCompilazioneSezione> listCompilazioneSezione;

	// bi-directional many-to-one association to FatTDatiCassaPrevidenz
	@OneToMany(mappedBy = "fattura", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatTDatiCassaPrevidenz> listDatiCassaPrevidenz;

	// bi-directional many-to-one association to FatTDatiDdt
	@OneToMany(mappedBy = "fattura", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatTDatiDdt> listDatiDdt;

	// bi-directional many-to-one association to FatTDatiPagamento
	@OneToMany(mappedBy = "fattura", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatTDatiPagamento> listDatiPagamento;

	// bi-directional many-to-one association to FatTDatiRiepilogo
	@OneToMany(mappedBy = "fattura", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatTDatiRiepilogo> listDatiRiepilogo;

	// bi-directional many-to-one association to FatTDatiRiferimento
	@OneToMany(mappedBy = "fattura", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatTDatiRiferimento> listDatiRiferimentoFattura;

	// bi-directional many-to-one association to FatTDatiRiferimento
	@OneToMany(mappedBy = "fatturaCollegata", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatTDatiRiferimento> listDatiRiferimentoFatturaCollegata;

	// bi-directional many-to-one association to FatTDatiSal
	@OneToMany(mappedBy = "fattura", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatTDatiSal> listDatiSal;

	// bi-directional many-to-one association to FatTDettaglioLinea
	@OneToMany(mappedBy = "fattura", fetch = FetchType.EAGER, orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	@OrderBy("pgNumeroLinea ASC")
	private List<FatTDettaglioLinea> listDettaglioLinea;

	// bi-directional many-to-one association to FatTExcelFattura
	@OneToMany(mappedBy = "fattura", orphanRemoval = true)
	private List<FatTExcelFattura> listExcelFattura;

	// bi-directional many-to-one association to FatTDizCausalePagamento
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DIZ_CAUSALE_PAGAMENTO")
	private FatTDizCausalePagamento dizCausalePagamento;

	// bi-directional many-to-one association to FatTDizDivisa
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DIVISA")
	private FatTDizDivisa dizDivisa;

	// bi-directional many-to-one association to FatTDizArt73
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DIZ_ART_73")
	private FatTDizArt73 dizArt73;

	// bi-directional many-to-one association to FatTDizTipoResa
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DIZ_TIPO_RESA")
	private FatTDizTipoResa dizTipoResa;

	// bi-directional many-to-one association to FatTDizTipoRitenuta
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DIZ_TIPO_RITENUTA")
	private FatTDizTipoRitenuta dizTipoRitenuta;

	// bi-directional many-to-one association to FatTDizTipoRitenuta
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DIZ_TIPO_DOCUMENTO")
	private FatTDizTipoDocumento dizTipoDocumento;

	// bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_FATTURA_PRINCIPALE")
	private FatTFattura fatturaPrincipale;

	// bi-directional many-to-one association to FatTFattura
	@OneToMany(mappedBy = "fatturaPrincipale")
	private List<FatTFattura> listFatturaPrincipale;

	// bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_FATTURA_RIFIUTATA")
	private FatTFattura fatturaRifiutata;

	// bi-directional many-to-one association to FatTFattura
	@OneToMany(mappedBy = "fatturaRifiutata")
	private List<FatTFattura> listFatturaRifiutata;

	// bi-directional many-to-one association to FatTLotto
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_LOTTO")
	private FatTLotto lotto;

	// bi-directional many-to-one association to FatTLotto
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_LOTTO_FAT_RIFIUTATA")
	private FatTLotto lottoFattRifiutata;

	// bi-directional many-to-one association to FatTFatturaStor
	@OneToMany(mappedBy = "fattura")
	private List<FatTFatturaStor> listFatturaStor;

	// bi-directional many-to-one association to FatTMail
	@OneToMany(mappedBy = "fattura", orphanRemoval = true)
	private List<FatTMail> listMail;

	// bi-directional many-to-one association to FatTNotifica
	@OneToMany(mappedBy = "fattura", orphanRemoval = true)
	private List<FatTNotifica> listNotifica;

	// bi-directional many-to-one association to FatTScontoMaggiorazione
	@OneToMany(mappedBy = "fattura", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatTScontoMaggiorazione> listScontoMaggiorazione;

	@Transient
	private List<FatTDatiRiferimento> datiOrdiniAcquistoList;
	@Transient
	private List<FatTDatiRiferimento> datiContrattoList;
	@Transient
	private List<FatTDatiRiferimento> datiConvenzioneList;
	@Transient
	private List<FatTDatiRiferimento> datiRicezioneList;

	public FatTFattura() {
	}

	public Long getIdFattura() {
		return this.idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
	}

	public String getCdBolloVirtuale() {
		return this.cdBolloVirtuale;
	}

	public void setCdBolloVirtuale(String cdBolloVirtuale) {
		this.cdBolloVirtuale = cdBolloVirtuale;
	}

	public String getCdCapResa() {
		return this.cdCapResa;
	}

	public void setCdCapResa(String cdCapResa) {
		this.cdCapResa = cdCapResa;
	}

	public String getCdCodEoriVettore() {
		return this.cdCodEoriVettore;
	}

	public void setCdCodEoriVettore(String cdCodEoriVettore) {
		this.cdCodEoriVettore = cdCodEoriVettore;
	}

	public String getCdCodiceFiscaleVettore() {
		return this.cdCodiceFiscaleVettore;
	}

	public void setCdCodiceFiscaleVettore(String cdCodiceFiscaleVettore) {
		this.cdCodiceFiscaleVettore = cdCodiceFiscaleVettore;
	}

	public String getCdCodiceVettore() {
		return this.cdCodiceVettore;
	}

	public void setCdCodiceVettore(String cdCodiceVettore) {
		this.cdCodiceVettore = cdCodiceVettore;
	}

	public String getCdNormaDiRiferimento() {
		return this.cdNormaDiRiferimento;
	}

	public void setCdNormaDiRiferimento(String cdNormaDiRiferimento) {
		this.cdNormaDiRiferimento = cdNormaDiRiferimento;
	}

	public String getCdNumLicenzaGuidaVettore() {
		return this.cdNumLicenzaGuidaVettore;
	}

	public void setCdNumLicenzaGuidaVettore(String cdNumLicenzaGuidaVettore) {
		this.cdNumLicenzaGuidaVettore = cdNumLicenzaGuidaVettore;
	}

	public String getCdNumero() {
		return this.cdNumero;
	}

	public void setCdNumero(String cdNumero) {
		this.cdNumero = cdNumero;
	}

	public String getCdNumeroBollo() {
		return this.cdNumeroBollo;
	}

	public void setCdNumeroBollo(String cdNumeroBollo) {
		this.cdNumeroBollo = cdNumeroBollo;
	}

	public String getCdNumeroCivicoResa() {
		return this.cdNumeroCivicoResa;
	}

	public void setCdNumeroCivicoResa(String cdNumeroCivicoResa) {
		this.cdNumeroCivicoResa = cdNumeroCivicoResa;
	}

	public String getCdNumeroFatturaPrincipale() {
		return this.cdNumeroFatturaPrincipale;
	}

	public void setCdNumeroFatturaPrincipale(String cdNumeroFatturaPrincipale) {
		this.cdNumeroFatturaPrincipale = cdNumeroFatturaPrincipale;
	}

	public String getCdUnitaMisuraPeso() {
		return this.cdUnitaMisuraPeso;
	}

	public void setCdUnitaMisuraPeso(String cdUnitaMisuraPeso) {
		this.cdUnitaMisuraPeso = cdUnitaMisuraPeso;
	}

	public String getDsCausale() {
		return this.dsCausale;
	}

	public void setDsCausale(String dsCausale) {
		this.dsCausale = dsCausale;
	}

	public String getDsCausaleTrasporto() {
		return this.dsCausaleTrasporto;
	}

	public void setDsCausaleTrasporto(String dsCausaleTrasporto) {
		this.dsCausaleTrasporto = dsCausaleTrasporto;
	}

	public String getDsDescrizione() {
		return this.dsDescrizione;
	}

	public void setDsDescrizione(String dsDescrizione) {
		this.dsDescrizione = dsDescrizione;
	}

	public Date getDtData() {
		return this.dtData;
	}

	public void setDtData(Date dtData) {
		this.dtData = dtData;
	}

	public Date getDtDataFatturaPrincipale() {
		return this.dtDataFatturaPrincipale;
	}

	public void setDtDataFatturaPrincipale(Date dtDataFatturaPrincipale) {
		this.dtDataFatturaPrincipale = dtDataFatturaPrincipale;
	}

	public Date getDtDataImmatVeicolo() {
		return this.dtDataImmatVeicolo;
	}

	public void setDtDataImmatVeicolo(Date dtDataImmatVeicolo) {
		this.dtDataImmatVeicolo = dtDataImmatVeicolo;
	}

	public Date getDtDataInizioTrasporto() {
		return this.dtDataInizioTrasporto;
	}

	public void setDtDataInizioTrasporto(Date dtDataInizioTrasporto) {
		this.dtDataInizioTrasporto = dtDataInizioTrasporto;
	}

	public Date getDtDataOraConsegna() {
		return this.dtDataOraConsegna;
	}

	public void setDtDataOraConsegna(Date dtDataOraConsegna) {
		this.dtDataOraConsegna = dtDataOraConsegna;
	}

	public Date getDtDataOraRitiro() {
		return this.dtDataOraRitiro;
	}

	public void setDtDataOraRitiro(Date dtDataOraRitiro) {
		this.dtDataOraRitiro = dtDataOraRitiro;
	}

	public Long getIdComuneResa() {
		return this.idComuneResa;
	}

	public void setIdComuneResa(Long idComuneResa) {
		this.idComuneResa = idComuneResa;
	}

	public Long getIdNazioneResa() {
		return this.idNazioneResa;
	}

	public void setIdNazioneResa(Long idNazioneResa) {
		this.idNazioneResa = idNazioneResa;
	}

	public Long getIdPaeseVettore() {
		return this.idPaeseVettore;
	}

	public void setIdPaeseVettore(Long idPaeseVettore) {
		this.idPaeseVettore = idPaeseVettore;
	}

	public Long getIdProvinciaResa() {
		return this.idProvinciaResa;
	}

	public void setIdProvinciaResa(Long idProvinciaResa) {
		this.idProvinciaResa = idProvinciaResa;
	}

	public Long getIdRegioneResa() {
		return this.idRegioneResa;
	}

	public void setIdRegioneResa(Long idRegioneResa) {
		this.idRegioneResa = idRegioneResa;
	}

	public BigDecimal getImArrotondamento() {
		return this.imArrotondamento;
	}

	public void setImArrotondamento(BigDecimal imArrotondamento) {
		this.imArrotondamento = imArrotondamento;
	}

	public BigDecimal getImImportoBollo() {
		return this.imImportoBollo;
	}

	public void setImImportoBollo(BigDecimal imImportoBollo) {
		this.imImportoBollo = imImportoBollo;
	}

	public BigDecimal getImImportoRitenuta() {
		return this.imImportoRitenuta;
	}

	public void setImImportoRitenuta(BigDecimal imImportoRitenuta) {
		this.imImportoRitenuta = imImportoRitenuta;
	}

	public BigDecimal getImImportoTotaleDocumento() {
		return this.imImportoTotaleDocumento;
	}

	public void setImImportoTotaleDocumento(BigDecimal imImportoTotaleDocumento) {
		this.imImportoTotaleDocumento = imImportoTotaleDocumento;
	}

	public String getNmCognomeVettore() {
		return this.nmCognomeVettore;
	}

	public void setNmCognomeVettore(String nmCognomeVettore) {
		this.nmCognomeVettore = nmCognomeVettore;
	}

	public String getNmComuneResaEst() {
		return this.nmComuneResaEst;
	}

	public void setNmComuneResaEst(String nmComuneResaEst) {
		this.nmComuneResaEst = nmComuneResaEst;
	}

	public String getNmDenominazioneVettore() {
		return this.nmDenominazioneVettore;
	}

	public void setNmDenominazioneVettore(String nmDenominazioneVettore) {
		this.nmDenominazioneVettore = nmDenominazioneVettore;
	}

	public String getNmIndirizzoResa() {
		return this.nmIndirizzoResa;
	}

	public void setNmIndirizzoResa(String nmIndirizzoResa) {
		this.nmIndirizzoResa = nmIndirizzoResa;
	}

	public String getNmMezzoTrasporto() {
		return this.nmMezzoTrasporto;
	}

	public void setNmMezzoTrasporto(String nmMezzoTrasporto) {
		this.nmMezzoTrasporto = nmMezzoTrasporto;
	}

	public String getNmNomeVettore() {
		return this.nmNomeVettore;
	}

	public void setNmNomeVettore(String nmNomeVettore) {
		this.nmNomeVettore = nmNomeVettore;
	}

	public String getNmTitoloVettore() {
		return this.nmTitoloVettore;
	}

	public void setNmTitoloVettore(String nmTitoloVettore) {
		this.nmTitoloVettore = nmTitoloVettore;
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

	public BigDecimal getPcAliquotaRitenuta() {
		return this.pcAliquotaRitenuta;
	}

	public void setPcAliquotaRitenuta(BigDecimal pcAliquotaRitenuta) {
		this.pcAliquotaRitenuta = pcAliquotaRitenuta;
	}

	public BigDecimal getPgVersioneLottoFatRifiut() {
		return this.pgVersioneLottoFatRifiut;
	}

	public void setPgVersioneLottoFatRifiut(BigDecimal pgVersioneLottoFatRifiut) {
		this.pgVersioneLottoFatRifiut = pgVersioneLottoFatRifiut;
	}

	public BigDecimal getQtNumeroColli() {
		return this.qtNumeroColli;
	}

	public void setQtNumeroColli(BigDecimal qtNumeroColli) {
		this.qtNumeroColli = qtNumeroColli;
	}

	public BigDecimal getQtPesoLordo() {
		return this.qtPesoLordo;
	}

	public void setQtPesoLordo(BigDecimal qtPesoLordo) {
		this.qtPesoLordo = qtPesoLordo;
	}

	public BigDecimal getQtPesoNetto() {
		return this.qtPesoNetto;
	}

	public void setQtPesoNetto(BigDecimal qtPesoNetto) {
		this.qtPesoNetto = qtPesoNetto;
	}

	public String getQtTotalePercorsoVeicolo() {
		return this.qtTotalePercorsoVeicolo;
	}

	public void setQtTotalePercorsoVeicolo(String qtTotalePercorsoVeicolo) {
		this.qtTotalePercorsoVeicolo = qtTotalePercorsoVeicolo;
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

	public List<FatAFatturaInz> getListFatturaInz() {
		return this.listFatturaInz;
	}

	public void setListFatturaInz(List<FatAFatturaInz> fatAFatturaInzs) {
		this.listFatturaInz = fatAFatturaInzs;
	}

	public FatAFatturaInz addFatAFatturaInz(FatAFatturaInz fatAFatturaInz) {
		getListFatturaInz().add(fatAFatturaInz);
		fatAFatturaInz.setFattura(this);

		return fatAFatturaInz;
	}

	public FatAFatturaInz removeFatAFatturaInz(FatAFatturaInz fatAFatturaInz) {
		getListFatturaInz().remove(fatAFatturaInz);
		fatAFatturaInz.setFattura(null);

		return fatAFatturaInz;
	}

	public List<FatAStatoLottoFattura> getListStatoLottoFattura() {
		return this.listStatoLottoFattura;
	}

	public void setListStatoLottoFattura(List<FatAStatoLottoFattura> fatAStatoLottoFatturas) {
		this.listStatoLottoFattura = fatAStatoLottoFatturas;
	}

	public FatAStatoLottoFattura addFatAStatoLottoFattura(FatAStatoLottoFattura fatAStatoLottoFattura) {
		getListStatoLottoFattura().add(fatAStatoLottoFattura);
		fatAStatoLottoFattura.setFattura(this);

		return fatAStatoLottoFattura;
	}

	public FatAStatoLottoFattura removeFatAStatoLottoFattura(FatAStatoLottoFattura fatAStatoLottoFattura) {
		getListStatoLottoFattura().remove(fatAStatoLottoFattura);
		fatAStatoLottoFattura.setFattura(null);

		return fatAStatoLottoFattura;
	}

	public List<FatTAllegato> getListAllegato() {
		return this.listAllegato;
	}

	public void setListAllegato(List<FatTAllegato> listAllegato) {
		this.listAllegato = listAllegato;
	}

	public FatTAllegato addFatTAllegato(FatTAllegato fatTAllegato) {
		getListAllegato().add(fatTAllegato);
		fatTAllegato.setFattura(this);

		return fatTAllegato;
	}

	public FatTAllegato removeFatTAllegato(FatTAllegato fatTAllegato) {
		getListAllegato().remove(fatTAllegato);
		fatTAllegato.setFattura(null);

		return fatTAllegato;
	}

	public List<FatTCausaleFattura> getListCausaleFattura() {
		return this.listCausaleFattura;
	}

	public void setListCausaleFattura(List<FatTCausaleFattura> listCausaleFattura) {
		this.listCausaleFattura = listCausaleFattura;
	}

	public FatTCausaleFattura addFatTCausaleFattura(FatTCausaleFattura fatTCausaleFattura) {
		getListCausaleFattura().add(fatTCausaleFattura);
		fatTCausaleFattura.setFattura(this);

		return fatTCausaleFattura;
	}

	public FatTCausaleFattura removeFatTCausaleFattura(FatTCausaleFattura fatTCausaleFattura) {
		getListCausaleFattura().remove(fatTCausaleFattura);
		fatTCausaleFattura.setFattura(null);

		return fatTCausaleFattura;
	}

	public List<FatTCompilazioneSezione> getListCompilazioneSezione() {
		return this.listCompilazioneSezione;
	}

	public void setListCompilazioneSezione(List<FatTCompilazioneSezione> listCompilazioneSezione) {
		this.listCompilazioneSezione = listCompilazioneSezione;
	}

	public FatTCompilazioneSezione addFatTCompilazioneSezione(FatTCompilazioneSezione fatTCompilazioneSezione) {
		getListCompilazioneSezione().add(fatTCompilazioneSezione);
		fatTCompilazioneSezione.setFattura(this);

		return fatTCompilazioneSezione;
	}

	public FatTCompilazioneSezione removeFatTCompilazioneSezione(FatTCompilazioneSezione fatTCompilazioneSezione) {
		getListCompilazioneSezione().remove(fatTCompilazioneSezione);
		fatTCompilazioneSezione.setFattura(null);

		return fatTCompilazioneSezione;
	}

	public List<FatTDatiCassaPrevidenz> getListDatiCassaPrevidenz() {
		return this.listDatiCassaPrevidenz;
	}

	public void setListDatiCassaPrevidenz(List<FatTDatiCassaPrevidenz> fatTDatiCassaPrevidenzs) {
		this.listDatiCassaPrevidenz = fatTDatiCassaPrevidenzs;
	}

	public FatTDatiCassaPrevidenz addFatTDatiCassaPrevidenz(FatTDatiCassaPrevidenz fatTDatiCassaPrevidenz) {
		getListDatiCassaPrevidenz().add(fatTDatiCassaPrevidenz);
		fatTDatiCassaPrevidenz.setFattura(this);

		return fatTDatiCassaPrevidenz;
	}

	public FatTDatiCassaPrevidenz removeFatTDatiCassaPrevidenz(FatTDatiCassaPrevidenz fatTDatiCassaPrevidenz) {
		getListDatiCassaPrevidenz().remove(fatTDatiCassaPrevidenz);
		fatTDatiCassaPrevidenz.setFattura(null);

		return fatTDatiCassaPrevidenz;
	}

	public List<FatTDatiDdt> getListDatiDdt() {
		return this.listDatiDdt;
	}

	public void setListDatiDdt(List<FatTDatiDdt> fatTDatiDdts) {
		this.listDatiDdt = fatTDatiDdts;
	}

	public FatTDatiDdt addFatTDatiDdt(FatTDatiDdt fatTDatiDdt) {
		getListDatiDdt().add(fatTDatiDdt);
		fatTDatiDdt.setFattura(this);

		return fatTDatiDdt;
	}

	public FatTDatiDdt removeFatTDatiDdt(FatTDatiDdt fatTDatiDdt) {
		getListDatiDdt().remove(fatTDatiDdt);
		fatTDatiDdt.setFattura(null);

		return fatTDatiDdt;
	}

	public List<FatTDatiPagamento> getListDatiPagamento() {
		return this.listDatiPagamento;
	}

	public void setListDatiPagamento(List<FatTDatiPagamento> listDatiPagamento) {
		this.listDatiPagamento = listDatiPagamento;
	}

	public FatTDatiPagamento addFatTDatiPagamento(FatTDatiPagamento fatTDatiPagamento) {
		getListDatiPagamento().add(fatTDatiPagamento);
		fatTDatiPagamento.setFattura(this);

		return fatTDatiPagamento;
	}

	public FatTDatiPagamento removeFatTDatiPagamento(FatTDatiPagamento fatTDatiPagamento) {
		getListDatiPagamento().remove(fatTDatiPagamento);
		fatTDatiPagamento.setFattura(null);

		return fatTDatiPagamento;
	}

	public List<FatTDatiRiepilogo> getListDatiRiepilogo() {
		return this.listDatiRiepilogo;
	}

	public void setDatiRiepilogos(List<FatTDatiRiepilogo> fatTDatiRiepilogos) {
		this.listDatiRiepilogo = fatTDatiRiepilogos;
	}

	public FatTDatiRiepilogo addFatTDatiRiepilogo(FatTDatiRiepilogo fatTDatiRiepilogo) {
		getListDatiRiepilogo().add(fatTDatiRiepilogo);
		fatTDatiRiepilogo.setFattura(this);

		return fatTDatiRiepilogo;
	}

	public FatTDatiRiepilogo removeFatTDatiRiepilogo(FatTDatiRiepilogo fatTDatiRiepilogo) {
		getListDatiRiepilogo().remove(fatTDatiRiepilogo);
		fatTDatiRiepilogo.setFattura(null);

		return fatTDatiRiepilogo;
	}

	/**
	 * @return the dizTipoDocumento
	 */
	public FatTDizTipoDocumento getDizTipoDocumento() {
		return dizTipoDocumento;
	}

	/**
	 * @param dizTipoDocumento
	 *            the dizTipoDocumento to set
	 */
	public void setDizTipoDocumento(FatTDizTipoDocumento dizTipoDocumento) {
		this.dizTipoDocumento = dizTipoDocumento;
	}

	/**
	 * @param listDatiRiepilogo
	 *            the listDatiRiepilogo to set
	 */
	public void setListDatiRiepilogo(List<FatTDatiRiepilogo> listDatiRiepilogo) {
		this.listDatiRiepilogo = listDatiRiepilogo;
	}

	public List<FatTDatiRiferimento> getListDatiRiferimentoFattura() {
		return listDatiRiferimentoFattura;
	}

	public void setListDatiRiferimentoFattura(List<FatTDatiRiferimento> listDatiRiferimentoFattura) {
		this.listDatiRiferimentoFattura = listDatiRiferimentoFattura;
	}

	public FatTDatiRiferimento addFatTDatiRiferimentos1(FatTDatiRiferimento fatTDatiRiferimentos1) {
		getListDatiRiferimentoFattura().add(fatTDatiRiferimentos1);
		fatTDatiRiferimentos1.setFattura(this);

		return fatTDatiRiferimentos1;
	}

	public FatTDatiRiferimento removeFatTDatiRiferimentos1(FatTDatiRiferimento fatTDatiRiferimentos1) {
		getListDatiRiferimentoFattura().remove(fatTDatiRiferimentos1);
		fatTDatiRiferimentos1.setFattura(null);

		return fatTDatiRiferimentos1;
	}

	public List<FatTDatiRiferimento> getListDatiRiferimentoFatturaCollegata() {
		return listDatiRiferimentoFatturaCollegata;
	}

	public void setListDatiRiferimentoFatturaCollegata(List<FatTDatiRiferimento> listDatiRiferimentoFatturaCollegata) {
		this.listDatiRiferimentoFatturaCollegata = listDatiRiferimentoFatturaCollegata;
	}

	public FatTDatiRiferimento addFatTDatiRiferimentos2(FatTDatiRiferimento fatTDatiRiferimentos2) {
		getListDatiRiferimentoFatturaCollegata().add(fatTDatiRiferimentos2);
		fatTDatiRiferimentos2.setFatturaCollegata(this);

		return fatTDatiRiferimentos2;
	}

	public FatTDatiRiferimento removeFatTDatiRiferimentos2(FatTDatiRiferimento fatTDatiRiferimentos2) {
		getListDatiRiferimentoFatturaCollegata().remove(fatTDatiRiferimentos2);
		fatTDatiRiferimentos2.setFatturaCollegata(null);

		return fatTDatiRiferimentos2;
	}

	public List<FatTDatiSal> getListDatiSal() {
		return this.listDatiSal;
	}

	public void setListDatiSal(List<FatTDatiSal> listDatiSal) {
		this.listDatiSal = listDatiSal;
	}

	public FatTDatiSal addFatTDatiSal(FatTDatiSal fatTDatiSal) {
		getListDatiSal().add(fatTDatiSal);
		fatTDatiSal.setFattura(this);

		return fatTDatiSal;
	}

	public FatTDatiSal removeFatTDatiSal(FatTDatiSal fatTDatiSal) {
		getListDatiSal().remove(fatTDatiSal);
		fatTDatiSal.setFattura(null);

		return fatTDatiSal;
	}

	public List<FatTDettaglioLinea> getListDettaglioLinea() {
		return this.listDettaglioLinea;
	}

	public void setListDettaglioLinea(List<FatTDettaglioLinea> fatTDettaglioLineas) {
		this.listDettaglioLinea = fatTDettaglioLineas;
	}

	public FatTDettaglioLinea addFatTDettaglioLinea(FatTDettaglioLinea fatTDettaglioLinea) {
		getListDettaglioLinea().add(fatTDettaglioLinea);
		fatTDettaglioLinea.setFattura(this);

		return fatTDettaglioLinea;
	}

	public FatTDettaglioLinea removeFatTDettaglioLinea(FatTDettaglioLinea fatTDettaglioLinea) {
		getListDettaglioLinea().remove(fatTDettaglioLinea);
		fatTDettaglioLinea.setFattura(null);

		return fatTDettaglioLinea;
	}

	public List<FatTExcelFattura> getListExcelFattura() {
		return this.listExcelFattura;
	}

	public void setListExcelFattura(List<FatTExcelFattura> fatTExcelFatturas) {
		this.listExcelFattura = fatTExcelFatturas;
	}

	public FatTExcelFattura addFatTExcelFattura(FatTExcelFattura fatTExcelFattura) {
		getListExcelFattura().add(fatTExcelFattura);
		fatTExcelFattura.setFattura(this);

		return fatTExcelFattura;
	}

	public FatTExcelFattura removeFatTExcelFattura(FatTExcelFattura fatTExcelFattura) {
		getListExcelFattura().remove(fatTExcelFattura);
		fatTExcelFattura.setFattura(null);

		return fatTExcelFattura;
	}

	public FatTDizCausalePagamento getDizCausalePagamento() {
		return this.dizCausalePagamento;
	}

	public void setDizCausalePagamento(FatTDizCausalePagamento fatTDizCausalePagamento) {
		this.dizCausalePagamento = fatTDizCausalePagamento;
	}

	public FatTDizDivisa getDizDivisa() {
		return this.dizDivisa;
	}

	public void setDizDivisa(FatTDizDivisa fatTDizDivisa) {
		this.dizDivisa = fatTDizDivisa;
	}

	public FatTDizArt73 getDizArt73() {
		return this.dizArt73;
	}

	public void setDizArt73(FatTDizArt73 fatTDizArt73) {
		this.dizArt73 = fatTDizArt73;
	}

	public FatTDizTipoResa getDizTipoResa() {
		return this.dizTipoResa;
	}

	public void setDizTipoResa(FatTDizTipoResa fatTDizTipoResa) {
		this.dizTipoResa = fatTDizTipoResa;
	}

	public FatTDizTipoRitenuta getDizTipoRitenuta() {
		return this.dizTipoRitenuta;
	}

	public void setDizTipoRitenuta(FatTDizTipoRitenuta fatTDizTipoRitenuta) {
		this.dizTipoRitenuta = fatTDizTipoRitenuta;
	}

	public FatTFattura getFatturaPrincipale() {
		return fatturaPrincipale;
	}

	public void setFatturaPrincipale(FatTFattura fatturaPrincipale) {
		this.fatturaPrincipale = fatturaPrincipale;
	}

	public List<FatTFattura> getListFatturaPrincipale() {
		return listFatturaPrincipale;
	}

	public void setListFatturaPrincipale(List<FatTFattura> listFatturaPrincipale) {
		this.listFatturaPrincipale = listFatturaPrincipale;
	}

	public FatTFattura addFatTFatturas1(FatTFattura fatTFatturas1) {
		getListFatturaPrincipale().add(fatTFatturas1);
		fatTFatturas1.setFatturaPrincipale(this);

		return fatTFatturas1;
	}

	public FatTFattura removeFatTFatturas1(FatTFattura fatTFatturas1) {
		getListFatturaPrincipale().remove(fatTFatturas1);
		fatTFatturas1.setFatturaPrincipale(null);

		return fatTFatturas1;
	}

	public FatTFattura getFatturaRifiutata() {
		return fatturaRifiutata;
	}

	public void setFatturaRifiutata(FatTFattura fatturaRifiutata) {
		this.fatturaRifiutata = fatturaRifiutata;
	}

	public List<FatTFattura> getListFatturaRifiutata() {
		return listFatturaRifiutata;
	}

	public void setListFatturaRifiutata(List<FatTFattura> listFatturaRifiutata) {
		this.listFatturaRifiutata = listFatturaRifiutata;
	}

	public FatTFattura addFatTFatturas2(FatTFattura fatTFatturas2) {
		getListFatturaRifiutata().add(fatTFatturas2);
		fatTFatturas2.setFatturaRifiutata(this);

		return fatTFatturas2;
	}

	public FatTFattura removeFatTFatturas2(FatTFattura fatTFatturas2) {
		getListFatturaRifiutata().remove(fatTFatturas2);
		fatTFatturas2.setFatturaRifiutata(null);

		return fatTFatturas2;
	}

	public FatTLotto getLotto() {
		return this.lotto;
	}

	public void setLotto(FatTLotto lotto) {
		this.lotto = lotto;
	}

	public FatTLotto getLottoFattRifiutata() {
		return this.lottoFattRifiutata;
	}

	public void setLottoFattRifiutata(FatTLotto lottoFattRifiutata) {
		this.lottoFattRifiutata = lottoFattRifiutata;
	}

	public List<FatTFatturaStor> getListFatturaStor() {
		return this.listFatturaStor;
	}

	public void setListFatturaStor(List<FatTFatturaStor> listFatturaStor) {
		this.listFatturaStor = listFatturaStor;
	}

	public FatTFatturaStor addFatTFatturaStor(FatTFatturaStor fatTFatturaStor) {
		getListFatturaStor().add(fatTFatturaStor);
		fatTFatturaStor.setFattura(this);

		return fatTFatturaStor;
	}

	public FatTFatturaStor removeFatTFatturaStor(FatTFatturaStor fatTFatturaStor) {
		getListFatturaStor().remove(fatTFatturaStor);
		fatTFatturaStor.setFattura(null);

		return fatTFatturaStor;
	}

	public List<FatTMail> getListMail() {
		return this.listMail;
	}

	public void setListMail(List<FatTMail> fatTMails) {
		this.listMail = fatTMails;
	}

	public FatTMail addFatTMail(FatTMail fatTMail) {
		getListMail().add(fatTMail);
		fatTMail.setFattura(this);

		return fatTMail;
	}

	public FatTMail removeFatTMail(FatTMail fatTMail) {
		getListMail().remove(fatTMail);
		fatTMail.setFattura(null);

		return fatTMail;
	}

	public List<FatTNotifica> getListNotifica() {
		return this.listNotifica;
	}

	public void setListNotifica(List<FatTNotifica> fatTNotificas) {
		this.listNotifica = fatTNotificas;
	}

	public FatTNotifica addFatTNotifica(FatTNotifica fatTNotifica) {
		getListNotifica().add(fatTNotifica);
		fatTNotifica.setFattura(this);

		return fatTNotifica;
	}

	public FatTNotifica removeFatTNotifica(FatTNotifica fatTNotifica) {
		getListNotifica().remove(fatTNotifica);
		fatTNotifica.setFattura(null);

		return fatTNotifica;
	}

	public List<FatTScontoMaggiorazione> getListScontoMaggiorazione() {
		return this.listScontoMaggiorazione;
	}

	public void setListScontoMaggiorazione(List<FatTScontoMaggiorazione> fatTScontoMaggioraziones) {
		this.listScontoMaggiorazione = fatTScontoMaggioraziones;
	}

	public FatTScontoMaggiorazione addFatTScontoMaggiorazione(FatTScontoMaggiorazione fatTScontoMaggiorazione) {
		getListScontoMaggiorazione().add(fatTScontoMaggiorazione);
		fatTScontoMaggiorazione.setFattura(this);

		return fatTScontoMaggiorazione;
	}

	public FatTScontoMaggiorazione removeFatTScontoMaggiorazione(FatTScontoMaggiorazione fatTScontoMaggiorazione) {
		getListScontoMaggiorazione().remove(fatTScontoMaggiorazione);
		fatTScontoMaggiorazione.setFattura(null);

		return fatTScontoMaggiorazione;
	}

	public String getNmXmlEuUploadedName() {
		return nmXmlEuUploadedName;
	}

	public void setNmXmlEuUploadedName(String nmXmlEuUploadedName) {
		this.nmXmlEuUploadedName = nmXmlEuUploadedName;
	}

	public String getNmXmlEuGeneratedName() {
		return nmXmlEuGeneratedName;
	}

	public void setNmXmlEuGeneratedName(String nmXmlEuGeneratedName) {
		this.nmXmlEuGeneratedName = nmXmlEuGeneratedName;
	}

	public List<FatTDatiRiferimento> getDatiOrdiniAcquistoList() {
		return datiOrdiniAcquistoList;
	}

	public void setDatiOrdiniAcquistoList(List<FatTDatiRiferimento> datiOrdiniAcquistoList) {
		this.datiOrdiniAcquistoList = datiOrdiniAcquistoList;
	}

	public List<FatTDatiRiferimento> getDatiContrattoList() {
		return datiContrattoList;
	}

	public void setDatiContrattoList(List<FatTDatiRiferimento> datiContrattoList) {
		this.datiContrattoList = datiContrattoList;
	}

	public List<FatTDatiRiferimento> getDatiConvenzioneList() {
		return datiConvenzioneList;
	}

	public void setDatiConvenzioneList(List<FatTDatiRiferimento> datiConvenzioneList) {
		this.datiConvenzioneList = datiConvenzioneList;
	}

	public List<FatTDatiRiferimento> getDatiRicezioneList() {
		return datiRicezioneList;
	}

	public void setDatiRicezioneList(List<FatTDatiRiferimento> datiRicezioneList) {
		this.datiRicezioneList = datiRicezioneList;
	}
	
	
	
	public String getIdXmlEuUploaded() {
		return idXmlEuUploaded;
	}

	public void setIdXmlEuUploaded(String idXmlEuUploaded) {
		this.idXmlEuUploaded = idXmlEuUploaded;
	}


	public String getIdXmlEuGenerated() {
		return idXmlEuGenerated;
	}

	public void setIdXmlEuGenerated(String idXmlEuGenerated) {
		this.idXmlEuGenerated = idXmlEuGenerated;
	}

	
	public Serializable getPrimaryKey() {
		return this.idFattura;
	}

}