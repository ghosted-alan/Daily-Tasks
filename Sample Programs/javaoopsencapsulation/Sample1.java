package javaoopsencapsulation;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empobj = new Employee();
		empobj.setEmpId(101);
		empobj.setEmpName("Alex");
		empobj.setEmpEmail("hello@gmail.com");
		System.out.println(empobj.getEmpId()+" "+empobj.getEmpName()+" "+empobj.getEmpEmail());
		System.out.println(empobj);
	}

}
