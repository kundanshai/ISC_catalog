package com.equant.flip.model;

import java.io.Serializable;
import java.util.List;

public class Ownership implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<ResourceCatelogOwnership> resourcesCatelogOwnerShipList;

	public List<ResourceCatelogOwnership> getResourcesCatelogOwnerShipList() {
		return resourcesCatelogOwnerShipList;
	}
	public void setResourcesCatelogOwnerShipList(List<ResourceCatelogOwnership> resourcesCatelogOwnerShipList) {
		this.resourcesCatelogOwnerShipList = resourcesCatelogOwnerShipList;
	}
	
	
	
}
