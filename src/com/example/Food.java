package com.example;

/**
 * Food is a type of "Thing" which has a name, description, cost, and quantity
 * should the player take any quantity of the food, there may be a detrimental consequence to taking it
 *      for example, if you take any type of food at the Yoruzuya, the probability that you will either go bankrupt or
 *      die is very high if you choose to eat it
 *      at the Shinsengumi, nothing really happens
 * Things that can be done to food:  buy, consume
 */
public class Food extends Thing{
    private String name;
    private String description;
    private String consequence;
    private int cost;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getConsequence() {
        return consequence;
    }

    public int getCost() {
        return cost;
    }

    public String toString() {
        return "Name: " + getName() + "\nDescription: " + getDescription() + "\nCost: " + getCost() + " yen";
    }
}
