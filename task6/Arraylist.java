package task6;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        ArrayList<String> l = new ArrayList<>();

        l.add("Java");
        l.add("C");
        l.add("C++");
        l.add("Ruby");
        l.add("Python");

        l.remove(1);

        System.out.println(l);
    }
}

