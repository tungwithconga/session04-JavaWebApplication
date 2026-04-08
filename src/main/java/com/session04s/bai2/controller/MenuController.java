package com.session04s.bai2.controller;

import com.session04s.bai2.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/bai2/menu")
    @ResponseBody
    public String getMenu(@RequestParam("category") String category) {
        return "Thực đơn loại: " + category;
    }
}
