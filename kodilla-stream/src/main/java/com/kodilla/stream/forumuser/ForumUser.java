package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int idUser;
    private final String username;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final int post;

    public ForumUser(final int idUser, final String username,
                     final char gender, final int year, final int month,
                     final int day, final int post) {
        this.idUser = idUser;
        this.username = username;
        this.gender = gender;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.post = post;
    }

    public int getIdUser() {
        return idUser;
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

    public int getPost() {
        return post;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idUser=" + idUser +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", post=" + post +
                '}';
    }
}

