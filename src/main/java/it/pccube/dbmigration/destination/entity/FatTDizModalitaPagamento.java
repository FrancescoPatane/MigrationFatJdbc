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
 * The persistent class for the FAT_T_DIZ_MODALITA_PAGAMENTO database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_MODALITA_PAGAMENTO")
public class FatTDizModalitaPagamento implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_MODALITA_PAGAMENTO")
	private Long idDizModalitaPagamento;

	
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

	//bi-directional many-to-one association to FatTDettaglioPagamento
	@OneToMany(mappedBy="dizModalitaPagamento")
	private List<FatTDettaglioPagamento> listDettaglioPagamento;

	//bi-directional many-to-one association to FatTDettaglioPagStor
	@OneToMany(mappedBy="dizModalitaPagamento")
	private List<FatTDettaglioPagStor> listDettaglioPagStor;

	public FatTDizModalitaPagamento() {
	}

	public Long getIdDizModalitaPagamento() {
		return this.idDizModalitaPagamento;
	}

	public void setIdDizModalitaPagamento(Long idDizModalitaPagamento) {
		this.idDizModalitaPagamento = idDizModalitaPagamento;
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

	public List<FatTDettaglioPagamento> getListDettaglioPagamento() {
		return this.listDettaglioPagamento;
	}

	public void setListDettaglioPagamento(List<FatTDettaglioPagamento> fatTDettaglioPagamentos) {
		this.listDettaglioPagamento = fatTDettaglioPagamentos;
	}

	public FatTDettaglioPagamento addFatTDettaglioPagamento(FatTDettaglioPagamento fatTDettaglioPagamento) {
		getListDettaglioPagamento().add(fatTDettaglioPagamento);
		fatTDettaglioPagamento.setDizModalitaPagamento(this);

		return fatTDettaglioPagamento;
	}

	public FatTDettaglioPagamento removeFatTDettaglioPagamento(FatTDettaglioPagamento fatTDettaglioPagamento) {
		getListDettaglioPagamento().remove(fatTDettaglioPagamento);
		fatTDettaglioPagamento.setDizModalitaPagamento(null);

		return fatTDettaglioPagamento;
	}

	public List<FatTDettaglioPagStor> getListDettaglioPagStor() {
		return this.listDettaglioPagStor;
	}

	public void setListDettaglioPagStor(List<FatTDettaglioPagStor> fatTDettaglioPagStors) {
		this.listDettaglioPagStor = fatTDettaglioPagStors;
	}

	public FatTDettaglioPagStor addFatTDettaglioPagStor(FatTDettaglioPagStor fatTDettaglioPagStor) {
		getListDettaglioPagStor().add(fatTDettaglioPagStor);
		fatTDettaglioPagStor.setDizModalitaPagamento(this);

		return fatTDettaglioPagStor;
	}

	public FatTDettaglioPagStor removeFatTDettaglioPagStor(FatTDettaglioPagStor fatTDettaglioPagStor) {
		getListDettaglioPagStor().remove(fatTDettaglioPagStor);
		fatTDettaglioPagStor.setDizModalitaPagamento(null);

		return fatTDettaglioPagStor;
	}

	public Serializable getPrimaryKey() {
		return this.idDizModalitaPagamento;
	}

}