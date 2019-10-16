package it.pccube.dbmigration.destination.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 * The persistent class for the FAT_T_MACROSEZ_APP_CFG database table.
 * 
 */
@Entity
@Table(name="FAT_T_MACROSEZ_APP_CFG")
public class FatTMacrosezAppCfg implements EntityInterface {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CONFIG_MACROSEZ_APP")
	private Long idConfigMacrosezApp;

	@Column(name="DS_DESCRIZIONE")
	
	private String dsDescrizione;

	@Column(name="FL_OBBLIGATORIO")
	
	private Boolean flObbligatorio;

	@Column(name="NM_CONTESTO")
	
	private String nmContesto;

	//bi-directional many-to-one association to FatTCompilazioneSezione
	@OneToMany(mappedBy="macrosezAppCfg")
	private List<FatTCompilazioneSezione> listCompilazioneSezione;

	//bi-directional many-to-one association to FatTCompSezioneStor
	@OneToMany(mappedBy="macrosezAppCfg")
	private List<FatTCompSezioneStor> listCompSezioneStor;

	//bi-directional many-to-one association to FatTXsdSezioneCfg
	@OneToMany(mappedBy="macrosezAppCfg")
	private List<FatTXsdSezioneCfg> listXsdSezioneCfg;

	public FatTMacrosezAppCfg() {
	}

	public Long getIdConfigMacrosezApp() {
		return this.idConfigMacrosezApp;
	}

	public void setIdConfigMacrosezApp(Long idConfigMacrosezApp) {
		this.idConfigMacrosezApp = idConfigMacrosezApp;
	}

	public String getDsDescrizione() {
		return this.dsDescrizione;
	}

	public void setDsDescrizione(String dsDescrizione) {
		this.dsDescrizione = dsDescrizione;
	}

	public Boolean getFlObbligatorio() {
		return this.flObbligatorio;
	}

	public void setFlObbligatorio(Boolean flObbligatorio) {
		this.flObbligatorio = flObbligatorio;
	}

	public String getNmContesto() {
		return this.nmContesto;
	}

	public void setNmContesto(String nmContesto) {
		this.nmContesto = nmContesto;
	}

	public List<FatTCompilazioneSezione> getListCompilazioneSezione() {
		return this.listCompilazioneSezione;
	}

	public void setListCompilazioneSezione(List<FatTCompilazioneSezione> listCompilazioneSezione) {
		this.listCompilazioneSezione = listCompilazioneSezione;
	}

	public FatTCompilazioneSezione addFatTCompilazioneSezione(FatTCompilazioneSezione fatTCompilazioneSezione) {
		getListCompilazioneSezione().add(fatTCompilazioneSezione);
		fatTCompilazioneSezione.setMacrosezAppCfg(this);

		return fatTCompilazioneSezione;
	}

	public FatTCompilazioneSezione removeFatTCompilazioneSezione(FatTCompilazioneSezione fatTCompilazioneSezione) {
		getListCompilazioneSezione().remove(fatTCompilazioneSezione);
		fatTCompilazioneSezione.setMacrosezAppCfg(null);

		return fatTCompilazioneSezione;
	}

	public List<FatTCompSezioneStor> getListCompSezioneStor() {
		return this.listCompSezioneStor;
	}

	public void setListCompSezioneStor(List<FatTCompSezioneStor> listCompSezioneStor) {
		this.listCompSezioneStor = listCompSezioneStor;
	}

	public FatTCompSezioneStor addFatTCompSezioneStor(FatTCompSezioneStor fatTCompSezioneStor) {
		getListCompSezioneStor().add(fatTCompSezioneStor);
		fatTCompSezioneStor.setMacrosezAppCfg(this);

		return fatTCompSezioneStor;
	}

	public FatTCompSezioneStor removeFatTCompSezioneStor(FatTCompSezioneStor fatTCompSezioneStor) {
		getListCompSezioneStor().remove(fatTCompSezioneStor);
		fatTCompSezioneStor.setMacrosezAppCfg(null);

		return fatTCompSezioneStor;
	}

	public List<FatTXsdSezioneCfg> getListXsdSezioneCfg() {
		return this.listXsdSezioneCfg;
	}

	public void setFatTXsdSezioneCfgs(List<FatTXsdSezioneCfg> listXsdSezioneCfg) {
		this.listXsdSezioneCfg = listXsdSezioneCfg;
	}

	public FatTXsdSezioneCfg addFatTXsdSezioneCfg(FatTXsdSezioneCfg fatTXsdSezioneCfg) {
		getListXsdSezioneCfg().add(fatTXsdSezioneCfg);
		fatTXsdSezioneCfg.setMacrosezAppCfg(this);

		return fatTXsdSezioneCfg;
	}

	public FatTXsdSezioneCfg removeFatTXsdSezioneCfg(FatTXsdSezioneCfg fatTXsdSezioneCfg) {
		getListXsdSezioneCfg().remove(fatTXsdSezioneCfg);
		fatTXsdSezioneCfg.setMacrosezAppCfg(null);

		return fatTXsdSezioneCfg;
	}

	public Serializable getPrimaryKey() {
		return this.idConfigMacrosezApp;
	}

}