package org.launchcode.models;


public enum Availability {

    EasilyAvailable ("Easily-Available"),
    Rare("Rare");


    private String name;

    Availability(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
