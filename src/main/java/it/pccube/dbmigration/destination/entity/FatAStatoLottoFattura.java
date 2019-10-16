package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * The persistent class for the FAT_A_STATO_LOTTO_FATTURA database table.
 * 
 */
@Entity
@Table(name="FAT_A_STATO_LOTTO_FATTURA")
public class FatAStatoLottoFattura implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_A_STATO_LOTTO_FATTURA_IDSTATOLOTTOFATTURA_GENERATOR", sequenceName = "SEQ_ID_STATO_LOTTO_FATTURA", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_A_STATO_LOTTO_FATTURA_IDSTATOLOTTOFATTURA_GENERATOR")
	@Column(name="ID_STATO_LOTTO_FATTURA")
	private Long idStatoLottoFattura;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA")
	
	private Date dtDataOra;

	@Column(name="NM_UTENTE_INSERIMENTO")
	
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	
	private String nmUtenteUltimaModifica;

	@Column(name="PG_VERSIONE_LOTTO")
	
	private BigDecimal pgVersioneLotto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FATTURA")
	private FatTFattura fattura;

	//bi-directional many-to-one association to FatTNotifica
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_NOTIFICA")
	private FatTNotifica notifica;

	//bi-directional many-to-one association to FatTLottoBckup
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_LOTTO")
	private FatTLotto lotto;

	//bi-directional many-to-one association to FatTDizStatoLottoFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_STATO_LOTTO_FATTURA")
	private FatTDizStatoLottoFattura dizStatoLottoFattura;

	//bi-directional many-to-one association to FatTMonitorInvioSdi
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_MONITORAGGIO_INVIO_SDI")
	private FatTMonitorInvioSdi monitorInvioSdi;

	public FatAStatoLottoFattura() {
	}

	public Long getIdStatoLottoFattura() {
		return this.idStatoLottoFattura;
	}

	public void setIdStatoLottoFattura(Long idStatoLottoFattura) {
		this.idStatoLottoFattura = idStatoLottoFattura;
	}

	public Date getDtDataOra() {
		return this.dtDataOra;
	}

	public void setDtDataOra(Date dtDataOra) {
		this.dtDataOra = dtDataOra;
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

	public BigDecimal getPgVersioneLotto() {
		return this.pgVersioneLotto;
	}

	public void setPgVersioneLotto(BigDecimal pgVersioneLotto) {
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

	public FatTFattura getFattura() {
		return this.fattura;
	}

	public void setFattura(FatTFattura fattura) {
		this.fattura = fattura;
	}

	public FatTNotifica getNotifica() {
		return this.notifica;
	}

	public void setNotifica(FatTNotifica notifica) {
		this.notifica = notifica;
	}

	public FatTLotto getLotto() {
		return this.lotto;
	}

	public void setLotto(FatTLotto lotto) {
		this.lotto = lotto;
	}

	public FatTDizStatoLottoFattura getDizStatoLottoFattura() {
		return this.dizStatoLottoFattura;
	}

	public void setDizStatoLottoFattura(FatTDizStatoLottoFattura dizStatoLottoFattura) {
		this.dizStatoLottoFattura = dizStatoLottoFattura;
	}

	public FatTMonitorInvioSdi getMonitorInvioSdi() {
		return this.monitorInvioSdi;
	}

	public void setMonitorInvioSdi(FatTMonitorInvioSdi monitorInvioSdi) {
		this.monitorInvioSdi = monitorInvioSdi;
	}

	public Serializable getPrimaryKey() {
		return this.idStatoLottoFattura;
	}

}