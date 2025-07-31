package task6;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        String input = "hello";

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                frequencyMap.put(ch, 1);
            }
        }

        System.out.println(frequencyMap);
    }
}

