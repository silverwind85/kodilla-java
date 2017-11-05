package com.kodilla.good.patterns.challenges.food.two.door;

public class OrderProcessor {

    private InformationService informationService;
    private Contractor contractor;

    public OrderProcessor( final InformationService informationService, final Contractor contractor) {

        this.informationService = informationService;
        this.contractor = contractor;
    }

    public OrderDto process(final Order orderInformation) {
        boolean isProcessed = contractor.process(orderInformation);
        if (isProcessed) {
            informationService.inform();
        }
        return new OrderDto(contractor, isProcessed);
    }
}
