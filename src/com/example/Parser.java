package com.example;
import com.google.gson.Gson;

public class Parser {
    public static Simulation gintama;

    public static Simulation parse(final String file) {
        Gson gson = new Gson();
        String str = Data.getFileContentsAsString(file);
        Simulation gintama = gson.fromJson(str, Simulation.class);
        return gintama;
    }
}
