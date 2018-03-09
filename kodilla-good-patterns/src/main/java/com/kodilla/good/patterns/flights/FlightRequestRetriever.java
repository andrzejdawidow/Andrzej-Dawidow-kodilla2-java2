package com.kodilla.good.patterns.flights;

public class FlightRequestRetriever {
    public FlightRequest retrieve() {
      City departure = new City("Cracow");
      City arrival = new City("Poznan");
      City transfer = new City("Warsaw");
      return new FlightRequest(departure, arrival, transfer);
    }
}
