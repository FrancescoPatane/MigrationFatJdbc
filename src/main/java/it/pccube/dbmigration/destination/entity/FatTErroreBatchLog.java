package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



/**
 * The persistent class for the FAT_T_ERRORE_BATCH_LOG database table.
 * 
 */
@Entity
@Table(name="FAT_T_ERRORE_BATCH_LOG")
@NamedQuery(name="FatTErroreBatchLog.findAll", query="SELECT f FROM FatTErroreBatchLog f")
public class FatTErroreBatchLog implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(sequenceName="SEQ_ID_LOG_ERRORE_BATCH_DB", name="FAT_T_ERRORE_BATCH_LOG_IDLOGERROREBATCHDB_GENERATOR", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_ERRORE_BATCH_LOG_IDLOGERROREBATCHDB_GENERATOR")
	@Column(name="ID_LOG_ERRORE_BATCH_DB")
	private long idLogErroreBatchDb;

	@Column(name="NM_CODICE_ERRORE")
	private String nmCodiceErrore;

	@Column(name="NM_PACKAGE")
	private String nmPackage;

	@Column(name="NM_PROCEDURA")
	private String nmProcedura;

	@Column(name="TS_DATA")
	private Timestamp tsData;

	@Column(name="TX_DESCRIZIONE_ERRORE")
	private String txDescrizioneErrore;

	@Column(name="TX_NOTE")
	private String txNote;

	public FatTErroreBatchLog() {
	}

	public long getIdLogErroreBatchDb() {
		return this.idLogErroreBatchDb;
	}

	public void setIdLogErroreBatchDb(long idLogErroreBatchDb) {
		this.idLogErroreBatchDb = idLogErroreBatchDb;
	}

	public String getNmCodiceErrore() {
		return this.nmCodiceErrore;
	}

	public void setNmCodiceErrore(String nmCodiceErrore) {
		this.nmCodiceErrore = nmCodiceErrore;
	}

	public String getNmPackage() {
		return this.nmPackage;
	}

	public void setNmPackage(String nmPackage) {
		this.nmPackage = nmPackage;
	}

	public String getNmProcedura() {
		return this.nmProcedura;
	}

	public void setNmProcedura(String nmProcedura) {
		this.nmProcedura = nmProcedura;
	}

	public Timestamp getTsData() {
		return this.tsData;
	}

	public void setTsData(Timestamp tsData) {
		this.tsData = tsData;
	}

	public String getTxDescrizioneErrore() {
		return this.txDescrizioneErrore;
	}

	public void setTxDescrizioneErrore(String txDescrizioneErrore) {
		this.txDescrizioneErrore = txDescrizioneErrore;
	}

	public String getTxNote() {
		return this.txNote;
	}

	public void setTxNote(String txNote) {
		this.txNote = txNote;
	}

	public Serializable getPrimaryKey() {
		return this.idLogErroreBatchDb;
	}

}