package Task1;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        System.out.println("\nTranspose of the Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

