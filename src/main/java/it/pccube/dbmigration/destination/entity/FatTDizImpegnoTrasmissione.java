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
 * The persistent class for the FAT_T_DIZ_IMPEGNO_TRASMISSIONE database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_IMPEGNO_TRASMISSIONE")
public class FatTDizImpegnoTrasmissione implements EntityInterface {

	private static final long serialVersionUID = 7569419440352749108L;

	@Id
	@Column(name="ID_DIZ_IMPEGNO_TRASMISSIONE")
	private Long idDizImpegnoTrasmissione;

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

	//bi-directional many-to-one association to FatTRicImprontaArchivio
	@OneToMany(mappedBy="dizImpegnoTrasmissione")
	private List<FatTRicImprontaArchivio> listRicImprontaArchivio;

	public FatTDizImpegnoTrasmissione() {
	}

	public Long getIdDizImpegnoTrasmissione() {
		return this.idDizImpegnoTrasmissione;
	}

	public void setIdDizImpegnoTrasmissione(Long idDizImpegnoTrasmissione) {
		this.idDizImpegnoTrasmissione = idDizImpegnoTrasmissione;
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

	public List<FatTRicImprontaArchivio> getListRicImprontaArchivios() {
		return this.listRicImprontaArchivio;
	}

	public void setListRicImprontaArchivios(List<FatTRicImprontaArchivio> fatTRicImprontaArchivios) {
		this.listRicImprontaArchivio = fatTRicImprontaArchivios;
	}

	public FatTRicImprontaArchivio addFatTRicImprontaArchivio(FatTRicImprontaArchivio fatTRicImprontaArchivio) {
		getListRicImprontaArchivios().add(fatTRicImprontaArchivio);
		fatTRicImprontaArchivio.setDizImpegnoTrasmissione(this);

		return fatTRicImprontaArchivio;
	}

	public FatTRicImprontaArchivio removeFatTRicImprontaArchivio(FatTRicImprontaArchivio fatTRicImprontaArchivio) {
		getListRicImprontaArchivios().remove(fatTRicImprontaArchivio);
		fatTRicImprontaArchivio.setDizImpegnoTrasmissione(null);

		return fatTRicImprontaArchivio;
	}

	public Serializable getPrimaryKey() {
		return this.idDizImpegnoTrasmissione;
	}

}