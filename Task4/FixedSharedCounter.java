package Task4;

public class FixedSharedCounter {
	
	static int counter = 0; 
    static final Object lock = new Object();
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Runnable incrementTask = () -> {
	            for (int i = 0; i < 1000; i++) {
	                synchronized (lock) {
	                    counter++; 
	                }
	            }
	        };

	        Thread thread1 = new Thread(incrementTask);
	        Thread thread2 = new Thread(incrementTask);

	        thread1.start();
	        thread2.start();

	        try {
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException ex) {
	            ex.printStackTrace();
	        }

	        System.out.println("Final counter value: " + counter);
	}

}



 
