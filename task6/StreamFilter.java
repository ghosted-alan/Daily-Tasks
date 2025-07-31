package task6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("C++");
        languages.add("Ruby");

        List<String> result = languages.stream()
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println("Strings starting with 'J': " + result);
    }
}
