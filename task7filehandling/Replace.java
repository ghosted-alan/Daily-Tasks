package task7filehandling;

import java.io.*;

public class Replace {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        String inputFile = "data.txt";
        String outputFile = "output.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                
                String modifiedLine = line.replaceAll("Java", "Python");
                writer.write(modifiedLine);
                writer.newLine();
            }

            System.out.println("All 'Java' words replaced with 'Python' and saved to output.txt.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

