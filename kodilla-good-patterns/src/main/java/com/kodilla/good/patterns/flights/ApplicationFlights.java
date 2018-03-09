package com.kodilla.good.patterns.flights;

public class ApplicationFlights {
    public static void main(String args[]) {
        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
        FlightRequest flightRequest = flightRequestRetriever.retrieve();

        FlightSearchService.processConnection(flightRequest);
    }
}
