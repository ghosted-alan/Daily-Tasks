package task7filehandling;

import java.io.File;

public class DirectoryScanner {
    public static void main(String[] args) {
        String path = "C:\\Users\\alanl\\eclipse-workspace\\MyProject\\src\\task7filehandling";
        
        File directory = new File(path);

        if (directory.exists() && directory.isDirectory()) {
            File[] contents = directory.listFiles();

            if (contents != null && contents.length > 0) {
                System.out.println("Contents of directory: " + path);
                System.out.println("------------------------------------------");

                for (File file : contents) {
                    String type = file.isDirectory() ? "Directory" : "File";
                    long size = file.length();
                    System.out.println(file.getName() + " | " + type + " | " + size + " bytes");
                }
            } else {
                System.out.println("Directory is empty.");
            }
        } else {
            System.out.println("Invalid directory path!");
        }
    }
}

