package com.kodilla.patterns2.observer.homework;

public class Student {
    final private String firstName;
    final private String LastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        LastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }
}
