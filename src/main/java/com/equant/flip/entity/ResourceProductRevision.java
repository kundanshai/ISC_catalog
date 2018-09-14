package com.equant.flip.entity;


import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.NamedNativeQuery;


import javax.persistence.Table;

@Entity
@Table(name = "table_mod_level")
@NamedNativeQuery(name = "findproductrevision",
query = "select  objid, mod_level, active,replaces_date,eff_date,end_date,dev,config_type,description,guid,x_gsa_revision from table_mod_level where part_info2part_num =:part_info2part_num", resultClass = ResourceProductRevision.class)

public class ResourceProductRevision implements Serializable {
	private static final long serialVersionUID = 2461419196575033455L;
	@Id
	@Column(name = "objid")
	private Integer objid;
	@Column(name = "mod_level")
	private String modLevel;
	private String active;
	@Column(name = "replaces_date")
	private Date replacesDate;
	@Column(name = "eff_date")
	private Date effDate;
	@Column(name = "end_date")
	private Date endDate;
	private String dev;
	@Column(name = "config_type")
	private String configType;
	@Column(name = "description")
	private String description;
	private String guid;
	@Column(name = "x_gsa_revision")
	private String xGsaRevision;



	public Integer getObjid() {
		return objid;
	}

	public void setObjid(Integer objid) {
		this.objid = objid;
	}

	public String getModLevel() {
		return modLevel;
	}

	public void setModLevel(String modLevel) {
		this.modLevel = modLevel;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
	
	public Date getReplacesDate() {
		return replacesDate;
	}

	public void setReplacesDate(Date replacesDate) {
		this.replacesDate = replacesDate;
	}

	public Date getEffDate() {
		return effDate;
	}

	public void setEffDate(Date effDate) {
		this.effDate = effDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDev() {
		return dev;
	}

	public void setDev(String dev) {
		this.dev = dev;
	}

	public String getConfigType() {
		return configType;
	}

	public void setConfigType(String configType) {
		this.configType = configType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getxGsaRevision() {
		return xGsaRevision;
	}

	public void setxGsaRevision(String xGsaRevision) {
		this.xGsaRevision = xGsaRevision;
	}
	
}
