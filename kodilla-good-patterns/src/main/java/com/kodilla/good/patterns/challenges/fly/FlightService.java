package com.kodilla.good.patterns.challenges.fly;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
   private  List<Flight> list;

    public FlightService(List<Flight> list) {
        this.list = list;
    }

    public List<String> searchAllFlightsFromTheSpecifiedCity(String departureCity) {
        return list.stream().filter(departure -> departure
                .getDepartureAirport()
                .equals(departureCity))
                .map(arrival -> arrival.getArrivalAirport())
                .collect(Collectors.toList());

    }

    public List<String> searchAllFlightsToYourDestination(String arrivalCity) {
        return list.stream().filter(arrival -> arrival
                .getArrivalAirport()
                .equals(arrivalCity))
                .map(departure -> departure.getDepartureAirport())
                .collect(Collectors.toList());
    }

    public List<Flight> searchFlightThroughAnotherCity(String departureCity, String arrivalCity) {

        List<Flight> listDeparture = list.stream().filter(departure -> departure
                .getDepartureAirport()
                .equals(departureCity))
                .collect(Collectors.toList());

        List<Flight> listArrival = list.stream().filter(departure -> departure
                .getArrivalAirport()
                .equals(arrivalCity))
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
