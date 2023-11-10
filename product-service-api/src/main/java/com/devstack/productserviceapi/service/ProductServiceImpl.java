package com.devstack.productserviceapi.service;

import com.devstack.productserviceapi.dto.ProductDto;
import com.devstack.productserviceapi.entity.Product;
import com.devstack.productserviceapi.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }


    @Override
    public void createProduct(ProductDto dto) {
        Product customer = new Product(
                dto.getCode(),
                dto.getDescription(),
                dto.getUnitPrice(),
                dto.getQtyOnHand()
        );
        productRepo.save(customer);
    }
}
