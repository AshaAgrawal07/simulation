package com.example;

import java.util.ArrayList;

public class Person {
    public static ArrayList<Location> location;
    public static int balance;
    private String startingLocation;
    private static int startingTime;
    public static ArrayList<Thing> carryItems = new ArrayList<>();

    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int money) {
        balance = money;
    }

    public String getStartingLocation() {
        return startingLocation;
    }

    public ArrayList<Location> getLocation() {
        return location;
    }

    public static int getStartingTime() {
        return startingTime;
    }

    public static void setTime(int time) {
        startingTime = time;
    }

    public static ArrayList<Thing> getCarryItems() {
        return carryItems;
    }
}
