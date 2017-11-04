package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderInformationRetriever {
    public OrderInformation retriever() {
        AppleContractor appleContractor = new AppleContractor("Apple Farm", "DownStreet 34 345 Chicago", "Apple");
        int quantity = 400;

        return new OrderInformation(appleContractor,quantity);
    }
}
