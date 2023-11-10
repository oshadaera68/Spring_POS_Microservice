package com.devstack.orderserviceapi.service.impl;

import com.devstack.orderserviceapi.dto.OrderDto;
import com.devstack.orderserviceapi.entity.Order;
import com.devstack.orderserviceapi.repo.OrderRepo;
import com.devstack.orderserviceapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    private final OrderRepo orderRepo;

    @Autowired
    public OrderServiceImpl(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public void makeOrder(OrderDto dto) {
        Order order= new Order(dto.getOrderId(), dto.getCustomerId(), dto.getProductId(), dto.getCost());
        orderRepo.save(order);
    }
}
