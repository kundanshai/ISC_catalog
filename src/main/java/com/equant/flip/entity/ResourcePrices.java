package com.equant.flip.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="table_c_price_srvc")
@NamedNativeQuery(name="tablecpricesrvc",query= "select objid, part_number,mod_level,"
		+ " part_desc, priced_qty,  price, price_inst_eff_dt, price_inst_exp_dt, price_prog_name from table_c_price_srvc where mod_level_objid = (select objid from table_mod_level where PART_INFO2PART_NUM =:objid and S_MOD_LEVEL = :S_MOD_LEVEL) AND  child_mod_objid = :objid ",resultClass=ResourcePrices.class)
public class ResourcePrices {
@Id
@Column(name = "objid")
private Integer objid;
@Column(name = "part_number")
private String partNumber;
@Column(name = "mod_level")
private String modLevel;
@Column(name = "part_desc")
private String partDesc;
@Column(name = "priced_qty")
private String pricedQty;
@Column(name = "price")
private String price;
@Column(name = "price_inst_eff_dt")
private Date priceInstEffDt;
@Column(name = "price_inst_exp_dt")
private Date priceInstExpDt;
@Column(name = "price_prog_name")
private String priceProgName;
/*@Column(name = "PART_INFO2PART_NUM")
private String partInfo2PARTnum;*/

public Integer getObjid() {
	return objid;
}
public void setObjid(Integer objid) {
	this.objid = objid;
}
public String getPartNumber() {
	return partNumber;
}
public void setPartNumber(String partNumber) {
	this.partNumber = partNumber;
}
public String getModLevel() {
	return modLevel;
}
public void setModLevel(String modLevel) {
	this.modLevel = modLevel;
}
public String getPartDesc() {
	return partDesc;
}
public void setPartDesc(String partDesc) {
	this.partDesc = partDesc;
}
public String getPricedQty() {
	return pricedQty;
}
public void setPricedQty(String pricedQty) {
	this.pricedQty = pricedQty;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}

public Date getPriceInstEffDt() {
	return priceInstEffDt;
}
public void setPriceInstEffDt(Date priceInstEffDt) {
	this.priceInstEffDt = priceInstEffDt;
}
public Date getPriceInstExpDt() {
	return priceInstExpDt;
}
public void setPriceInstExpDt(Date priceInstExpDt) {
	this.priceInstExpDt = priceInstExpDt;
}
public String getPriceProgName() {
	return priceProgName;
}
public void setPriceProgName(String priceProgName) {
	this.priceProgName = priceProgName;
}
/*public String getPartInfo2PARTnum() {
	return partInfo2PARTnum;
}
public void setPartInfo2PARTnum(String partInfo2PARTnum) {
	this.partInfo2PARTnum = partInfo2PARTnum;
}*/

}
