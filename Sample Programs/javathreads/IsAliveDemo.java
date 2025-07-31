package javathreads;

public class IsAliveDemo extends Thread{

	public void run() {
		System.out.println("Thread is running: ");
		try {
			Thread.sleep(300);
		}catch(InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Thread Execution done: ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsAliveDemo tobj1 = new IsAliveDemo();
		IsAliveDemo tobj2 = new IsAliveDemo();
		tobj1.start();
		tobj2.start();
		
		System.out.println(tobj1.isAlive());
		System.out.println(tobj2.isAlive());
		
	}

}
