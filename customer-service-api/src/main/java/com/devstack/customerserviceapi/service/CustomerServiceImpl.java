package com.devstack.customerserviceapi.service;

import com.devstack.customerserviceapi.dto.CustomerDto;
import com.devstack.customerserviceapi.entity.Customer;
import com.devstack.customerserviceapi.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }


    @Override
    public void createCustomer(CustomerDto dto) {
        Customer customer = new Customer(
                dto.getId(),
                dto.getName(),
                dto.getAddress(),
                dto.getSalary()
        );
        customerRepo.save(customer);
    }
}
