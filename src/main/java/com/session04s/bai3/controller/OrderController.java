package com.session04s.bai3.controller;

import com.session04s.bai3.service.OrderServiceBai3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class OrderController {

    private final OrderServiceBai3 orderService;

    @Autowired
    public OrderController(OrderServiceBai3 orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/bai3/orders/{id}")
    @ResponseBody
    public String getOrderDetail(@PathVariable Long id) {
        return orderService.getOrderDetail(id);
    }
}
