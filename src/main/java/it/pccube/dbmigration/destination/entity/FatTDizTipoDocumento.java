package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the FE_DIZ_TIPO_DOCUMENTO database table.
 * 
 */
@Entity
@Table(name = "FAT_T_DIZ_TIPO_DOCUMENTO")
public class FatTDizTipoDocumento implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_DIZ_TIPO_DOCUMENTO")
	private long idDizTipoDocumento;

	
	@Column(name = "CD_CODICE")
	private String cdCodice;

	
	@Column(name = "DS_DESCRIZIONE")
	private String dsDescrizione;

	// bi-directional many-to-one association to FatturaStorico
	// @OneToMany(mappedBy="feDizTipoDocumento")
	// private List<FatturaStorico> feFatturaStoricos;

	public FatTDizTipoDocumento() {
	}

	public long getIdDizTipoDocumento() {
		return this.idDizTipoDocumento;
	}

	public void setIdDizTipoDocumento(long idDizTipoDocumento) {
		this.idDizTipoDocumento = idDizTipoDocumento;
	}

	/**
	 * @return the cdCodice
	 */
	public String getCdCodice() {
		return cdCodice;
	}

	/**
	 * @param cdCodice
	 *            the cdCodice to set
	 */
	public void setCdCodice(String cdCodice) {
		this.cdCodice = cdCodice;
	}

	/**
	 * @return the dsDescrizione
	 */
	public String getDsDescrizione() {
		return dsDescrizione;
	}

	/**
	 * @param dsDescrizione
	 *            the dsDescrizione to set
	 */
	public void setDsDescrizione(String dsDescrizione) {
		this.dsDescrizione = dsDescrizione;
	}

	public Serializable getPrimaryKey() {
		return this.idDizTipoDocumento;
	}

	// public List<FatturaStorico> getFeFatturaStoricos() {
	// return this.feFatturaStoricos;
	// }
	//
	// public void setFeFatturaStoricos(List<FatturaStorico> feFatturaStoricos)
	// {
	// this.feFatturaStoricos = feFatturaStoricos;
	// }
	//
	// public FatturaStorico addFeFatturaStorico(FatturaStorico
	// feFatturaStorico) {
	// getFeFatturaStoricos().add(feFatturaStorico);
	// feFatturaStorico.setFeDizTipoDocumento(this);
	//
	// return feFatturaStorico;
	// }
	//
	// public FatturaStorico removeFeFatturaStorico(FatturaStorico
	// feFatturaStorico) {
	// getFeFatturaStoricos().remove(feFatturaStorico);
	// feFatturaStorico.setFeDizTipoDocumento(null);
	//
	// return feFatturaStorico;
	// }

}