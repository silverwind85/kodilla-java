package com.kodilla.good.patterns.challenges.service;

public class MailService implements InformationService{


    public void inform(User user) {
        System.out.println("New message for: " + user.getName() + " "+ user.getSurname());
    }
}
