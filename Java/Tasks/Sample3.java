package Tasks;

class BankAccountDetails { 
	
	private double balance; 
	public void deposit(double amt) { 
		if (amt > 0) { 
			balance += amt; 
		} 
	} 
	public void withdraw(double amt) { 
		if (amt <= balance) { 
			balance -= amt; 
		} 
	} 
	public double getBalance() { 
		return balance; 
	} 
} 
	public class Sample3 { 
		public static void main(String[] args) { 
			BankAccountDetails obj = new BankAccountDetails(); 
			obj.deposit(1000); 
			obj.withdraw(300); 
			System.out.println("Remaining Balance: ₹" + obj.getBalance()); 
		} 
} 
