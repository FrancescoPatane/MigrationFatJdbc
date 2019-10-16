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
 * The persistent class for the FAT_A_STATO_ARCHIVIO database table.
 * 
 */
@Entity
@Table(name="FAT_A_STATO_ARCHIVIO")
public class FatAStatoArchivio implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_A_STATO_ARCHIVIO_IDSTATOARCHIVIO_GENERATOR", sequenceName="SEQ_ID_STATO_ARCHIVIO", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_A_STATO_ARCHIVIO_IDSTATOARCHIVIO_GENERATOR")
	@Column(name="ID_STATO_ARCHIVIO")
	private Long idStatoArchivio;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_ORA")
	
	private Date dtDataOra;

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

	//bi-directional many-to-one association to FatTDizStatoArchivio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_STATO_ARCHIVIO")
	private FatTDizStatoArchivio dizStatoArchivio;

	//bi-directional many-to-one association to FatTArchivio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ARCHIVIO")
	private FatTArchivio archivio;

	//bi-directional many-to-one association to FatTMonitorInvioSdi
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_MONITORAGGIO_INVIO_SDI")
	private FatTMonitorInvioSdi monitorInvioSdi;

	public FatAStatoArchivio() {
	}

	public Long getIdStatoArchivio() {
		return this.idStatoArchivio;
	}

	public void setIdStatoArchivio(Long idStatoArchivio) {
		this.idStatoArchivio = idStatoArchivio;
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

	public FatTDizStatoArchivio getDizStatoArchivio() {
		return this.dizStatoArchivio;
	}

	public void setDizStatoArchivio(FatTDizStatoArchivio dizStatoArchivio) {
		this.dizStatoArchivio = dizStatoArchivio;
	}

	public FatTArchivio getArchivio() {
		return this.archivio;
	}

	public void setArchivio(FatTArchivio archivio) {
		this.archivio = archivio;
	}

	public FatTMonitorInvioSdi getMonitorInvioSdi() {
		return this.monitorInvioSdi;
	}

	public void setMonitorInvioSdi(FatTMonitorInvioSdi monitorInvioSdi) {
		this.monitorInvioSdi = monitorInvioSdi;
	}

	public Serializable getPrimaryKey() {
		return this.idStatoArchivio;
	}

}