package com.product.quotation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.quotation.entity.OutputEntity;
import com.product.quotation.service.ProductService;

@RestController
public class ServiceController {

	@Autowired
	private ProductService service;
	
	@RequestMapping("/getAllData")
	public List<OutputEntity> getAllData(){
		return service.getAllData();
	}

}
