package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {
    private Map<String, Boolean> flights = new HashMap<>();
    private int counter;

    public void findFilght(Flight flight) throws RouteNotFoundException {
        flights.put("Madrid", true);
        flights.put("Warsaw", true);
        flights.put("Berlin", true);
        flights.put("Paris", true);
        flights.put("London", true);
        flights.put("Moscow ", true);
        flights.put("Prague", true);
        flights.put("Vienna", true);
        flights.put("Los Angeles", true);
        for (Map.Entry<String, Boolean> entry : flights.entrySet()
                ) {
            if (counter == flights.size() && !entry.getKey().equalsIgnoreCase(flight.getArrivalAiport())) {

                throw new RouteNotFoundException("Flight isn't on the list");
            }
            if (entry.getKey().equalsIgnoreCase(flight.getArrivalAiport())) {
                System.out.println("Flight is on the list");
            }
        }

    }
}
