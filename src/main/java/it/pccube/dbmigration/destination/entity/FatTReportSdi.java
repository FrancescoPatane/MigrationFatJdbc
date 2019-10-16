package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_REPORT_SDI database table.
 * 
 */
@Entity
@Table(name="FAT_T_REPORT_SDI")
public class FatTReportSdi implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_REPORT_SDI_ID_GENERATOR", sequenceName="SEQ_ID_REPORT_SDI", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_REPORT_SDI_ID_GENERATOR")
	@Column(name="ID_REPORT")
	private Long idReport;

	@Column(name="CD_CF_PIVA_UTENTE")
	private String cdCfPivaUtente;

	@Column(name="CD_TIPO")
	private String cdTipo;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_PRELIEVO")
	private Date dtDataOraPrelievo;

	@Column(name="ID_FILE_REPORT")
	private String idFileReport;

	@Column(name="NM_IDENTIFICATIVO_NODO")
	private String nmIdentificativoNodo;

	@Column(name="NM_NOME_FILE")
	private String nmNomeFile;

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

	public FatTReportSdi() {
	}

	public Long getIdReport() {
		return this.idReport;
	}

	public void setIdReport(Long idReport) {
		this.idReport = idReport;
	}

	public String getCdCfPivaUtente() {
		return this.cdCfPivaUtente;
	}

	public void setCdCfPivaUtente(String cdCfPivaUtente) {
		this.cdCfPivaUtente = cdCfPivaUtente;
	}

	public String getCdTipo() {
		return this.cdTipo;
	}

	public void setCdTipo(String cdTipo) {
		this.cdTipo = cdTipo;
	}

	public Date getDtDataOraPrelievo() {
		return this.dtDataOraPrelievo;
	}

	public void setDtDataOraPrelievo(Date dtDataOraPrelievo) {
		this.dtDataOraPrelievo = dtDataOraPrelievo;
	}

	public String getIdFileReport() {
		return this.idFileReport;
	}

	public void setIdFileReport(String idFileReport) {
		this.idFileReport = idFileReport;
	}

	public String getNmIdentificativoNodo() {
		return this.nmIdentificativoNodo;
	}

	public void setNmIdentificativoNodo(String nmIdentificativoNodo) {
		this.nmIdentificativoNodo = nmIdentificativoNodo;
	}

	public String getNmNomeFile() {
		return this.nmNomeFile;
	}

	public void setNmNomeFile(String nmNomeFile) {
		this.nmNomeFile = nmNomeFile;
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

	public Serializable getPrimaryKey() {
		return this.idReport;
	}
}