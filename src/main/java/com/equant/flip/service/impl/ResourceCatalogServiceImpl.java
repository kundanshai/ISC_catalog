package com.equant.flip.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equant.flip.dao.impl.ResourceCatalogDaoImpl;
import com.equant.flip.entity.PartNum;
import com.equant.flip.entity.ResourceActivityLog;
import com.equant.flip.entity.ResourceAlternates;
import com.equant.flip.entity.ResourceBillMaterial;
import com.equant.flip.entity.ResourceCatalogDetails;
import com.equant.flip.entity.ResourceOwnerShip;
import com.equant.flip.entity.ResourcePrices;
import com.equant.flip.entity.ResourceProductRevision;
import com.equant.flip.exception.RecordNotFoundException;
import com.equant.flip.model.ActivityLog;
import com.equant.flip.model.Ownership;
import com.equant.flip.model.Prices;
import com.equant.flip.model.ProductRevision;
import com.equant.flip.model.ProductRevisionList;
import com.equant.flip.model.ResourceCatalogDetailsModel;
import com.equant.flip.model.ResourceCatalogModel;
import com.equant.flip.model.ResourceCatelogOwnership;
import com.equant.flip.model.ResourceCatelogPrice;
import com.equant.flip.model.ResourceCatelogRef;
import com.equant.flip.repository.ActivityLogRepository;
import com.equant.flip.repository.PartNumRepository;
import com.equant.flip.repository.ResourceCatalogRepository;
import com.equant.flip.service.ResourceCatalogService;
import com.equant.flip.util.Constants;

@Service
public class ResourceCatalogServiceImpl implements ResourceCatalogService {
	
	private final Logger logger = LogManager.getLogger(this.getClass().getName());
	
	@Autowired
	ResourceCatalogDaoImpl resourceCatalogImpl;

	@Autowired
	private ResourceCatalogRepository resourceCatalogRepository;

	@Autowired
	private PartNumRepository partNumRepository;

	@Autowired
	private ActivityLogRepository activityLogRepository;

	private String modObjId = "";

	@Override
	public ResourceCatalogModel getResourceCatalogDetails(String resourceCatalogId, String revision)
			throws RecordNotFoundException {
		logger.info(Constants.START_METHOD,"getResourceCatalogDetails");
		List<ResourceCatalogDetails> resourceCatalogDetailsAllList = resourceCatalogImpl
				.getResourceCatalogDetails(resourceCatalogId, revision);
		ResourceCatalogDetailsModel resourceCatalogDto = new ResourceCatalogDetailsModel();
		ResourceCatalogModel model = new ResourceCatalogModel();
		try {
			if (!resourceCatalogDetailsAllList.isEmpty()) {

				for (ResourceCatalogDetails resourceCatalogDetails : resourceCatalogDetailsAllList) {
					modObjId = resourceCatalogDetails.getObjid();
					resourceCatalogDto.setPartNumber(resourceCatalogDetails.getPartNo());
					resourceCatalogDto.setActive(resourceCatalogDetails.getActive());
					resourceCatalogDto.setDescription(resourceCatalogDetails.getDescription());
					resourceCatalogDto.setDomain(resourceCatalogDetails.getDomain());
					resourceCatalogDto.setFamily(resourceCatalogDetails.getFamily());
					resourceCatalogDto.setLine(resourceCatalogDetails.getLine());
					resourceCatalogDto.setModelNumber(resourceCatalogDetails.getModelNum());
					resourceCatalogDto.setPartType(resourceCatalogDetails.getPartType());
					resourceCatalogDto.setNotes(resourceCatalogDetails.getNotes());
					resourceCatalogDto.setsModLevel(resourceCatalogDetails.getModLevel());
					resourceCatalogDto.setStdWarranty(resourceCatalogDetails.getStdWarranty());
					resourceCatalogDto.setUnitMeasure(resourceCatalogDetails.getUnitMeasure());
					resourceCatalogDto.setTurnRatio(resourceCatalogDetails.getTurnRatio());
				}
				String partObjId = resourceCatalogRepository.getPartObjId(modObjId);
				String partStatesObjId = resourceCatalogRepository.getPartStatesObjId(modObjId);
				PartNum partNum = partNumRepository.getPartDetails(partObjId);
				if (partNum != null) {
					resourceCatalogDto.setDimension(partNum.getDiamension());
					resourceCatalogDto.setWeight(partNum.getWeight());
					resourceCatalogDto.setRepairType(partNum.getRepairType());
					resourceCatalogDto.setUnitMeasure(partNum.getUnitMeasure());
					resourceCatalogDto.setDynamicCatelog(partNum.getsGsaFlex2());
					resourceCatalogDto.setAbcCode(resourceCatalogRepository.getAbcCode(partStatesObjId));
					resourceCatalogDto.setClassName(resourceCatalogRepository.getClassName(partObjId));
				}
				model.setResourceCatalogDetails(resourceCatalogDto);
			} else {
				throw new RecordNotFoundException(Constants.RECORD_NOT_FOUND_DESCRIPTION);
			}
		} catch (Exception e) {
			throw new RecordNotFoundException(Constants.RECORD_NOT_FOUND_DESCRIPTION);
		}
		logger.info(Constants.END_METHOD,"getResourceCatalogDetails");
		return model;

	}

