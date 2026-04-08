package com.session04s.bai3.service;

import com.session04s.bai3.repository.OrderRepositoryBai3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepositoryBai3 orderRepository;

    @Autowired
    public OrderService(OrderRepositoryBai3 orderRepository) {
        this.orderRepository = orderRepository;
    }

    public String getOrderDetail(Long id) {
        return orderRepository.getOrderById(id);
    }
}
