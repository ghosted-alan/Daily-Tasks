package task7filehandling;

import java.util.Scanner;

public class ReverseInput {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed: " + reversed);

        scanner.close();
    }
}
