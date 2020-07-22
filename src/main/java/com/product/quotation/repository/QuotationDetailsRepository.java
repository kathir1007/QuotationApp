package com.product.quotation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.quotation.entity.QuotationDetails;

@Repository
public interface QuotationDetailsRepository extends JpaRepository<QuotationDetails, Long> {


}
