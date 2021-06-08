package exaxmple.read;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filename = "file.txt";
        File file = new File(filename);

        if(!file.exists()){
            System.err.println("The file does not exist.");
            return;
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
