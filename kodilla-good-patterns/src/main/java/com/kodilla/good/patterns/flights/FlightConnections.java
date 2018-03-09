package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightConnections {
    public static Set<Flight> getFlightConnections() {
       final Set<Flight> flightSet = new HashSet<>();
       flightSet.add(new Flight(new City("Warsaw"), new City("Gdansk")));
       flightSet.add(new Flight(new City("Warsaw"), new City("Cracow")));
       flightSet.add(new Flight(new City("Warsaw"), new City("Poznan")));
       flightSet.add(new Flight(new City("Warsaw"), new City("Wroclaw")));
       flightSet.add(new Flight(new City("Gdansk"), new City("Warsaw")));
       flightSet.add(new Flight(new City("Gdansk"), new City("Poznan")));
       flightSet.add(new Flight(new City("Gdansk"), new City("Wroclaw")));
       flightSet.add(new Flight(new City("Cracow"), new City("Warsaw")));
       flightSet.add(new Flight(new City("Cracow"), new City("Poznan")));
       flightSet.add(new Flight(new City("Poznan"), new City("Cracow")));
       flightSet.add(new Flight(new City("Poznan"), new City("Gdansk")));
       flightSet.add(new Flight(new City("Poznan"), new City("Warsaw")));
       flightSet.add(new Flight(new City("Wroclaw"), new City("Gdansk")));
       flightSet.add(new Flight(new City("Wroclaw"), new City("Warsaw")));
       return new HashSet<Flight>(flightSet);
    }
}
