package Task1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        double num1, num2, result;
        int choice;

        System.out.println("Simple Calculator");
        System.out.println("Addition");
        System.out.println("Subtraction");
        System.out.println("Multiplication");
        System.out.println("Division");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
