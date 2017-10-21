package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private final String name ;

    private Set<Continent> continentsSet= new HashSet<>();

    public World(String name) {
        this.name = name;
    }

    public Set<Continent> getContinent() {
        return continentsSet;
    }

    public void addContinent(Continent continent){
        continentsSet.add(continent);
    }
    public Set<Continent> getContinentsSet(){
        return continentsSet;
    }
    public BigDecimal getPeopleQuantity(){
         return continentsSet.stream()
                .flatMap(continent -> continent.getCountriesSet().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
