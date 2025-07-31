package task5;

import java.util.List;
import java.util.ArrayList;

public class AutoAndUnboxing {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        List<Double> numbers = new ArrayList<>();

        numbers.add(10.5);
        numbers.add(20.0);
        numbers.add(15.75);
        numbers.add(30.25);

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        double average = sum / numbers.size();

        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + average);
    }
}

