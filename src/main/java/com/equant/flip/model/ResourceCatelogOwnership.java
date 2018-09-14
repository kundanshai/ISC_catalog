package com.equant.flip.model;

import java.io.Serializable;

public class ResourceCatelogOwnership implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String owner;
	private String revision;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getRevision() {
		return revision;
	}
	public void setRevision(String revision) {
		this.revision = revision;
	}
	
	
}
