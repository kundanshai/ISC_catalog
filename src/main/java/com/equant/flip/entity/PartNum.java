package com.equant.flip.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="table_part_num")
public class PartNum {
	@Id
	@Column(name = "std_warranty")
	private String stdWarranty;
	
	@Column(name = "DOMAIN")
	private String domain;
	
	private String notes;
	
	@Column(name = "UNIT_MEASURE")
	private String unitMeasure;
	@Column(name = "SN_TRACK")
	private String snTrack;
	
	@Column(name = "X_GSA_FLEX_2")
	private String sGsaFlex2;
	
	@Column(name = "WARR_START_KEY")
	private String warrStartKey;
	
	@Column(name = "WEIGHT")
	private String weight;
	
	@Column(name = "DIMENSION")
	private String diamension;
	
	@Column(name = "PART_TYPE")
	private String partType;
	
	@Column(name = "DESCRIPTION")
	private String DESCRIPTION;
	
	@Column(name = "FAMILY")
	private String family;
	
	@Column(name = "LINE")
	private String line;
	
	@Column(name = "ACTIVE")
	private String active;
	
	@Column(name = "MODEL_NUM")
	private String modelNumber;
	
	@Column(name = "PART_NUMBER")
	private String partNumber;
	
	@Column(name = "repair_type")
	private String repairType;

	public String getStdWarranty() {
		return stdWarranty;
	}

	public void setStdWarranty(String stdWarranty) {
		this.stdWarranty = stdWarranty;
	}

	public String getInclDomain() {
		return domain;
	}

	public void setInclDomain(String domain) {
		this.domain = domain;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	
	public String getUnitMeasure() {
		return unitMeasure;
	}

	public void setUnitMeasure(String unitMeasure) {
		this.unitMeasure = unitMeasure;
	}
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getSnTrack() {
		return snTrack;
	}

	public void setSnTrack(String snTrack) {
		this.snTrack = snTrack;
	}

	public String getWarrStartKey() {
		return warrStartKey;
	}

	public void setWarrStartKey(String warrStartKey) {
		this.warrStartKey = warrStartKey;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getDiamension() {
		return diamension;
	}

	public void setDiamension(String diamension) {
		this.diamension = diamension;
	}

	public String getPartType() {
		return partType;
	}

	public void setPartType(String partType) {
		this.partType = partType;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
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

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getRepairType() {
		return repairType;
	}

	public void setRepairType(String repairType) {
		this.repairType = repairType;
	}

	public String getsGsaFlex2() {
		return sGsaFlex2;
	}

	public void setsGsaFlex2(String sGsaFlex2) {
		this.sGsaFlex2 = sGsaFlex2;
	}
	
	
	
}
