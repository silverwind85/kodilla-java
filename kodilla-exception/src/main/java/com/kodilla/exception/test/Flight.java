package com.kodilla.exception.test;

public class Flight {
    private  String departureAiport;
    private String arrivalAiport ;

    public Flight(String departureAiport, String arrivalAiport) {
        this.departureAiport = departureAiport;
        this.arrivalAiport = arrivalAiport;
    }

    public String getDepartureAiport() {
        return departureAiport;
    }

    public String getArrivalAiport() {
        return arrivalAiport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (departureAiport != null ? !departureAiport.equals(flight.departureAiport) : flight.departureAiport != null)
            return false;
        return arrivalAiport != null ? arrivalAiport.equals(flight.arrivalAiport) : flight.arrivalAiport == null;
    }

    @Override
    public int hashCode() {
        int result = departureAiport != null ? departureAiport.hashCode() : 0;
        result = 31 * result + (arrivalAiport != null ? arrivalAiport.hashCode() : 0);
        return result;
    }
}
