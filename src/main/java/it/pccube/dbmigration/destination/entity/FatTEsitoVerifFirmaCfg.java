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
 * The persistent class for the FAT_T_ESITO_VERIF_FIRMA_CFG database table.
 * 
 */
@Entity
@Table(name="FAT_T_ESITO_VERIF_FIRMA_CFG")
public class FatTEsitoVerifFirmaCfg implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CONFIG_ESITO_VERIF_FIRMA")
	private Long idConfigEsitoVerifFirma;

	@Column(name="CD_RITORNO_SERVICE_VERIFICA")
	private Long cdRitornoServiceVerifica;

	@Column(name="DS_DESCRIZIONE")
	private String dsDescrizione;

	@Column(name="FL_FIRMATARI")
	private Boolean flFirmatari;

	@Column(name="FL_MODELLO_CONFORME")
	private Boolean flModelloConforme;

	@Column(name="FL_RAGGIUNGIBILE")
	private Boolean flRaggiungibile;

	@Column(name="FL_RICONOSCIUTO")
	private Boolean flRiconosciuto;

	@Column(name="FL_VERIFICA")
	private Boolean flVerifica;

	@Column(name="CD_STATO")
	private String cdStato;
	
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

	//bi-directional many-to-one association to FatTDizRispostaWsFirma
	@OneToMany(mappedBy="esitoVerifFirmaCfg")
	private List<FatTDizRispostaWsFirma> listDizRispostaWsFirma;

	public FatTEsitoVerifFirmaCfg() {
		super();
	}

	public Long getIdConfigEsitoVerifFirma() {
		return this.idConfigEsitoVerifFirma;
	}

	public void setIdConfigEsitoVerifFirma(Long idConfigEsitoVerifFirma) {
		this.idConfigEsitoVerifFirma = idConfigEsitoVerifFirma;
	}

	public Long getCdRitornoServiceVerifica() {
		return this.cdRitornoServiceVerifica;
	}

	public void setCdRitornoServiceVerifica(Long cdRitornoServiceVerifica) {
		this.cdRitornoServiceVerifica = cdRitornoServiceVerifica;
	}

	public String getDsDescrizione() {
		return this.dsDescrizione;
	}

	public void setDsDescrizione(String dsDescrizione) {
		this.dsDescrizione = dsDescrizione;
	}

	public Boolean getFlFirmatari() {
		return this.flFirmatari;
	}

	public void setFlFirmatari(Boolean flFirmatari) {
		this.flFirmatari = flFirmatari;
	}

	public Boolean getFlModelloConforme() {
		return this.flModelloConforme;
	}

	public void setFlModelloConforme(Boolean flModelloConforme) {
		this.flModelloConforme = flModelloConforme;
	}

	public Boolean getFlRaggiungibile() {
		return this.flRaggiungibile;
	}

	public void setFlRaggiungibile(Boolean flRaggiungibile) {
		this.flRaggiungibile = flRaggiungibile;
	}

	public Boolean getFlRiconosciuto() {
		return this.flRiconosciuto;
	}

	public void setFlRiconosciuto(Boolean flRiconosciuto) {
		this.flRiconosciuto = flRiconosciuto;
	}

	public Boolean getFlVerifica() {
		return this.flVerifica;
	}

	public void setFlVerifica(Boolean flVerifica) {
		this.flVerifica = flVerifica;
	}

	public String getCdStato() {
		return this.cdStato;
	}

	public void setCdStato(String cdStato) {
		this.cdStato = cdStato;
	}

	public String getNmUtenteInserimento() {
		return nmUtenteInserimento;
	}

	public void setNmUtenteInserimento(String nmUtenteInserimento) {
		this.nmUtenteInserimento = nmUtenteInserimento;
	}

	public String getNmUtenteUltimaModifica() {
		return nmUtenteUltimaModifica;
	}

	public void setNmUtenteUltimaModifica(String nmUtenteUltimaModifica) {
		this.nmUtenteUltimaModifica = nmUtenteUltimaModifica;
	}

	public Date getTsInserimento() {
		return tsInserimento;
	}

	public void setTsInserimento(Date tsInserimento) {
		this.tsInserimento = tsInserimento;
	}

	public Date getTsUltimaModifica() {
		return tsUltimaModifica;
	}

	public void setTsUltimaModifica(Date tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}

	public List<FatTDizRispostaWsFirma> getListDizRispostaWsFirma() {
		return this.listDizRispostaWsFirma;
	}

	public void setListDizRispostaWsFirma(List<FatTDizRispostaWsFirma> listDizRispostaWsFirma) {
		this.listDizRispostaWsFirma = listDizRispostaWsFirma;
	}

	public FatTDizRispostaWsFirma addFatTDizRispostaWsFirma(FatTDizRispostaWsFirma fatTDizRispostaWsFirma) {
		getListDizRispostaWsFirma().add(fatTDizRispostaWsFirma);
		fatTDizRispostaWsFirma.setEsitoVerifFirmaCfg(this);

		return fatTDizRispostaWsFirma;
	}

	public FatTDizRispostaWsFirma removeFatTDizRispostaWsFirma(FatTDizRispostaWsFirma fatTDizRispostaWsFirma) {
		getListDizRispostaWsFirma().remove(fatTDizRispostaWsFirma);
		fatTDizRispostaWsFirma.setEsitoVerifFirmaCfg(null);

		return fatTDizRispostaWsFirma;
	}

	
	public Serializable getPrimaryKey() {
		return this.idConfigEsitoVerifFirma;
	}

}