	@Override
	public ProductRevision getResourceCatalogProductRevision() {
		logger.info(Constants.START_METHOD,"getResourceCatalogProductRevision");
		ProductRevision productRevision = new ProductRevision();

		List<ProductRevisionList> productRevisionList = new ArrayList<>();
		List<ResourceProductRevision> resourceProductRevisionList = resourceCatalogImpl
				.getResourceCatalogProductRevision(modObjId);
		try {
			if (!resourceProductRevisionList.isEmpty()) {
				for (ResourceProductRevision resourceProductRevision : resourceProductRevisionList) {
					ProductRevisionList productRevisionList1 = new ProductRevisionList();
					productRevisionList1.setRevision(resourceProductRevision.getModLevel());
					productRevisionList1.setRevisionStatus(resourceProductRevision.getActive());
					productRevisionList1.setReplacePN(resourceProductRevision.getReplacesDate());
					productRevisionList1.setEffectiveDate(resourceProductRevision.getEffDate());
					productRevisionList1.setEndDate(resourceProductRevision.getEndDate());
					productRevisionList.add(productRevisionList1);
				}
			}
			productRevision.setProductRevisionList(productRevisionList);
		} catch (Exception e) {
			logger.error(Constants.ERROR_MESSAGE+e.getMessage());
		}
		logger.info(Constants.END_METHOD,"getResourceCatalogProductRevision");
		return productRevision;
	}

	@Override
	public List<ResourceCatelogRef> getResourceCatelogMeterials() {
		logger.info(Constants.START_METHOD,"getResourceCatelogMeterials");

		List<ResourceCatelogRef> resurcesCatelogMeterialList = new ArrayList<>();
		List<ResourceBillMaterial> resurcesCatelogRefList = resourceCatalogImpl.getResourceBillMaterial(modObjId);
		try {
			if (!resurcesCatelogRefList.isEmpty()) {
				for (ResourceBillMaterial resourceCatelogMet : resurcesCatelogRefList) {
					ResourceCatelogRef resourceCatelogRef = new ResourceCatelogRef();
					resourceCatelogRef.setPartNumber(resourceCatelogMet.getPartNo());
					resourceCatelogRef.setRevision(resourceCatelogMet.getModLevel());
					resourceCatelogRef.setQuantity(Integer.valueOf(resourceCatelogMet.getQty()));
					resourceCatelogRef.setDescription(resourceCatelogMet.getDescription());
					resourceCatelogRef.setType(resourceCatelogMet.getPartType());
					resourceCatelogRef.setDomain(resourceCatelogMet.getDomain());
					resourceCatelogRef.setStatus(resourceCatelogMet.getActive());
					resurcesCatelogMeterialList.add(resourceCatelogRef);
				}
			}
		} catch (Exception e) {
			logger.error("Error : "+e.getMessage());
		}
		logger.info(Constants.END_METHOD,"getResourceCatelogMeterials");
		return resurcesCatelogMeterialList;
	}

	@Override
	public Prices getResourceCatelogprice(String revision) {
		logger.info(Constants.START_METHOD,"getResourceCatelogprice");
		logger.info("revision------->"+revision);
		List<ResourceCatelogPrice> catelogPriceList = new ArrayList<>();
		Prices prices = new Prices();
		List<ResourcePrices> resourcePricesList = resourceCatalogImpl.getResourcePrices(modObjId, revision);
		try {
			if (!resourcePricesList.isEmpty()) {
				for (ResourcePrices resourcePrices : resourcePricesList) {
					ResourceCatelogPrice catelogPrice = new ResourceCatelogPrice();
					catelogPrice.setPartNumber(resourcePrices.getPartNumber());
					catelogPrice.setRevision(resourcePrices.getModLevel());
					catelogPrice.setDescription(resourcePrices.getPartDesc());
					catelogPrice.setPricedQty(Integer.valueOf(resourcePrices.getPricedQty()));
					catelogPrice.setPrice(Double.valueOf(resourcePrices.getPrice()));
					catelogPrice.setPriceSchedule(resourcePrices.getPriceProgName());
					catelogPrice.setEffectiveDate(resourcePrices.getPriceInstEffDt());
					catelogPrice.setEndDate(resourcePrices.getPriceInstExpDt());
					catelogPriceList.add(catelogPrice);
				}
			}
		} catch (Exception ex) {
			logger.error(Constants.ERROR_MESSAGE+ex.getMessage());
		}
		prices.setPriceList(catelogPriceList);
		logger.info(Constants.END_METHOD,"getResourceCatelogprice");
		return prices;
	}

