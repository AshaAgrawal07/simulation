package com.example;

import java.util.ArrayList;

import static com.example.Person.carryItems;

public class Thing {
    private String name;
    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Name: " + getName());
    }

    /**
     *
     * @param input the thing you want to buy
     * @param place your current location
     * @return your updated list of carry items
     *      NOTE: if your wallet has reached either 0 or <0 during this transaction, game will promptly end
     */
    public ArrayList<Thing> buy (String input, Location place) {
        String purchase = input.substring(4);
        Thing item;
        for (int i = 0; i < place.getItems().size(); i++) {
            if(place.getItems().get(i).getFood().equals(purchase) ||
                    place.getItems().get(i).getWeapon().equals(purchase)) {
                carryItems.add(place.getItems().get(i));
                place.getItems().remove(place.getItems().get(i));
            }
        }
        System.out.println("You are now carrying: ");
        return Person.getCarryItems();
    }

    /**
     *
     * @param input food that will be consumed
     * @return the consequence of taking that food
     */
    public String consume(String input) {
        String toConsume = input.substring(8);
        if (carryItems.get(carryItems.indexOf(toConsume)).getClass() != Food.class) {
            return toConsume + " is not food!";
        }
        String consequence = ((Food) carryItems.get(carryItems.indexOf(toConsume))).getConsequence();
        carryItems.remove(carryItems.indexOf(toConsume));
        return consequence;
    }

    /**
     *
     * @param input takes a pet
     * @param place the current location
     * @return whether or not the pet was taken successfully
     */
    public String take(String input, Location place) {
        String toTake = input.substring(5);
        if (carryItems.get(carryItems.indexOf(toTake)).getClass() == Pets.class || place.getItems().contains(toTake)) {
            return toTake + " cannot be taken!";
        }
        carryItems.remove(carryItems.indexOf(toTake));
        return "You have successfully taken " + toTake;
    }
}
