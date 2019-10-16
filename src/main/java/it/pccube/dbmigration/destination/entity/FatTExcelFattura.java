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
 * The persistent class for the FAT_T_EXCEL_FATTURA database table.
 * 
 */
@Entity
@Table(name="FAT_T_EXCEL_FATTURA")
public class FatTExcelFattura implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_EXCEL_FATTURA_IDEXCELFATTURA_GENERATOR",sequenceName="SEQ_ID_EXCEL_FATTURA",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_EXCEL_FATTURA_IDEXCELFATTURA_GENERATOR")
	@Column(name="ID_EXCEL_FATTURA")
	private Long idExcelFattura;

	@Column(name="DS_DESCRIZIONE")
	private String dsDescrizione;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_CARICAMENTO")
	private Date dtDataOraCaricamento;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA_ULTIMA_MODIFICA")
	private Date dtDataOraUltimaModifica;

	@Column(name="ID_SEDIA")
	private Long idSedia;

	@Column(name="NM_CONTENT_TYPE_EXCEL_ORIG")
	private String nmContentTypeExcelOrig;

	@Column(name="NM_CONTENT_TYPE_EXCEL_VALIDAZ")
	private String nmContentTypeExcelValidaz;

	@Column(name="NM_NOME_EXCEL_ORIGINALE")
	private String nmNomeExcelOriginale;

	@Column(name="NM_NOME_EXCEL_VALIDAZIONI")
	private String nmNomeExcelValidazioni;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	
	@Column(name="ID_FILE_EXCEL_CON_VALIDAZIONI")
	private String idFileExcelConValidazioni;
	
	@Column(name="ID_FILE_EXCEL_ORIGINALE")
	private String idFileExcelOriginale;

	@Column(name="PG_VERSIONE_LOTTO")
	private Long pgVersioneLotto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatAStatoExcelFattura
	@OneToMany(mappedBy="excelFattura")
	private List<FatAStatoExcelFattura> listStatoExcelFattura;

	//bi-directional many-to-one association to FatTExcelFailValidaz
	@OneToMany(mappedBy="excelFattura")
	private List<FatTExcelFailValidaz> listExcelFailValidaz;

	//bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FATTURA")
	private FatTFattura fattura;

	//bi-directional many-to-one association to FatTExcelFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_EXCEL_FATTURA_SOSTITUENTE")
	private FatTExcelFattura excelFattura;

	//bi-directional many-to-one association to FatTExcelFattura
	@OneToMany(mappedBy="excelFattura")
	private List<FatTExcelFattura> listExcelFattura;

	//bi-directional many-to-one association to FatTLotto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_LOTTO")
	private FatTLotto lotto;

	//bi-directional many-to-one association to FatTDizStatoExcelFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_STATO_EXCEL_FATTURA")
	private FatTDizStatoExcelFattura dizStatoExcelFattura;

	public FatTExcelFattura() {
	}

	public Long getIdExcelFattura() {
		return this.idExcelFattura;
	}

	public void setIdExcelFattura(Long idExcelFattura) {
		this.idExcelFattura = idExcelFattura;
	}

	public String getDsDescrizione() {
		return this.dsDescrizione;
	}

	public void setDsDescrizione(String dsDescrizione) {
		this.dsDescrizione = dsDescrizione;
	}

	public Date getDtDataOraCaricamento() {
		return this.dtDataOraCaricamento;
	}

	public void setDtDataOraCaricamento(Date dtDataOraCaricamento) {
		this.dtDataOraCaricamento = dtDataOraCaricamento;
	}

	public Date getDtDataOraUltimaModifica() {
		return this.dtDataOraUltimaModifica;
	}

	public void setDtDataOraUltimaModifica(Date dtDataOraUltimaModifica) {
		this.dtDataOraUltimaModifica = dtDataOraUltimaModifica;
	}

	public Long getIdSedia() {
		return this.idSedia;
	}

	public void setIdSedia(Long idSedia) {
		this.idSedia = idSedia;
	}

	public String getNmContentTypeExcelOrig() {
		return this.nmContentTypeExcelOrig;
	}

	public void setNmContentTypeExcelOrig(String nmContentTypeExcelOrig) {
		this.nmContentTypeExcelOrig = nmContentTypeExcelOrig;
	}

	public String getNmContentTypeExcelValidaz() {
		return this.nmContentTypeExcelValidaz;
	}

	public void setNmContentTypeExcelValidaz(String nmContentTypeExcelValidaz) {
		this.nmContentTypeExcelValidaz = nmContentTypeExcelValidaz;
	}

	public String getNmNomeExcelOriginale() {
		return this.nmNomeExcelOriginale;
	}

	public void setNmNomeExcelOriginale(String nmNomeExcelOriginale) {
		this.nmNomeExcelOriginale = nmNomeExcelOriginale;
	}

	public String getNmNomeExcelValidazioni() {
		return this.nmNomeExcelValidazioni;
	}

	public void setNmNomeExcelValidazioni(String nmNomeExcelValidazioni) {
		this.nmNomeExcelValidazioni = nmNomeExcelValidazioni;
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


	public Long getPgVersioneLotto() {
		return this.pgVersioneLotto;
	}

	public void setPgVersioneLotto(Long pgVersioneLotto) {
		this.pgVersioneLotto = pgVersioneLotto;
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

	public List<FatAStatoExcelFattura> getListStatoExcelFattura() {
		return this.listStatoExcelFattura;
	}

	public void setListStatoExcelFattura(List<FatAStatoExcelFattura> listStatoExcelFattura) {
		this.listStatoExcelFattura = listStatoExcelFattura;
	}

	public FatAStatoExcelFattura addFatAStatoExcelFattura(FatAStatoExcelFattura fatAStatoExcelFattura) {
		getListStatoExcelFattura().add(fatAStatoExcelFattura);
		fatAStatoExcelFattura.setExcelFattura(this);

		return fatAStatoExcelFattura;
	}

	public FatAStatoExcelFattura removeFatAStatoExcelFattura(FatAStatoExcelFattura fatAStatoExcelFattura) {
		getListStatoExcelFattura().remove(fatAStatoExcelFattura);
		fatAStatoExcelFattura.setExcelFattura(null);

		return fatAStatoExcelFattura;
	}

	public List<FatTExcelFailValidaz> getListExcelFailValidaz() {
		return this.listExcelFailValidaz;
	}

	public void setListExcelFailValidaz(List<FatTExcelFailValidaz> listExcelFailValidaz) {
		this.listExcelFailValidaz = listExcelFailValidaz;
	}

	public FatTExcelFailValidaz addFatTExcelFailValidaz(FatTExcelFailValidaz fatTExcelFailValidaz) {
		getListExcelFailValidaz().add(fatTExcelFailValidaz);
		fatTExcelFailValidaz.setExcelFattura(this);

		return fatTExcelFailValidaz;
	}

	public FatTExcelFailValidaz removeFatTExcelFailValidaz(FatTExcelFailValidaz fatTExcelFailValidaz) {
		getListExcelFailValidaz().remove(fatTExcelFailValidaz);
		fatTExcelFailValidaz.setExcelFattura(null);

		return fatTExcelFailValidaz;
	}

	public FatTFattura getFattura() {
		return this.fattura;
	}

	public void setFattura(FatTFattura fattura) {
		this.fattura = fattura;
	}

	public FatTExcelFattura getExcelFattura() {
		return this.excelFattura;
	}

	public void setExcelFattura(FatTExcelFattura excelFattura) {
		this.excelFattura = excelFattura;
	}

	public List<FatTExcelFattura> getListExcelFattura() {
		return this.listExcelFattura;
	}

	public void setListExcelFattura(List<FatTExcelFattura> listExcelFattura) {
		this.listExcelFattura = listExcelFattura;
	}

	public FatTExcelFattura addFatTExcelFattura(FatTExcelFattura fatTExcelFattura) {
		getListExcelFattura().add(fatTExcelFattura);
		fatTExcelFattura.setExcelFattura(this);

		return fatTExcelFattura;
	}

	public FatTExcelFattura removeFatTExcelFattura(FatTExcelFattura fatTExcelFattura) {
		getListExcelFattura().remove(fatTExcelFattura);
		fatTExcelFattura.setExcelFattura(null);

		return fatTExcelFattura;
	}

	public FatTLotto getLotto() {
		return this.lotto;
	}

	public void setLotto(FatTLotto lotto) {
		this.lotto = lotto;
	}

	public FatTDizStatoExcelFattura getDizStatoExcelFattura() {
		return this.dizStatoExcelFattura;
	}

	public void setDizStatoExcelFattura(FatTDizStatoExcelFattura dizStatoExcelFattura) {
		this.dizStatoExcelFattura = dizStatoExcelFattura;
	}

	public Serializable getPrimaryKey() {
		return this.idExcelFattura;
	}

	public String getIdFileExcelConValidazioni() {
		return idFileExcelConValidazioni;
	}

	public void setIdFileExcelConValidazioni(String idFileExcelConValidazioni) {
		this.idFileExcelConValidazioni = idFileExcelConValidazioni;
	}

	public String getIdFileExcelOriginale() {
		return idFileExcelOriginale;
	}

	public void setIdFileExcelOriginale(String idFileExcelOriginale) {
		this.idFileExcelOriginale = idFileExcelOriginale;
	}



}