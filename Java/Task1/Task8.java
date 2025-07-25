package Task1;
import java.util.Scanner;
public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,res;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Num");
		a=sc.nextFloat();
		System.out.println("Enter 2nd Num");
		b=sc.nextFloat();
		System.out.println("Enter the operator");
		op=sc.next().charAt(0);
		
		res=a;
		
		switch(op) {
		case '+':
			res+=b;
			break;
		case '-':
			res-=b;
			break;
		case '*':
			res*=b;
			break;
		case '/':
			if(b!=0) {
			res/=b;		
			}
			else {
				System.out.println("Error Division by 0");
				return;
			}
			break;
		default:
			System.out.println("Enter valid operator");
			break;
		}
		System.out.println("Result : " +res);

}
}
