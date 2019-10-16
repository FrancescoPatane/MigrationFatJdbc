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
 * The persistent class for the FAT_T_DIZ_SHEET_EXCEL database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_SHEET_EXCEL")
@NamedQuery(name="FatTDizSheetExcel.findAll", query="SELECT f FROM FatTDizSheetExcel f")
public class FatTDizSheetExcel implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_DIZ_SHEET_EXCEL_IDDIZSHEETEXCEL_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_DIZ_SHEET_EXCEL_IDDIZSHEETEXCEL_GENERATOR")
	@Column(name="ID_DIZ_SHEET_EXCEL")
	private long idDizSheetExcel;

	@Column(name="CD_CODICE")
	private String cdCodice;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Column(name="TS_INSERIMENTO")
	private Timestamp tsInserimento;

	@Column(name="TS_ULTIMA_MODIFICA")
	private Timestamp tsUltimaModifica;

	public FatTDizSheetExcel() {
	}

	public long getIdDizSheetExcel() {
		return this.idDizSheetExcel;
	}

	public void setIdDizSheetExcel(long idDizSheetExcel) {
		this.idDizSheetExcel = idDizSheetExcel;
	}

	public String getCdCodice() {
		return this.cdCodice;
	}

	public void setCdCodice(String cdCodice) {
		this.cdCodice = cdCodice;
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

	public Timestamp getTsInserimento() {
		return this.tsInserimento;
	}

	public void setTsInserimento(Timestamp tsInserimento) {
		this.tsInserimento = tsInserimento;
	}

	public Timestamp getTsUltimaModifica() {
		return this.tsUltimaModifica;
	}

	public void setTsUltimaModifica(Timestamp tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}

	@Override
	public Serializable getPrimaryKey() {
		// TODO Auto-generated method stub
		return null;
	}

}