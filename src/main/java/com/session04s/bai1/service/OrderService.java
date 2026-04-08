package com.session04s.bai1.service;

import com.session04s.bai1.repository.OrderRepositoryBai1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepositoryBai1 orderRepository;

    @Autowired
    public OrderService(OrderRepositoryBai1 orderRepository) {
        this.orderRepository = orderRepository;
    }

    public String getAllOrders() {
        return orderRepository.getAllOrders();
    }

    public String getOrderById(Long id) {
        return orderRepository.getOrderById(id);
    }
}
