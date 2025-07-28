package Task4;


class MyThread1 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyThread(), "Thread-1");
        t1.setPriority(Thread.MIN_PRIORITY);

        Thread t2 = new Thread(new MyThread(), "Thread-2");
        t2.setPriority(Thread.NORM_PRIORITY);

        Thread t3 = new Thread(new MyThread(), "Thread-3");
        t3.setPriority(Thread.MAX_PRIORITY);

        System.out.println("t1.setPriority(Thread.MIN_PRIORITY): " + t1.getPriority());
        System.out.println("t2.setPriority(Thread.NORM_PRIORITY): " + t2.getPriority());
        System.out.println("t3.setPriority(Thread.MAX_PRIORITY): " + t3.getPriority());

        t1.start();
        t2.start();
        t3.start();
    }
}
