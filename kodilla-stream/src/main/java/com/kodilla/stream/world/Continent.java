package com.kodilla.stream.world;

import java.util.List;

public final class Continent {
    private final String nameContinent;
    private final List<Country> countries;

    public Continent(final String nameContinent, final List<Country> states) {
        this.nameContinent = nameContinent;
        this.countries = states;
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
