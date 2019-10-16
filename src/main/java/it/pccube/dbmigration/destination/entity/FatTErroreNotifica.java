package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import javax.persistence.*;


import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the FAT_T_ERRORE_NOTIFICA database table.
 * 
 */
@Entity
@Table(name="FAT_T_ERRORE_NOTIFICA")
public class FatTErroreNotifica implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_ERRORE_NOTIFICA_IDERRORENOTIFICA_GENERATOR", sequenceName="SEQ_ID_ERRORE_NOTIFICA",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_ERRORE_NOTIFICA_IDERRORENOTIFICA_GENERATOR")
	@Column(name="ID_ERRORE_NOTIFICA")
	private Long idErroreNotifica;

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

	//bi-directional many-to-one association to FatTNotifica
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_NOTIFICA")
	private FatTNotifica notifica;

	public FatTErroreNotifica() {
	}

	public Long getIdErroreNotifica() {
		return this.idErroreNotifica;
	}

	public void setIdErroreNotifica(Long idErroreNotifica) {
		this.idErroreNotifica = idErroreNotifica;
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

	public void setTsInserimento(Timestamp tsInserimento) {
		this.tsInserimento = tsInserimento;
	}

	public Date getTsUltimaModifica() {
		return this.tsUltimaModifica;
	}

	public void setTsUltimaModifica(Timestamp tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}

	public FatTNotifica getNotifica() {
		return this.notifica;
	}

	public void setNotifica(FatTNotifica notifica) {
		this.notifica = notifica;
	}

	public Serializable getPrimaryKey() {
		return this.idErroreNotifica;
	}

}