package task6;

import java.util.*;

class Student3 {
 String name;
 int score;

 public Student3(String name, int score) {
     this.name = name;
     this.score = score;
 }

 @Override
 public String toString() {
     return name + " - " + score;
 }
}

public class TopStudents {
 public static void main(String[] args) {
	 // TODO Auto-generated method stub
     List<Student3> students = new ArrayList<>();
     students.add(new Student3("Alice", 85));
     students.add(new Student3("Bob", 92));
     students.add(new Student3("Charlie", 78));
     students.add(new Student3("David", 95));
     students.add(new Student3("Eve", 88));

     PriorityQueue<Student3> maxHeap = new PriorityQueue<>(
         (a, b) -> Integer.compare(b.score, a.score)
     );

     maxHeap.addAll(students);

     System.out.println("Top 3 Highest Scoring Students:");
     for (int i = 0; i < 3 && !maxHeap.isEmpty(); i++) {
         System.out.println(maxHeap.poll());
     }
 }
}

