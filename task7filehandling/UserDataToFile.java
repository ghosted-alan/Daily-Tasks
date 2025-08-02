package task7filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDataToFile {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        String fileName = "userdata.txt";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Name: " + name + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Address: " + address + "\n");
            writer.close();
            System.out.println("User data saved to " + fileName);
        } catch (IOException ex) {
            System.out.println("An error occurred: " + ex.getMessage());
        }

        scanner.close();
    }
}
