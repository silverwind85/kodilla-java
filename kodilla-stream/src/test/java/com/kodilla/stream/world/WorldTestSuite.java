package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testgetPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("France", new BigDecimal("66891240"), new BigDecimal("643801"), "French"));
        europe.addCountry(new Country("German", new BigDecimal("80891240"), new BigDecimal("357376"), "German"));
        europe.addCountry(new Country("Poland", new BigDecimal("37891240"), new BigDecimal("31279"), "Polish"));
        europe.addCountry(new Country("Great Britain", new BigDecimal("68891240"), new BigDecimal("209331"), "English"));
        europe.addCountry(new Country("Spain", new BigDecimal("44891240"), new BigDecimal("505990"), "spanish"));
        europe.addCountry(new Country("Russia", new BigDecimal("133891240"), new BigDecimal("17143801"), "Russian"));
        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China", new BigDecimal("1386891240"), new BigDecimal("9597000"), "Chinese "));
        asia.addCountry(new Country("Japan", new BigDecimal("125891240"), new BigDecimal("377962"), "Japanese "));
        asia.addCountry(new Country("South Korea", new BigDecimal("51891240"), new BigDecimal("312679"), "Korean"));
        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(new Country("USA", new BigDecimal("321691240"), new BigDecimal("9897000"), "English"));
        northAmerica.addCountry(new Country("Canada", new BigDecimal("36891240"), new BigDecimal("9985000"), "English"));
        World earth = new World("Earth");
        earth.addContinent(europe);
        earth.addContinent(asia);
        earth.addContinent(northAmerica);
        //Then
        BigDecimal resultPopulationEarth = earth.getPeopleQuantity();
        BigDecimal resultEurope = BigDecimal.ZERO;
        BigDecimal resultAsia = BigDecimal.ZERO;
        BigDecimal resultNorthAmerica = BigDecimal.ZERO;

        for (Country country : europe.getCountries()) {
            resultEurope = resultEurope.add(country.getPeopleQuantity());
        }
        for (Country country : asia.getCountries()) {
            resultAsia = resultAsia.add(country.getPeopleQuantity());
        }
        for (Country country : northAmerica.getCountries()) {
            resultNorthAmerica = resultNorthAmerica.add(country.getPeopleQuantity());
        }
        BigDecimal resultWord = (resultAsia.add(resultEurope)).add(resultNorthAmerica);

        //When
        Assert.assertEquals(3, earth.getContinents().size());
        // Europe manual count 433347440
        Assert.assertEquals(new BigDecimal("433347440"),resultEurope);
        Assert.assertEquals(new BigDecimal("1564673720"),resultAsia);
        Assert.assertEquals(new BigDecimal("358582480"),resultNorthAmerica);
        Assert.assertEquals(new BigDecimal("2356603640"),resultWord);
        Assert.assertEquals(new BigDecimal("2356603640"),resultPopulationEarth);

    }
}

