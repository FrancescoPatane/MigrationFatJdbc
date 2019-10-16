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
 * The persistent class for the FAT_T_DIZ_TIPO_ASSEGNAZIONE database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_TIPO_ASSEGNAZIONE")
public class FatTDizTipoAssegnazione implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DIZ_TIPO_ASSEGNAZIONE")
	private Long idDizTipoAssegnazione;

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

	//bi-directional many-to-one association to FatTAssegnazione
	@OneToMany(mappedBy="dizTipoAssegnazione")
	private List<FatTAssegnazione> listAssegnazione;

	public FatTDizTipoAssegnazione() {
	}

	public Long getIdDizTipoAssegnazione() {
		return this.idDizTipoAssegnazione;
	}

	public void setIdDizTipoAssegnazione(Long idDizTipoAssegnazione) {
		this.idDizTipoAssegnazione = idDizTipoAssegnazione;
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

	public List<FatTAssegnazione> getListAssegnazione() {
		return this.listAssegnazione;
	}

	public void setListAssegnazione(List<FatTAssegnazione> listAssegnazione) {
		this.listAssegnazione = listAssegnazione;
	}

	public FatTAssegnazione addFatTAssegnazione(FatTAssegnazione fatTAssegnazione) {
		getListAssegnazione().add(fatTAssegnazione);
		fatTAssegnazione.setDizTipoAssegnazione(this);

		return fatTAssegnazione;
	}

	public FatTAssegnazione removeFatTAssegnazione(FatTAssegnazione fatTAssegnazione) {
		getListAssegnazione().remove(fatTAssegnazione);
		fatTAssegnazione.setDizTipoAssegnazione(null);

		return fatTAssegnazione;
	}

	public Serializable getPrimaryKey() {
		return this.idDizTipoAssegnazione;
	}

}