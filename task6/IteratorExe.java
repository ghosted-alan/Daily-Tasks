package task6;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExe {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("Charlie");
        names.add("Amanda");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("A")) {
                iterator.remove();
            }
        }

        System.out.println("Names after removing those starting with 'A':");
        System.out.println(names);
    }
}

