package com.example;

public class Item {
    private Food[] food;
    private Weapon[] weapon;
    private Pets[] pets;

    public Food[] getFood() {
        return food;
    }

    public Weapon[] getWeapon() {
        return weapon;
    }

    public Pets[] getPets() {
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

    }
}
