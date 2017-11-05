package com.kodilla.good.patterns.challenges.food.two.door;

public class Application {
    public static void main(String[] args) {
        OrderRetriever orderInformationRetriever = new OrderRetriever();
        Order orderInformation = orderInformationRetriever.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(),orderInformation.getContractor());
        orderProcessor.process(orderInformation);
    }
}
