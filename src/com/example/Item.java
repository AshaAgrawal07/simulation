package com.example;

import java.util.ArrayList;

/**
 * Item class basically contains arrays of the subclasses that extends "Thing"
 */
public class Item extends Thing{
    private ArrayList<Food> food;
    private ArrayList<Weapon> weapon;
    private ArrayList<Pets> pets;

    public ArrayList<Food> getFood() {
        return food;
    }

    public ArrayList<Weapon> getWeapon() {
        return weapon;
    }

    public ArrayList<Pets> getPets() {
        return pets;
    }

    public String toString() {
        StringBuilder tostring = new StringBuilder();
        tostring.append("Food Items present: ");
        for(Food f: food){
            tostring.append("\n");
            tostring.append(f);
        }
        tostring.append("\nWeapons present: ");
        for(Weapon w: weapon){
            tostring.append("\n");
            tostring.append(w);
        }
        tostring.append("\nPets present: ");
        for(Pets p: pets){
            tostring.append("\n");
            tostring.append(p);
        }
        return tostring.toString();
    }
}
