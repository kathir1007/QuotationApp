package com.product.quotation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="product_details")
@Data
public class ProductDetails {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "customer_id")
	private String customerId;
	
	@Column(name = "validity_date")
	private String validityDate;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_id")
	private String productId;
	
	@Column(name = "unit_of_measure")
	private String unitOfMeasure;
	
	@Column(name = "unit_price")
	private String unitPrince;
	
	@Column(name = "sub_total")
	private String subTotal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getValidityDate() {
		return validityDate;
	}

	public void setValidityDate(String validityDate) {
		this.validityDate = validityDate;
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
