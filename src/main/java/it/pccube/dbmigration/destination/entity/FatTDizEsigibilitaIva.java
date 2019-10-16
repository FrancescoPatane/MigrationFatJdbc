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
 * The persistent class for the FAT_T_DIZ_ESIGIBILITA_IVA database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_ESIGIBILITA_IVA")
public class FatTDizEsigibilitaIva implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_ESIGIBILITA_IVA")
	private Long idDizEsigibilitaIva;

	
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

	//bi-directional many-to-one association to FatTDatiCassaPrevidenz
	@OneToMany(mappedBy="dizEsigibilitaIva")
	private List<FatTDatiCassaPrevidenz> listDatiCassaPrevidenz;

	//bi-directional many-to-one association to FatTDatiCassaPrevStor
	@OneToMany(mappedBy="dizEsigibilitaIva")
	private List<FatTDatiCassaPrevStor> listDatiCassaPrevStor;

	//bi-directional many-to-one association to FatTDatiRiepilogo
	@OneToMany(mappedBy="dizEsigibilitaIva")
	private List<FatTDatiRiepilogo> listDatiRiepilogo;

	//bi-directional many-to-one association to FatTDatiRiepilogoStor
	@OneToMany(mappedBy="dizEsigibilitaIva")
	private List<FatTDatiRiepilogoStor> listDatiRiepilogoStor;

	//bi-directional many-to-one association to FatTDettaglioLinea
	@OneToMany(mappedBy="dizEsigibilitaIva")
	private List<FatTDettaglioLinea> listDettaglioLinea;

	//bi-directional many-to-one association to FatTDettaglioLineaStor
	@OneToMany(mappedBy="dizEsigibilitaIva")
	private List<FatTDettaglioLineaStor> listDettaglioLineaStor;

	public FatTDizEsigibilitaIva() {
	}

	public Long getIdDizEsigibilitaIva() {
		return this.idDizEsigibilitaIva;
	}

	public void setIdDizEsigibilitaIva(Long idDizEsigibilitaIva) {
		this.idDizEsigibilitaIva = idDizEsigibilitaIva;
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

	public List<FatTDatiCassaPrevidenz> getListDatiCassaPrevidenz() {
		return this.listDatiCassaPrevidenz;
	}

	public void setListDatiCassaPrevidenz(List<FatTDatiCassaPrevidenz> listDatiCassaPrevidenz) {
		this.listDatiCassaPrevidenz = listDatiCassaPrevidenz;
	}

	public FatTDatiCassaPrevidenz addFatTDatiCassaPrevidenz(FatTDatiCassaPrevidenz fatTDatiCassaPrevidenz) {
		getListDatiCassaPrevidenz().add(fatTDatiCassaPrevidenz);
		fatTDatiCassaPrevidenz.setDizEsigibilitaIva(this);

		return fatTDatiCassaPrevidenz;
	}

	public FatTDatiCassaPrevidenz removeFatTDatiCassaPrevidenz(FatTDatiCassaPrevidenz fatTDatiCassaPrevidenz) {
		getListDatiCassaPrevidenz().remove(fatTDatiCassaPrevidenz);
		fatTDatiCassaPrevidenz.setDizEsigibilitaIva(null);

		return fatTDatiCassaPrevidenz;
	}

	public List<FatTDatiCassaPrevStor> getListDatiCassaPrevStor() {
		return this.listDatiCassaPrevStor;
	}

	public void setListDatiCassaPrevStor(List<FatTDatiCassaPrevStor> listDatiCassaPrevStor) {
		this.listDatiCassaPrevStor = listDatiCassaPrevStor;
	}

	public FatTDatiCassaPrevStor addFatTDatiCassaPrevStor(FatTDatiCassaPrevStor fatTDatiCassaPrevStor) {
		getListDatiCassaPrevStor().add(fatTDatiCassaPrevStor);
		fatTDatiCassaPrevStor.setDizEsigibilitaIva(this);

		return fatTDatiCassaPrevStor;
	}

	public FatTDatiCassaPrevStor removeFatTDatiCassaPrevStor(FatTDatiCassaPrevStor fatTDatiCassaPrevStor) {
		getListDatiCassaPrevStor().remove(fatTDatiCassaPrevStor);
		fatTDatiCassaPrevStor.setDizEsigibilitaIva(null);

		return fatTDatiCassaPrevStor;
	}

	public List<FatTDatiRiepilogo> getListDatiRiepilogo() {
		return this.listDatiRiepilogo;
	}

	public void setListDatiRiepilogo(List<FatTDatiRiepilogo> listDatiRiepilogo) {
		this.listDatiRiepilogo = listDatiRiepilogo;
	}

	public FatTDatiRiepilogo addFatTDatiRiepilogo(FatTDatiRiepilogo fatTDatiRiepilogo) {
		getListDatiRiepilogo().add(fatTDatiRiepilogo);
		fatTDatiRiepilogo.setDizEsigibilitaIva(this);

		return fatTDatiRiepilogo;
	}

	public FatTDatiRiepilogo removeFatTDatiRiepilogo(FatTDatiRiepilogo fatTDatiRiepilogo) {
		getListDatiRiepilogo().remove(fatTDatiRiepilogo);
		fatTDatiRiepilogo.setDizEsigibilitaIva(null);

		return fatTDatiRiepilogo;
	}

	public List<FatTDatiRiepilogoStor> getListDatiRiepilogoStor() {
		return this.listDatiRiepilogoStor;
	}

	public void setListDatiRiepilogoStor(List<FatTDatiRiepilogoStor> listDatiRiepilogoStor) {
		this.listDatiRiepilogoStor = listDatiRiepilogoStor;
	}

	public FatTDatiRiepilogoStor addFatTDatiRiepilogoStor(FatTDatiRiepilogoStor fatTDatiRiepilogoStor) {
		getListDatiRiepilogoStor().add(fatTDatiRiepilogoStor);
		fatTDatiRiepilogoStor.setDizEsigibilitaIva(this);

		return fatTDatiRiepilogoStor;
	}

	public FatTDatiRiepilogoStor removeFatTDatiRiepilogoStor(FatTDatiRiepilogoStor fatTDatiRiepilogoStor) {
		getListDatiRiepilogoStor().remove(fatTDatiRiepilogoStor);
		fatTDatiRiepilogoStor.setDizEsigibilitaIva(null);

		return fatTDatiRiepilogoStor;
	}

	public List<FatTDettaglioLinea> getListDettaglioLinea() {
		return this.listDettaglioLinea;
	}

	public void setListDettaglioLinea(List<FatTDettaglioLinea> listDettaglioLinea) {
		this.listDettaglioLinea = listDettaglioLinea;
	}

	public FatTDettaglioLinea addFatTDettaglioLinea(FatTDettaglioLinea fatTDettaglioLinea) {
		getListDettaglioLinea().add(fatTDettaglioLinea);
		fatTDettaglioLinea.setDizEsigibilitaIva(this);

		return fatTDettaglioLinea;
	}

	public FatTDettaglioLinea removeFatTDettaglioLinea(FatTDettaglioLinea fatTDettaglioLinea) {
		getListDettaglioLinea().remove(fatTDettaglioLinea);
		fatTDettaglioLinea.setDizEsigibilitaIva(null);

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
		fatTDettaglioLineaStor.setDizEsigibilitaIva(this);

		return fatTDettaglioLineaStor;
	}

	public FatTDettaglioLineaStor removeFatTDettaglioLineaStor(FatTDettaglioLineaStor fatTDettaglioLineaStor) {
		getListDettaglioLineaStor().remove(fatTDettaglioLineaStor);
		fatTDettaglioLineaStor.setDizEsigibilitaIva(null);

		return fatTDettaglioLineaStor;
	}

	public Serializable getPrimaryKey() {
		return this.idDizEsigibilitaIva;
	}

}