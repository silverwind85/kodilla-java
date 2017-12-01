package com.kodilla.good.patterns.challenges.srp.add.work;

public class RentalProcessor {
    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    public RentalProcessor(InformationService informationService, RentalService rentalService, RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }
    public RentalDto process(final RentRequest rentRequest){
        boolean isRented = rentalService.rent(rentRequest.getUser(),rentRequest.from,rentRequest.to);
        if(isRented) {
            informationService.inform(rentRequest.getUser());
            rentalRepository.createCarRental(rentRequest.getUser(),rentRequest.from,rentRequest.to);
            return new RentalDto(rentRequest.getUser(),true);
        }else {
            return new RentalDto(rentRequest.getUser(), false);
        }

    }
}
