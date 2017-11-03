package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    public boolean createOrder(User user, LocalDateTime sellDate, Shipment shipment, int quantity, int price) {
        System.out.println("Product order is save in database");
        return true;
    }
}
