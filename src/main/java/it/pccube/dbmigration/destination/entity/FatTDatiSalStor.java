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
 * The persistent class for the FAT_T_DATI_SAL_STOR database table.
 * 
 */
@Entity
@Table(name="FAT_T_DATI_SAL_STOR")
public class FatTDatiSalStor implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_DATI_SAL_STOR_IDDATISALSTOR_GENERATOR",sequenceName="SEQ_ID_DATI_SAL_STO",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_DATI_SAL_STOR_IDDATISALSTOR_GENERATOR")
	@Column(name="ID_DATI_SAL_STOR")
	private Long idDatiSalStor;

	@Column(name="CD_RIFERIMENTO_FASE")
	private String cdRiferimentoFase;

	@Column(name="ID_DATI_SAL")
	private Long idDatiSal;

	@Column(name="ID_FATTURA")
	private Long idFattura;

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

	//bi-directional many-to-one association to FatTFatturaStor
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FATTURA_STOR")
	private FatTFatturaStor fatturaStor;

	public FatTDatiSalStor() {
	}

	public Long getIdDatiSalStor() {
		return this.idDatiSalStor;
	}

	public void setIdDatiSalStor(Long idDatiSalStor) {
		this.idDatiSalStor = idDatiSalStor;
	}

	public String getCdRiferimentoFase() {
		return this.cdRiferimentoFase;
	}

	public void setCdRiferimentoFase(String cdRiferimentoFase) {
		this.cdRiferimentoFase = cdRiferimentoFase;
	}

	public Long getIdDatiSal() {
		return this.idDatiSal;
	}

	public void setIdDatiSal(Long idDatiSal) {
		this.idDatiSal = idDatiSal;
	}

	public Long getIdFattura() {
		return this.idFattura;
	}

	public void setIdFattura(Long idFattura) {
		this.idFattura = idFattura;
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

	public FatTFatturaStor getFatturaStor() {
		return this.fatturaStor;
	}

	public void setFatturaStor(FatTFatturaStor fatTFatturaStor) {
		this.fatturaStor = fatTFatturaStor;
	}

	public Serializable getPrimaryKey() {
		return this.idDatiSalStor;
	}

}