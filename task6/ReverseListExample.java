package task6;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseListExample {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");

        Collections.reverse(items);

        System.out.println("Reversed List: " + items);
    }
}

