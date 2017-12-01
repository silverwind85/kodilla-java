package com.kodilla.good.patterns.challenges.srp.add.work;

public class Application {
    /*public static void main(String[] args) {
        User user = new User("John", "Wekl");
        LocalDateTime rentForm = LocalDateTime.of(2017, 8, 1, 12, 0);
        LocalDateTime rentTo = LocalDateTime.of(2017, 8, 10, 12, 0);

        CarRentalService carRentalService = new CarRentalService();
        boolean isRented = carRentalService.rent(user, rentForm, rentTo);

        MailService mailService = new MailService();

        CarRentalRepository carRentalRepository = new CarRentalRepository();
        if (isRented) {
            mailService.sentMail(user);
            carRentalRepository.createCarRental(user,rentForm, rentTo);
        }else {
            System.out.println("Car rent has been rejected");
        }
    }*/
    public static void main(String[] args) {
        RentalRequesRetriever rentalRequesRetriever = new RentalRequesRetriever();
        RentRequest rentRequest = rentalRequesRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(new MailService(),new CarRentalService(), new CarRentalRepository());
        rentalProcessor.process(rentRequest);
    }
}
