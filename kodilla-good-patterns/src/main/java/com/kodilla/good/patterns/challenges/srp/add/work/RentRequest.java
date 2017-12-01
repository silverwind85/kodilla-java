package com.kodilla.good.patterns.challenges.srp.add.work;

import java.time.LocalDateTime;

public class RentRequest {
    public User user;
    public LocalDateTime from;
    public LocalDateTime to;

    public RentRequest(final User user, final LocalDateTime from, final LocalDateTime to) {
        this.user = user;
        this.from = from;
        this.to = to;
    }

    public User getUser(){
        return user;
    }
}
