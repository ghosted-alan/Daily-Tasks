package javagenerics;

import java.util.ArrayList;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Alex");
		al.add("Bob");
//		al.add(30);
		
		String s1 = (String) al.get(0);
		String s2 = (String) al.get(1);
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
