package com.equant.flip.service;

import java.util.List;

import com.equant.flip.model.Ownership;
import com.equant.flip.model.Prices;
import com.equant.flip.model.ProductRevision;
import com.equant.flip.model.ResourceCatalogModel;
import com.equant.flip.model.ResourceCatelogRef;
import com.equant.flip.exception.BadApiRequestException;
import com.equant.flip.exception.RecordNotFoundException;
import com.equant.flip.model.ActivityLog;

public interface ResourceCatalogService {
	public ResourceCatalogModel getResourceCatalogDetails(String resourceCatalogId, String revision)throws RecordNotFoundException;
	
	public ProductRevision getResourceCatalogProductRevision();

	List<ResourceCatelogRef> getResourceCatelogMeterials();
	
	Prices getResourceCatelogprice(String revision);
	
	List<ResourceCatelogRef> getResourceCatelogAlternates(String revision);
	
	Ownership getcatelogOwnerShipDetails(String resourcesCatelogId);
	
	List<ActivityLog> getActivityLogDetails();

}
