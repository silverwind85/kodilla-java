package com.kodilla.good.patterns.challenges.service;

public class OrderDto {
    private User user;
    private boolean isRentaled;

    public OrderDto(User user, boolean isRentaled) {
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
