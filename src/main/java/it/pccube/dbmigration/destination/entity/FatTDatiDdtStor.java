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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_DATI_DDT_STOR database table.
 * 
 */
@Entity
@Table(name="FAT_T_DATI_DDT_STOR")
public class FatTDatiDdtStor implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_DATI_DDT_STOR_IDDATIDDTSTOR_GENERATOR", sequenceName="SEQ_ID_DATI_DDT_STO", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_DATI_DDT_STOR_IDDATIDDTSTOR_GENERATOR")
	@Column(name="ID_DATI_DDT_STOR")
	private Long idDatiDdtStor;

	@Column(name="CD_NUMERO_DDT")
	private String cdNumeroDdt;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_DDT")
	private Date dtDataDdt;

	@Column(name="ID_DATI_DDT")
	private Long idDatiDdt;

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

	//bi-directional many-to-one association to FatARifLineaStor
	@OneToMany(mappedBy="datiDdtStor")
	private List<FatARifLineaStor> listRifLineaStor;

	//bi-directional many-to-one association to FatTFatturaStor
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FATTURA_STOR")
	private FatTFatturaStor fatturaStor;

	public FatTDatiDdtStor() {
	}

	public Long getIdDatiDdtStor() {
		return this.idDatiDdtStor;
	}

	public void setIdDatiDdtStor(Long idDatiDdtStor) {
		this.idDatiDdtStor = idDatiDdtStor;
	}

	public String getCdNumeroDdt() {
		return this.cdNumeroDdt;
	}

	public void setCdNumeroDdt(String cdNumeroDdt) {
		this.cdNumeroDdt = cdNumeroDdt;
	}

	public Date getDtDataDdt() {
		return this.dtDataDdt;
	}

	public void setDtDataDdt(Date dtDataDdt) {
		this.dtDataDdt = dtDataDdt;
	}

	public Long getIdDatiDdt() {
		return this.idDatiDdt;
	}

	public void setIdDatiDdt(Long idDatiDdt) {
		this.idDatiDdt = idDatiDdt;
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

	public List<FatARifLineaStor> getListRifLineaStor() {
		return this.listRifLineaStor;
	}

	public void setListRifLineaStor(List<FatARifLineaStor> listRifLineaStor) {
		this.listRifLineaStor = listRifLineaStor;
	}

	public FatARifLineaStor addFatARifLineaStor(FatARifLineaStor fatARifLineaStor) {
		getListRifLineaStor().add(fatARifLineaStor);
		fatARifLineaStor.setDatiDdtStor(this);

		return fatARifLineaStor;
	}

	public FatARifLineaStor removeFatARifLineaStor(FatARifLineaStor fatARifLineaStor) {
		getListRifLineaStor().remove(fatARifLineaStor);
		fatARifLineaStor.setDatiDdtStor(null);

		return fatARifLineaStor;
	}

	public FatTFatturaStor getFatturaStor() {
		return this.fatturaStor;
	}

	public void setFatturaStor(FatTFatturaStor fatturaStor) {
		this.fatturaStor = fatturaStor;
	}

	public Serializable getPrimaryKey() {
		return this.idDatiDdtStor;
	}

}