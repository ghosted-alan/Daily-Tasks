package task7filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        String fileName = "info.txt";

        try {
            
            FileWriter writer = new FileWriter(fileName);
            writer.write("Java I/O is powerful!\n");
            writer.close();

            FileWriter appendWriter = new FileWriter(fileName, true);
            appendWriter.write("Learn Java step-by-step");
            appendWriter.close();

            System.out.println("File written successfully.");
        } catch (IOException ex) {
            System.out.println("An error occurred: " + ex.getMessage());
        }
    }
}

