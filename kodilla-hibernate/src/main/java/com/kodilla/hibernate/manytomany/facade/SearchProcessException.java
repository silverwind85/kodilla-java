package com.kodilla.hibernate.manytomany.facade;

public class SearchProcessException extends Exception{

    public static String ERR_SEARCH_PROBLEM = "an unexpected error occurred";

    public SearchProcessException(String message) {
        super(message);
    }
}
