package com.kodilla.good.patterns.challenges.service;

public class InfoPostShipment implements Shipment {
    private String name;
    private int price;
    private int timeShipment;

    public InfoPostShipment(String name, int price, int timeShipment) {
        this.name = name;
        this.price = price;
        this.timeShipment = timeShipment;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getTimeShipment() {
        return timeShipment;
    }
}
