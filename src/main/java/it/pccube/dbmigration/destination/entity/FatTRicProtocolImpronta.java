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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_RIC_PROTOCOL_IMPRONTA database table.
 * 
 */
@Entity
@Table(name="FAT_T_RIC_PROTOCOL_IMPRONTA")
public class FatTRicProtocolImpronta implements EntityInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_RIC_PROTOCOL_IMPRONTA_IDRICPROTOCOLLOIMPRONTA_GENERATOR", sequenceName="SEQ_ID_RIC_PROTOCOLLO_IMPRONTA", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_RIC_PROTOCOL_IMPRONTA_IDRICPROTOCOLLOIMPRONTA_GENERATOR")
	@Column(name="ID_RIC_PROTOCOLLO_IMPRONTA")
	private Long idRicProtocolloImpronta;

	@Column(name="CD_COD_ERR_RICHIESTA_NCS")
	private String cdCodErrRichiestaNcs;

	@Column(name="DS_DESCR_ERR_RICHIESTA_NCS")
	private String dsDescrErrRichiestaNcs;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_INVIO_PROTOCOL_NCS")
	private Date dtDataOraInvioProtocolNcs;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_PROTOCOLLO_COMUNIC")
	private Date dtDataProtocolloComunic;

	@Column(name="FL_ATTUALE")
	private Boolean flAttuale;

	@Column(name="FL_ESITO_RICHIESTA_NCS")
	private Boolean flEsitoRichiestaNcs;

	@Column(name="ID_SEDIA_RICHIESTA")
	private Long idSediaRichiesta;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Column(name="NR_NUMERO_PROTOCOLLO_COMUNIC")
	private String nrNumeroProtocolloComunic;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTRicImprontaArchivio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_RIC_IMPRONTA_ARCHIVIO")
	private FatTRicImprontaArchivio ricImprontaArchivio;

	public FatTRicProtocolImpronta() {
	}

	public Long getIdRicProtocolloImpronta() {
		return this.idRicProtocolloImpronta;
	}

	public void setIdRicProtocolloImpronta(Long idRicProtocolloImpronta) {
		this.idRicProtocolloImpronta = idRicProtocolloImpronta;
	}

	public String getCdCodErrRichiestaNcs() {
		return this.cdCodErrRichiestaNcs;
	}

	public void setCdCodErrRichiestaNcs(String cdCodErrRichiestaNcs) {
		this.cdCodErrRichiestaNcs = cdCodErrRichiestaNcs;
	}

	public String getDsDescrErrRichiestaNcs() {
		return this.dsDescrErrRichiestaNcs;
	}

	public void setDsDescrErrRichiestaNcs(String dsDescrErrRichiestaNcs) {
		this.dsDescrErrRichiestaNcs = dsDescrErrRichiestaNcs;
	}

	public Date getDtDataOraInvioProtocolNcs() {
		return this.dtDataOraInvioProtocolNcs;
	}

	public void setDtDataOraInvioProtocolNcs(Date dtDataOraInvioProtocolNcs) {
		this.dtDataOraInvioProtocolNcs = dtDataOraInvioProtocolNcs;
	}

	public Date getDtDataProtocolloComunic() {
		return this.dtDataProtocolloComunic;
	}

	public void setDtDataProtocolloComunic(Date dtDataProtocolloComunic) {
		this.dtDataProtocolloComunic = dtDataProtocolloComunic;
	}

	public Boolean getFlAttuale() {
		return this.flAttuale;
	}

	public void setFlAttuale(Boolean flAttuale) {
		this.flAttuale = flAttuale;
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

	public String getNrNumeroProtocolloComunic() {
		return this.nrNumeroProtocolloComunic;
	}

	public void setNrNumeroProtocolloComunic(String nrNumeroProtocolloComunic) {
		this.nrNumeroProtocolloComunic = nrNumeroProtocolloComunic;
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

	public FatTRicImprontaArchivio getRicImprontaArchivio() {
		return this.ricImprontaArchivio;
	}

	public void setRicImprontaArchivio(FatTRicImprontaArchivio fatTRicImprontaArchivio) {
		this.ricImprontaArchivio = fatTRicImprontaArchivio;
	}

	public Serializable getPrimaryKey() {
		return this.idRicProtocolloImpronta;
	}

}