package com.equant.flip.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="table_mod_level")
@NamedNativeQuery(name="tablemodlevel",query="select TPN.objid, TPN.s_part_number, TML.s_mod_level, TPN.s_description,TPN.part_type, TPN.s_domain, TML.active from table_mod_level TML, table_part_num TPN, TABLE_PART_ROLE TPR where TPR.ROLE_FOR2MOD_LEVEL=(select A.objid from table_mod_level a where a.PART_INFO2PART_NUM =:objid and a.S_MOD_LEVEL =:S_MOD_LEVEL) and TML.part_info2part_num = TPN.objid and TPR.ROLE_PLAYER2MOD_LEVEL = TML.objid ",resultClass=ResourceAlternates.class)
public class ResourceAlternates {
	@Id
	@Column(name = "objid")
	private Integer objid;
	@Column(name = "s_part_number")
	private String sPartNumber;
	@Column(name = "s_mod_level")
	private String sModLevel;
	@Column(name = "s_description")
	private String sDescription;
	@Column(name = "part_type")
	private String partType;
	@Column(name = "s_domain")
	private String sDomain;
	private String active;
	
	
	public Integer getObjid() {
		return objid;
	}
	public void setObjid(Integer objid) {
		this.objid = objid;
	}
	public String getsPartNumber() {
		return sPartNumber;
	}
	public void setsPartNumber(String sPartNumber) {
		this.sPartNumber = sPartNumber;
	}
	public String getsModLevel() {
		return sModLevel;
	}
	public void setsModLevel(String sModLevel) {
		this.sModLevel = sModLevel;
	}
	public String getsDescription() {
		return sDescription;
	}
	public void setsDescription(String sDescription) {
		this.sDescription = sDescription;
	}
	public String getPartType() {
		return partType;
	}
	public void setPartType(String partType) {
		this.partType = partType;
	}
	public String getsDomain() {
		return sDomain;
	}
	public void setsDomain(String sDomain) {
		this.sDomain = sDomain;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
}
