package com.kodilla.good.patterns.challenges.srp.add.work;

import java.time.LocalDateTime;

public interface RentalRepository {
    default void createCarRental(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo){

    }
}
