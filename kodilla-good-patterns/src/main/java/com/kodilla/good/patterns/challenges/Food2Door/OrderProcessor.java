package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessor {

    private InformationService informationService;
    private Contractor contractor;

    public OrderProcessor( final InformationService informationService, final Contractor contractor) {

        this.informationService = informationService;
        this.contractor = contractor;
    }

    public OrderDto process(final OrderInformation orderInformation) {
        boolean isProcess = contractor.process(orderInformation);
        if (isProcess) {
            informationService.inform();
        }
        return new OrderDto(contractor, isProcess);
    }
}
