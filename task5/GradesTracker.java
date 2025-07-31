package task5;

import java.util.ArrayList;
import java.util.Collections;

public class GradesTracker {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(88);
        marks.add(75);
        marks.add(92);
        marks.add(60);
        marks.add(85);

        System.out.println("Original Marks: " + marks);

        Integer minMark = Collections.min(marks);
        marks.remove(minMark);

        System.out.println("removing lowest (" + minMark + "): " + marks);

        int max = Collections.max(marks);
        int min = Collections.min(marks);

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.size();

        System.out.println("Max marks: " + max);
        System.out.println("Min marks: " + min);
        System.out.println("Avg: " + average);
    }
}

