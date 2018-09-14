package com.equant.flip.model;

import java.io.Serializable;
import java.util.List;

public class Prices implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ResourceCatelogPrice> priceList;
	public List<ResourceCatelogPrice> getPriceList() {
		return priceList;
	}
	public void setPriceList(List<ResourceCatelogPrice> priceList) {
		this.priceList = priceList;
	}
	

}
