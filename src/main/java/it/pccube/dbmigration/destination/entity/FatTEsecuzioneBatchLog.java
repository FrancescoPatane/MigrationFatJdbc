package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import javax.persistence.*;


import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the FAT_T_ESECUZIONE_BATCH_LOG database table.
 * 
 */
@Entity
@Table(name="FAT_T_ESECUZIONE_BATCH_LOG")
@NamedQuery(name="FatTEsecuzioneBatchLog.findAll", query="SELECT f FROM FatTEsecuzioneBatchLog f")
public class FatTEsecuzioneBatchLog implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(sequenceName="SEQ_ID_LOG_ESECUZIONE_BATCH_DB", name="FAT_T_ESECUZIONE_BATCH_LOG_IDLOGESECUZIONEBATCHDB_GENERATOR", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_ESECUZIONE_BATCH_LOG_IDLOGESECUZIONEBATCHDB_GENERATOR")
	@Column(name="ID_LOG_ESECUZIONE_BATCH_DB")
	private long idLogEsecuzioneBatchDb;

	@Column(name="CN_NUM_ELEMENTI_COMPLESSIVI")
	private BigDecimal cnNumElementiComplessivi;

	@Column(name="CN_NUM_ELEMENTI_ELABORATI")
	private BigDecimal cnNumElementiElaborati;

	@Column(name="DT_DATA_FINE_ESECUZIONE")
	private Timestamp dtDataFineEsecuzione;

	@Column(name="DT_DATA_INIZIO_ESECUZIONE")
	private Timestamp dtDataInizioEsecuzione;

	@Column(name="FG_ERRORE_ESECUZIONE")
	private String fgErroreEsecuzione;

	@Column(name="NM_PACKAGE")
	private String nmPackage;

	@Column(name="NM_PROCEDURA")
	private String nmProcedura;

	public FatTEsecuzioneBatchLog() {
	}

	public long getIdLogEsecuzioneBatchDb() {
		return this.idLogEsecuzioneBatchDb;
	}

	public void setIdLogEsecuzioneBatchDb(long idLogEsecuzioneBatchDb) {
		this.idLogEsecuzioneBatchDb = idLogEsecuzioneBatchDb;
	}

	public BigDecimal getCnNumElementiComplessivi() {
		return this.cnNumElementiComplessivi;
	}

	public void setCnNumElementiComplessivi(BigDecimal cnNumElementiComplessivi) {
		this.cnNumElementiComplessivi = cnNumElementiComplessivi;
	}

	public BigDecimal getCnNumElementiElaborati() {
		return this.cnNumElementiElaborati;
	}

	public void setCnNumElementiElaborati(BigDecimal cnNumElementiElaborati) {
		this.cnNumElementiElaborati = cnNumElementiElaborati;
	}

	public Timestamp getDtDataFineEsecuzione() {
		return this.dtDataFineEsecuzione;
	}

	public void setDtDataFineEsecuzione(Timestamp dtDataFineEsecuzione) {
		this.dtDataFineEsecuzione = dtDataFineEsecuzione;
	}

	public Timestamp getDtDataInizioEsecuzione() {
		return this.dtDataInizioEsecuzione;
	}

	public void setDtDataInizioEsecuzione(Timestamp dtDataInizioEsecuzione) {
		this.dtDataInizioEsecuzione = dtDataInizioEsecuzione;
	}

	public String getFgErroreEsecuzione() {
		return this.fgErroreEsecuzione;
	}

	public void setFgErroreEsecuzione(String fgErroreEsecuzione) {
		this.fgErroreEsecuzione = fgErroreEsecuzione;
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

	public Serializable getPrimaryKey() {
		return this.idLogEsecuzioneBatchDb;
	}

}