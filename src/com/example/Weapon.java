package com.example;

public class Weapon extends Thing{
    private String name;
    private String description;
    private int cost;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }
    public String toString() {
        return "Name: " + getName() + "\nDescription: " + getDescription() + "\nCost: " + getCost() + " yen";
    }
}
