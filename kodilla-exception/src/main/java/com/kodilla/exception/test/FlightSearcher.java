package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {
    private Map<String, Boolean> flights = new HashMap<>();

    public void findFlight(Flight flight) throws RouteNotFoundException {
        flights.put("Madrid", true);
        flights.put("Warsaw", true);
        flights.put("Berlin", true);
        flights.put("Paris", true);
        flights.put("London", true);
        flights.put("Moscow ", true);
        flights.put("Prague", true);
        flights.put("Vienna", true);
        flights.put("Los Angeles", true);

        if(!flights.containsKey(flight.getArrivalAirport())){
            throw new RouteNotFoundException("Flight isn't on the list");
        }else{
            flights.get(flight.getArrivalAirport());
            System.out.println("Flight is on the list");
        }




    }
}
