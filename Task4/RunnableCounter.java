package Task4;

class RunnableCounter implements Runnable {
	 public void run() {
	     for (int i = 1; i <= 10; i++) {
	         System.out.println("Number: " + i);
	     }
	 }

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableCounter counter = new RunnableCounter();     
	     Thread thread = new Thread(counter);                 
	     thread.start();                                      
	 }
	}

