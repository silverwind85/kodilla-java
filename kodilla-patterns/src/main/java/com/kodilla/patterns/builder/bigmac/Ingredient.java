package com.kodilla.patterns.builder.bigmac;

public enum Ingredient {
    onion("onion"),
    bacon("bacon"),
    chiliPeppers("chili peppers"),
    mushrooms("mushrooms"),
    shrimps("shrimps");

   private String name;

    private Ingredient(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
