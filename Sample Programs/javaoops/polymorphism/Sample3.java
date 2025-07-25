package javaoops.polymorphism;

class A1{
	void addition(int x,int y) {
		int res;
		res =x+y;
		System.out.println("Sum is: "+res);
	}
}
class B1 extends A1{
	void addition(int x,int y) {
		int res;
		res =x+y;
		System.out.println("Sum is: "+res);
	}
}
public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj = new B1();
		obj.addition(50, 50);

	}

}
