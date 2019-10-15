package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




/**
 * The persistent class for the FAT_T_DIZ_TIPO_CASSA database table.
 * 
 */
@Entity
@Table(name="FAT_T_DIZ_TIPO_CASSA")
public class FatTDizTipoCassa  {

	@Id
	@Column(name="ID_DIZ_TIPO_CASSA")
	private Long idDizTipoCassa;

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

	//bi-directional many-to-one association to FatTDatiCassaPrevidenz
//	@OneToMany(mappedBy="dizTipoCassa")
//	private List<FatTDatiCassaPrevidenz> listDatiCassaPrevidenz;
//
//	//bi-directional many-to-one association to FatTDatiCassaPrevStor
//	@OneToMany(mappedBy="dizTipoCassa")
//	private List<FatTDatiCassaPrevStor> listDatiCassaPrevStor;

	public FatTDizTipoCassa() {
	}

	public Long getIdDizTipoCassa() {
		return this.idDizTipoCassa;
	}

	public void setIdDizTipoCassa(Long idDizTipoCassa) {
		this.idDizTipoCassa = idDizTipoCassa;
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

	public void setTsInserimento(Date tsInserimento) {
		this.tsInserimento = tsInserimento;
	}

	public Date getTsUltimaModifica() {
		return this.tsUltimaModifica;
	}

	public void setTsUltimaModifica(Date tsUltimaModifica) {
		this.tsUltimaModifica = tsUltimaModifica;
	}

//	public List<FatTDatiCassaPrevidenz> getListDatiCassaPrevidenz() {
//		return this.listDatiCassaPrevidenz;
//	}
//
//	public void setListDatiCassaPrevidenz(List<FatTDatiCassaPrevidenz> listDatiCassaPrevidenz) {
//		this.listDatiCassaPrevidenz = listDatiCassaPrevidenz;
//	}

//	public FatTDatiCassaPrevidenz addFatTDatiCassaPrevidenz(FatTDatiCassaPrevidenz fatTDatiCassaPrevidenz) {
//		getListDatiCassaPrevidenz().add(fatTDatiCassaPrevidenz);
//		fatTDatiCassaPrevidenz.setDizTipoCassa(this);
//
//		return fatTDatiCassaPrevidenz;
//	}

//	public FatTDatiCassaPrevidenz removeFatTDatiCassaPrevidenz(FatTDatiCassaPrevidenz fatTDatiCassaPrevidenz) {
//		getListDatiCassaPrevidenz().remove(fatTDatiCassaPrevidenz);
//		fatTDatiCassaPrevidenz.setDizTipoCassa(null);
//
//		return fatTDatiCassaPrevidenz;
//	}

//	public List<FatTDatiCassaPrevStor> getListDatiCassaPrevStor() {
//		return this.listDatiCassaPrevStor;
//	}
//
//	public void setListDatiCassaPrevStor(List<FatTDatiCassaPrevStor> listDatiCassaPrevStor) {
//		this.listDatiCassaPrevStor = listDatiCassaPrevStor;
//	}

//	public FatTDatiCassaPrevStor addFatTDatiCassaPrevStor(FatTDatiCassaPrevStor fatTDatiCassaPrevStor) {
//		getListDatiCassaPrevStor().add(fatTDatiCassaPrevStor);
//		fatTDatiCassaPrevStor.setDizTipoCassa(this);
//
//		return fatTDatiCassaPrevStor;
//	}

//	public FatTDatiCassaPrevStor removeFatTDatiCassaPrevStor(FatTDatiCassaPrevStor fatTDatiCassaPrevStor) {
//		getListDatiCassaPrevStor().remove(fatTDatiCassaPrevStor);
//		fatTDatiCassaPrevStor.setDizTipoCassa(null);
//
//		return fatTDatiCassaPrevStor;
//	}

	public Serializable getPrimaryKey() {
		return this.idDizTipoCassa;
	}

}