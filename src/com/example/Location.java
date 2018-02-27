package com.example;

abstract public class Location {
    private String name;
    private String description;
    private Item[] items;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Item[] getItems() {
        return items;
    }

    public abstract void nextEpoch();
    public abstract Location moveTo(String place);

    public String toString() {
        return String.format("Name: " + getName(), "\nDescription: " + getDescription() + "\nItems: " + getItems());
    }
}
