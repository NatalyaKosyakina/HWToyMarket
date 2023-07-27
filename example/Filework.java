package org.example;

import java.io.*;

public class Filework {
    private String path_to_folder = "";
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

    public String load(String filename){
        StringBuilder text = new StringBuilder();
        try {
            File file = new File(findpath(filename));
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String tmp = reader.readLine();
            while(tmp != null){
                tmp = reader.readLine();
                text.append(tmp);
                text.append("\n");
            }
            reader.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Не удалось прочитать файл");
        }
        return text.toString();
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setPath_to_folder(String path_to_folder) {
        this.path_to_folder = path_to_folder;
    }
}
