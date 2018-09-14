package com.equant.flip.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.equant.flip.dao.ResourceCatalogDao;
import com.equant.flip.entity.ResourceAlternates;
import com.equant.flip.entity.ResourceBillMaterial;
import com.equant.flip.entity.ResourceCatalogDetails;
import com.equant.flip.entity.ResourceOwnerShip;
import com.equant.flip.entity.ResourcePrices;
import com.equant.flip.entity.ResourceProductRevision;
import com.equant.flip.util.Constants;


@Repository
public class ResourceCatalogDaoImpl implements ResourceCatalogDao {

	@Autowired
	private EntityManager entityManager;
	
	private final Logger logger = LogManager.getLogger(this.getClass().getName());

	@Override
	public List<ResourceCatalogDetails> getResourceCatalogDetails(String resourceCatalogId, String revision) {
		List<ResourceCatalogDetails> resourceCatalogDetailsAllList = null;
		try {
			TypedQuery<ResourceCatalogDetails> query = entityManager
					.createNamedQuery("findpartnumview", ResourceCatalogDetails.class)
					.setParameter("S_PART_NO", resourceCatalogId).setParameter("mod_level", revision);
			resourceCatalogDetailsAllList = query.getResultList();
		} catch (Exception ex) {
			logger.error("Error in executing ResourceCatalogDetails Query {}",ex.getMessage(),ex);
		}	
		
		return resourceCatalogDetailsAllList;
	}
	@Override
	public List<ResourceProductRevision> getResourceCatalogProductRevision(String objId) {
		List<ResourceProductRevision> resourceProductRevisionList=new ArrayList<>();
		try {
			TypedQuery<ResourceProductRevision> query = entityManager
					.createNamedQuery("findproductrevision", ResourceProductRevision.class)
					.setParameter("part_info2part_num", objId);
			resourceProductRevisionList = query.getResultList();
		}catch(Exception e) {
			logger.error("Error in executing ResourceCatalogProductRevision Query {}",e.getMessage(),e);
		}
		return resourceProductRevisionList; 
	}
	@Override
	public List<ResourceBillMaterial> getResourceBillMaterial(String objId) {
		List<ResourceBillMaterial> resourceResourceBillMaterialList=new ArrayList<>();
		try {
			TypedQuery<ResourceBillMaterial> query = entityManager
					.createNamedQuery("tablePartnumView", ResourceBillMaterial.class)
					.setParameter(Constants.OBJ_ID, objId);
			resourceResourceBillMaterialList = query.getResultList();
		}catch(Exception e) {
			logger.error("Error in executing ResourceBillMaterial Query {}",e.getMessage(),e);
		}
		return resourceResourceBillMaterialList; 
	}
	@Override
	public List<ResourcePrices> getResourcePrices(String objId, String revision) {
		List<ResourcePrices> resourcePricesList=new ArrayList<>();
		try {
			TypedQuery<ResourcePrices> query = entityManager
					.createNamedQuery("tablecpricesrvc", ResourcePrices.class)
					.setParameter("objid", objId).setParameter("S_MOD_LEVEL", revision);
			resourcePricesList = query.getResultList();
		}catch(Exception e) {
			logger.error("Error in executing ResourcePrices Query {}",e.getMessage(),e);
		}
		return resourcePricesList; 
	}
	@Override
	public List<ResourceAlternates> getResourceAlternates(String objId, String revision) {
		List<ResourceAlternates> resourceResourceAlternates=new ArrayList<>();
		try {
			TypedQuery<ResourceAlternates> query = entityManager
					.createNamedQuery("tablemodlevel", ResourceAlternates.class)
					.setParameter("objid", objId).setParameter("S_MOD_LEVEL", revision);
			resourceResourceAlternates = query.getResultList();
		}catch(Exception e) {
			logger.error("Error in executing ResourceAlternates Query {}",e.getMessage(),e);
		}
		return resourceResourceAlternates; 
	}
	@Override
	public List<ResourceOwnerShip> getResourceOwnerShip(String resourceCatalogId) {
		List<ResourceOwnerShip> resourceResourceOwnerShip=new ArrayList<>();
		try {
			TypedQuery<ResourceOwnerShip> query = entityManager
					.createNamedQuery("tablexgsaprodrevview", ResourceOwnerShip.class)
					.setParameter("part_num", resourceCatalogId);
			resourceResourceOwnerShip = query.getResultList();
		}catch(Exception e) {
			logger.error("Error in executing ResourceOwnerShip Query {}",e.getMessage(),e);
		}
		return resourceResourceOwnerShip; 
	}
}
