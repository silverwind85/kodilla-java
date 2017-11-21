package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String roll;
    private final int burger;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String roll;
        private int burger;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder roll(String roll) {
            this.roll = roll;
            return this;
        }
        public BigmacBuilder burger(int burger){
            this.burger = burger;
            return this;
        }
        public BigmacBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }
        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }
        public Bigmac build(){
            return new Bigmac(roll,burger,sauce,ingredients);

        }

    }

    public Bigmac(String roll, int burger, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burger = burger;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getRoll() {
        return roll;
    }

    public int getBurger() {
        return burger;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burger=" + burger +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

}
