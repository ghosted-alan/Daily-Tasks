package javaoops.polymorphism;
// Different Data types
class calculation1{
	void addition(int x, int y) {
		int res;
		res = x+y;
		System.out.println("Sum is: "+res);
	}
	void addition(double x, double y) {
		double res;
		res = x+y;
		System.out.println("Sum is: "+res);
	}
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculation1 obj = new calculation1();
		obj.addition(20, 30);
		obj.addition(80.5, 60.25);

	}

}
