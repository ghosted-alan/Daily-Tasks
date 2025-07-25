package javaoops;

class Employee1{
	int emp_id;
	String emp_name;
	static String emp_company="Wipro";
	Employee1(int emp_id,String emp_name){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
	}
	void getEmpInfo() {
		System.out.println(this.emp_id+" "+this.emp_name+" "+emp_company);
	}
}

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 empobj1 = new Employee1(101,"Alex");
		Employee1 empobj2 = new Employee1(101,"Bob");
		Employee1 empobj3 = new Employee1(101,"Clare");
		Employee1 empobj4 = new Employee1(101,"Emily");
		Employee1 empobj5 = new Employee1(101,"Daniel");
		
		empobj1.getEmpInfo();
		empobj2.getEmpInfo();
		empobj3.getEmpInfo();
		empobj4.getEmpInfo();
		empobj5.getEmpInfo();

	}

}
