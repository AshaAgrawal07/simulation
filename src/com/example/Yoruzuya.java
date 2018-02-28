package com.example;

import java.util.ArrayList;

/**
 * Yoruzuya is a type of "Location"
 * Unique actions here: play, nap, clean, laze, hide
 * Overlap actions: buy, consume, moveTo
 */
public class Yoruzuya extends Location {

    private ArrayList<Item> items;
    private String description;
    private String name;

    public ArrayList<Item> getItem() {
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
    public Location moveTo(String place) {
        return super.moveTo(place);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * earn money for playing with Kagura and Sadaharu
     * @return positive message
     */
    public String play() {
        Person.setBalance(Person.getBalance() + 100);
        return "Kagura and Sadaharu are happy that you played with them.  You have earned 100 yen";
    }

    /**
     *
     * @return String that praises naps
     */
    public String nap() {
        return "Congrats on napping for an hour.  Naps are important.  Naps are fun.";
    }

    /**
     * earn money for cleaning the shop with Shinpachi
     * @return positive message
     */
    public String clean() {
        Person.setBalance(Person.getBalance() + 200);
        return "Shinpachi is very happy that you helped him clean Yoruzuya Gin-Chan.  You have earned 200 yen";
    }


    /**
     *
     * @return a sarcastic message
     */
    public String laze() {
        return "Congrats on successfully lazing around and wasting an entire hour";
    }

    /**
     *
     * @return message on not paying rent
     */
    public String hide() {
        return "Congrats on hiding from Otose-tanukibaba and not paying rent for the 4th month in a row!";
    }
}
