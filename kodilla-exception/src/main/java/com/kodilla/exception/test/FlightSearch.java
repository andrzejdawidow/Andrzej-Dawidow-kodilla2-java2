package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    private Map<String, Boolean> airports = new HashMap<>();
    public FlightSearch() {
      airports.put("Cracow", true);
      airports.put("Wroclaw", true);
    }

    public  Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Boolean openAirport = airports.get(flight.getArrivalAirport());
        if (openAirport != null)
            return openAirport;
        else
            throw new RouteNotFoundException();
    }

    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        Flight flight = new Flight("New York", "Warsaw");
        try {
            flightSearch.findFlight(flight);
            System.out.println("It's good decision :)");
        } catch (RouteNotFoundException e) {
            System.out.println("Can't find flights to " + flight.getArrivalAirport().toString() + "\n" + e);
        }
    }
}
