package task7filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WriteCount {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        String fileName = "info.txt";
        int wordCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }

            reader.close();
            System.out.println("Total words: " + wordCount);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

