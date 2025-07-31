package javathreads;

class Task1 implements Runnable{
	Task1(){
		System.out.println("Thread: "+ Thread.currentThread().getName()+", "+"State: New");
}
	@Override
	public void run() {
		System.out.println("Thread: "+Thread.currentThread().getName()+", "+"State: Running");
	
	for(int i=4;i>0;i--) {
		System.out.println("Thread: "+Thread.currentThread().getName()+", "+"State Ending...");
	}
	System.out.println("Thread: "+Thread.currentThread().getName()+", "+"State: Dead");
	
}
}

public class ThreadsJoinDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Thread tobj1 = new Thread(new Task1(),"Scanning...");
		Thread tobj2 = new Thread(new Task1(),"Counting...");
		Thread tobj3 = new Thread(new Task1(),"Printing...");
		
		tobj1.start();
		tobj1.join();
		
		tobj2.start();
		tobj2.join();
		
		tobj3.start();
		
	}

}
