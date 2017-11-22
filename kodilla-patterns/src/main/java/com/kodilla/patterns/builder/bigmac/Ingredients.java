package com.kodilla.patterns.builder.bigmac;

public enum Ingredients {
    onion("onion"),
    bacon("bacon"),
    chiliPeppers("chili peppers"),
    mushrooms("mushrooms"),
    shrimps("shrimps");

   private String name;

    private  Ingredients(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
