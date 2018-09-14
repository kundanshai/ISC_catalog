package com.equant.flip.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.equant.flip.exception.BadApiRequestException;
import com.equant.flip.exception.RecordNotFoundException;
import com.equant.flip.model.Prices;
import com.equant.flip.model.ProductRevision;
import com.equant.flip.model.ResourceCatalogModel;
import com.equant.flip.model.ResourceCatelogRef;
import com.equant.flip.service.ResourceCatalogService;
import com.equant.flip.util.Constants;

import io.swagger.annotations.ApiOperation;

@RestController
public class ResourceCatalogController {
	
	@Autowired
	ResourceCatalogService resourceCatalogService;
	
	private final Logger logger = LoggerFactory.getLogger(ResourceCatalogController.class);

	@GetMapping(value = "/resourceCatalog/{resourceCatalogId}",produces= {"application/json;charset=utf-8"})
	@ApiOperation (value = "Fetch Resource Catalog Records", notes = "This service is used to Fetch resource Catalog Details")
	
	public ResponseEntity<ResourceCatalogModel> getAllPartDetails(@PathVariable String resourceCatalogId,
			@RequestParam(name = "revision",required = true) String revision) throws BadApiRequestException, RecordNotFoundException  {
		 logger.debug( "Calling physical resource API with parameters: {}",resourceCatalogId);
		if(resourceCatalogId==null || revision==null) {
			throw new BadApiRequestException(Constants.BAD_REQUEST_API);
		}
		ResourceCatalogModel resourceCatalogDto = resourceCatalogService.getResourceCatalogDetails(resourceCatalogId,
				revision);
		ProductRevision resourceProductRevision = resourceCatalogService.getResourceCatalogProductRevision();
		List<ResourceCatelogRef> resourceCatelogMeterial = resourceCatalogService.getResourceCatelogMeterials();
		resourceCatalogDto.setResourceCatalogProductRevision(resourceProductRevision);
		resourceCatalogDto.setResourceCatelogMeterial(resourceCatelogMeterial);
		Prices catelogPrice = resourceCatalogService.getResourceCatelogprice(revision);

		resourceCatalogDto.setResourceCatelogPrice(catelogPrice);
		resourceCatalogDto.setResourceCatelogAlternate(resourceCatalogService.getResourceCatelogAlternates(revision));
		resourceCatalogDto
				.setResourcesCatelogOwnerShip(resourceCatalogService.getcatelogOwnerShipDetails(resourceCatalogId));
		resourceCatalogDto.setActivityLogDetails(resourceCatalogService.getActivityLogDetails());
		return ResponseEntity.ok().body(resourceCatalogDto);
	}
	
	
	

}
