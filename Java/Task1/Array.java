package Task1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;

            if (num < min)
                min = num;

            if (num > max)
                max = num;
        }

        double average = sum / 10.0;

        System.out.println("\nAverage: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        sc.close();
    }
}
