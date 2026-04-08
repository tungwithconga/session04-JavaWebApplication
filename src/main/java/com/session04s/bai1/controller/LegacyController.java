package com.session04s.bai1.controller;

import com.session04s.bai1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller("legacyControllerBai1")
public class LegacyController {

    private final OrderService orderService;

    @Autowired
    public LegacyController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Trả về String thay vì JSON
    @GetMapping("/bai1/orders")
    @ResponseBody
    public String getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/bai1/orders/{id}")
    @ResponseBody
    public String getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    @PostMapping("/bai1/orders")
    @ResponseBody
    public String createOrder(@RequestParam String customer,
                              @RequestParam String item,
                              @RequestParam int quantity) {
        return "Đã thêm đơn hàng mới: khách " + customer +
                ", món " + item +
                ", số lượng " + quantity;
    }
}
