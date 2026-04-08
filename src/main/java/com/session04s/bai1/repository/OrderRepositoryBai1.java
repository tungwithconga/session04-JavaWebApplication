package com.session04s.bai1.repository;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryBai1 {

    public String getAllOrders() {
        return "Danh sách toàn bộ đơn hàng: [Phở bò, Bún chả, Cà phê sữa]";
    }

    public String getOrderById(Long id) {
        return "Thông tin đơn hàng với ID: " + id;
    }
}
