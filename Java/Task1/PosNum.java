package Task1;

import java.util.Scanner;

public class PosNum {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number (Enter 1 to stop): ");
            number = sc.nextInt();
        } while (number != 1);

        System.out.println("You entered 1, Program ended");
        sc.close();
    }
}
