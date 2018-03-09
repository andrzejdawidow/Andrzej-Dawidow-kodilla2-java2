package com.kodilla.good.patterns.flights;

public class Flight {
    private City departure;
    private City arrival;

    public Flight(City departure, City arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public City getDeparture() {
        return departure;
    }

    public City getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (departure != null ? !departure.equals(flight.departure) : flight.departure != null) return false;
        return arrival != null ? arrival.equals(flight.arrival) : flight.arrival == null;
    }

    @Override
    public int hashCode() {
        int result = departure != null ? departure.hashCode() : 0;
        result = 31 * result + (arrival != null ? arrival.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure=" + departure +
                ", arrival=" + arrival +
                '}';
    }
}
