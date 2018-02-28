package com.example;

import java.util.ArrayList;

/**
 * Shinsengumi is a type of "Location"
 * Unique actions here: stake out, read, train, fire, arrest
 * Overlap actions: buy, consume, moveTo
 */
public class Shinsengumi extends Location{

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public ArrayList<Item> getItems() {
        return super.getItems();
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
     *
     * @param input will contain "arrest" and "Zura"
     * @return that Zura has been successfully arrested and that player has earned money
     */
    public static String arrest(String input) {
            Person.setBalance(Person.getBalance() + 1000);
            return "Congrats on helping arrest the head of the Joui Patriots.  You have been awarded 1000 yen";
    }

    /**
     *
     * @return String that says that you wasted 1 hr of your time
     */
    public static String stakeOut() {
        return "Congrats on successfully wasting 1 hour of your time";
    }

    /**
     *
     * @param input check if they are trying to read the Kyokucho Hatto rather than something else
     * @return a string based on what you want to read
     */
    public static String read(String input) {
        if (input.contains("Kyokucho Hatto")) {
            return "Congrats on finally realizing the true and innate beauty of the Kyokucho Hatto";
        }
        return "Why on earth are you wasting time reading trash??????";
    }

    /**
     * checks if you can train by checking if you have any weapon at all
     * @return String on training status
     */
    public static String train() {
        for (int i = 0; i < Person.getCarryItems().size(); i++) {
            if (Person.getCarryItems().get(i).getClass() == Weapon.class) {
                return "Congrats on completing 1 hour of training";
            }
        }
        return "You need a weapon if you want to train";
    }

    /**
     *
     * @param input will contain "fire" and a fire-able weapon
     * @return wether or not you could actually fire the weapon
     */
    public static String fire(String input) {
        for (int i = 0; i < Person.getCarryItems().size(); i++) {
            if (Person.getCarryItems().get(i).getName().contains("bazooka") ||
                    Person.getCarryItems().get(i).getName().contains("canon") ||
                    Person.getCarryItems().get(i).getName().contains("umbrella")) {
                return "Congrats on firing a weapon";
            }
        }
        return "You need either a bazooka, canon, or umbrella if you want to train";
    }
}
