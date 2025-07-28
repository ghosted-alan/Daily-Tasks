package Task4;

public class BankAccountSimulation {
	static class BankAccount {
        private int balance = 1000;

        public synchronized void withdraw(int amount, String user) {
            if (balance >= amount) {
                System.out.println(user + " is trying to withdraw " + amount);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                balance -= amount;
                System.out.println(user + " completed withdrawal, Remaining balance: " + balance);
            } else {
                System.out.println(user + " tried to withdraw $" + amount + " but insufficient balance");
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();

        Thread user1 = new Thread(() -> account.withdraw(700, "User1"));
        Thread user2 = new Thread(() -> account.withdraw(700, "User2"));

        user1.start();
        user2.start();
	}

}

