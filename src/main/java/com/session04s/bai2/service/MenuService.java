package com.session04s.bai2.service;

import com.session04s.bai2.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public String getMenu(String category) {
        return menuRepository.getMenuByCategory(category);
    }
}
