package com.kodilla.exception.test;

public class FlightSearcherRunner {
    public static void main(String[] args) {
        Flight warsawtoMadrid = new Flight("Warsaw","Madrid");
        FlightSearcher flightSearcher = new FlightSearcher();
        try {
            flightSearcher.findFlight(warsawtoMadrid);
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
            System.out.println("Flight isn't on the list");

        }
    }
}
