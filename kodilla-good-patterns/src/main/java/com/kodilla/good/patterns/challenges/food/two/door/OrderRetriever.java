package com.kodilla.good.patterns.challenges.food.two.door;

public class OrderRetriever {
    public Order retrieve() {
        AppleContractor appleContractor = new AppleContractor("Apple Farm", "DownStreet 34 345 Chicago", "Apple");
        int quantity = 400;

        return new Order(appleContractor,quantity);
    }
}
