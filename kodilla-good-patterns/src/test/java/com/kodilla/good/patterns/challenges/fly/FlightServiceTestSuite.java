package com.kodilla.good.patterns.challenges.fly;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FlightServiceTestSuite {
    public List<Flight> getList() {
        List<Flight> list = new ArrayList<>();
        list.add(new Flight("Gdańsk", "Katowice"
                , LocalDateTime.of(2017, 12, 31, 12, 34)
                , LocalDateTime.of(2017, 12, 31, 14, 34)));
        list.add(new Flight("Warszawa", "Wrocław"
                , LocalDateTime.of(2017, 12, 31, 12, 34)
                , LocalDateTime.of(2017, 12, 31, 14, 34)));
        list.add(new Flight("Wrocław", "Praga"
                , LocalDateTime.of(2017, 12, 31, 12, 34)
                , LocalDateTime.of(2017, 12, 31, 14, 34)));
        list.add(new Flight("Warszawa", "Moskwa"
                , LocalDateTime.of(2017, 12, 31, 12, 34)
                , LocalDateTime.of(2017, 12, 31, 14, 34)));
        list.add(new Flight("Gdańsk", "Szczecin"
                , LocalDateTime.of(2017, 12, 31, 12, 34)
                , LocalDateTime.of(2017, 12, 31, 14, 34)));
        list.add(new Flight("Gdańsk", "Kraków"
                , LocalDateTime.of(2017, 12, 31, 12, 34)
                , LocalDateTime.of(2017, 12, 31, 14, 34)));
        list.add(new Flight("Katowice", "Sydney"
                , LocalDateTime.of(2017, 12, 31, 12, 34)
                , LocalDateTime.of(2017, 12, 31, 14, 34)));
        list.add(new Flight("Szczecin", "Sydney"
                , LocalDateTime.of(2017, 12, 31, 12, 34)
                , LocalDateTime.of(2017, 12, 31, 14, 34)));

        return list;

    }

    @Test
    public void testSearchAllFlightsFromTheSpecifiedCity() {
        //Give


        FlightService flightService = new FlightService(getList());

        //When
        String city = "Gdańsk";
        List<String> result = flightService.searchAllFlightsFromTheSpecifiedCity(city);

        //Then
        Assert.assertEquals("Katowice", result.get(0));
        Assert.assertEquals(3, result.size());

    }
    @Test
    public void testSearchAllFlightsToYourDestination(){
        //Give


        FlightService flightService = new FlightService(getList());

        //When
        String city = "Sydney";
        List<String> result = flightService.searchAllFlightsToYourDestination(city);

        //Then
        Assert.assertEquals("Katowice", result.get(0));
        Assert.assertEquals(2, result.size());

    }

    @Test
    public void testSearchFlightThroughAnotherCity() {


        FlightService flightService = new FlightService(getList());

        //When
        String cityDeparture = "Gdańsk";
        String cityArrival = "Sydney";
        List<Flight> result = flightService.searchFlightThroughAnotherCity(cityDeparture,cityArrival);
        //Then

        Assert.assertEquals(2, result.size());

    }
}


