package org.launchcode.models;


public enum CheeseType {

    Combative ("Combative"),
    NonCombative("Non-Combative");


    private final String name;

    CheeseType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
