package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Filework {
    private String path_to_folder = "/forfiles/";
    private String format = ".txt";

    public String findpath(String filename){
        return path_to_folder + filename + format;
    }
    public void saveToFile(String filename, String text) throws IOException {
        try {
            FileWriter writer = new FileWriter(findpath(filename), true);
            writer.append(text);
            writer.close();
        } catch (IOException e) {
            System.out.println("Не удалось записать данные в файл");
        }

    }
    //        File file = new File(path);
    public void setFormat(String format) {
        this.format = format;
    }

    public void setPath_to_folder(String path_to_folder) {
        this.path_to_folder = path_to_folder;
    }
}
