package Task4;


public class MyPrinterThread extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello from Thread!");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ex) {
				System.out.println("Thread Interrupted...");
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyPrinterThread obj = new MyPrinterThread();
		obj.start();
	}

}