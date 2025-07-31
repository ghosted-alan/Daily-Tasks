package javacollections;

import java.util.*; 
public class ListExample { 
	public static void main(String[] args) { 
		List<String> languages = new ArrayList<>(); 
		languages.add("Java"); 
		languages.add("Python"); 
		languages.add("JavaScript"); 
		for (String lang : languages) { 
		System.out.println(lang); 
		} 
	} 
} 
