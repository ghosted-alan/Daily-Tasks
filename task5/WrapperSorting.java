package task5;

import java.util.Arrays;

public class WrapperSorting {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        Integer[] numbers = {45, 22, 78, 90, 66};

        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        int secondHighest = numbers[numbers.length - 2];
        System.out.println("2nd Highest Value: " + secondHighest);
    }
}
