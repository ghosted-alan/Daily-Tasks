package task7filehandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileNotFound {
    public static void main(String[] args) throws IOException {
    	// TODO Auto-generated method stub
    	String fileName = "nonexistent.txt";

        try {
            FileReader reader = new FileReader(fileName);
            System.out.println("File opened successfully.");
            reader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found. Please check the file name.");
        }
    }
}
