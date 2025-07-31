package javawrapperclass;

import java.util.ArrayList;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character ch = 'a';
		char c = ch;
		
		ArrayList<Character> a1 = new ArrayList<Character>();
		a1.add(ch);
		System.out.println(a1.get(0));
	}

}
