package exaxmple.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "file.txt";

        try (FileWriter fileWriter = new FileWriter(new File(fileName),true)){
            fileWriter.write("Text new line.");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
