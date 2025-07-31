package javawrapperclass;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive data type
		int number;
		
		//integer wrapper type
		Integer number1;
		
		number=200;
		
		//Auto Boxing: converting primitive Int to Integer Object
		number1 =number;
		
		System.out.println("The primitive int number is: "+number);
		System.out.println("The integer Object number1 is: "+number1);
	}

}
