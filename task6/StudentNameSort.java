package task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1 {
    String name;
    int marks;

    public Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

class NameComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class StudentNameSort {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        ArrayList<Student1> students = new ArrayList<>();
        students.add(new Student1("Charlie", 90));
        students.add(new Student1("Alice", 85));
        students.add(new Student1("David", 75));
        students.add(new Student1("Bob", 70));

        Collections.sort(students, new NameComparator());

        for (Student1 s : students) {
            System.out.println(s);
        }
    }
}
