package com.example;

public class Simulator {
    private Place[] place;
    private int balance;
    private String startingLocation;
    private static int startingTime;

    public int getBalance() {
        return balance;
    }

    public String getStartingLocation() {
        return startingLocation;
    }

    public Place[] getPlace() {
        return place;
    }

    public static int getStartingTime() {
        return startingTime;
    }

    public static void setTime(int time) {
        startingTime = time;
    }
}
