package task7filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppLogger {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        String fileName = "app.log";

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = now.format(formatter);

        String logMessage = "[" + timestamp + "] Application started";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(logMessage);
            writer.newLine();
            System.out.println("Log entry added.");
        } catch (IOException e) {
            System.out.println("Logging error: " + e.getMessage());
        }
    }
}
