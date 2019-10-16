package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_CONSERV_AUTORE_LOTTO database table.
 * 
 */
@Entity
@Table(name="FAT_T_CONSERV_AUTORE_LOTTO")
public class FatTConservAutoreLotto implements EntityInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_CONSERV_AUTORE_LOTTO_IDCONSERVAZAUTORELOTTO_GENERATOR", sequenceName="SEQ_ID_CONSERVAZ_AUTORE_LOTTO", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_CONSERV_AUTORE_LOTTO_IDCONSERVAZAUTORELOTTO_GENERATOR")
	@Column(name="ID_CONSERVAZ_AUTORE_LOTTO")
	private Long idConservazAutoreLotto;

	@Column(name="CD_CODICE_FISCALE")
	private String cdCodiceFiscale;

	@Column(name="ID_LOTTO")
	private Long idLotto;

	@Column(name="ID_UTENTE_AUTORE")
	private Long idUtenteAutore;

	@Column(name="NM_COGNOME")
	private String nmCognome;

	@Column(name="NM_NOME")
	private String nmNome;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Column(name="PG_VERSIONE_LOTTO")
	private BigDecimal pgVersioneLotto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	public FatTConservAutoreLotto() {
	}

	public Long getIdConservazAutoreLotto() {
		return this.idConservazAutoreLotto;
	}

	public void setIdConservazAutoreLotto(Long idConservazAutoreLotto) {
		this.idConservazAutoreLotto = idConservazAutoreLotto;
	}

	public String getCdCodiceFiscale() {
		return this.cdCodiceFiscale;
	}

	public void setCdCodiceFiscale(String cdCodiceFiscale) {
		this.cdCodiceFiscale = cdCodiceFiscale;
	}

	public Long getIdLotto() {
		return this.idLotto;
	}

	public void setIdLotto(Long idLotto) {
		this.idLotto = idLotto;
	}

	public Long getIdUtenteAutore() {
		return this.idUtenteAutore;
	}

	public void setIdUtenteAutore(Long idUtenteAutore) {
		this.idUtenteAutore = idUtenteAutore;
	}

	public String getNmCognome() {
		return this.nmCognome;
	}

	public void setNmCognome(String nmCognome) {
		this.nmCognome = nmCognome;
	}

	public String getNmNome() {
		return this.nmNome;
	}

	public void setNmNome(String nmNome) {
		this.nmNome = nmNome;
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

	public BigDecimal getPgVersioneLotto() {
		return this.pgVersioneLotto;
	}

	public void setPgVersioneLotto(BigDecimal pgVersioneLotto) {
		this.pgVersioneLotto = pgVersioneLotto;
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

	public Serializable getPrimaryKey() {
		return this.idConservazAutoreLotto;
	}

}