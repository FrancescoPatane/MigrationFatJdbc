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
 * The persistent class for the FAT_T_ESITO_FTP database table.
 * 
 */
@Entity
@Table(name="FAT_T_ESITO_FTP")
public class FatTEsitoFtp implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_ESITO_FTP_IDESITOFTP_GENERATOR", sequenceName="SEQ_ID_ESITO_FTP", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_ESITO_FTP_IDESITOFTP_GENERATOR")
	@Column(name="ID_ESITO_FTP")
	private Long idEsitoFtp;

	@Column(name="CD_ESITO")
	private String cdEsito;

	@Column(name="CD_IDENTIFICATIVO_NODO")
	private String cdIdentificativoNodo;

	@Column(name="CD_STATO")
	private String cdStato;

	@Column(name="DS_LOG_ERRORE_CONTROLLI_FILE")
	private String dsLogErroreControlliFile;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_ESITO")
	private Date dtDataOraEsito;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_RICEZIONE")
	private Date dtDataOraRicezione;

	@Column(name="FL_ATTUALE")
	private Boolean flAttuale;

	@Column(name="FL_ERRORE_CONTROLLI_FILE")
	private Boolean flErroreControlliFile;

	@Column(name="FL_ERRORE_STATO")
	private Boolean flErroreStato;

	@Column(name="FL_RIGENERATO")
	private Boolean flRigenerato;

	@Column(name="FL_VERSO_SDI")
	private Boolean flVersoSdi;

	@Column(name="NM_NOME_FILE_ESITO")
	private String nmNomeFileEsito;

	@Column(name="NM_NOME_SUPPORTO")
	private String nmNomeSupporto;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Column(name="CD_TIPO_ESITO")
	private String cdTipoEsito;
	
	@Column(name="ID_FILE_CIFRATO")
	private String idFileCifrato;

	@Column(name="ID_FILE_FIRMATO")
	private String idFileFirmato;

	@Column(name="ID_FILE_NON_FIRMATO")
	private String idFileNonFirmato;

	@Column(name="PG_VERSIONE_ESITO")
	private String pgVersioneEsito;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatAStatoEsitoFtp
	@OneToMany(mappedBy="esitoFtp")
	private List<FatAStatoEsitoFtp> listStatoEsitoFtp;

	//bi-directional many-to-one association to FatTSupportoFtp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_SUPPORTO_FTP")
	private FatTSupportoFtp supportoFtp;

	//bi-directional many-to-one association to FatTVerifFirmaEsitoFtp
	@OneToMany(mappedBy="esitoFtp")
	private List<FatTVerifFirmaEsitoFtp> listVerifFirmaEsitoFtp;

	public FatTEsitoFtp() {
	}

	public Long getIdEsitoFtp() {
		return this.idEsitoFtp;
	}

	public void setIdEsitoFtp(Long idEsitoFtp) {
		this.idEsitoFtp = idEsitoFtp;
	}

	public String getCdEsito() {
		return this.cdEsito;
	}

	public void setCdEsito(String cdEsito) {
		this.cdEsito = cdEsito;
	}

	public String getCdIdentificativoNodo() {
		return this.cdIdentificativoNodo;
	}

	public void setCdIdentificativoNodo(String cdIdentificativoNodo) {
		this.cdIdentificativoNodo = cdIdentificativoNodo;
	}

	public String getCdStato() {
		return this.cdStato;
	}

	public void setCdStato(String cdStato) {
		this.cdStato = cdStato;
	}

	public String getDsLogErroreControlliFile() {
		return this.dsLogErroreControlliFile;
	}

	public void setDsLogErroreControlliFile(String dsLogErroreControlliFile) {
		this.dsLogErroreControlliFile = dsLogErroreControlliFile;
	}

	public Date getDtDataOraEsito() {
		return this.dtDataOraEsito;
	}

	public void setDtDataOraEsito(Date dtDataOraEsito) {
		this.dtDataOraEsito = dtDataOraEsito;
	}

	public Date getDtDataOraRicezione() {
		return this.dtDataOraRicezione;
	}

	public void setDtDataOraRicezione(Date dtDataOraRicezione) {
		this.dtDataOraRicezione = dtDataOraRicezione;
	}

	public Boolean getFlAttuale() {
		return this.flAttuale;
	}

	public void setFlAttuale(Boolean flAttuale) {
		this.flAttuale = flAttuale;
	}

	public Boolean getFlErroreControlliFile() {
		return this.flErroreControlliFile;
	}

	public void setFlErroreControlliFile(Boolean flErroreControlliFile) {
		this.flErroreControlliFile = flErroreControlliFile;
	}

	public Boolean getFlErroreStato() {
		return this.flErroreStato;
	}

	public void setFlErroreStato(Boolean flErroreStato) {
		this.flErroreStato = flErroreStato;
	}

	public Boolean getFlRigenerato() {
		return this.flRigenerato;
	}

	public void setFlRigenerato(Boolean flRigenerato) {
		this.flRigenerato = flRigenerato;
	}

	public Boolean getFlVersoSdi() {
		return this.flVersoSdi;
	}

	public void setFlVersoSdi(Boolean flVersoSdi) {
		this.flVersoSdi = flVersoSdi;
	}

	public String getNmNomeFileEsito() {
		return this.nmNomeFileEsito;
	}

	public void setNmNomeFileEsito(String nmNomeFileEsito) {
		this.nmNomeFileEsito = nmNomeFileEsito;
	}

	public String getNmNomeSupporto() {
		return this.nmNomeSupporto;
	}

	public void setNmNomeSupporto(String nmNomeSupporto) {
		this.nmNomeSupporto = nmNomeSupporto;
	}

	public String getNmUtenteInserimento() {
		return this.nmUtenteInserimento;
	}

	public void setNmUtenteInserimento(String nmUtenteInserimento) {
		this.nmUtenteInserimento = nmUtenteInserimento;
	}

	public String getCdTipoEsito() {
		return cdTipoEsito;
	}

	public void setCdTipoEsito(String cdTipoEsito) {
		this.cdTipoEsito = cdTipoEsito;
	}
	
	public String getNmUtenteUltimaModifica() {
		return this.nmUtenteUltimaModifica;
	}

	public void setNmUtenteUltimaModifica(String nmUtenteUltimaModifica) {
		this.nmUtenteUltimaModifica = nmUtenteUltimaModifica;
	}



	public String getPgVersioneEsito() {
		return this.pgVersioneEsito;
	}

	public void setPgVersioneEsito(String pgVersioneEsito) {
		this.pgVersioneEsito = pgVersioneEsito;
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

	public List<FatAStatoEsitoFtp> getListStatoEsitoFtp() {
		return this.listStatoEsitoFtp;
	}

	public void setListStatoEsitoFtp(List<FatAStatoEsitoFtp> listStatoEsitoFtp) {
		this.listStatoEsitoFtp = listStatoEsitoFtp;
	}

	public FatAStatoEsitoFtp addFatAStatoEsitoFtp(FatAStatoEsitoFtp fatAStatoEsitoFtp) {
		getListStatoEsitoFtp().add(fatAStatoEsitoFtp);
		fatAStatoEsitoFtp.setEsitoFtp(this);

		return fatAStatoEsitoFtp;
	}

	public FatAStatoEsitoFtp removeFatAStatoEsitoFtp(FatAStatoEsitoFtp fatAStatoEsitoFtp) {
		getListStatoEsitoFtp().remove(fatAStatoEsitoFtp);
		fatAStatoEsitoFtp.setEsitoFtp(null);

		return fatAStatoEsitoFtp;
	}

	public FatTSupportoFtp getSupportoFtp() {
		return this.supportoFtp;
	}

	public void setSupportoFtp(FatTSupportoFtp supportoFtp) {
		this.supportoFtp = supportoFtp;
	}

	public List<FatTVerifFirmaEsitoFtp> getlistVerifFirmaEsitoFtp() {
		return this.listVerifFirmaEsitoFtp;
	}

	public void setlistVerifFirmaEsitoFtp(List<FatTVerifFirmaEsitoFtp> listVerifFirmaEsitoFtp) {
		this.listVerifFirmaEsitoFtp = listVerifFirmaEsitoFtp;
	}

	public FatTVerifFirmaEsitoFtp addFatTVerifFirmaEsitoFtp(FatTVerifFirmaEsitoFtp fatTVerifFirmaEsitoFtp) {
		getlistVerifFirmaEsitoFtp().add(fatTVerifFirmaEsitoFtp);
		fatTVerifFirmaEsitoFtp.setEsitoFtp(this);

		return fatTVerifFirmaEsitoFtp;
	}

	public FatTVerifFirmaEsitoFtp removeFatTVerifFirmaEsitoFtp(FatTVerifFirmaEsitoFtp fatTVerifFirmaEsitoFtp) {
		getlistVerifFirmaEsitoFtp().remove(fatTVerifFirmaEsitoFtp);
		fatTVerifFirmaEsitoFtp.setEsitoFtp(null);

		return fatTVerifFirmaEsitoFtp;
	}

	public Serializable getPrimaryKey() {
		return this.idEsitoFtp;
	}

	public String getIdFileCifrato() {
		return idFileCifrato;
	}

	public void setIdFileCifrato(String idFileCifrato) {
		this.idFileCifrato = idFileCifrato;
	}

	public String getIdFileFirmato() {
		return idFileFirmato;
	}

	public void setIdFileFirmato(String idFileFirmato) {
		this.idFileFirmato = idFileFirmato;
	}

	public String getIdFileNonFirmato() {
		return idFileNonFirmato;
	}

	public void setIdFileNonFirmato(String idFileNonFirmato) {
		this.idFileNonFirmato = idFileNonFirmato;
	}

}