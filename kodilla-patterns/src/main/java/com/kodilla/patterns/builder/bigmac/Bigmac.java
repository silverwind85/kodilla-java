package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private Roll roll;
    private int burger;
    private Sauce sauce;
    private List<Ingredient> ingredients;

    public static class BigmacBuilder {
        private Roll roll;
        private int burger;
        private Sauce sauce;
        private List<Ingredient> ingredients= new ArrayList<>();

        public BigmacBuilder withRoll(Roll roll) {
            this.roll = roll;
            return this;
        }
        public BigmacBuilder withBurger(int burger){
            this.burger = burger;
            return this;
        }
        public BigmacBuilder withSauce(Sauce sauce){
            this.sauce = sauce;
            return this;
        }
        public BigmacBuilder withIngredient(Ingredient ingredient) {
            ingredients.add(ingredient);
            return this;
        }
        public Bigmac Build(){
            return new Bigmac(roll,burger,sauce,ingredients);

        }

    }

    public Bigmac(Roll roll, int burger, Sauce sauce, List<Ingredient> ingredients) {
        this.roll = roll;
        this.burger = burger;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public Roll getRoll() {
        return roll;
    }

    public int getBurger() {
        return burger;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
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
