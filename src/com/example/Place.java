package com.example;

/**
 * Place is a type of "Location"
 */
public class Place extends Location {

    private Item[] items;
    private String description;
    private String name;

    public Item[] getItem() {
        return items;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public void nextEpoch() {
        super.nextEpoch();
    }

    @Override
    public Place moveTo(String place) {
        return null;
    }
}
