package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order( User user,  LocalDateTime sellDate, Shipment shipment,  int quantity, int price);
}
