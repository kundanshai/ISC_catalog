package com.equant.flip.model;

import java.io.Serializable;
import java.util.Date;

public class ResourceCatelogPrice implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String partNumber;
	private String revision;
	private String description;
	private Integer pricedQty;
	private Double price;
	private String priceSchedule;
	private Date effectiveDate;
	private Date endDate;
	
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getRevision() {
		return revision;
	}
	public void setRevision(String revision) {
		this.revision = revision;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPricedQty() {
		return pricedQty;
	}
	public void setPricedQty(Integer pricedQty) {
		this.pricedQty = pricedQty;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPriceSchedule() {
		return priceSchedule;
	}
	public void setPriceSchedule(String priceSchedule) {
		this.priceSchedule = priceSchedule;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
