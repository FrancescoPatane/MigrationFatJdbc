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
 * The persistent class for the FAT_A_RIF_LINEA_STOR database table.
 * 
 */
@Entity
@Table(name="FAT_A_RIF_LINEA_STOR")
public class FatARifLineaStor implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_A_RIF_LINEA_STOR_IDRIFERIMENTOLINEASTOR_GENERATOR", sequenceName="SEQ_ID_RIFERIMENTO_LINEA_STO", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_A_RIF_LINEA_STOR_IDRIFERIMENTOLINEASTOR_GENERATOR")
	@Column(name="ID_RIFERIMENTO_LINEA_STOR")
	private Long idRiferimentoLineaStor;

	@Column(name="ID_DATI_DDT")
	private Long idDatiDdt;

	@Column(name="ID_DATI_RIFERIMENTO")
	private Long idDatiRiferimento;

	@Column(name="ID_DETTAGLIO_LINEA")
	private Long idDettaglioLinea;

	@Column(name="ID_RIFERIMENTO_LINEA")
	private Long idRiferimentoLinea;

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

	//bi-directional many-to-one association to FatTDettaglioLineaStor
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DETTAGLIO_LINEA_STOR")
	private FatTDettaglioLineaStor dettaglioLineaStor;

	//bi-directional many-to-one association to FatTDatiDdtStor
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DATI_DDT_STOR")
	private FatTDatiDdtStor datiDdtStor;

	//bi-directional many-to-one association to FatTDatiRiferimentoStor
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DATI_RIFERIMENTO_STOR")
	private FatTDatiRiferimentoStor datiRiferimentoStor;

	public FatARifLineaStor() {
	}

	public Long getIdRiferimentoLineaStor() {
		return this.idRiferimentoLineaStor;
	}

	public void setIdRiferimentoLineaStor(Long idRiferimentoLineaStor) {
		this.idRiferimentoLineaStor = idRiferimentoLineaStor;
	}

	public Long getIdDatiDdt() {
		return this.idDatiDdt;
	}

	public void setIdDatiDdt(Long idDatiDdt) {
		this.idDatiDdt = idDatiDdt;
	}

	public Long getIdDatiRiferimento() {
		return this.idDatiRiferimento;
	}

	public void setIdDatiRiferimento(Long idDatiRiferimento) {
		this.idDatiRiferimento = idDatiRiferimento;
	}

	public Long getIdDettaglioLinea() {
		return this.idDettaglioLinea;
	}

	public void setIdDettaglioLinea(Long idDettaglioLinea) {
		this.idDettaglioLinea = idDettaglioLinea;
	}

	public Long getIdRiferimentoLinea() {
		return this.idRiferimentoLinea;
	}

	public void setIdRiferimentoLinea(Long idRiferimentoLinea) {
		this.idRiferimentoLinea = idRiferimentoLinea;
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

	public FatTDettaglioLineaStor getDettaglioLineaStor() {
		return this.dettaglioLineaStor;
	}

	public void setDettaglioLineaStor(FatTDettaglioLineaStor dettaglioLineaStor) {
		this.dettaglioLineaStor = dettaglioLineaStor;
	}

	public FatTDatiDdtStor getDatiDdtStor() {
		return this.datiDdtStor;
	}

	public void setDatiDdtStor(FatTDatiDdtStor datiDdtStor) {
		this.datiDdtStor = datiDdtStor;
	}

	public FatTDatiRiferimentoStor getDatiRiferimentoStor() {
		return this.datiRiferimentoStor;
	}

	public void setDatiRiferimentoStor(FatTDatiRiferimentoStor datiRiferimentoStor) {
		this.datiRiferimentoStor = datiRiferimentoStor;
	}

	public Serializable getPrimaryKey() {
		return this.idRiferimentoLineaStor;
	}

}