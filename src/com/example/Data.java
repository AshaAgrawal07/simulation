package com.example;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Data {
    /**
     * This function reads the contents of a file located in the project's 'data' directory into a String
     *
     * @param filename contains the name of file
     * @return a String containing the file's contents
     */
    public static String getFileContentsAsString(String filename) {


        final Path path = FileSystems.getDefault().getPath("Data", filename);

        try {
            return new String(Files.readAllBytes(path));
        } catch (IOException e) {

            System.out.println("Couldn't find file: " + filename);
            System.exit(-1);
            return null;
        }
    }
}


