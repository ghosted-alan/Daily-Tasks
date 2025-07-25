package javaoops.polymorphism;
// Polymorphism by Function Overloading
class calculation{
	void addition(int x,int y) {
		int res;
		res=x+y;
		System.out.println("Sum is : "+res);
	}
	void addition(int x,int y,int z) {
		int res;
		res=x+y+z;
		System.out.println("Sum is : "+res);
	}
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculation obj = new calculation();
		obj.addition(40, 40);
		obj.addition(40, 50, 60);

	}

}
