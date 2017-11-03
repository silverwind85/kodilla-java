package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user ;
    private LocalDateTime sellDate;
    private Shipment shipment;
    private int quantity;
    private int price;

    public OrderRequest(final User user, final LocalDateTime sellDate, final Shipment shipment, final int quantity,final int price) {
        this.user = user;
        this.sellDate = sellDate;
        this.shipment = shipment;
        this.quantity = quantity;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getSellDate() {
        return sellDate;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
