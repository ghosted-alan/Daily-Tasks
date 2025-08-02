package task7filehandling;

import java.io.*;
import java.util.Scanner;

public class ContactManager {
    static final String FILE_NAME = "contacts.txt";

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Contact Manager ===");
            System.out.println("1. Add New Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    displayContacts();
                    break;
                case 3:
                    searchContact(scanner);
                    break;
                case 4:
                    System.out.println("Exiting Contact Manager.");
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void addContact(Scanner scanner) {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(name + "," + phone);
            writer.newLine();
            System.out.println("Contact saved.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void displayContacts() {
        System.out.println("\n--- All Contacts ---");

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean empty = true;

            while ((line = reader.readLine()) != null) {
                empty = false;
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    System.out.println("Name: " + parts[0] + ", Phone: " + parts[1]);
                }
            }

            if (empty) {
                System.out.println("No contacts found.");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void searchContact(Scanner scanner) {
        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine().toLowerCase();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].toLowerCase().contains(searchName)) {
                    System.out.println("Found - Name: " + parts[0] + ", Phone: " + parts[1]);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Contact not found.");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

