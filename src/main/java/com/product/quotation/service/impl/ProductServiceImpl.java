package com.product.quotation.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.quotation.entity.OutputEntity;
import com.product.quotation.entity.ProductDetails;
import com.product.quotation.repository.ProductDetailsRepository;
import com.product.quotation.repository.QuotationDetailsRepository;
import com.product.quotation.service.ProductService;



@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDetailsRepository productRepo;

	@Autowired
	QuotationDetailsRepository quotationRepo;

	@Override
	public List<OutputEntity> getAllData() {
		List<OutputEntity> outputList = new ArrayList<>();
		List<ProductDetails> product = productRepo.findAll();
		product.stream().forEach(data -> {
			OutputEntity op = new OutputEntity();
			op.setCustomerId(data.getCustomerId());
			op.setCustomerName(data.getCustomerName());
			op.setProductName(data.getProductName());
			outputList.add(op);
		});
		// TODO Auto-generated method stub
		return outputList;
	}

}