package com.patterns.singlton;

public class FileReader {
    private static FileReader instance;

    private FileReader() {

    }

    public static FileReader getInstance() {
        if (instance == null) {
            instance = new FileReader();
        }
        return instance;
    }
}
