package com.kodilla.good.patterns.challenges.srp.add.work;

public class RentalDto {
    private User user;
    private boolean isRentaled;

    public RentalDto(User user, boolean isRentaled) {
        this.user = user;
        this.isRentaled = isRentaled;
    }

    public User getUser() {
        return user;
    }

    public boolean isRentaled() {
        return isRentaled;
    }
}
