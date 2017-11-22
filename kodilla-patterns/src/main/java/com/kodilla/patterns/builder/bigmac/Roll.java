package com.kodilla.patterns.builder.bigmac;

public enum Roll {
   rollSesame("roll sesame"),
    rollWithoutSesame("roll without sesame"),;

    private String name;

   private  Roll(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
