package task6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student2 {
    String id;
    String name;

    public Student2(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }
}

public class ListToMap {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        List<Student2> studentList = new ArrayList<>();
        studentList.add(new Student2("S101", "Alice"));
        studentList.add(new Student2("S102", "Bob"));
        studentList.add(new Student2("S103", "Charlie"));

        Map<String, Student2> studentMap = new HashMap<>();
        for (Student2 s : studentList) {
            studentMap.put(s.id, s);
        }

        for (Map.Entry<String, Student2> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Student: " + entry.getValue());
        }
    }
}

