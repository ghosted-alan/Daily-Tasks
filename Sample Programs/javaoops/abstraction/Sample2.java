package javaoops.abstraction;

interface I1{
	void personalLoan();
	void educationLoan();
}
class IDFC implements I1{
	public void personalLoan() {
		System.out.println("Rate of Interest: 11%");
	}
	public void educationLoan() {
		System.out.println("Rate of Interest: 5%");
	}
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDFC obj=new IDFC();
		obj.personalLoan();
		obj.educationLoan();

	}

}
