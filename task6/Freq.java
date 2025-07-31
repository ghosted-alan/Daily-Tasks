package task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Freq {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("Java");

        int count = Collections.frequency(languages, "Java");

        System.out.println("\"Java\" appears " + count + " times in the list.");
    }
}

