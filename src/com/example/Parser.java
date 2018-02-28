package com.example;
import com.google.gson.Gson;
import com.google.gson.*;
import com.google.gson.GsonBuilder;

public class Parser {
    public static Person gintama;

    public static Person parse(final String file) {

        RuntimeTypeAdapterFactory<Location> locationParser = RuntimeTypeAdapterFactory.of(Location.class, "type");
        locationParser.registerSubtype(Yoruzuya.class, "Yoruzuya Gin-Chan");
        locationParser.registerSubtype(Shinsengumi.class, "Shinsengumi HQ");

        Gson gson = new GsonBuilder().registerTypeAdapterFactory(locationParser).create();
        String str = Data.getFileContentsAsString(file);
        Person gintama = gson.fromJson(str, Person.class);
        return gintama;
    }
}
