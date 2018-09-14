package com.equant.flip.model;

import java.io.Serializable;
import java.util.List;

import com.equant.flip.entity.ResourceProductRevision;

public class ResourceCatalogDetailsModel implements Serializable{
	
	private static final long serialVersionUID = -175124244872907518L;
	
	private String objid;
	private String partNumber;
	private String sModLevel;
	private String description;
	private String notes;
	private String dynamicCatelog;
	private String modelNumber;
	private String family;
	private String line;
	private String stdWarranty;
	private String unitMeasure;
	private String active;
	
	private List<ResourceProductRevision> resourceProductRevisionList;
	

	private String weight;
	private String dimension;
	private String repairType;

	private String domain;
	
	public String getObjid() {
		return objid;
	}
	public void setObjid(String objid) {
		this.objid = objid;
	}
	private String partType;
	private String abcCode;
	private String className;
	private String turnRatio;
	
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getPartType() {
		return partType;
	}
	public void setPartType(String partType) {
		this.partType = partType;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getsModLevel() {
		return sModLevel;
	}
	public void setsModLevel(String sModLevel) {
		this.sModLevel = sModLevel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
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
	public String getStdWarranty() {
		return stdWarranty;
	}
	public void setStdWarranty(String stdWarranty) {
		this.stdWarranty = stdWarranty;
	}
	public String getUnitMeasure() {
		return unitMeasure;
	}
	public void setUnitMeasure(String unitMeasure) {
		this.unitMeasure = unitMeasure;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}

	public List<ResourceProductRevision> getResourceProductRevisionList() {
		return resourceProductRevisionList;
	}
	public void setResourceProductRevisionList(List<ResourceProductRevision> resourceProductRevisionList) {
		this.resourceProductRevisionList = resourceProductRevisionList;
	}

	
	public String getDynamicCatelog() {
		return dynamicCatelog;
	}
	public void setDynamicCatelog(String dynamicCatelog) {
		this.dynamicCatelog = dynamicCatelog;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getRepairType() {
		return repairType;
	}
	public void setRepairType(String repairType) {
		this.repairType = repairType;
	}
	public String getAbcCode() {
		return abcCode;
	}
	public void setAbcCode(String abcCode) {
		this.abcCode = abcCode;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getTurnRatio() {
		return turnRatio;
	}
	public void setTurnRatio(String turnRatio) {
		this.turnRatio = turnRatio;
	}
	
	

	
}
