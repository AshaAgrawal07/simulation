package com.example;

import java.util.ArrayList;

import static com.example.Person.carryItems;

abstract public class Thing {
    private String name;
    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Name: " + getName());
    }

    public ArrayList<Thing> buy (String input, Location place) {
        String purchase = input.substring(4);
        Thing item;
        for (int i = 0; i < place.getItems().size(); i++) {
            if(place.getItems().get(i).getFood().equals(purchase) ||
                    place.getItems().get(i).getWeapon().equals(purchase)) {
                carryItems.add(carryItems.indexOf(purchase),place.getItems().get(i));
            }
        }
        System.out.println("You are now carrying: ");
        return Person.getCarryItems();
    }

    public String consume(String input) {
        String toConsume = input.substring(8);
        if (carryItems.get(carryItems.indexOf(toConsume)).getClass() != Food.class) {
            return toConsume + " is not food!";
        }
        String consequence = ((Food) carryItems.get(carryItems.indexOf(toConsume))).getConsequence();
        carryItems.remove(carryItems.indexOf(toConsume));
        return consequence;
    }
}
