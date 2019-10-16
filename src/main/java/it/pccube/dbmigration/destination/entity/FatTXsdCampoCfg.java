package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 * The persistent class for the FAT_T_XSD_CAMPO_CFG database table.
 * 
 */
@Entity
@Table(name="FAT_T_XSD_CAMPO_CFG")
public class FatTXsdCampoCfg implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CONFIG_XSD_CAMPO")
	private Long idConfigXsdCampo;

	@Column(name="FL_OBBLIGATORIO")
	private Boolean flObbligatorio;

	@Column(name="NM_NOME_CAMPO")
	private String nmNomeCampo;

	@Column(name="NM_NOME_CAMPO_MAPPING")
	private String nmNomeCampoMapping;

	@Column(name="NM_NOME_TABELLA_MAPPING")
	private String nmNomeTabellaMapping;

	//bi-directional many-to-one association to FatTXsdSezioneCfg
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_CONFIG_XSD_SEZIONE")
	private FatTXsdSezioneCfg xsdSezioneCfg;

	public FatTXsdCampoCfg() {
	}

	public Long getIdConfigXsdCampo() {
		return this.idConfigXsdCampo;
	}

	public void setIdConfigXsdCampo(Long idConfigXsdCampo) {
		this.idConfigXsdCampo = idConfigXsdCampo;
	}

	public Boolean getFlObbligatorio() {
		return this.flObbligatorio;
	}

	public void setFlObbligatorio(Boolean flObbligatorio) {
		this.flObbligatorio = flObbligatorio;
	}

	public String getNmNomeCampo() {
		return this.nmNomeCampo;
	}

	public void setNmNomeCampo(String nmNomeCampo) {
		this.nmNomeCampo = nmNomeCampo;
	}

	public String getNmNomeCampoMapping() {
		return this.nmNomeCampoMapping;
	}

	public void setNmNomeCampoMapping(String nmNomeCampoMapping) {
		this.nmNomeCampoMapping = nmNomeCampoMapping;
	}

	public String getNmNomeTabellaMapping() {
		return this.nmNomeTabellaMapping;
	}

	public void setNmNomeTabellaMapping(String nmNomeTabellaMapping) {
		this.nmNomeTabellaMapping = nmNomeTabellaMapping;
	}

	public FatTXsdSezioneCfg getXsdSezioneCfg() {
		return this.xsdSezioneCfg;
	}

	public void setXsdSezioneCfg(FatTXsdSezioneCfg xsdSezioneCfg) {
		this.xsdSezioneCfg = xsdSezioneCfg;
	}

	public Serializable getPrimaryKey() {
		return this.idConfigXsdCampo;
	}

}