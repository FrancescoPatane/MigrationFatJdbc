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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_FATTURA_STOR database table.
 * 
 */
@Entity
@Table(name="FAT_T_FATTURA_STOR")
public class FatTFatturaStor implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_FATTURA_STOR_IDFATTURASTOR_GENERATOR",sequenceName="SEQ_ID_FATTURA_STO",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_FATTURA_STOR_IDFATTURASTOR_GENERATOR")
	@Column(name="ID_FATTURA_STOR")
	private Long idFatturaStor;

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

//	@Column(name="ID_FATTURA")
//	private Long idFattura;

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

	@Column(name = "PG_VERS_LOTTO_FAT_RIFIUTATA")
	
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

	//bi-directional many-to-one association to FatAFatturaInzStor
	@OneToMany(mappedBy="fatturaStor")
	private List<FatAFatturaInzStor> listFatturaInzStor;

	//bi-directional many-to-one association to FatTAllegatoStor
	@OneToMany(mappedBy="fatturaStor")
	private List<FatTAllegatoStor> listAllegatoStor;

	//bi-directional many-to-one association to FatTCausaleFatturaStor
	@OneToMany(mappedBy="fatturaStor")
	private List<FatTCausaleFatturaStor> listCausaleFatturaStor;

	//bi-directional many-to-one association to FatTCompSezioneStor
	@OneToMany(mappedBy="fatturaStor")
	private List<FatTCompSezioneStor> listCompSezioneStor;

	//bi-directional many-to-one association to FatTDatiCassaPrevStor
	@OneToMany(mappedBy="fatturaStor")
	private List<FatTDatiCassaPrevStor> listDatiCassaPrevStor;

	//bi-directional many-to-one association to FatTDatiDdtStor
	@OneToMany(mappedBy="fatturaStor")
	private List<FatTDatiDdtStor> listDatiDdtStor;

	//bi-directional many-to-one association to FatTDatiPagamentoStor
	@OneToMany(mappedBy="fatturaStor")
	private List<FatTDatiPagamentoStor> listDatiPagamentoStor;

	//bi-directional many-to-one association to FatTDatiRiepilogoStor
	@OneToMany(mappedBy="fatturaStor")
	private List<FatTDatiRiepilogoStor> listDatiRiepilogoStor;

	//bi-directional many-to-one association to FatTDatiRiferimentoStor
	@OneToMany(mappedBy="fatturaStor")
	private List<FatTDatiRiferimentoStor> listDatiRiferimentoStor;

	//bi-directional many-to-one association to FatTDatiSalStor
	@OneToMany(mappedBy="fatturaStor")
	private List<FatTDatiSalStor> listDatiSalStor;

	//bi-directional many-to-one association to FatTDettaglioLineaStor
	@OneToMany(mappedBy="fatturaStor")
	private List<FatTDettaglioLineaStor> listDettaglioLineaStor;
	
	//bi-directional many-to-one association to FatTScontoMagStor
	@OneToMany(mappedBy="fatturaStor")
	private List<FatTScontoMagStor> listScontoMagStor;

	//bi-directional many-to-one association to FatTDizCausalePagamento
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_CAUSALE_PAGAMENTO")
	private FatTDizCausalePagamento dizCausalePagamento;

	//bi-directional many-to-one association to FatTDizTipoResa
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_TIPO_RESA")
	private FatTDizTipoResa dizTipoResa;

	//bi-directional many-to-one association to FatTDizTipoRitenuta
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_TIPO_RITENUTA")
	private FatTDizTipoRitenuta dizTipoRitenuta;

	//bi-directional many-to-one association to FatTDizDivisa
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIVISA")
	private FatTDizDivisa dizDivisa;

	//bi-directional many-to-one association to FatTDizArt73
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_ART_73")
	private FatTDizArt73 dizArt73;

	//bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FATTURA_RIFIUTATA")
	private FatTFattura fatturaRifiutata;

	//bi-directional many-to-one association to FatTLotto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_LOTTO_FAT_RIFIUTATA")
	private FatTLotto lottoFatturaRifiutata;

	//bi-directional many-to-one association to FatTLottoStor
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="PG_VERSIONE_LOTTO")
	
	private FatTLottoStor lottoStor;
	
	// bi-directional many-to-one association to FatTDizTipoRitenuta
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DIZ_TIPO_DOCUMENTO")
	private FatTDizTipoDocumento dizTipoDocumento;

	// bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_FATTURA")
	private FatTFattura fattura;
	
	// bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_FATTURA_PRINCIPALE")
	private FatTFattura fatturaPrincipale;

	// bi-directional many-to-one association to FatTLotto
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_LOTTO")
	private FatTLotto lotto;
	

	public FatTFatturaStor() {
	}

	public Long getIdFatturaStor() {
		return this.idFatturaStor;
	}

	public void setIdFatturaStor(Long idFatturaStor) {
		this.idFatturaStor = idFatturaStor;
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

//	public Long getIdFattura() {
//		return idFattura;
//	}
//
//	public void setIdFattura(Long idFattura) {
//		this.idFattura = idFattura;
//	}

	public FatTDizTipoDocumento getDizTipoDocumento() {
		return dizTipoDocumento;
	}

	public void setDizTipoDocumento(FatTDizTipoDocumento dizTipoDocumento) {
		this.dizTipoDocumento = dizTipoDocumento;
	}

	public FatTFattura getFatturaPrincipale() {
		return fatturaPrincipale;
	}

	public void setFatturaPrincipale(FatTFattura fatturaPrincipale) {
		this.fatturaPrincipale = fatturaPrincipale;
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

	public List<FatAFatturaInzStor> getListFatturaInzStor() {
		return this.listFatturaInzStor;
	}

	public void setListFatturaInzStor(List<FatAFatturaInzStor> fatAFatturaInzStors) {
		this.listFatturaInzStor = fatAFatturaInzStors;
	}

	public FatAFatturaInzStor addFatAFatturaInzStor(FatAFatturaInzStor fatAFatturaInzStor) {
		getListFatturaInzStor().add(fatAFatturaInzStor);
		fatAFatturaInzStor.setFatturaStor(this);

		return fatAFatturaInzStor;
	}

	public FatAFatturaInzStor removeFatAFatturaInzStor(FatAFatturaInzStor fatAFatturaInzStor) {
		getListFatturaInzStor().remove(fatAFatturaInzStor);
		fatAFatturaInzStor.setFatturaStor(null);

		return fatAFatturaInzStor;
	}

	public List<FatTAllegatoStor> getListAllegatoStor() {
		return this.listAllegatoStor;
	}

	public void setListAllegatoStor(List<FatTAllegatoStor> fatTAllegatoStors) {
		this.listAllegatoStor = fatTAllegatoStors;
	}

	public FatTAllegatoStor addFatTAllegatoStor(FatTAllegatoStor fatTAllegatoStor) {
		getListAllegatoStor().add(fatTAllegatoStor);
		fatTAllegatoStor.setFatturaStor(this);

		return fatTAllegatoStor;
	}

	public FatTAllegatoStor removeFatTAllegatoStor(FatTAllegatoStor fatTAllegatoStor) {
		getListAllegatoStor().remove(fatTAllegatoStor);
		fatTAllegatoStor.setFatturaStor(null);

		return fatTAllegatoStor;
	}

	public List<FatTCausaleFatturaStor> getListCausaleFatturaStor() {
		return this.listCausaleFatturaStor;
	}

	public void setListCausaleFatturaStor(List<FatTCausaleFatturaStor> fatTCausaleFatturaStors) {
		this.listCausaleFatturaStor = fatTCausaleFatturaStors;
	}

	public FatTCausaleFatturaStor addFatTCausaleFatturaStor(FatTCausaleFatturaStor fatTCausaleFatturaStor) {
		getListCausaleFatturaStor().add(fatTCausaleFatturaStor);
		fatTCausaleFatturaStor.setFatturaStor(this);

		return fatTCausaleFatturaStor;
	}

	public FatTCausaleFatturaStor removeFatTCausaleFatturaStor(FatTCausaleFatturaStor fatTCausaleFatturaStor) {
		getListCausaleFatturaStor().remove(fatTCausaleFatturaStor);
		fatTCausaleFatturaStor.setFatturaStor(null);

		return fatTCausaleFatturaStor;
	}

	public List<FatTCompSezioneStor> getListCompSezioneStor() {
		return this.listCompSezioneStor;
	}

	public void setListCompSezioneStor(List<FatTCompSezioneStor> fatTCompSezioneStors) {
		this.listCompSezioneStor = fatTCompSezioneStors;
	}

	public FatTCompSezioneStor addFatTCompSezioneStor(FatTCompSezioneStor fatTCompSezioneStor) {
		getListCompSezioneStor().add(fatTCompSezioneStor);
		fatTCompSezioneStor.setFatturaStor(this);

		return fatTCompSezioneStor;
	}

	public FatTCompSezioneStor removeFatTCompSezioneStor(FatTCompSezioneStor fatTCompSezioneStor) {
		getListCompSezioneStor().remove(fatTCompSezioneStor);
		fatTCompSezioneStor.setFatturaStor(null);

		return fatTCompSezioneStor;
	}

	public List<FatTDatiCassaPrevStor> getListDatiCassaPrevStor() {
		return this.listDatiCassaPrevStor;
	}

	public void setListDatiCassaPrevStor(List<FatTDatiCassaPrevStor> fatTDatiCassaPrevStors) {
		this.listDatiCassaPrevStor = fatTDatiCassaPrevStors;
	}

	public FatTDatiCassaPrevStor addFatTDatiCassaPrevStor(FatTDatiCassaPrevStor fatTDatiCassaPrevStor) {
		getListDatiCassaPrevStor().add(fatTDatiCassaPrevStor);
		fatTDatiCassaPrevStor.setFatturaStor(this);

		return fatTDatiCassaPrevStor;
	}

	public FatTDatiCassaPrevStor removeFatTDatiCassaPrevStor(FatTDatiCassaPrevStor fatTDatiCassaPrevStor) {
		getListDatiCassaPrevStor().remove(fatTDatiCassaPrevStor);
		fatTDatiCassaPrevStor.setFatturaStor(null);

		return fatTDatiCassaPrevStor;
	}

	public List<FatTDatiDdtStor> getListDatiDdtStor() {
		return this.listDatiDdtStor;
	}

	public void setListDatiDdtStor(List<FatTDatiDdtStor> fatTDatiDdtStors) {
		this.listDatiDdtStor = fatTDatiDdtStors;
	}

	public FatTDatiDdtStor addFatTDatiDdtStor(FatTDatiDdtStor fatTDatiDdtStor) {
		getListDatiDdtStor().add(fatTDatiDdtStor);
		fatTDatiDdtStor.setFatturaStor(this);

		return fatTDatiDdtStor;
	}

	public FatTDatiDdtStor removeFatTDatiDdtStor(FatTDatiDdtStor fatTDatiDdtStor) {
		getListDatiDdtStor().remove(fatTDatiDdtStor);
		fatTDatiDdtStor.setFatturaStor(null);

		return fatTDatiDdtStor;
	}

	public List<FatTDatiPagamentoStor> getListDatiPagamentoStor() {
		return this.listDatiPagamentoStor;
	}

	public void setListDatiPagamentoStor(List<FatTDatiPagamentoStor> fatTDatiPagamentoStors) {
		this.listDatiPagamentoStor = fatTDatiPagamentoStors;
	}

	public FatTDatiPagamentoStor addFatTDatiPagamentoStor(FatTDatiPagamentoStor fatTDatiPagamentoStor) {
		getListDatiPagamentoStor().add(fatTDatiPagamentoStor);
		fatTDatiPagamentoStor.setFatturaStor(this);

		return fatTDatiPagamentoStor;
	}

	public FatTDatiPagamentoStor removeFatTDatiPagamentoStor(FatTDatiPagamentoStor fatTDatiPagamentoStor) {
		getListDatiPagamentoStor().remove(fatTDatiPagamentoStor);
		fatTDatiPagamentoStor.setFatturaStor(null);

		return fatTDatiPagamentoStor;
	}

	public List<FatTDatiRiepilogoStor> getListDatiRiepilogoStor() {
		return this.listDatiRiepilogoStor;
	}

	public void setListDatiRiepilogoStor(List<FatTDatiRiepilogoStor> fatTDatiRiepilogoStors) {
		this.listDatiRiepilogoStor = fatTDatiRiepilogoStors;
	}

	public FatTDatiRiepilogoStor addFatTDatiRiepilogoStor(FatTDatiRiepilogoStor fatTDatiRiepilogoStor) {
		getListDatiRiepilogoStor().add(fatTDatiRiepilogoStor);
		fatTDatiRiepilogoStor.setFatturaStor(this);

		return fatTDatiRiepilogoStor;
	}

	public FatTDatiRiepilogoStor removeFatTDatiRiepilogoStor(FatTDatiRiepilogoStor fatTDatiRiepilogoStor) {
		getListDatiRiepilogoStor().remove(fatTDatiRiepilogoStor);
		fatTDatiRiepilogoStor.setFatturaStor(null);

		return fatTDatiRiepilogoStor;
	}

	public List<FatTDatiRiferimentoStor> getListDatiRiferimentoStor() {
		return this.listDatiRiferimentoStor;
	}

	public void setListDatiRiferimentoStor(List<FatTDatiRiferimentoStor> fatTDatiRiferimentoStors) {
		this.listDatiRiferimentoStor = fatTDatiRiferimentoStors;
	}

	public FatTDatiRiferimentoStor addFatTDatiRiferimentoStor(FatTDatiRiferimentoStor fatTDatiRiferimentoStor) {
		getListDatiRiferimentoStor().add(fatTDatiRiferimentoStor);
		fatTDatiRiferimentoStor.setFatturaStor(this);

		return fatTDatiRiferimentoStor;
	}

	public FatTDatiRiferimentoStor removeFatTDatiRiferimentoStor(FatTDatiRiferimentoStor fatTDatiRiferimentoStor) {
		getListDatiRiferimentoStor().remove(fatTDatiRiferimentoStor);
		fatTDatiRiferimentoStor.setFatturaStor(null);

		return fatTDatiRiferimentoStor;
	}

	public List<FatTDatiSalStor> getListDatiSalStor() {
		return this.listDatiSalStor;
	}

	public void setListDatiSalStor(List<FatTDatiSalStor> fatTDatiSalStors) {
		this.listDatiSalStor = fatTDatiSalStors;
	}

	public FatTDatiSalStor addFatTDatiSalStor(FatTDatiSalStor fatTDatiSalStor) {
		getListDatiSalStor().add(fatTDatiSalStor);
		fatTDatiSalStor.setFatturaStor(this);

		return fatTDatiSalStor;
	}

	public FatTDatiSalStor removeFatTDatiSalStor(FatTDatiSalStor fatTDatiSalStor) {
		getListDatiSalStor().remove(fatTDatiSalStor);
		fatTDatiSalStor.setFatturaStor(null);

		return fatTDatiSalStor;
	}

	public List<FatTDettaglioLineaStor> getListDettaglioLineaStor() {
		return this.listDettaglioLineaStor;
	}

	public void setListDettaglioLineaStor(List<FatTDettaglioLineaStor> fatTDettaglioLineaStors) {
		this.listDettaglioLineaStor = fatTDettaglioLineaStors;
	}

	public FatTDettaglioLineaStor addFatTDettaglioLineaStor(FatTDettaglioLineaStor fatTDettaglioLineaStor) {
		getListDettaglioLineaStor().add(fatTDettaglioLineaStor);
		fatTDettaglioLineaStor.setFatturaStor(this);

		return fatTDettaglioLineaStor;
	}

	public FatTDettaglioLineaStor removeFatTDettaglioLineaStor(FatTDettaglioLineaStor fatTDettaglioLineaStor) {
		getListDettaglioLineaStor().remove(fatTDettaglioLineaStor);
		fatTDettaglioLineaStor.setFatturaStor(null);

		return fatTDettaglioLineaStor;
	}

	public FatTDizCausalePagamento getDizCausalePagamento() {
		return this.dizCausalePagamento;
	}

	public void setDizCausalePagamento(FatTDizCausalePagamento fatTDizCausalePagamento) {
		this.dizCausalePagamento = fatTDizCausalePagamento;
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

	public FatTFattura getFattura() {
		return fattura;
	}

	public void setFattura(FatTFattura fattura) {
		this.fattura = fattura;
	}

	public FatTFattura getFatturaRifiutata() {
		return this.fatturaRifiutata;
	}

	public void setFatturaRifiutata(FatTFattura fattura) {
		this.fatturaRifiutata = fattura;
	}

	public FatTLotto getLotto() {
		return this.lotto;
	}

	public void setLotto(FatTLotto lotto) {
		this.lotto = lotto;
	}

	public FatTLotto getLottoFatturaRifiutata() {
		return lottoFatturaRifiutata;
	}

	public void setLottoFatturaRifiutata(FatTLotto lottoFatturaRifiutata) {
		this.lottoFatturaRifiutata = lottoFatturaRifiutata;
	}

	public FatTLottoStor getLottoStor() {
		return this.lottoStor;
	}

	public void setLottoStor(FatTLottoStor fatTLottoStor) {
		this.lottoStor = fatTLottoStor;
	}

	public List<FatTScontoMagStor> getListScontoMagStor() {
		return this.listScontoMagStor;
	}

	public void setListScontoMagStor(List<FatTScontoMagStor> fatTScontoMagStors) {
		this.listScontoMagStor = fatTScontoMagStors;
	}

	public FatTScontoMagStor addFatTScontoMagStor(FatTScontoMagStor fatTScontoMagStor) {
		getListScontoMagStor().add(fatTScontoMagStor);
		fatTScontoMagStor.setFatturaStor(this);

		return fatTScontoMagStor;
	}

	public FatTScontoMagStor removeFatTScontoMagStor(FatTScontoMagStor fatTScontoMagStor) {
		getListScontoMagStor().remove(fatTScontoMagStor);
		fatTScontoMagStor.setFatturaStor(null);

		return fatTScontoMagStor;
	}

	public BigDecimal getPgVersioneLottoFatRifiut() {
		return pgVersioneLottoFatRifiut;
	}

	public void setPgVersioneLottoFatRifiut(BigDecimal pgVersioneLottoFatRifiut) {
		this.pgVersioneLottoFatRifiut = pgVersioneLottoFatRifiut;
	}

	public Serializable getPrimaryKey() {
		return this.idFatturaStor;
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

}