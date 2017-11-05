package com.kodilla.good.patterns.challenges.food.two.door;

interface Contractor {
    boolean process(Order orderInformation);
    String getName();
    String getAddress();
    String getProduct();

}
