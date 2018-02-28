package com.example;
import com.google.gson.Gson;
import com.google.gson.*;
import com.google.gson.GsonBuilder;

public class Parser {
    public static Simulator gintama;

    public static Simulation parse(final String file) {

        RuntimeTypeAdapterFactory<Location> locationParser = RuntimeTypeAdapterFactory.of(Location.class, "type");
        locationParser.registerSubtype(Yoruzuya.class, "Yoruzuya Gin-Chan");
        locationParser.registerSubtype(Shinsengumi.class, "Shinsengumi HQ");

        Gson gson = new GsonBuilder().registerTypeAdapterFactory(locationParser).create();
        String str = Data.getFileContentsAsString(file);
        Simulation gintama = gson.fromJson(str, Simulation.class);
        return gintama;
    }
}
