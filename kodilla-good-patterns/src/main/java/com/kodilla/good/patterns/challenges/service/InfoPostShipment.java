package com.kodilla.good.patterns.challenges.service;

public class InfoPostShipment implements Shipment {
    private String name;
    private int price;
    private int time;

    public InfoPostShipment(String name, int price, int time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    public int getTime() {
        return 0;
    }


}
