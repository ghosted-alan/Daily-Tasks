package javaoops;

class Employee{
	int e_id;
	String e_name;
	//Default Constructor
	Employee(){
		System.out.println("Default Constructor Executed");	
	}
	//Parameterized Constructor 
	Employee(int e_id,String e_name){
		this.e_id=e_id;
		this.e_name=e_name;
	}
	void getInfo() {
		System.out.println(this.e_id+" "+this.e_name);
	}
}

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee eobj= new Employee(101,"Alex");
		eobj.getInfo();
		Employee eobj2=new Employee(102,"John");
		eobj2.getInfo();
	}

}
