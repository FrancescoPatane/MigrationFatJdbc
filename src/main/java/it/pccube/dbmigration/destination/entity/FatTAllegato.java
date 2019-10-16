package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_ALLEGATO database table.
 * 
 */
@Entity
@Table(name="FAT_T_ALLEGATO")
public class FatTAllegato implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_ALLEGATO_IDALLEGATO_GENERATOR",sequenceName="SEQ_ID_ALLEGATO",allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_ALLEGATO_IDALLEGATO_GENERATOR")
	@Column(name="ID_ALLEGATO")
	private Long idAllegato;

	@Column(name="DS_DESCRIZIONE_ATTACHMENT")
	
	private String dsDescrizioneAttachment;

	@Column(name="NM_ALGORITMO_COMPRESSIONE")
	
	private String nmAlgoritmoCompressione;

	@Column(name="NM_FORMATO_ATTACHMENT")
	
	private String nmFormatoAttachment;

	@Column(name="NM_NOME_ATTACHMENT")
	
	private String nmNomeAttachment;

	@Column(name="NM_UTENTE_INSERIMENTO")
	
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	
	private String nmUtenteUltimaModifica;

	@Column(name="ID_ATTACHMENT")
	
	private String idAttachment;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FATTURA")
	private FatTFattura fattura;

	public FatTAllegato() {
	}

	public Long getIdAllegato() {
		return this.idAllegato;
	}

	public void setIdAllegato(Long idAllegato) {
		this.idAllegato = idAllegato;
	}

	public String getDsDescrizioneAttachment() {
		return this.dsDescrizioneAttachment;
	}

	public void setDsDescrizioneAttachment(String dsDescrizioneAttachment) {
		this.dsDescrizioneAttachment = dsDescrizioneAttachment;
	}

	public String getNmAlgoritmoCompressione() {
		return this.nmAlgoritmoCompressione;
	}

	public void setNmAlgoritmoCompressione(String nmAlgoritmoCompressione) {
		this.nmAlgoritmoCompressione = nmAlgoritmoCompressione;
	}

	public String getNmFormatoAttachment() {
		return this.nmFormatoAttachment;
	}

	public void setNmFormatoAttachment(String nmFormatoAttachment) {
		this.nmFormatoAttachment = nmFormatoAttachment;
	}

	public String getNmNomeAttachment() {
		return this.nmNomeAttachment;
	}

	public void setNmNomeAttachment(String nmNomeAttachment) {
		this.nmNomeAttachment = nmNomeAttachment;
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

	public FatTFattura getFattura() {
		return this.fattura;
	}

	public void setFattura(FatTFattura fatTFattura) {
		this.fattura = fatTFattura;
	}

	public Serializable getPrimaryKey() {
		return this.idAllegato;
	}

	public String getIdAttachment() {
		return idAttachment;
	}

	public void setIdAttachment(String idAttachment) {
		this.idAttachment = idAttachment;
	}
	

}