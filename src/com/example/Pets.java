package com.example;

/**
 * Pets is a type of "Thing"
 * It has a name and cannot be bought or anything
 * Things that can be done to pets:  walk, borrow
 */
public class Pets extends Thing{
    private String name;

    public String getName() {
        return name;
    }

    public String toString() {
        return super.toString();
    }
}
