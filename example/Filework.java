package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filework {
    private String path_to_folder = "";
    private String format = ".txt";

    public String findpath(String filename){
        return path_to_folder + filename + format;
    }
    public void saveToFile(String filename, String text) throws IOException {
        String path = findpath(filename);
//        File file = new File(path);
        FileWriter writer = new FileWriter(path, true);
        writer.append(text);
        writer.close();
    }
}
