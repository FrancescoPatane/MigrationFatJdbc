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
 * The persistent class for the FAT_T_DIZ_TIPO_CESSIONE_PREST database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_TIPO_CESSIONE_PREST")
public class FatTDizTipoCessionePrest implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_TIPO_CESSIONE_PREST")
	private Long idDizTipoCessionePrest;

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

	//bi-directional many-to-one association to FatTDettaglioLinea
	@OneToMany(mappedBy="dizTipoCessionePrest")
	private List<FatTDettaglioLinea> listDettaglioLinea;

	//bi-directional many-to-one association to FatTDettaglioLineaStor
	@OneToMany(mappedBy="dizTipoCessionePrest")
	private List<FatTDettaglioLineaStor> listDettaglioLineaStor;

	public FatTDizTipoCessionePrest() {
	}

	public Long getIdDizTipoCessionePrest() {
		return this.idDizTipoCessionePrest;
	}

	public void setIdDizTipoCessionePrest(Long idDizTipoCessionePrest) {
		this.idDizTipoCessionePrest = idDizTipoCessionePrest;
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

	public List<FatTDettaglioLinea> getListDettaglioLinea() {
		return this.listDettaglioLinea;
	}

	public void setListDettaglioLinea(List<FatTDettaglioLinea> listDettaglioLinea) {
		this.listDettaglioLinea = listDettaglioLinea;
	}

	public FatTDettaglioLinea addFatTDettaglioLinea(FatTDettaglioLinea fatTDettaglioLinea) {
		getListDettaglioLinea().add(fatTDettaglioLinea);
		fatTDettaglioLinea.setDizTipoCessionePrest(this);

		return fatTDettaglioLinea;
	}

	public FatTDettaglioLinea removeFatTDettaglioLinea(FatTDettaglioLinea fatTDettaglioLinea) {
		getListDettaglioLinea().remove(fatTDettaglioLinea);
		fatTDettaglioLinea.setDizTipoCessionePrest(null);

		return fatTDettaglioLinea;
	}

	public List<FatTDettaglioLineaStor> getListDettaglioLineaStor() {
		return this.listDettaglioLineaStor;
	}

	public void setListDettaglioLineaStor(List<FatTDettaglioLineaStor> listDettaglioLineaStor) {
		this.listDettaglioLineaStor = listDettaglioLineaStor;
	}

	public FatTDettaglioLineaStor addFatTDettaglioLineaStor(FatTDettaglioLineaStor fatTDettaglioLineaStor) {
		getListDettaglioLineaStor().add(fatTDettaglioLineaStor);
		fatTDettaglioLineaStor.setDizTipoCessionePrest(this);

		return fatTDettaglioLineaStor;
	}

	public FatTDettaglioLineaStor removeFatTDettaglioLineaStor(FatTDettaglioLineaStor fatTDettaglioLineaStor) {
		getListDettaglioLineaStor().remove(fatTDettaglioLineaStor);
		fatTDettaglioLineaStor.setDizTipoCessionePrest(null);

		return fatTDettaglioLineaStor;
	}

	public Serializable getPrimaryKey() {
		return this.idDizTipoCessionePrest;
	}

}