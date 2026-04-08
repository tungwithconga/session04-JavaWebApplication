package com.session04s.bai2.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MenuRepository {

    public String getMenuByCategory(String category) {
        switch (category.toLowerCase()) {
            case "chay":
                return "Thực đơn chay: Rau xào, Đậu hũ kho, Canh nấm";
            case "man":
                return "Thực đơn mặn: Phở bò, Bún chả, Cá kho";
            case "nuocuong":
                return "Thực đơn nước uống: Cà phê, Trà đá, Sinh tố";
            default:
                return "Không tìm thấy thực đơn cho loại: " + category;
        }
    }
}
