package service;

import model.Student;

public class StudentService {
    private Student student;

    public void saveStudent(Student s) {
        this.student = s;
        System.out.println("Student info saved");
    }

    public void printStudent() {
        if (student != null) {
            System.out.println("Student Name: " + student.name);
            System.out.println("Roll No: " + student.rollNo);
        } else {
            System.out.println("No student found.");
        }
    }
}

