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
 * The persistent class for the FAT_T_ASSEGNAZIONE database table.
 * 
 */
@Entity
@Table(name="FAT_T_ASSEGNAZIONE")
public class FatTAssegnazione implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_ASSEGNAZIONE_IDASSEGNAZIONE_GENERATOR", sequenceName="SEQ_ID_ASSEGNAZIONE", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_ASSEGNAZIONE_IDASSEGNAZIONE_GENERATOR")
	@Column(name="ID_ASSEGNAZIONE")
	private Long idAssegnazione;

	@Column(name="DS_MOTIVO_ASSEGNAZIONE")
	private String dsMotivoAssegnazione;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ASSEGNAZIONE")
	private Date dtDataAssegnazione;

	@Column(name="ID_SEDIA_DEST")
	private Long idSediaDest;

	@Column(name="ID_SEDIA_MITTENTE")
	private Long idSediaMittente;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Column(name="PG_VERSIONE_LOTTO")
	private Long pgVersioneLotto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTLotto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_LOTTO")
	private FatTLotto lotto;

	//bi-directional many-to-one association to FatTDizTipoAssegnazione
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_TIPO_ASSEGNAZIONE")
	private FatTDizTipoAssegnazione dizTipoAssegnazione;

	public FatTAssegnazione() {
	}

	public Long getIdAssegnazione() {
		return this.idAssegnazione;
	}

	public void setIdAssegnazione(Long idAssegnazione) {
		this.idAssegnazione = idAssegnazione;
	}

	public String getDsMotivoAssegnazione() {
		return this.dsMotivoAssegnazione;
	}

	public void setDsMotivoAssegnazione(String dsMotivoAssegnazione) {
		this.dsMotivoAssegnazione = dsMotivoAssegnazione;
	}

	public Date getDtDataAssegnazione() {
		return this.dtDataAssegnazione;
	}

	public void setDtDataAssegnazione(Date dtDataAssegnazione) {
		this.dtDataAssegnazione = dtDataAssegnazione;
	}

	public Long getIdSediaDest() {
		return this.idSediaDest;
	}

	public void setIdSediaDest(Long idSediaDest) {
		this.idSediaDest = idSediaDest;
	}

	public Long getIdSediaMittente() {
		return this.idSediaMittente;
	}

	public void setIdSediaMittente(Long idSediaMittente) {
		this.idSediaMittente = idSediaMittente;
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

	public FatTLotto getLotto() {
		return this.lotto;
	}

	public void setLotto(FatTLotto lotto) {
		this.lotto = lotto;
	}

	public FatTDizTipoAssegnazione getDizTipoAssegnazione() {
		return this.dizTipoAssegnazione;
	}

	public void setDizTipoAssegnazione(FatTDizTipoAssegnazione dizTipoAssegnazione) {
		this.dizTipoAssegnazione = dizTipoAssegnazione;
	}

	public Serializable getPrimaryKey() {
		return this.idAssegnazione;
	}

}