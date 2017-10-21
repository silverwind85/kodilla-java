package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {
    private final String name;

    private Set<Country> countriesSet= new HashSet<>();

    public Continent(String name) {
        this.name = name;
    }

    public Set<Country> getCountry() {
        return countriesSet;
    }

    public void addCountry(Country country){
        countriesSet.add(country);
    }
    public Set<Country> getCountriesSet(){
        return countriesSet;
    }

}
