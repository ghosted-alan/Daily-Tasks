package task5;

import java.util.*;

public class StudentScoreboard {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Map<String, List<Integer>> studentScores = new HashMap<>();

        studentScores.put("Abdul", Arrays.asList(85, 90, 88));
        studentScores.put("Srikant", Arrays.asList(78, 82, 80));
        studentScores.put("Rahul", Arrays.asList(92, 95, 91));

        String topStudent = null;
        double highestAvg = 0.0;

        for (Map.Entry<String, List<Integer>> entry : studentScores.entrySet()) {
            String name = entry.getKey();
            List<Integer> marks = entry.getValue();

            int total = 0;
            for (int mark : marks) {
                total += mark;
            }
            double average = (double) total / marks.size();

            System.out.println(name + "'s Average: " + average);

            if (average > highestAvg) {
                highestAvg = average;
                topStudent = name;
            }
        }

        System.out.println("\nHighest Scorer: " + topStudent + " with average score " + highestAvg);
    }
}

