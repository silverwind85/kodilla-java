package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderInformation {
    private Contractor contractor;
    private int quantity;

    public OrderInformation(final Contractor contractor,final  int quantity) {
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
