package com.equant.flip.dao;

import java.util.List;

import com.equant.flip.entity.ResourceAlternates;
import com.equant.flip.entity.ResourceBillMaterial;
import com.equant.flip.entity.ResourceCatalogDetails;
import com.equant.flip.entity.ResourceOwnerShip;
import com.equant.flip.entity.ResourcePrices;
import com.equant.flip.entity.ResourceProductRevision;
import com.equant.flip.exception.RecordNotFoundException;

public interface ResourceCatalogDao {
	
	public List<ResourceCatalogDetails> getResourceCatalogDetails(String resourceCatalogId, String revision)throws RecordNotFoundException;

	public List<ResourceProductRevision> getResourceCatalogProductRevision(String objId);

	public List<ResourceBillMaterial> getResourceBillMaterial(String objId);
	
	public List<ResourcePrices> getResourcePrices(String objId,String revision);
	
	public List<ResourceAlternates> getResourceAlternates(String objId,String revision);
	
	List<ResourceOwnerShip> getResourceOwnerShip(String resourceCatalogId);
 
}
