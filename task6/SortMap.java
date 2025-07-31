package task6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        HashMap<Integer, String> students = new HashMap<>();
        students.put(103, "Charlie");
        students.put(101, "Alice");
        students.put(105, "Eva");
        students.put(102, "Bob");
        students.put(104, "David");

        TreeMap<Integer, String> sortedMap = new TreeMap<>(students);

        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

