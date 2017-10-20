package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {
    private final String name;

    private Set<Country> countriesList= new HashSet<>();

    public Continent(String name) {
        this.name = name;
    }

    public Set<Country> getCountry() {
        return countriesList;
    }

    public void addCountry(Country country){
        countriesList.add(country);
    }
    public Set<Country> getCountriesList(){
        return countriesList;
    }

}
