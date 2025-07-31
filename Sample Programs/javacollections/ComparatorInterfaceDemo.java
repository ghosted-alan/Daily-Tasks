package javacollections;

import java.util.*;

class Student{
	int rollNo;
	String name;
	
	Student(int rollNo,String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return rollNo + " " + name;
	}
}
class SortByRoll implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.rollNo - o2.rollNo;
	}
}


public class ComparatorInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> sobj = new ArrayList<>();
		sobj.add(new Student(111,"Maya"));
		sobj.add(new Student(131,"Alex"));
		sobj.add(new Student(110,"Clare"));
		sobj.add(new Student(101,"Jack"));
		
		Collections.sort(sobj, new SortByRoll());
		System.out.println("Sorted by roll number: ");
		
		Iterator<Student> itr = sobj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
