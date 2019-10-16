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
 * The persistent class for the FAT_T_DIZ_OPERAZIONE_LOG database table.
 * 
 */
@Entity
@Table(name = "FAT_T_DIZ_OPERAZIONE_LOG")
public class FatTDizOperazioneLog implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_DIZ_OPERAZIONE_LOG")
	private Long idDizOperazioneLog;

	
	@Column(name = "TX_DESCRIZIONE")
	private String txDescrizione;

	
	@Column(name = "FL_CERTIFICAZIONE")
	private Boolean flCertificazione;

	
	@Column(name = "NM_NOME")
	private String nmNome;

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

	// bi-directional many-to-one association to FatTApplicativoLog
	@OneToMany(mappedBy = "dizOperazioneLog")
	private List<FatTApplicativoLog> listApplicativoLog;

	public FatTDizOperazioneLog() {
		super();
	}

	public Long getIdDizOperazioneLog() {
		return this.idDizOperazioneLog;
	}

	public void setIdDizOperazioneLog(Long idDizOperazioneLog) {
		this.idDizOperazioneLog = idDizOperazioneLog;
	}

	public String getTxDescrizione() {
		return this.txDescrizione;
	}

	public void setTxDescrizione(String txDescrizione) {
		this.txDescrizione = txDescrizione;
	}

	public Boolean getFlCertificazione() {
		return this.flCertificazione;
	}

	public void setFlCertificazione(Boolean flCertificazione) {
		this.flCertificazione = flCertificazione;
	}

	public String getNmNome() {
		return this.nmNome;
	}

	public void setNmNome(String nmNome) {
		this.nmNome = nmNome;
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

	public List<FatTApplicativoLog> getListApplicativoLog() {
		return this.listApplicativoLog;
	}

	public void setListApplicativoLog(List<FatTApplicativoLog> listApplicativoLog) {
		this.listApplicativoLog = listApplicativoLog;
	}

	public FatTApplicativoLog addFatTApplicativoLog(FatTApplicativoLog fatTApplicativoLog) {
		getListApplicativoLog().add(fatTApplicativoLog);
		fatTApplicativoLog.setDizOperazioneLog(this);

		return fatTApplicativoLog;
	}

	public FatTApplicativoLog removeFatTApplicativoLog(FatTApplicativoLog fatTApplicativoLog) {
		getListApplicativoLog().remove(fatTApplicativoLog);
		fatTApplicativoLog.setDizOperazioneLog(null);

		return fatTApplicativoLog;
	}

	
	public Serializable getPrimaryKey() {
		return this.idDizOperazioneLog;
	}

}