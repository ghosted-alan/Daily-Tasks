package task6;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterators {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Ruby");

        ListIterator<String> iterator = languages.listIterator();

        System.out.println("Forward Traversal:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nBackward Traversal:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}

