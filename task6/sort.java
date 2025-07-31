package task6;

import java.util.ArrayList;
import java.util.Collections;

public class sort {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(15);
        numbers.add(7);
        numbers.add(89);
        numbers.add(23);

        Collections.sort(numbers);
        System.out.println("Ascending order: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending order: " + numbers);
    }
}

