package Tasks;

import java.util.*;

public class lamdacoll {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        List<String> names = Arrays.asList("Alice", "Bob", "Anita", "Charlie", "Andrew");

        System.out.println("All Names:");
        names.forEach(name -> System.out.println("Name: "+name));

        System.out.println("\nNames starting with 'A':");
        names.stream().filter(name -> name.startsWith("A")).forEach(name -> System.out.println("Name: "+name));

        System.out.println("\nSorted Names:");
        names.stream().sorted().forEach(name -> System.out.println("Name: "+name));
    }
}

