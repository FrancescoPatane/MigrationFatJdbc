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
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the FAT_T_LOTTO_RIC_ESTR_UFF database table.
 * 
 */
@Entity
@Table(name="FAT_T_LOTTO_RIC_ESTR_UFF")
public class FatTLottoRicEstrUff implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FAT_T_LOTTO_RIC_ESTR_UFF_IDLOTTORICHIESTAESTRUFF_GENERATOR", sequenceName="SEQ_ID_LOTTO_RIC_ESTR_UFF", allocationSize=1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FAT_T_LOTTO_RIC_ESTR_UFF_IDLOTTORICHIESTAESTRUFF_GENERATOR")
	@Column(name="ID_LOTTO_RICHIESTA_ESTR_UFF")
	private Long idLottoRichiestaEstrUff;

	@Column(name="CD_STATO")
	private String cdStato;

	@Column(name="ID_RIC_ESTRAZIONE_UFFICIALE")
	private Long idRicEstrazioneUfficiale;

	@Column(name="ID_SEDIA_RIC")
	private Long idSediaRic;

	@Column(name="NM_UTENTE_INSERIMENTO")
	private String nmUtenteInserimento;

	@Column(name="NM_UTENTE_ULTIMA_MODIFICA")
	private String nmUtenteUltimaModifica;

	@Column(name="PG_VERSIONE_LOTTO")
	private Long pgVersioneLotto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_INSERIMENTO")
	private Date tsInserimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TS_ULTIMA_MODIFICA")
	private Date tsUltimaModifica;

	//bi-directional many-to-one association to FatTLotto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_LOTTO")
	private FatTLotto lotto;

	public FatTLottoRicEstrUff() {
	}

	public Long getIdLottoRichiestaEstrUff() {
		return this.idLottoRichiestaEstrUff;
	}

	public void setIdLottoRichiestaEstrUff(Long idLottoRichiestaEstrUff) {
		this.idLottoRichiestaEstrUff = idLottoRichiestaEstrUff;
	}

	public String getCdStato() {
		return this.cdStato;
	}

	public void setCdStato(String cdStato) {
		this.cdStato = cdStato;
	}

	public Long getIdRicEstrazioneUfficiale() {
		return this.idRicEstrazioneUfficiale;
	}

	public void setIdRicEstrazioneUfficiale(Long idRicEstrazioneUfficiale) {
		this.idRicEstrazioneUfficiale = idRicEstrazioneUfficiale;
	}

	public Long getIdSediaRic() {
		return this.idSediaRic;
	}

	public void setIdSediaRic(Long idSediaRic) {
		this.idSediaRic = idSediaRic;
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

	public Long getPgVersioneLotto() {
		return this.pgVersioneLotto;
	}

	public void setPgVersioneLotto(Long pgVersioneLotto) {
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

	public FatTLotto getLotto() {
		return this.lotto;
	}

	public void setLotto(FatTLotto lotto) {
		this.lotto = lotto;
	}

	public Serializable getPrimaryKey() {
		return this.idLottoRichiestaEstrUff;
	}

}