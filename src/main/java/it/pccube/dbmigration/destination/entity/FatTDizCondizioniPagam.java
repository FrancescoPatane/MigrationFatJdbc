package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_DIZ_CONDIZIONI_PAGAM database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_CONDIZIONI_PAGAM")
public class FatTDizCondizioniPagam implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_CONDIZIONI_PAGAM")
	private Long idDizCondizioniPagam;

	
	@Column(name="CD_CODICE")
	private String cdCodice;

	
	@Column(name="DS_DESCRIZIONE")
	private String dsDescrizione;

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

	//bi-directional many-to-one association to FatTDatiPagamento
	@OneToMany(mappedBy="dizCondizioniPagam")
	private List<FatTDatiPagamento> listDatiPagamento;

	//bi-directional many-to-one association to FatTDatiPagamentoStor
	@OneToMany(mappedBy="dizCondizioniPagam")
	private List<FatTDatiPagamentoStor> listDatiPagamentoStor;

	public FatTDizCondizioniPagam() {
	}

	public Long getIdDizCondizioniPagam() {
		return this.idDizCondizioniPagam;
	}

	public void setIdDizCondizioniPagam(Long idDizCondizioniPagam) {
		this.idDizCondizioniPagam = idDizCondizioniPagam;
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

	public List<FatTDatiPagamento> getListDatiPagamento() {
		return this.listDatiPagamento;
	}

	public void setListDatiPagamento(List<FatTDatiPagamento> fatTDatiPagamentos) {
		this.listDatiPagamento = fatTDatiPagamentos;
	}

	public FatTDatiPagamento addFatTDatiPagamento(FatTDatiPagamento fatTDatiPagamento) {
		getListDatiPagamento().add(fatTDatiPagamento);
		fatTDatiPagamento.setDizCondizioniPagam(this);

		return fatTDatiPagamento;
	}

	public FatTDatiPagamento removeFatTDatiPagamento(FatTDatiPagamento fatTDatiPagamento) {
		getListDatiPagamento().remove(fatTDatiPagamento);
		fatTDatiPagamento.setDizCondizioniPagam(null);

		return fatTDatiPagamento;
	}

	public List<FatTDatiPagamentoStor> getListDatiPagamentoStor() {
		return this.listDatiPagamentoStor;
	}

	public void setListDatiPagamentoStor(List<FatTDatiPagamentoStor> listDatiPagamentoStor) {
		this.listDatiPagamentoStor = listDatiPagamentoStor;
	}

	public FatTDatiPagamentoStor addFatTDatiPagamentoStor(FatTDatiPagamentoStor fatTDatiPagamentoStor) {
		getListDatiPagamentoStor().add(fatTDatiPagamentoStor);
		fatTDatiPagamentoStor.setDizCondizioniPagam(this);

		return fatTDatiPagamentoStor;
	}

	public FatTDatiPagamentoStor removeFatTDatiPagamentoStor(FatTDatiPagamentoStor fatTDatiPagamentoStor) {
		getListDatiPagamentoStor().remove(fatTDatiPagamentoStor);
		fatTDatiPagamentoStor.setDizCondizioniPagam(null);

		return fatTDatiPagamentoStor;
	}

	public Serializable getPrimaryKey() {
		return this.idDizCondizioniPagam;
	}

}