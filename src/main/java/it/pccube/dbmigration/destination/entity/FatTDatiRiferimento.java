package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the FAT_T_DATI_RIFERIMENTO database table.
 * 
 */
@Entity
@Table(name = "FAT_T_DATI_RIFERIMENTO")
public class FatTDatiRiferimento implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FAT_T_DATI_RIFERIMENTO_IDDATIRIFERIMENTO_GENERATOR", sequenceName = "SEQ_ID_DATI_RIFERIMENTO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAT_T_DATI_RIFERIMENTO_IDDATIRIFERIMENTO_GENERATOR")
	@Column(name = "ID_DATI_RIFERIMENTO")
	private Long idDatiRiferimento;

	@Column(name = "CD_CODICE_CIG")
	
	private String cdCodiceCig;

	@Column(name = "CD_CODICE_COMMESSA_CONVENZIONE")
	
	private String cdCodiceCommessaConvenzione;

	@Column(name = "CD_CODICE_CUP")
	
	private String cdCodiceCup;

	@Column(name = "CD_DOCUMENTO")
	
	private String cdDocumento;

	@Column(name = "CD_NUM_ITEM")
	
	private String cdNumItem;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_DATA")
	
	private Date dtData;

	@Column(name = "FL_EPROC")
	
	private Boolean flEproc;

	@Column(name = "ID_IDT")
	
	private Long idIdt;

	@Column(name = "ID_ORDINE_ACQUISTO")
	private Long idOrdineAcquisto;

	@Column(name = "ID_TRATTATIVA")
	private Long idTrattativa;

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

	// bi-directional many-to-one association to FatARiferimentoLinea
	@OneToMany(mappedBy = "datiRiferimento", orphanRemoval = true)
	private List<FatARiferimentoLinea> listRiferimentoLinea;

	// bi-directional many-to-one association to FatTDizTipoIniziativa
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DIZ_TIPO_INIZIATIVA")
	private FatTDizTipoIniziativa dizTipoIniziativa;

	// bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_FATTURA")
	private FatTFattura fattura;

	// bi-directional many-to-one association to FatTFattura
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_FATTURA_COLLEGATA")
	private FatTFattura fatturaCollegata;

	// bi-directional many-to-one association to FatTDizTipoDatiRif
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DIZ_TIPO_DATI_RIFERIMENTO")
	private FatTDizTipoDatiRif dizTipoDatiRif;

	public FatTDatiRiferimento() {
	}

	public Long getIdDatiRiferimento() {
		return this.idDatiRiferimento;
	}

	public void setIdDatiRiferimento(long idDatiRiferimento) {
		this.idDatiRiferimento = idDatiRiferimento;
	}

	public String getCdCodiceCig() {
		return this.cdCodiceCig;
	}

	public void setCdCodiceCig(String cdCodiceCig) {
		this.cdCodiceCig = cdCodiceCig;
	}

	public String getCdCodiceCommessaConvenzione() {
		return this.cdCodiceCommessaConvenzione;
	}

	public void setCdCodiceCommessaConvenzione(String cdCodiceCommessaConvenzione) {
		this.cdCodiceCommessaConvenzione = cdCodiceCommessaConvenzione;
	}

	public String getCdCodiceCup() {
		return this.cdCodiceCup;
	}

	public void setCdCodiceCup(String cdCodiceCup) {
		this.cdCodiceCup = cdCodiceCup;
	}

	public String getCdDocumento() {
		return this.cdDocumento;
	}

	public void setCdDocumento(String cdDocumento) {
		this.cdDocumento = cdDocumento;
	}

	public String getCdNumItem() {
		return this.cdNumItem;
	}

	public void setCdNumItem(String cdNumItem) {
		this.cdNumItem = cdNumItem;
	}

	public Date getDtData() {
		return this.dtData;
	}

	public void setDtData(Date dtData) {
		this.dtData = dtData;
	}

	public Boolean getFlEproc() {
		return this.flEproc;
	}

	public void setFlEproc(Boolean flEproc) {
		this.flEproc = flEproc;
	}

	public Long getIdIdt() {
		return this.idIdt;
	}

	public void setIdIdt(Long idIdt) {
		this.idIdt = idIdt;
	}

	public Long getIdOrdineAcquisto() {
		return this.idOrdineAcquisto;
	}

	public void setIdOrdineAcquisto(Long idOrdineAcquisto) {
		this.idOrdineAcquisto = idOrdineAcquisto;
	}

	public Long getIdTrattativa() {
		return this.idTrattativa;
	}

	public void setIdTrattativa(Long idTrattativa) {
		this.idTrattativa = idTrattativa;
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

	public List<FatARiferimentoLinea> getListRiferimentoLinea() {
		return this.listRiferimentoLinea;
	}

	public void setListRiferimentoLinea(List<FatARiferimentoLinea> listRiferimentoLinea) {
		this.listRiferimentoLinea = listRiferimentoLinea;
	}

	public FatARiferimentoLinea addFatARiferimentoLinea(FatARiferimentoLinea fatARiferimentoLinea) {
		getListRiferimentoLinea().add(fatARiferimentoLinea);
		fatARiferimentoLinea.setDatiRiferimento(this);

		return fatARiferimentoLinea;
	}

	public FatARiferimentoLinea removeFatARiferimentoLinea(FatARiferimentoLinea fatARiferimentoLinea) {
		getListRiferimentoLinea().remove(fatARiferimentoLinea);
		fatARiferimentoLinea.setDatiRiferimento(null);

		return fatARiferimentoLinea;
	}

	public FatTDizTipoIniziativa getDizTipoIniziativa() {
		return this.dizTipoIniziativa;
	}

	public void setDizTipoIniziativa(FatTDizTipoIniziativa dizTipoIniziativa) {
		this.dizTipoIniziativa = dizTipoIniziativa;
	}

	public FatTFattura getFattura() {
		return this.fattura;
	}

	public void setFattura(FatTFattura fattura1) {
		this.fattura = fattura1;
	}

	public FatTFattura getFatturaCollegata() {
		return this.fatturaCollegata;
	}

	public void setFatturaCollegata(FatTFattura fattura2) {
		this.fatturaCollegata = fattura2;
	}

	public FatTDizTipoDatiRif getDizTipoDatiRif() {
		return this.dizTipoDatiRif;
	}

	public void setDizTipoDatiRif(FatTDizTipoDatiRif dizTipoDatiRif) {
		this.dizTipoDatiRif = dizTipoDatiRif;
	}

	public Serializable getPrimaryKey() {
		return this.idDatiRiferimento;
	}

}