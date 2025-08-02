package task7filehandling;

import java.io.*;

public class MergeFiles {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        String file1 = "file1.txt";
        String file2 = "file2.txt";
        String mergedFile = "merged.txt";

        try (
            BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile));
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2))
        ) {
            String line;

            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Files merged successfully into " + mergedFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

