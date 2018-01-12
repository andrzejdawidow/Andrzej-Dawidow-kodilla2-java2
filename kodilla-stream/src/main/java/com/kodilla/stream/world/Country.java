package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String nameCountry;
    private final BigDecimal amountOfPeople;

    public Country(final String nameCountry, final BigDecimal amountOfPeople) {
        this.nameCountry = nameCountry;
        this.amountOfPeople = amountOfPeople;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public BigDecimal getAmountOfPeople() {
        return amountOfPeople;
    }
}
