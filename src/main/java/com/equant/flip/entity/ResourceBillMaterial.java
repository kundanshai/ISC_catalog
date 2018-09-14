package com.equant.flip.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name = "table_partnum_view")
@NamedNativeQuery(name="tablePartnumView",query="select  objid, part_no, description, mod_level, qty, part_type, domain, active, part_num_objid,parent_objid, qty_objid, bom_type, sn_track, ml_part_type, ml_active  from table_partbom_view WHERE  parent_objid = (select PART_INFO2PART_NUM from table_mod_level  where objid =:objid) AND  bom_type = '0' ", resultClass =ResourceBillMaterial.class)
public class ResourceBillMaterial {
	@Id
	@Column(name = "objid")
	private Integer objid;
	@Column(name = "part_no")
	private String partNo;
	private String description;
	@Column(name = "mod_level")
	private String modLevel;
	private String qty;
	@Column(name = "part_type")
	private String partType;
	private String domain;
	private String active;
	@Column(name = "part_num_objid")
	private String partNumObjid;
	@Column(name = "parent_objid")
	private String parentObjid;
	@Column(name = "qty_objid")
	private String qtyObjid;
	@Column(name = "bom_type")
	private String bomType;
	@Column(name = "sn_track")
	private String snTrack;
	@Column(name = "ml_part_type")
	private String mlPartType;
	@Column(name = "ml_active")
	private String mlActive;
	@Column(name = "PART_INFO2PART_NUM")
	private String partInfO2partNum;
	public Integer getObjid() {
		return objid;
	}
	public void setObjid(Integer objid) {
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
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
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
	public String getParentObjid() {
		return parentObjid;
	}
	public void setParentObjid(String parentObjid) {
		this.parentObjid = parentObjid;
	}
	public String getQtyObjid() {
		return qtyObjid;
	}
	public void setQtyObjid(String qtyObjid) {
		this.qtyObjid = qtyObjid;
	}
	public String getBomType() {
		return bomType;
	}
	public void setBomType(String bomType) {
		this.bomType = bomType;
	}
	public String getSnTrack() {
		return snTrack;
	}
	public void setSnTrack(String snTrack) {
		this.snTrack = snTrack;
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
	public String getPartInfO2partNum() {
		return partInfO2partNum;
	}
	public void setPartInfO2partNum(String partInfO2partNum) {
		this.partInfO2partNum = partInfO2partNum;
	}
	
}
