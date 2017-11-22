package com.kodilla.patterns.builder.bigmac;

public enum Sauce {
    standard("standard"),
    spicy("spicy"),
    barbecue("barbecue");

    private String name ;

    private Sauce(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
