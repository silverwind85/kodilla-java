package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private final String name ;

    private Set<Continent> continentsList= new HashSet<>();

    public World(String name) {
        this.name = name;
    }

    public Set<Continent> getContinent() {
        return continentsList;
    }

    public void addContinent(Continent continent){
        continentsList.add(continent);
    }
    public Set<Continent> getContinentsList(){
        return continentsList;
    }
    public BigDecimal getPeopleQuantity(){
        return continentsList.stream()
                .flatMap(continent -> continent.getCountriesList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
