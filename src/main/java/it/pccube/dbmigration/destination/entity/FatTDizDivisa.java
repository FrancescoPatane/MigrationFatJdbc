package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_DIZ_DIVISA database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_DIVISA")
public class FatTDizDivisa implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_DIZ_DIVISA_IDDIZDIVISA_GENERATOR",sequenceName="",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_DIZ_DIVISA_IDDIZDIVISA_GENERATOR")
	@Column(name="ID_DIZ_DIVISA")
	private Long idDizDivisa;

	
	@Column(name="CD_CODICE")
	private String cdCodice;

	
	@Column(name="DS_DESCRIZIONE")
	private String dsDescrizione;
	
	
	@Column(name="PG_ORDINAMENTO")
	private BigDecimal pgOrdinamento;

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
	@OneToMany(mappedBy="dizDivisa")
	private List<FatTFattura> listFattura;

	//bi-directional many-to-one association to FatTFatturaStor
	@OneToMany(mappedBy="dizDivisa")
	private List<FatTFatturaStor> listFatturaStor;

	public FatTDizDivisa() {
	}

	public Long getIdDizDivisa() {
		return this.idDizDivisa;
	}

	public void setIdDizDivisa(Long idDizDivisa) {
		this.idDizDivisa = idDizDivisa;
	}

	public String getCdCodice() {
		return this.cdCodice;
	}

	public void setCdCodice(String cdCodice) {
		this.cdCodice = cdCodice;
	}

	public String getDsDescrizione() {
		return this.dsDescrizione;
	}

	public void setDsDescrizione(String dsDescrizione) {
		this.dsDescrizione = dsDescrizione;
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

	public BigDecimal getPgOrdinamento() {
		return this.pgOrdinamento;
	}

	public void setPgOrdinamento(BigDecimal pgOrdinamento) {
		this.pgOrdinamento = pgOrdinamento;
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

	public List<FatTFattura> getListFattura() {
		return this.listFattura;
	}

	public void setListFattura(List<FatTFattura> fatTFatturas) {
		this.listFattura = fatTFatturas;
	}

	public FatTFattura addFatTFattura(FatTFattura fatTFattura) {
		getListFattura().add(fatTFattura);
		fatTFattura.setDizDivisa(this);

		return fatTFattura;
	}

	public FatTFattura removeFatTFattura(FatTFattura fatTFattura) {
		getListFattura().remove(fatTFattura);
		fatTFattura.setDizDivisa(null);

		return fatTFattura;
	}

	public List<FatTFatturaStor> getListFatturaStor() {
		return this.listFatturaStor;
	}

	public void setListFatturaStor(List<FatTFatturaStor> listFatturaStor) {
		this.listFatturaStor = listFatturaStor;
	}

	public FatTFatturaStor addFatTFatturaStor(FatTFatturaStor fatTFatturaStor) {
		getListFatturaStor().add(fatTFatturaStor);
		fatTFatturaStor.setDizDivisa(this);

		return fatTFatturaStor;
	}

	public FatTFatturaStor removeFatTFatturaStor(FatTFatturaStor fatTFatturaStor) {
		getListFatturaStor().remove(fatTFatturaStor);
		fatTFatturaStor.setDizDivisa(null);

		return fatTFatturaStor;
	}

	public Serializable getPrimaryKey() {
		return this.idDizDivisa;
	}

}