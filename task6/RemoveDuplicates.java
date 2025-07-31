package task6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("C");
        languages.add("Java");
        languages.add("Python");

        Set<String> uniqueLanguages = new HashSet<>(languages);

        List<String> result = new ArrayList<>(uniqueLanguages);

        System.out.println(result);
    }
}

