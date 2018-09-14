package com.equant.flip.model;

import java.io.Serializable;
import java.util.Date;

public class ProductRevisionList implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String partRevision;
	private String productOwner;
	private String revisionStatus;
	private Date replacePN;
	private String revision;
	private String on;
	private Date effectiveDate;
	private Date endDate;
	public String getPartRevision() {
		return partRevision;
	}
	public void setPartRevision(String partRevision) {
		this.partRevision = partRevision;
	}
	public String getProductOwner() {
		return productOwner;
	}
	public void setProductOwner(String productOwner) {
		this.productOwner = productOwner;
	}
	public String getRevisionStatus() {
		return revisionStatus;
	}
	public void setRevisionStatus(String revisionStatus) {
		this.revisionStatus = revisionStatus;
	}
	public Date getReplacePN() {
		return replacePN;
	}
	public void setReplacePN(Date replacePN) {
		this.replacePN = replacePN;
	}
	public String getRevision() {
		return revision;
	}
	public void setRevision(String revision) {
		this.revision = revision;
	}
	public String getOn() {
		return on;
	}
	public void setOn(String on) {
		this.on = on;
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
