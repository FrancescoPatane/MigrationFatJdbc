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
 * The persistent class for the FAT_T_DATI_PAGAMENTO database table.
 * 
 */
@Entity
@Table(name="FAT_T_DATI_PAGAMENTO")
public class FatTDatiPagamento implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_DATI_PAGAMENTO_IDDATIPAGAMENTO_GENERATOR",sequenceName="SEQ_ID_DATI_PAGAMENTO",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_DATI_PAGAMENTO_IDDATIPAGAMENTO_GENERATOR")
	@Column(name="ID_DATI_PAGAMENTO")
	private Long idDatiPagamento;

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

	//bi-directional many-to-one association to FatTDizCondizioniPagam
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_CONDIZIONI_PAGAMENTO")
	private FatTDizCondizioniPagam dizCondizioniPagam;

	//bi-directional many-to-one association to FatTDettaglioPagamento
	@OneToMany(mappedBy="datiPagamento", orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	private List<FatTDettaglioPagamento> listDettaglioPagamento;

	public FatTDatiPagamento() {
	}

	public Long getIdDatiPagamento() {
		return this.idDatiPagamento;
	}

	public void setIdDatiPagamento(Long idDatiPagamento) {
		this.idDatiPagamento = idDatiPagamento;
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

	public void setFattura(FatTFattura fattura) {
		this.fattura = fattura;
	}

	public FatTDizCondizioniPagam getDizCondizioniPagam() {
		return this.dizCondizioniPagam;
	}

	public void setDizCondizioniPagam(FatTDizCondizioniPagam dizCondizioniPagam) {
		this.dizCondizioniPagam = dizCondizioniPagam;
	}

	public List<FatTDettaglioPagamento> getListDettaglioPagamento() {
		return this.listDettaglioPagamento;
	}

	public void setListDettaglioPagamento(List<FatTDettaglioPagamento> listDettaglioPagamento) {
		this.listDettaglioPagamento = listDettaglioPagamento;
	}

	public FatTDettaglioPagamento addFatTDettaglioPagamento(FatTDettaglioPagamento fatTDettaglioPagamento) {
		getListDettaglioPagamento().add(fatTDettaglioPagamento);
		fatTDettaglioPagamento.setDatiPagamento(this);

		return fatTDettaglioPagamento;
	}

	public FatTDettaglioPagamento removeFatTDettaglioPagamento(FatTDettaglioPagamento fatTDettaglioPagamento) {
		getListDettaglioPagamento().remove(fatTDettaglioPagamento);
		fatTDettaglioPagamento.setDatiPagamento(null);

		return fatTDettaglioPagamento;
	}

	public Serializable getPrimaryKey() {
		return this.idDatiPagamento;
	}

}