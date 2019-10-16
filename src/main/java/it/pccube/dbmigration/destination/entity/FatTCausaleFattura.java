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
 * The persistent class for the FAT_T_CAUSALE_FATTURA database table.
 * 
 */
@Entity
@Table(name="FAT_T_CAUSALE_FATTURA")
public class FatTCausaleFattura implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_CAUSALE_FATTURA_IDCAUSALEFATTURA_GENERATOR", sequenceName="SEQ_ID_CAUSALE_FATTURA",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_CAUSALE_FATTURA_IDCAUSALEFATTURA_GENERATOR")
	@Column(name="ID_CAUSALE_FATTURA")
	private Long idCausaleFattura;

	@Column(name="DS_CAUSALE")
	private String dsCausale;

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

	//bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FATTURA")
	private FatTFattura fattura;

	public FatTCausaleFattura() {
	}

	public Long getIdCausaleFattura() {
		return this.idCausaleFattura;
	}

	public void setIdCausaleFattura(Long idCausaleFattura) {
		this.idCausaleFattura = idCausaleFattura;
	}

	public String getDsCausale() {
		return this.dsCausale;
	}

	public void setDsCausale(String dsCausale) {
		this.dsCausale = dsCausale;
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

	public FatTFattura getFattura() {
		return this.fattura;
	}

	public void setFattura(FatTFattura fatTFattura) {
		this.fattura = fatTFattura;
	}

	public Serializable getPrimaryKey() {
		return this.idCausaleFattura;
	}

}