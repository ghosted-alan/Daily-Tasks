package task6;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Set<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");
        languages.add("Python");  

        System.out.println(languages);
    }
}

