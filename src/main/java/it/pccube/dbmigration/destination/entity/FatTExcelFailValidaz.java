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
 * The persistent class for the FAT_T_EXCEL_FAIL_VALIDAZ database table.
 * 
 */
@Entity
@Table(name="FAT_T_EXCEL_FAIL_VALIDAZ")
public class FatTExcelFailValidaz implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_EXCEL_FAIL_VALIDAZ_IDEXCELFAILVALIDAZIONE_GENERATOR",sequenceName="SEQ_ID_EXCEL_FAIL_VALIDAZIONE",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_EXCEL_FAIL_VALIDAZ_IDEXCELFAILVALIDAZIONE_GENERATOR")
	@Column(name="ID_EXCEL_FAIL_VALIDAZIONE")
	private Long idExcelFailValidazione;

	@Column(name="CD_COLONNA_CELLA")
	private String cdColonnaCella;

	@Column(name="CD_RIGA_CELLA")
	private String cdRigaCella;

	@Column(name="ID_DIZ_TIPO_VALIDAZIONE")
	private Long idDizTipoValidazione;

	@Column(name="ID_REGOLA_VALIDAZIONE")
	private Long idRegolaValidazione;

	@Column(name="NM_NOME_SHEET")
	private String nmNomeSheet;

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

	//bi-directional many-to-one association to FatTExcelFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_EXCEL_FATTURA")
	private FatTExcelFattura excelFattura;

	public FatTExcelFailValidaz() {
	}

	public Long getIdExcelFailValidazione() {
		return this.idExcelFailValidazione;
	}

	public void setIdExcelFailValidazione(Long idExcelFailValidazione) {
		this.idExcelFailValidazione = idExcelFailValidazione;
	}

	public String getCdColonnaCella() {
		return this.cdColonnaCella;
	}

	public void setCdColonnaCella(String cdColonnaCella) {
		this.cdColonnaCella = cdColonnaCella;
	}

	public String getCdRigaCella() {
		return this.cdRigaCella;
	}

	public void setCdRigaCella(String cdRigaCella) {
		this.cdRigaCella = cdRigaCella;
	}

	public Long getIdDizTipoValidazione() {
		return this.idDizTipoValidazione;
	}

	public void setIdDizTipoValidazione(Long idDizTipoValidazione) {
		this.idDizTipoValidazione = idDizTipoValidazione;
	}

	public Long getIdRegolaValidazione() {
		return this.idRegolaValidazione;
	}

	public void setIdRegolaValidazione(Long idRegolaValidazione) {
		this.idRegolaValidazione = idRegolaValidazione;
	}

	public String getNmNomeSheet() {
		return this.nmNomeSheet;
	}

	public void setNmNomeSheet(String nmNomeSheet) {
		this.nmNomeSheet = nmNomeSheet;
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

	public FatTExcelFattura getExcelFattura() {
		return this.excelFattura;
	}

	public void setExcelFattura(FatTExcelFattura excelFattura) {
		this.excelFattura = excelFattura;
	}

	public Serializable getPrimaryKey() {
		return this.idExcelFailValidazione;
	}

}