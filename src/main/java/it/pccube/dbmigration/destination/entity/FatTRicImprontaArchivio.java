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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_RIC_IMPRONTA_ARCHIVIO database table.
 * 
 */
@Entity
@Table(name="FAT_T_RIC_IMPRONTA_ARCHIVIO")
public class FatTRicImprontaArchivio implements EntityInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_RIC_IMPRONTA_ARCHIVIO_IDRICIMPRONTAARCHIVIO_GENERATOR", sequenceName="SEQ_ID_RIC_IMPRONTA_ARCHIVIO", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_RIC_IMPRONTA_ARCHIVIO_IDRICIMPRONTAARCHIVIO_GENERATOR")
	@Column(name="ID_RIC_IMPRONTA_ARCHIVIO")
	private Long idRicImprontaArchivio;

	@Column(name="CD_CAP_SEDE_TITOL_CONT")
	private String cdCapSedeTitolCont;

	@Column(name="CD_CF_PIVA_INTERMED_TRASM")
	private String cdCfPivaIntermedTrasm;

	@Column(name="CD_CF_PIVA_SOGGETTO_TRASM")
	private String cdCfPivaSoggettoTrasm;

	@Column(name="CD_CF_PIVA_TITOLARE_CONT")
	private String cdCfPivaTitolareCont;

	@Column(name="CD_COD_ERR_RICHIESTA_NCS")
	private String cdCodErrRichiestaNcs;

	@Column(name="CD_CODICE_FORNITURA")
	private String cdCodiceFornitura;

	@Column(name="CD_FATTURAZIONE_ELE_TITOL_CONT")
	private String cdFatturazioneEleTitolCont;

	@Column(name="CD_NUM_CIVICO_SEDE_TITOL_CONT")
	private String cdNumCivicoSedeTitolCont;

	@Column(name="CD_PROTOCOLLO_DA_SOSTITUIRE")
	private String cdProtocolloDaSostituire;

	@Column(name="CD_RICHIESTA_NCS")
	private String cdRichiestaNcs;

	@Column(name="CD_SESSO_TITOLARE_CONT")
	private String cdSessoTitolareCont;

	@Column(name="DS_DESCR_ERR_RICHIESTA_NCS")
	private String dsDescrErrRichiestaNcs;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_IMPEGNO_TRASM")
	private Date dtDataImpegnoTrasm;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_NASC_TITOLARE_CONT")
	private Date dtDataNascTitolareCont;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_INVIO_RIC_NCS")
	private Date dtDataOraInvioRicNcs;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_RICEZIONE_XML_COMUNIC")
	private Date dtDataRicezioneXmlComunic;

	@Column(name="FL_ESITO_RICHIESTA_NCS")
	private Boolean flEsitoRichiestaNcs;

	@Column(name="ID_SEDIA_RICHIESTA")
	private Long idSediaRichiesta;

	@Column(name="NM_COGNOME_TITOLARE_CONT")
	private String nmCognomeTitolareCont;

	@Column(name="NM_COMUNESTATO_NASC_TITOL_CONT")
	private String nmComunestatoNascTitolCont;

	@Column(name="NM_COMUNESTATO_SEDE_TITOL_CONT")
	private String nmComunestatoSedeTitolCont;

	@Column(name="NM_DENOMINAZIONE_TITOLARE_CONT")
	private String nmDenominazioneTitolareCont;

	@Column(name="NM_INDIRIZZO_SEDE_TITOL_CONT")
	private String nmIndirizzoSedeTitolCont;

	@Column(name="NM_NOME_TITOLARE_CONT")
	private String nmNomeTitolareCont;

	@Column(name="NM_NOME_XML_COMUNICAZIONE")
	private String nmNomeXmlComunicazione;

	@Column(name="NM_PROVINCIA_NASC_TITOL_CONT")
	private String nmProvinciaNascTitolCont;

	@Column(name="NM_PROVINCIA_SEDE_TITOL_CONT")
	private String nmProvinciaSedeTitolCont;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Column(name="NR_ALBO_CAF_INTERMED_TRASM")
	private String nrAlboCafIntermedTrasm;

	@Column(name="NR_PERIODO_IMPOSTA")
	private Long nrPeriodoImposta;
	
	@Column(name="ID_XML_COMUNICAZIONE")
	private String idXmlComunicazione;

	@Column(name="ID_XML_RICHIESTA")
	private String idXmlRichiesta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTDizStatoRicImpronta
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_STATO_RICHIESTA")
	private FatTDizStatoRicImpronta dizStatoRicImpronta;

	//bi-directional many-to-one association to FatTDizTipoComImpronta
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_TIPO_COMUNICAZIONE")
	private FatTDizTipoComImpronta dizTipoComImpronta;

	//bi-directional many-to-one association to FatTDizImpegnoTrasmissione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_IMPEGNO_TRASM")
	private FatTDizImpegnoTrasmissione dizImpegnoTrasmissione;

	//bi-directional many-to-one association to FatTRicProtocolImpronta
	@OneToMany(mappedBy="ricImprontaArchivio")
	private List<FatTRicProtocolImpronta> listRicProtocolImpronta;

	public FatTRicImprontaArchivio() {
	}

	public Long getIdRicImprontaArchivio() {
		return this.idRicImprontaArchivio;
	}

	public void setIdRicImprontaArchivio(Long idRicImprontaArchivio) {
		this.idRicImprontaArchivio = idRicImprontaArchivio;
	}

	public String getCdCapSedeTitolCont() {
		return this.cdCapSedeTitolCont;
	}

	public void setCdCapSedeTitolCont(String cdCapSedeTitolCont) {
		this.cdCapSedeTitolCont = cdCapSedeTitolCont;
	}

	public String getCdCfPivaIntermedTrasm() {
		return this.cdCfPivaIntermedTrasm;
	}

	public void setCdCfPivaIntermedTrasm(String cdCfPivaIntermedTrasm) {
		this.cdCfPivaIntermedTrasm = cdCfPivaIntermedTrasm;
	}

	public String getCdCfPivaSoggettoTrasm() {
		return this.cdCfPivaSoggettoTrasm;
	}

	public void setCdCfPivaSoggettoTrasm(String cdCfPivaSoggettoTrasm) {
		this.cdCfPivaSoggettoTrasm = cdCfPivaSoggettoTrasm;
	}

	public String getCdCfPivaTitolareCont() {
		return this.cdCfPivaTitolareCont;
	}

	public void setCdCfPivaTitolareCont(String cdCfPivaTitolareCont) {
		this.cdCfPivaTitolareCont = cdCfPivaTitolareCont;
	}

	public String getCdCodErrRichiestaNcs() {
		return this.cdCodErrRichiestaNcs;
	}

	public void setCdCodErrRichiestaNcs(String cdCodErrRichiestaNcs) {
		this.cdCodErrRichiestaNcs = cdCodErrRichiestaNcs;
	}

	public String getCdCodiceFornitura() {
		return this.cdCodiceFornitura;
	}

	public void setCdCodiceFornitura(String cdCodiceFornitura) {
		this.cdCodiceFornitura = cdCodiceFornitura;
	}

	public String getCdFatturazioneEleTitolCont() {
		return this.cdFatturazioneEleTitolCont;
	}

	public void setCdFatturazioneEleTitolCont(String cdFatturazioneEleTitolCont) {
		this.cdFatturazioneEleTitolCont = cdFatturazioneEleTitolCont;
	}

	public String getCdNumCivicoSedeTitolCont() {
		return this.cdNumCivicoSedeTitolCont;
	}

	public void setCdNumCivicoSedeTitolCont(String cdNumCivicoSedeTitolCont) {
		this.cdNumCivicoSedeTitolCont = cdNumCivicoSedeTitolCont;
	}

	public String getCdProtocolloDaSostituire() {
		return this.cdProtocolloDaSostituire;
	}

	public void setCdProtocolloDaSostituire(String cdProtocolloDaSostituire) {
		this.cdProtocolloDaSostituire = cdProtocolloDaSostituire;
	}

	public String getCdRichiestaNcs() {
		return this.cdRichiestaNcs;
	}

	public void setCdRichiestaNcs(String cdRichiestaNcs) {
		this.cdRichiestaNcs = cdRichiestaNcs;
	}

	public String getCdSessoTitolareCont() {
		return this.cdSessoTitolareCont;
	}

	public void setCdSessoTitolareCont(String cdSessoTitolareCont) {
		this.cdSessoTitolareCont = cdSessoTitolareCont;
	}

	public String getDsDescrErrRichiestaNcs() {
		return this.dsDescrErrRichiestaNcs;
	}

	public void setDsDescrErrRichiestaNcs(String dsDescrErrRichiestaNcs) {
		this.dsDescrErrRichiestaNcs = dsDescrErrRichiestaNcs;
	}

	public Date getDtDataImpegnoTrasm() {
		return this.dtDataImpegnoTrasm;
	}

	public void setDtDataImpegnoTrasm(Date dtDataImpegnoTrasm) {
		this.dtDataImpegnoTrasm = dtDataImpegnoTrasm;
	}

	public Date getDtDataNascTitolareCont() {
		return this.dtDataNascTitolareCont;
	}

	public void setDtDataNascTitolareCont(Date dtDataNascTitolareCont) {
		this.dtDataNascTitolareCont = dtDataNascTitolareCont;
	}

	public Date getDtDataOraInvioRicNcs() {
		return this.dtDataOraInvioRicNcs;
	}

	public void setDtDataOraInvioRicNcs(Date dtDataOraInvioRicNcs) {
		this.dtDataOraInvioRicNcs = dtDataOraInvioRicNcs;
	}

	public Date getDtDataRicezioneXmlComunic() {
		return this.dtDataRicezioneXmlComunic;
	}

	public void setDtDataRicezioneXmlComunic(Date dtDataRicezioneXmlComunic) {
		this.dtDataRicezioneXmlComunic = dtDataRicezioneXmlComunic;
	}

	public Boolean getFlEsitoRichiestaNcs() {
		return this.flEsitoRichiestaNcs;
	}

	public void setFlEsitoRichiestaNcs(Boolean flEsitoRichiestaNcs) {
		this.flEsitoRichiestaNcs = flEsitoRichiestaNcs;
	}

	public Long getIdSediaRichiesta() {
		return this.idSediaRichiesta;
	}

	public void setIdSediaRichiesta(Long idSediaRichiesta) {
		this.idSediaRichiesta = idSediaRichiesta;
	}

	public String getNmCognomeTitolareCont() {
		return this.nmCognomeTitolareCont;
	}

	public void setNmCognomeTitolareCont(String nmCognomeTitolareCont) {
		this.nmCognomeTitolareCont = nmCognomeTitolareCont;
	}

	public String getNmComunestatoNascTitolCont() {
		return this.nmComunestatoNascTitolCont;
	}

	public void setNmComunestatoNascTitolCont(String nmComunestatoNascTitolCont) {
		this.nmComunestatoNascTitolCont = nmComunestatoNascTitolCont;
	}

	public String getNmComunestatoSedeTitolCont() {
		return this.nmComunestatoSedeTitolCont;
	}

	public void setNmComunestatoSedeTitolCont(String nmComunestatoSedeTitolCont) {
		this.nmComunestatoSedeTitolCont = nmComunestatoSedeTitolCont;
	}

	public String getNmDenominazioneTitolareCont() {
		return this.nmDenominazioneTitolareCont;
	}

	public void setNmDenominazioneTitolareCont(String nmDenominazioneTitolareCont) {
		this.nmDenominazioneTitolareCont = nmDenominazioneTitolareCont;
	}

	public String getNmIndirizzoSedeTitolCont() {
		return this.nmIndirizzoSedeTitolCont;
	}

	public void setNmIndirizzoSedeTitolCont(String nmIndirizzoSedeTitolCont) {
		this.nmIndirizzoSedeTitolCont = nmIndirizzoSedeTitolCont;
	}

	public String getNmNomeTitolareCont() {
		return this.nmNomeTitolareCont;
	}

	public void setNmNomeTitolareCont(String nmNomeTitolareCont) {
		this.nmNomeTitolareCont = nmNomeTitolareCont;
	}

	public String getNmNomeXmlComunicazione() {
		return this.nmNomeXmlComunicazione;
	}

	public void setNmNomeXmlComunicazione(String nmNomeXmlComunicazione) {
		this.nmNomeXmlComunicazione = nmNomeXmlComunicazione;
	}

	public String getNmProvinciaNascTitolCont() {
		return this.nmProvinciaNascTitolCont;
	}

	public void setNmProvinciaNascTitolCont(String nmProvinciaNascTitolCont) {
		this.nmProvinciaNascTitolCont = nmProvinciaNascTitolCont;
	}

	public String getNmProvinciaSedeTitolCont() {
		return this.nmProvinciaSedeTitolCont;
	}

	public void setNmProvinciaSedeTitolCont(String nmProvinciaSedeTitolCont) {
		this.nmProvinciaSedeTitolCont = nmProvinciaSedeTitolCont;
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

	public String getNrAlboCafIntermedTrasm() {
		return this.nrAlboCafIntermedTrasm;
	}

	public void setNrAlboCafIntermedTrasm(String nrAlboCafIntermedTrasm) {
		this.nrAlboCafIntermedTrasm = nrAlboCafIntermedTrasm;
	}

	public Long getNrPeriodoImposta() {
		return this.nrPeriodoImposta;
	}

	public void setNrPeriodoImposta(Long nrPeriodoImposta) {
		this.nrPeriodoImposta = nrPeriodoImposta;
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

	public FatTDizStatoRicImpronta getDizStatoRicImpronta() {
		return this.dizStatoRicImpronta;
	}

	public void setDizStatoRicImpronta(FatTDizStatoRicImpronta fatTDizStatoRicImpronta) {
		this.dizStatoRicImpronta = fatTDizStatoRicImpronta;
	}

	public FatTDizTipoComImpronta getDizTipoComImpronta() {
		return this.dizTipoComImpronta;
	}

	public void setDizTipoComImpronta(FatTDizTipoComImpronta fatTDizTipoComImpronta) {
		this.dizTipoComImpronta = fatTDizTipoComImpronta;
	}

	public FatTDizImpegnoTrasmissione getDizImpegnoTrasmissione() {
		return this.dizImpegnoTrasmissione;
	}

	public void setDizImpegnoTrasmissione(FatTDizImpegnoTrasmissione fatTDizImpegnoTrasmissione) {
		this.dizImpegnoTrasmissione = fatTDizImpegnoTrasmissione;
	}

	public List<FatTRicProtocolImpronta> getListRicProtocolImpronta() {
		return this.listRicProtocolImpronta;
	}

	public void setListRicProtocolImpronta(List<FatTRicProtocolImpronta> fatTRicProtocolImprontas) {
		this.listRicProtocolImpronta = fatTRicProtocolImprontas;
	}

	public FatTRicProtocolImpronta addFatTRicProtocolImpronta(FatTRicProtocolImpronta fatTRicProtocolImpronta) {
		getListRicProtocolImpronta().add(fatTRicProtocolImpronta);
		fatTRicProtocolImpronta.setRicImprontaArchivio(this);

		return fatTRicProtocolImpronta;
	}

	public FatTRicProtocolImpronta removeFatTRicProtocolImpronta(FatTRicProtocolImpronta fatTRicProtocolImpronta) {
		getListRicProtocolImpronta().remove(fatTRicProtocolImpronta);
		fatTRicProtocolImpronta.setRicImprontaArchivio(null);

		return fatTRicProtocolImpronta;
	}

	public Serializable getPrimaryKey() {
		return this.idRicImprontaArchivio;
	}

	public String getIdXmlComunicazione() {
		return idXmlComunicazione;
	}

	public void setIdXmlComunicazione(String idXmlComunicazione) {
		this.idXmlComunicazione = idXmlComunicazione;
	}

	public String getIdXmlRichiesta() {
		return idXmlRichiesta;
	}

	public void setIdXmlRichiesta(String idXmlRichiesta) {
		this.idXmlRichiesta = idXmlRichiesta;
	}

	
}