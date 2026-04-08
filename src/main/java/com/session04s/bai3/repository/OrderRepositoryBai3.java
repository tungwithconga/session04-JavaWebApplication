package com.session04s.bai3.repository;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryBai3 {

    public String getOrderById(Long id) {
        return "Chi tiết đơn hàng số " + id;
    }
}
