package javaoops;

class Student{
	int s_id;
	String s_name;
	
	Student(){
		s_id=102;
		s_name="John";
		System.out.println("Default Constructor Gets executed!!!");
	}
	void getInfo() {
		System.out.println(s_id+" "+s_name);
	}
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sobj = new Student();
		sobj.getInfo();

	}

}
