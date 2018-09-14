package com.equant.flip.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ProductRevision implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<ProductRevisionList>productRevisionList;
	
	public List<ProductRevisionList> getProductRevisionList() {
		return productRevisionList;
	}
	public void setProductRevisionList(List<ProductRevisionList> productRevisionList) {
		this.productRevisionList = productRevisionList;
	}
	
	

}