	@Override
	public List<ResourceCatelogRef> getResourceCatelogAlternates(String revision) {
		logger.info("Start method {} ","getResourceCatelogAlternates");
		logger.info("revision------->"+revision);
		List<ResourceCatelogRef> resurcesCatelogAlternateList = new ArrayList<>();
		List<ResourceAlternates> resurcesCatelogRefList = resourceCatalogImpl.getResourceAlternates(modObjId, revision);
		try {
			if (!resurcesCatelogRefList.isEmpty()) {
				for (ResourceAlternates resourceAlternates : resurcesCatelogRefList) {
					ResourceCatelogRef resourceCatelogRef = new ResourceCatelogRef();
					resourceCatelogRef.setPartNumber(resourceAlternates.getsPartNumber());
					resourceCatelogRef.setRevision(resourceAlternates.getsModLevel());
					resourceCatelogRef.setDescription(resourceAlternates.getsDescription());
					resourceCatelogRef.setType(resourceAlternates.getPartType());
					resourceCatelogRef.setDomain(resourceAlternates.getsDomain());
					resourceCatelogRef.setStatus(resourceAlternates.getActive());
					resurcesCatelogAlternateList.add(resourceCatelogRef);
				}
			}
		} catch (Exception ex) {
			logger.error(Constants.ERROR_MESSAGE+ex.getMessage());
		}
		logger.info("End method {} ","getResourceCatelogAlternates");
		return resurcesCatelogAlternateList;
	}

	@Override
	public Ownership getcatelogOwnerShipDetails(String resourcesCatelogId) {
		logger.info(Constants.START_METHOD,"getcatelogOwnerShipDetails");
		logger.info("resourcesCatelogId-------->"+resourcesCatelogId);
		List<ResourceCatelogOwnership> catelogOwnerList = new ArrayList<>();
		Ownership ownerShip = new Ownership();
		List<ResourceOwnerShip> ownerList = resourceCatalogImpl.getResourceOwnerShip(resourcesCatelogId);
		try {
			if (!ownerList.isEmpty()) {
				for (ResourceOwnerShip owner : ownerList) {
					ResourceCatelogOwnership resourceCatelogOwnership = new ResourceCatelogOwnership();
					resourceCatelogOwnership.setOwner(owner.getxGsaModLevel());
					resourceCatelogOwnership.setRevision(owner.getxGsaRevision());
					catelogOwnerList.add(resourceCatelogOwnership);
				}
				ownerShip.setResourcesCatelogOwnerShipList(catelogOwnerList);
			}
		} catch (Exception ex) {
			logger.error("Error in fetching data: "+ex.getMessage());
		}
		logger.info(Constants.END_METHOD,"getcatelogOwnerShipDetails");
		return ownerShip;
	}

	public List<ActivityLog> getActivityLogDetails() {
		logger.info(Constants.START_METHOD,"getActivityLogDetails");
		List<ActivityLog> activityLogList = new ArrayList<>();
		List<ResourceActivityLog> resourcesActivityLogList = activityLogRepository
				.getResourceCatelogActivityLogDetails(modObjId);
		try {
			if (!resourcesActivityLogList.isEmpty()) {
				for (ResourceActivityLog activityLog : resourcesActivityLogList) {
					ActivityLog activityLog1 = new ActivityLog();
					activityLog1.setActivityName(activityLog.getActivityName());
					activityLog1.setUserName(activityLog.getLoginName());
					activityLog1.setCreatedDate(activityLog.getEntryTime());
					activityLog1.setWorkGroup(activityLog.getWorkGroup());
					activityLogList.add(activityLog1);
				}
			}
		} catch (Exception ex) {
			logger.error(Constants.ERROR_MESSAGE+ex.getMessage());
		}
		logger.info(Constants.END_METHOD,"getActivityLogDetails");
		return activityLogList;
	}

}
