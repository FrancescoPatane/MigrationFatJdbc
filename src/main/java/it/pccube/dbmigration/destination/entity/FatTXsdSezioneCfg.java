package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 * The persistent class for the FAT_T_XSD_SEZIONE_CFG database table.
 * 
 */
@Entity
@Table(name="FAT_T_XSD_SEZIONE_CFG")
public class FatTXsdSezioneCfg implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CONFIG_XSD_SEZIONE")
	private Long idConfigXsdSezione;

	@Column(name="FL_OBBLIGATORIO")
	private Boolean flObbligatorio;

	@Column(name="NM_NOME_SEZIONE")
	private String nmNomeSezione;

	//bi-directional many-to-one association to FatTXsdCampoCfg
	@OneToMany(mappedBy="xsdSezioneCfg")
	private List<FatTXsdCampoCfg> listXsdCampoCfg;

	//bi-directional many-to-one association to FatTMacrosezAppCfg
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_CONFIG_MACROSEZ_APP")
	private FatTMacrosezAppCfg macrosezAppCfg;

	//bi-directional many-to-one association to FatTXsdSezioneCfg
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_CONFIG_XSD_SEZIONE_PADRE")
	private FatTXsdSezioneCfg xsdSezioneCfg;

	//bi-directional many-to-one association to FatTXsdSezioneCfg
	@OneToMany(mappedBy="xsdSezioneCfg")
	private List<FatTXsdSezioneCfg> listXsdSezioneCfg;

	public FatTXsdSezioneCfg() {
	}

	public Long getIdConfigXsdSezione() {
		return this.idConfigXsdSezione;
	}

	public void setIdConfigXsdSezione(Long idConfigXsdSezione) {
		this.idConfigXsdSezione = idConfigXsdSezione;
	}

	public Boolean getFlObbligatorio() {
		return this.flObbligatorio;
	}

	public void setFlObbligatorio(Boolean flObbligatorio) {
		this.flObbligatorio = flObbligatorio;
	}

	public String getNmNomeSezione() {
		return this.nmNomeSezione;
	}

	public void setNmNomeSezione(String nmNomeSezione) {
		this.nmNomeSezione = nmNomeSezione;
	}

	public List<FatTXsdCampoCfg> getListXsdCampoCfg() {
		return this.listXsdCampoCfg;
	}

	public void setListXsdCampoCfg(List<FatTXsdCampoCfg> listXsdCampoCfg) {
		this.listXsdCampoCfg = listXsdCampoCfg;
	}

	public FatTXsdCampoCfg addFatTXsdCampoCfg(FatTXsdCampoCfg fatTXsdCampoCfg) {
		getListXsdCampoCfg().add(fatTXsdCampoCfg);
		fatTXsdCampoCfg.setXsdSezioneCfg(this);

		return fatTXsdCampoCfg;
	}

	public FatTXsdCampoCfg removeFatTXsdCampoCfg(FatTXsdCampoCfg fatTXsdCampoCfg) {
		getListXsdCampoCfg().remove(fatTXsdCampoCfg);
		fatTXsdCampoCfg.setXsdSezioneCfg(null);

		return fatTXsdCampoCfg;
	}

	public FatTMacrosezAppCfg getMacrosezAppCfg() {
		return this.macrosezAppCfg;
	}

	public void setMacrosezAppCfg(FatTMacrosezAppCfg macrosezAppCfg) {
		this.macrosezAppCfg = macrosezAppCfg;
	}

	public FatTXsdSezioneCfg getXsdSezioneCfg() {
		return this.xsdSezioneCfg;
	}

	public void setXsdSezioneCfg(FatTXsdSezioneCfg xsdSezioneCfg) {
		this.xsdSezioneCfg = xsdSezioneCfg;
	}

	public List<FatTXsdSezioneCfg> getListXsdSezioneCfg() {
		return this.listXsdSezioneCfg;
	}

	public void setListXsdSezioneCfg(List<FatTXsdSezioneCfg> listXsdSezioneCfg) {
		this.listXsdSezioneCfg = listXsdSezioneCfg;
	}

	public FatTXsdSezioneCfg addFatTXsdSezioneCfg(FatTXsdSezioneCfg fatTXsdSezioneCfg) {
		getListXsdSezioneCfg().add(fatTXsdSezioneCfg);
		fatTXsdSezioneCfg.setXsdSezioneCfg(this);

		return fatTXsdSezioneCfg;
	}

	public FatTXsdSezioneCfg removeFatTXsdSezioneCfg(FatTXsdSezioneCfg fatTXsdSezioneCfg) {
		getListXsdSezioneCfg().remove(fatTXsdSezioneCfg);
		fatTXsdSezioneCfg.setXsdSezioneCfg(null);

		return fatTXsdSezioneCfg;
	}

	public Serializable getPrimaryKey() {
		return this.idConfigXsdSezione;
	}

}