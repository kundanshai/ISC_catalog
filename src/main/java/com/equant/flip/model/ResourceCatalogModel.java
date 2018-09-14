package com.equant.flip.model;

import java.io.Serializable;
import java.util.List;

public class ResourceCatalogModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private ResourceCatalogDetailsModel resourceCatalogDetails;

	private ProductRevision resourceCatalogProductRevision;
	private Prices resourceCatelogPrice;
	
	private List<ResourceCatelogRef> resourceCatelogMeterial;


	private List<ResourceCatelogRef> ResourceCatelogMeterial;
	
	private List<ResourceCatelogRef> resourceCatelogAlternate;
	
	private Ownership resourcesCatelogOwnerShip;
	
	private List<ActivityLog> activityLogDetails;


	public ResourceCatalogDetailsModel getResourceCatalogDetails() {

		return resourceCatalogDetails;
	}

	public void setResourceCatalogDetails(ResourceCatalogDetailsModel resourceCatalogDetails) {
		this.resourceCatalogDetails = resourceCatalogDetails;
	}

	public ProductRevision getResourceCatalogProductRevision() {
		return resourceCatalogProductRevision;
	}

	public void setResourceCatalogProductRevision(ProductRevision resourceCatalogProductRevision) {
		this.resourceCatalogProductRevision = resourceCatalogProductRevision;
	}

	public List<ResourceCatelogRef> getResourceCatelogMeterial() {
		return resourceCatelogMeterial;
	}

	public void setResourceCatelogMeterial(List<ResourceCatelogRef> resourceCatelogMeterial) {
		this.resourceCatelogMeterial = resourceCatelogMeterial;
	}

	public Prices getResourceCatelogPrice() {
		return resourceCatelogPrice;
	}

	public void setResourceCatelogPrice(Prices resourceCatelogPrice) {
		this.resourceCatelogPrice = resourceCatelogPrice;
	}

	public List<ResourceCatelogRef> getResourceCatelogAlternate() {
		return resourceCatelogAlternate;
	}

	public void setResourceCatelogAlternate(List<ResourceCatelogRef> resourceCatelogAlternate) {
		this.resourceCatelogAlternate = resourceCatelogAlternate;
	}

	public Ownership getResourcesCatelogOwnerShip() {
		return resourcesCatelogOwnerShip;
	}

	public void setResourcesCatelogOwnerShip(Ownership resourcesCatelogOwnerShip) {
		this.resourcesCatelogOwnerShip = resourcesCatelogOwnerShip;
	}

	public List<ActivityLog> getActivityLogDetails() {
		return activityLogDetails;
	}

	public void setActivityLogDetails(List<ActivityLog> activityLogDetails) {
		this.activityLogDetails = activityLogDetails;
	}
	
}
