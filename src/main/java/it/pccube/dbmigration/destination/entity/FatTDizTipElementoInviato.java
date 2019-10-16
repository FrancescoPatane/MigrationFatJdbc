package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import javax.persistence.*;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FAT_T_DIZ_TIP_ELEMENTO_INVIATO database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_TIP_ELEMENTO_INVIATO")
public class FatTDizTipElementoInviato implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_TIP_ELEMENTO_INVIATO")
	private Long idDizTipElementoInviato;

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

	//bi-directional many-to-one association to FatTMonitorInvioSdi
	@OneToMany(mappedBy="dizTipElementoInviato")
	private List<FatTMonitorInvioSdi> listMonitorInvioSdi;

	public FatTDizTipElementoInviato() {
	}

	public Long getIdDizTipElementoInviato() {
		return this.idDizTipElementoInviato;
	}

	public void setIdDizTipElementoInviato(Long idDizTipElementoInviato) {
		this.idDizTipElementoInviato = idDizTipElementoInviato;
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

	public void setTsInserimento(Timestamp tsInserimento) {
		this.tsInserimento = tsInserimento;
	}

	public Date getTsUltimaModifica() {
		return this.tsUltimaModifica;
	}

	public void setTsUltimaModifica(Timestamp tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}

	public List<FatTMonitorInvioSdi> getListMonitorInvioSdi() {
		return this.listMonitorInvioSdi;
	}

	public void setListMonitorInvioSdi(List<FatTMonitorInvioSdi> listMonitorInvioSdi) {
		this.listMonitorInvioSdi = listMonitorInvioSdi;
	}

	public FatTMonitorInvioSdi addFatTMonitorInvioSdi(FatTMonitorInvioSdi fatTMonitorInvioSdi) {
		getListMonitorInvioSdi().add(fatTMonitorInvioSdi);
		fatTMonitorInvioSdi.setDizTipElementoInviato(this);

		return fatTMonitorInvioSdi;
	}

	public FatTMonitorInvioSdi removeFatTMonitorInvioSdi(FatTMonitorInvioSdi fatTMonitorInvioSdi) {
		getListMonitorInvioSdi().remove(fatTMonitorInvioSdi);
		fatTMonitorInvioSdi.setDizTipElementoInviato(null);

		return fatTMonitorInvioSdi;
	}

	public Serializable getPrimaryKey() {
		return this.idDizTipElementoInviato;
	}

}