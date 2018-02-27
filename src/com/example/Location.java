package com.example;

abstract public class Location {
    public abstract void nextEpoch();
    public abstract Location moveTo(String place);
    public String toString() {
        return me() + "\n" + this.getDescription() + this.getItem();
    }
}
