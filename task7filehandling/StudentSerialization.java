package task7filehandling;

import java.io.*;

class Student implements Serializable {
 private String name;
 private int rollNo;
 private int marks;

 public Student(String name, int rollNo, int marks) {
     this.name = name;
     this.rollNo = rollNo;
     this.marks = marks;
 }

 public String toString() {
     return "Name: " + name + "\nRoll No: " + rollNo + "\nMarks: " + marks;
 }
}

public class StudentSerialization {
 public static void main(String[] args) {
	// TODO Auto-generated method stub
     String fileName = "student.ser";

     Student student = new Student("Rahul", 101, 85);

     try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
         oos.writeObject(student);
         System.out.println("Object serialized and written to " + fileName);
     } catch (IOException e) {
         System.out.println("Serialization error: " + e.getMessage());
     }

     try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
         Student deserializedStudent = (Student) ois.readObject();
         System.out.println("Deserialized Student:");
         System.out.println(deserializedStudent);
     } catch (IOException | ClassNotFoundException e) {
         System.out.println("Deserialization error: " + e.getMessage());
     }
 }
}

