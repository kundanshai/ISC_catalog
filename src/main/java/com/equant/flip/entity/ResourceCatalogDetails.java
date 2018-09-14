package com.equant.flip.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name = "table_partnum_view")
@NamedNativeQuery(name = "findpartnumview",
		query = "select objid,part_no,description,mod_level,family,line,part_type,domain,active,part_num_objid,mod_active,dom_serialno,dom_uniquesn,"
				+ "dom_catalogs,dom_boms,dom_at_site,dom_at_parts,"
				+ "dom_at_domain,dom_pt_used_bom,"
				+ "dom_pr_used_dom,model_num,sn_track,dom_pt_used_warn,std_warranty,incl_domain,notes,is_sppt_prog,unit_measure,dom_literature,dom_is_service,p_standalone,p_as_parent,p_as_child,turn_ratio,abc_code,config_type,ml_mod_active,ml_family,ml_line,ml_part_type,ml_active,x_interfaced,x_gsa_revision,x_part_class,x_login_name from table_partnum_view where S_PART_NO=:S_PART_NO AND mod_level=:mod_level", resultClass = ResourceCatalogDetails.class)

public class ResourceCatalogDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "objid")
	private String objid;
	@Column(name = "part_no")
	private String partNo;
	@Column(name = "description")
	private String description;
	@Column(name = "mod_level")
	private String modLevel;
	@Column(name = "family")
	private String family;
	@Column(name = "line")
	private String line;
	@Column(name = "part_type")
	private String partType;
	@Column(name = "domain")
	private String domain;
	@Column(name = "active")
	private String active;
	@Column(name = "part_num_objid")
	private String partNumObjid;
	@Column(name = "mod_active")
	private String modActive;
	@Column(name = "dom_serialno")
	private String domSerialno;
	@Column(name = "dom_uniquesn")
	private String domUniquesn;
	@Column(name = "dom_catalogs")
	private String domCatalogs;
	@Column(name = "dom_boms")
	private String domBoms;
	@Column(name = "dom_at_site")
	private String domAtSite;
	@Column(name = "dom_at_parts")
	private String domAtParts;

	@Column(name = "dom_at_domain")
	private String domAtDomain;

	@Column(name = "dom_pt_used_bom")
	private String domPtUsedBom;
	@Column(name = "dom_pr_used_dom")
	private String domPrUsedDom;
	@Column(name = "model_num")
	private String modelNum;
 
	@Column(name = "sn_track")
	private String snTrack;

	@Column(name = "dom_pt_used_warn")
	private String domPtUsedWarn;

	@Column(name = "std_warranty")
	private String stdWarranty;
	@Column(name = "incl_domain")
	private String inclDomain;
	private String notes;
	@Column(name = "is_sppt_prog")
	private String isSpptProg;
	@Column(name = "unit_measure")
	private String unitMeasure;
	@Column(name = "dom_literature")
	private String domLiterature;
	@Column(name = "dom_is_service")
	private String domIsService;

	@Column(name = "p_standalone")
	private String pStandalone;
	@Column(name = "p_as_parent")
	private String pAsParent;

	@Column(name = "p_as_child")
	private String pAsChild;
	@Column(name = "turn_ratio")
	private String turnRatio;
	@Column(name = "abc_code")
	private String abcCode;
	@Column(name = "config_type")
	private String configType;

	@Column(name = "ml_mod_active")
	private String mlModActive;
	
	@Column(name = "ml_family")
	private String mlFamily;
	@Column(name = "ml_line")
	private String mlLine;

	@Column(name = "ml_part_type")
	private String mlPartType;

	@Column(name = "ml_active")
	private String mlActive;
	@Column(name = "x_interfaced")
	private String xInterfaced;

	@Column(name = "x_gsa_revision")
	private String xGsaRevision;

	@Column(name = "x_part_class")
	private String xPartClass;

	@Column(name = "x_login_name")
	private String xLoginName;

	public String getObjid() {
		return objid;
	}

	public void setObjid(String objid) {
		this.objid = objid;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getModLevel() {
		return modLevel;
	}

	public void setModLevel(String modLevel) {
		this.modLevel = modLevel;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getPartType() {
		return partType;
	}

	public void setPartType(String partType) {
		this.partType = partType;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getPartNumObjid() {
		return partNumObjid;
	}

	public void setPartNumObjid(String partNumObjid) {
		this.partNumObjid = partNumObjid;
	}

	public String getModActive() {
		return modActive;
	}

	public void setModActive(String modActive) {
		this.modActive = modActive;
	}

	public String getDomSerialno() {
		return domSerialno;
	}

	public void setDomSerialno(String domSerialno) {
		this.domSerialno = domSerialno;
	}

	public String getDomUniquesn() {
		return domUniquesn;
	}

	public void setDomUniquesn(String domUniquesn) {
		this.domUniquesn = domUniquesn;
	}

	public String getDomCatalogs() {
		return domCatalogs;
	}

	public void setDomCatalogs(String domCatalogs) {
		this.domCatalogs = domCatalogs;
	}

	public String getDomBoms() {
		return domBoms;
	}

	public void setDomBoms(String domBoms) {
		this.domBoms = domBoms;
	}

	public String getDomAtSite() {
		return domAtSite;
	}

	public void setDomAtSite(String domAtSite) {
		this.domAtSite = domAtSite;
	}

	public String getDomAtParts() {
		return domAtParts;
	}

	public void setDomAtParts(String domAtParts) {
		this.domAtParts = domAtParts;
	}

	public String getDomAtDomain() {
		return domAtDomain;
	}

	public void setDomAtDomain(String domAtDomain) {
		this.domAtDomain = domAtDomain;
	}

	public String getDomPtUsedBom() {
		return domPtUsedBom;
	}

	public void setDomPtUsedBom(String domPtUsedBom) {
		this.domPtUsedBom = domPtUsedBom;
	}

	public String getDomPrUsedDom() {
		return domPrUsedDom;
	}

	public void setDomPrUsedDom(String domPrUsedDom) {
		this.domPrUsedDom = domPrUsedDom;
	}

	public String getModelNum() {
		return modelNum;
	}

	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
	}

	public String getSnTrack() {
		return snTrack;
	}

	public void setSnTrack(String snTrack) {
		this.snTrack = snTrack;
	}

	public String getDomPtUsedWarn() {
		return domPtUsedWarn;
	}

	public void setDomPtUsedWarn(String domPtUsedWarn) {
		this.domPtUsedWarn = domPtUsedWarn;
	}

	public String getStdWarranty() {
		return stdWarranty;
	}

	public void setStdWarranty(String stdWarranty) {
		this.stdWarranty = stdWarranty;
	}

	public String getInclDomain() {
		return inclDomain;
	}

	public void setInclDomain(String inclDomain) {
		this.inclDomain = inclDomain;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getIsSpptProg() {
		return isSpptProg;
	}

	public void setIsSpptProg(String isSpptProg) {
		this.isSpptProg = isSpptProg;
	}

	public String getUnitMeasure() {
		return unitMeasure;
	}

	public void setUnitMeasure(String unitMeasure) {
		this.unitMeasure = unitMeasure;
	}

	public String getDomLiterature() {
		return domLiterature;
	}

	public void setDomLiterature(String domLiterature) {
		this.domLiterature = domLiterature;
	}

	public String getDomIsService() {
		return domIsService;
	}

	public void setDomIsService(String domIsService) {
		this.domIsService = domIsService;
	}

	public String getpStandalone() {
		return pStandalone;
	}

	public void setpStandalone(String pStandalone) {
		this.pStandalone = pStandalone;
	}

	public String getpAsParent() {
		return pAsParent;
	}

	public void setpAsParent(String pAsParent) {
		this.pAsParent = pAsParent;
	}

	public String getpAsChild() {
		return pAsChild;
	}

	public void setpAsChild(String pAsChild) {
		this.pAsChild = pAsChild;
	}

	public String getTurnRatio() {
		return turnRatio;
	}

	public void setTurnRatio(String turnRatio) {
		this.turnRatio = turnRatio;
	}

	public String getAbcCode() {
		return abcCode;
	}

	public void setAbcCode(String abcCode) {
		this.abcCode = abcCode;
	}

	public String getConfigType() {
		return configType;
	}

	public void setConfigType(String configType) {
		this.configType = configType;
	}

	public String getMlModActive() {
		return mlModActive;
	}

	public void setMlModActive(String mlModActive) {
		this.mlModActive = mlModActive;
	}

	public String getMlFamily() {
		return mlFamily;
	}

	public void setMlFamily(String mlFamily) {
		this.mlFamily = mlFamily;
	}

	public String getMlLine() {
		return mlLine;
	}

	public void setMlLine(String mlLine) {
		this.mlLine = mlLine;
	}

	public String getMlPartType() {
		return mlPartType;
	}

	public void setMlPartType(String mlPartType) {
		this.mlPartType = mlPartType;
	}

	public String getMlActive() {
		return mlActive;
	}

	public void setMlActive(String mlActive) {
		this.mlActive = mlActive;
	}

	public String getxInterfaced() {
		return xInterfaced;
	}

	public void setxInterfaced(String xInterfaced) {
		this.xInterfaced = xInterfaced;
	}

	public String getxGsaRevision() {
		return xGsaRevision;
	}

	public void setxGsaRevision(String xGsaRevision) {
		this.xGsaRevision = xGsaRevision;
	}

	public String getxPartClass() {
		return xPartClass;
	}

	public void setxPartClass(String xPartClass) {
		this.xPartClass = xPartClass;
	}

	public String getxLoginName() {
		return xLoginName;
	}

	public void setxLoginName(String xLoginName) {
		this.xLoginName = xLoginName;
	}

	
}
