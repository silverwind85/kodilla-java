package com.kodilla.good.patterns.challenges.food.two.door;

public class Order {
    private Contractor contractor;
    private int quantity;

    public Order(final Contractor contractor, final  int quantity) {
        this.contractor = contractor;
        this.quantity = quantity;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public int getQuantity() {
        return quantity;
    }
}
