package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public static Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        Boolean openAirport = airports.get(flight.getArrivalAirport());
            if (openAirport != null)
                return openAirport;
             else
                throw new RouteNotFoundException();
    }
    public static void main(String[] args) {
        Flight flight = new Flight("New York", "Warsaw");
        try {
            findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Can't find flights to " + flight.getArrivalAirport().toString() + "\n" + e);
        }
    }
}
