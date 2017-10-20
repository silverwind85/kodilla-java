package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String name;
    private final BigDecimal population;
    private final BigDecimal area;
    private final String language;

    public Country(String name, BigDecimal population, BigDecimal area, String language) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.language = language;
    }

    public String getName() {
        return name;
    }


    public BigDecimal getArea() {
        return area;
    }

    public String getLanguage() {
        return language;
    }

    public BigDecimal getPeopleQuantity() {
        return population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (name != null ? !name.equals(country.name) : country.name != null) return false;
        if (population != null ? !population.equals(country.population) : country.population != null) return false;
        if (area != null ? !area.equals(country.area) : country.area != null) return false;
        return language != null ? language.equals(country.language) : country.language == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (population != null ? population.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", language='" + language + '\'' +
                '}';
    }
}
