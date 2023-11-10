package com.devstack.orderserviceapi.service;

import com.devstack.orderserviceapi.dto.OrderDto;

public interface OrderService {
    public void makeOrder(OrderDto dto);
}
