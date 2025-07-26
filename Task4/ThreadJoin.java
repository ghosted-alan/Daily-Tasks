package Task4;

class NumberPrinter extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread1: " + i);
         try {
             Thread.sleep(1000);
         } catch (InterruptedException ex) {
             System.out.println("Thread interrupted");
         }
     }
 }
}

public class ThreadJoin {
 public static void main(String[] args) {
	// TODO Auto-generated method stub
     NumberPrinter thread1 = new NumberPrinter();
     thread1.start();

     try {
         thread1.join(); 
     } catch (InterruptedException ex) {
         System.out.println("Main thread interrupted");
     }

     System.out.println("Main thread done.");
 }
}
