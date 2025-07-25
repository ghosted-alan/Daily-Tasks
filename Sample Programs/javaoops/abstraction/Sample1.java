package javaoops.abstraction;

abstract class RBI{
	void studentloan() {
		System.out.println("Rate of Interest: 5%");
	}
	abstract void personalLoan();
}

class SBI extends RBI {
    void personalLoan() {
        System.out.println("Rate of Interest: 8%");
    }
}

class HDFC extends RBI {
    void personalLoan() {
        System.out.println("Rate of Interest: 10%");
    }
}

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI bank = new SBI(); 
        bank.studentloan();   
        bank.personalLoan();

	}

}
