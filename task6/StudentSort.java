package task6;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;
    }

    
    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class StudentSort {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 70));
        students.add(new Student("Charlie", 90));
        students.add(new Student("David", 75));

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}

