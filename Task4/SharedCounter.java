package Task4;

class CounterIncrementer implements Runnable {
    
    public void run() {
        for (int i = 0; i < 1000; i++) {
            SharedCounter.counter++;
        }
    }
}

public class SharedCounter {
	
	static int counter = 0;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 Thread t1 = new Thread(new CounterIncrementer());
	     Thread t2 = new Thread(new CounterIncrementer());

	        t1.start();
	        t2.start();

	        t1.join();
	        t2.join();

	        System.out.println("Final Counter Value: " + counter);
	}

}




