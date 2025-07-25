package javaoops.interfce;

interface I2{
	void addition();
}
interface I3{
	void substraction();
}
public class Sample1 implements I2,I3 {


		public void addition() {
			System.out.println("Addition Function");
		}
		public void substraction() {
			System.out.println("Substraction Function");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Sample1 obj = new Sample1();
			obj.addition();
			obj.substraction();
	}

}
