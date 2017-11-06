package com.kodilla.good.patterns.challenges.fly;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    private List<Flight> flights;

    public FlightService(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> searchAllFlightsFromTheSpecifiedCity(String departure) {
        return flights.stream().filter(d-> d
                .getDepartureAirport()
                .equals(departure))
                .collect(Collectors.toList());

    }

    public List<Flight> searchAllFlightsToYourDestination(String arrival) {
        return flights.stream().filter(a-> a
                .getArrivalAirport()
                .equals(arrival))
                .collect(Collectors.toList());
    }

    public List<Flight> searchFlightThroughAnotherCity(String departure,String indirect, String arrival) {

        List<Flight> listDeparture =flights.stream().filter(d -> d
                .getDepartureAirport()
                .equals(departure))
                .filter(a->a.getArrivalAirport().equals(indirect))
                .collect(Collectors.toList());

        List<Flight> listArrival = flights.stream().filter(a -> a
                .getArrivalAirport()
                .equals(arrival))
                .filter(d->d.getDepartureAirport().equals(indirect))
                .collect(Collectors.toList());

        List<Flight> listResult = new ArrayList<>();

        for (Flight flightDeparture : listDeparture
                ) {
            for (Flight flightArrival : listArrival) {
                if (flightDeparture.getArrivalAirport().equals(flightArrival.getDepartureAirport())) {
                    listResult.add(flightArrival);
                }
            }
        }
        return listResult;
    }

}
