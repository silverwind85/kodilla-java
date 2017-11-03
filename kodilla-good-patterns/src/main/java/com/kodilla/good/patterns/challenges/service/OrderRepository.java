package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createOrder(User user, LocalDateTime sellDate, Shipment shipment, int quantity, int price);
}
