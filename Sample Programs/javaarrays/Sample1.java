package javaarrays;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = {80,50,70,77,82,55};
		System.out.println(marks.length);
		System.out.println(marks[2]);
		System.out.println("--------");
		
		for(int i : marks) {
			System.out.println(i);
		}

	}

}
