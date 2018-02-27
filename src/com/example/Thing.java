package com.example;

abstract public class Thing {
    private String name;
    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Name: " + getName());
    }
}
