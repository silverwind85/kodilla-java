package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String[] args) {
        OrderInformationRetriever orderInformationRetriever = new OrderInformationRetriever();
        orderInformationRetriever.retriever();
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(),new AppleContractor("Apple Farm", "DownStreet 34 345 Chicago", "Apple"));
        orderProcessor.process(orderInformationRetriever.retriever());
    }
}
