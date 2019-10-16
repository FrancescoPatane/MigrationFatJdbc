package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import it.pccube.dbmigration.destination.entity.id.FatTLottoArchivioPK;



/**
 * The persistent class for the FAT_T_LOTTO_ARCHIVIO database table.
 * 
 */
@Entity
@Table(name="FAT_T_LOTTO_ARCHIVIO")
public class FatTLottoArchivio implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FatTLottoArchivioPK id;

	@Column(name="PG_VERSIONE_LOTTO")
	
	private BigDecimal pgVersioneLotto;
	
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

	//bi-directional many-to-one association to FatTArchivio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ARCHIVIO", insertable=false, updatable=false)
	private FatTArchivio archivio;

	//bi-directional many-to-one association to FatTLotto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_LOTTO", insertable=false, updatable=false)
	private FatTLotto lotto;

	public FatTLottoArchivio() {
	}

	public FatTLottoArchivioPK getId() {
		return this.id;
	}

	public void setId(FatTLottoArchivioPK id) {
		this.id = id;
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

	public FatTArchivio getArchivio() {
		return this.archivio;
	}

	public void setArchivio(FatTArchivio archivio) {
		this.archivio = archivio;
	}

	public FatTLotto getLotto() {
		return this.lotto;
	}

	public void setLotto(FatTLotto lotto) {
		this.lotto = lotto;
	}

	public Serializable getPrimaryKey() {
		return this.id;
	}

}