package task7filehandling;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Student2 implements Serializable {
    private String name;
    private int rollNo;
    private int marks;

    public Student2(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks;
    }
}

public class MultiStudent {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        String fileName = "students.ser";

        List<Student2> studentList = new ArrayList<>();
        studentList.add(new Student2("Rahul", 101, 85));
        studentList.add(new Student2("Anjali", 102, 90));
        studentList.add(new Student2("Vikram", 103, 78));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(studentList);
            System.out.println("Student list serialized to " + fileName);
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            List<Student2> deserializedList = (List<Student2>) ois.readObject();
            System.out.println("\nDeserialized Student List:");

            for (Student2 student : deserializedList) {
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
