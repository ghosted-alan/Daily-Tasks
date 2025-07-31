package task5;

public class BankAccount {
    private String accountNumber;
    private Double balance;

    public BankAccount(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;

        if (balance == null) {
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void showBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        BankAccount acc = new BankAccount("ABC123", null);

        acc.showBalance();
        acc.deposit(5000);
        acc.withdraw(1200);
        acc.showBalance();
    }
}
