package Task1;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
