package com.product.quotation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.quotation.entity.OutputEntity;

@Service
public interface ProductService {

	List<OutputEntity> getAllData();
	

}
