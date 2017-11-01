package com.kodilla.exception.test;

public class FlightSearcherRunner {
    public static void main(String[] args) {
        Flight warsawtoMadrid = new Flight("Warsaw","Toronto");
        FlightSearcher flightSearcher = new FlightSearcher();
        try {
            flightSearcher.findFilght(warsawtoMadrid);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight isn't on the list");

        }
    }
}
