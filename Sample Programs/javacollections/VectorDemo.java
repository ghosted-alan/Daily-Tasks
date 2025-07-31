package javacollections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vobj = new Vector<Integer>();
		for(int i=1;i<=5;i++)
			vobj.add(i);
		System.out.println(vobj);
		vobj.remove(3);
		System.out.println(vobj);
		
		for(int i=0; i<vobj.size();i++) {
			System.out.println(vobj.get(i)+" ");
		}
	}

}
