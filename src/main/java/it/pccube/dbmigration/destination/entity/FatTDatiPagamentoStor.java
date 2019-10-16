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
 * The persistent class for the FAT_T_DATI_PAGAMENTO_STOR database table.
 * 
 */
@Entity
@Table(name="FAT_T_DATI_PAGAMENTO_STOR")
public class FatTDatiPagamentoStor implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_DATI_PAGAMENTO_STOR_IDDATIPAGAMENTOSTOR_GENERATOR",sequenceName="SEQ_ID_DATI_PAGAMENTO_STO",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_DATI_PAGAMENTO_STOR_IDDATIPAGAMENTOSTOR_GENERATOR")
	@Column(name="ID_DATI_PAGAMENTO_STOR")
	private Long idDatiPagamentoStor;

	@Column(name="ID_DATI_PAGAMENTO")
	private Long idDatiPagamento;

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

	//bi-directional many-to-one association to FatTDizCondizioniPagam
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DIZ_CONDIZIONI_PAGAMENTO")
	private FatTDizCondizioniPagam dizCondizioniPagam;

	//bi-directional many-to-one association to FatTDettaglioPagStor
	@OneToMany(mappedBy="datiPagamentoStor")
	private List<FatTDettaglioPagStor> listDettaglioPagStor;

	public FatTDatiPagamentoStor() {
	}

	public Long getIdDatiPagamentoStor() {
		return this.idDatiPagamentoStor;
	}

	public void setIdDatiPagamentoStor(Long idDatiPagamentoStor) {
		this.idDatiPagamentoStor = idDatiPagamentoStor;
	}

	public Long getIdDatiPagamento() {
		return this.idDatiPagamento;
	}

	public void setIdDatiPagamento(Long idDatiPagamento) {
		this.idDatiPagamento = idDatiPagamento;
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

	public FatTDizCondizioniPagam getDizCondizioniPagam() {
		return this.dizCondizioniPagam;
	}

	public void setDizCondizioniPagam(FatTDizCondizioniPagam fatTDizCondizioniPagam) {
		this.dizCondizioniPagam = fatTDizCondizioniPagam;
	}

	public List<FatTDettaglioPagStor> getListDettaglioPagStor() {
		return this.listDettaglioPagStor;
	}

	public void setListDettaglioPagStor(List<FatTDettaglioPagStor> fatTDettaglioPagStors) {
		this.listDettaglioPagStor = fatTDettaglioPagStors;
	}

	public FatTDettaglioPagStor addFatTDettaglioPagStor(FatTDettaglioPagStor fatTDettaglioPagStor) {
		getListDettaglioPagStor().add(fatTDettaglioPagStor);
		fatTDettaglioPagStor.setDatiPagamentoStor(this);

		return fatTDettaglioPagStor;
	}

	public FatTDettaglioPagStor removeFatTDettaglioPagStor(FatTDettaglioPagStor fatTDettaglioPagStor) {
		getListDettaglioPagStor().remove(fatTDettaglioPagStor);
		fatTDettaglioPagStor.setDatiPagamentoStor(null);

		return fatTDettaglioPagStor;
	}

	public Serializable getPrimaryKey() {
		return this.idDatiPagamentoStor;
	}

}