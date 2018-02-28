package com.example;

import java.util.ArrayList;

abstract public class Location {
    private String name;
    private String description;
    private ArrayList<Item> items;

    /**
     *
     * @return the name of the Location
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the description of the location
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @return the items at the specific location, including food, weapons, and pets
     */
    public ArrayList<Item> getItems() {
        return items;
    }

    /**
     * advances the epoch by 1 (hour).
     * it will be called each time the player has done something.
     */
    public void nextEpoch() {
        Person.setTime(Person.getStartingTime() + 1);
    }

    /**
     *
     * @param input the place you want to move to
     * @return the new location if you aren't already there and if it exists
     */
    public Location moveTo(String input) {
        String place = input.substring(7);
        if (getName().equalsIgnoreCase(place)) {
            System.out.println("You are already at " + place);
            return null;
        } else if (!Person.location.contains(place)) {
            return null;
        }
        return Person.location.get(Person.location.indexOf(place));
    }

    /**
     *
     * @return the toString for the specific location
     */
    public String toString() {
        return String.format("Name: " + getName(), "\nDescription: " + getDescription() + "\nItems: " + getItems().toString());
    }
}
