package com.devstack.orderserviceapi.repo;

import com.devstack.orderserviceapi.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface OrderRepo extends JpaRepository<Order,Long> {
}
