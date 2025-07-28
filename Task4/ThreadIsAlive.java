package Task4;
class MyThread extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {
			System.out.println("Thread Interrupted...");
		}
	}
}

public class ThreadIsAlive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		
		System.out.println("Before Start: "+ t.isAlive());
		t.start();
		
		System.out.println("After start: "+t.isAlive());
		
		try {
			t.join();
		}catch(InterruptedException ex) {
			System.out.println("Thread Interrupted...");
		}
		System.out.println("After join: "+t.isAlive());
	}

}