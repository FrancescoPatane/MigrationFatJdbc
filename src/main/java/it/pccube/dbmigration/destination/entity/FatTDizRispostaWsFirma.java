package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the FAT_T_DIZ_RISPOSTA_WS_FIRMA database table.
 * 
 */
@Entity
@Table(name = "FAT_T_DIZ_RISPOSTA_WS_FIRMA")
public class FatTDizRispostaWsFirma implements EntityInterface {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_DIZ_RISPOSTA_WS_FIRMA")
	private Long idDizRispostaWsFirma;

	
	@Column(name = "CD_COSTANTE")
	private String cdCostante;

	
	@Column(name = "DS_DESCRIZIONE")
	private String dsDescrizione;

	@Column(name = "NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name = "NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	// bi-directional many-to-one association to FatTEsitoVerifFirmaCfg
	@ManyToOne
	@JoinColumn(name = "ID_CONFIG_ESITO_VERIF_FIRMA", updatable = false, insertable = false)
	private FatTEsitoVerifFirmaCfg esitoVerifFirmaCfg;

	public FatTDizRispostaWsFirma() {
		super();
	}

	public Long getIdDizRispostaWsFirma() {
		return this.idDizRispostaWsFirma;
	}

	public void setIdDizRispostaWsFirma(Long idDizRispostaWsFirma) {
		this.idDizRispostaWsFirma = idDizRispostaWsFirma;
	}

	public String getCdCostante() {
		return this.cdCostante;
	}

	public void setCdCostante(String cdCostante) {
		this.cdCostante = cdCostante;
	}

	public String getDsDescrizione() {
		return this.dsDescrizione;
	}

	public void setDsDescrizione(String dsDescrizione) {
		this.dsDescrizione = dsDescrizione;
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

	public FatTEsitoVerifFirmaCfg getEsitoVerifFirmaCfg() {
		return this.esitoVerifFirmaCfg;
	}

	public void setEsitoVerifFirmaCfg(FatTEsitoVerifFirmaCfg esitoVerifFirmaCfg) {
		this.esitoVerifFirmaCfg = esitoVerifFirmaCfg;
	}

	
	public Serializable getPrimaryKey() {
		return this.idDizRispostaWsFirma;
	}

}