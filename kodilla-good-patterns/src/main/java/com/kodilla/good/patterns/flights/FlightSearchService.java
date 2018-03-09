package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchService {

    public static List<Flight> getFlightsFromCity(City departure) {
        return FlightConnections.getFlightConnections().stream()
                .filter(flight -> flight.getDeparture() == departure)
                .collect(Collectors.toList());
    }

    public static List<Flight> getFlightsToCity(City arrival) {
        return FlightConnections.getFlightConnections().stream()
                .filter(flight -> flight.getArrival() == arrival)
                .collect(Collectors.toList());
    }

    public static List<Flight> getDirectFlights(City departure, City arrival) {
        return FlightConnections.getFlightConnections().stream()
                .filter(flight -> flight.getDeparture().equals(departure) && flight.getArrival().equals(arrival))
                .collect(Collectors.toList());
    }

    public static List<Flight> getTransfersTo(City departure, City transfer) {
        return FlightConnections.getFlightConnections().stream()
                .filter(flight -> flight.getDeparture().equals(departure) && flight.getArrival().equals(transfer))
                .collect(Collectors.toList());
    }

    public static List<Flight> getTransfersFrom(City transfer, City arrival) {
        return FlightConnections.getFlightConnections().stream()
                .filter(flight -> flight.getDeparture().equals(transfer) && flight.getArrival().equals(arrival))
                .collect(Collectors.toList());
    }

    public static void processConnection(final FlightRequest flightRequest) {
        List<Flight> directFlight = FlightSearchService.getDirectFlights(flightRequest.getDeparture(), flightRequest.getArrival());
        directFlight.stream()
                .map(flight -> flight.toString().toUpperCase())
                .forEach(f -> System.out.println("Direct connection: " + f));

        List<Flight> transfersToCity = FlightSearchService.getTransfersTo(flightRequest.getDeparture(), flightRequest.getTransfer());
        transfersToCity.stream()
                .map(flight -> flight.toString().toUpperCase())
                .forEach(f -> System.out.println("Connection to transfer point: " + f));

        List<Flight> transfersFromCity = FlightSearchService.getTransfersFrom(flightRequest.getTransfer(), flightRequest.getArrival());
        transfersToCity.stream()
                .map(flight -> flight.toString().toUpperCase())
                .forEach(f -> System.out.println("Connection from transfer point: " + f));
    }

}
