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

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;



/**
 * The persistent class for the FAT_T_DATI_DDT database table.
 * 
 */
@Entity
@Table(name="FAT_T_DATI_DDT")
public class FatTDatiDdt implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_DATI_DDT_IDDATIDDT_GENERATOR", sequenceName="SEQ_ID_DATI_DDT", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_DATI_DDT_IDDATIDDT_GENERATOR")
	@Column(name="ID_DATI_DDT")
	private Long idDatiDdt;

	@Column(name="CD_NUMERO_DDT")
	private String cdNumeroDdt;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_DATA_DDT")
	private Date dtDataDdt;

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

	//bi-directional many-to-one association to FatARiferimentoLinea
	@OneToMany(mappedBy="datiDdt", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatARiferimentoLinea> listRiferimentoLinea;

	//bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FATTURA")
	private FatTFattura fattura;

	public FatTDatiDdt() {
	}

	public Long getIdDatiDdt() {
		return this.idDatiDdt;
	}

	public void setIdDatiDdt(Long idDatiDdt) {
		this.idDatiDdt = idDatiDdt;
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

	public List<FatARiferimentoLinea> getListRiferimentoLinea() {
		return this.listRiferimentoLinea;
	}

	public void setListRiferimentoLinea(List<FatARiferimentoLinea> listRiferimentoLinea) {
		this.listRiferimentoLinea = listRiferimentoLinea;
	}

	public FatARiferimentoLinea addFatARiferimentoLinea(FatARiferimentoLinea fatARiferimentoLinea) {
		getListRiferimentoLinea().add(fatARiferimentoLinea);
		fatARiferimentoLinea.setDatiDdt(this);

		return fatARiferimentoLinea;
	}

	public FatARiferimentoLinea removeFatARiferimentoLinea(FatARiferimentoLinea fatARiferimentoLinea) {
		getListRiferimentoLinea().remove(fatARiferimentoLinea);
		fatARiferimentoLinea.setDatiDdt(null);

		return fatARiferimentoLinea;
	}

	public FatTFattura getFattura() {
		return this.fattura;
	}

	public void setFattura(FatTFattura fattura) {
		this.fattura = fattura;
	}

	public Serializable getPrimaryKey() {
		return this.idDatiDdt;
	}

}