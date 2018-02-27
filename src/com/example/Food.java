package com.example;

public class Food extends Thing{
    private String name;
    private String description;
    private String consequence;
    private int cost;
    private int quantity;

    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

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

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return "Name: " + getName() + "\nDescription: " + getDescription() + "\nCost: " + getCost() + " yen \nQuantity: "
                + getQuantity();
    }
}
