package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int id;
    private final String username;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final int numberOfPost;

    public ForumUser(final int id, final String username,
                     final char gender, final int year, final int month,
                     final int day, final int numberOfPost) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.numberOfPost = numberOfPost;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPost=" + numberOfPost +
                '}';
    }
}

