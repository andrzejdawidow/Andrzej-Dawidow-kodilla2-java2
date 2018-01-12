package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Country> countriesAsia = new ArrayList<>();
        countriesAsia.add(new Country("China", new BigDecimal("1000000000")));
        countriesAsia.add(new Country("Japan", new BigDecimal("1000000000")));

        List<Country> countriesEurope = new ArrayList<>();
        countriesEurope.add(new Country("Poland", new BigDecimal("1000000000")));
        countriesEurope.add(new Country("German", new BigDecimal("1000000000")));

        List<Country> countriesAfrica = new ArrayList<>();
        countriesAfrica.add(new Country("Kongo", new BigDecimal("1000000000")));
        countriesAfrica.add(new Country("Egypt", new BigDecimal("1000000000")));

        List<Continent> continents = new ArrayList<>();
        continents.add(new Continent("Asia", countriesAsia));
        continents.add(new Continent("Europa", countriesEurope));
        continents.add(new Continent("Africa", countriesAfrica));
        World areas = new World(continents);

        //When
        BigDecimal totalPeople = areas.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("6000000000");
        Assert.assertEquals(expectedPeople, totalPeople);
    }
}
