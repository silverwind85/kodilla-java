package com.kodilla.good.patterns.challenges.srp.add.work;

import java.time.LocalDateTime;

public class RentalRequesRetriever {
    public RentRequest retrieve(){
        User user = new User("John","Wild");
        LocalDateTime rentForm = LocalDateTime.of(2017, 8, 1, 12, 0);
        LocalDateTime rentTo = LocalDateTime.of(2017, 8, 10, 12, 0);

        return new RentRequest(user,rentForm,rentTo);

    }
}
