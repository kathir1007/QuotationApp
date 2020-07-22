package com.product.quotation.entity;

import java.util.Date;

import lombok.Data;

@Data
public class OutputEntity {
	
	private String customerName;
	
	private String customerId;
	
	private Date validityData;
	
	private String productName;
	
	private String productId;
	
	private String unitOfMeasure;
	
	private String unitPrince;
	
	private String subTotal;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Date getValidityData() {
		return validityData;
	}

	public void setValidityData(Date validityData) {
		this.validityData = validityData;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public String getUnitPrince() {
		return unitPrince;
	}

	public void setUnitPrince(String unitPrince) {
		this.unitPrince = unitPrince;
	}

	public String getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}
	
	
	
}
