package com.patterns.singlton;

import java.io.File;
import java.nio.file.Files;

public class FileReader {
    private static FileReader instance;
    private File file;

    private FileReader() {
        this.file = new File("src/main/java/com/patterns/singlton/Data.txt");
    }

    public static FileReader getInstance() {
        if (instance == null) {
            instance = new FileReader();
        }
        return instance;
    }

    public String getContent() {
        try {
            System.out.println(file.exists());
            return Files.readString(file.toPath());
        } catch (Exception ex) {
            return null;
        }
    }
}
