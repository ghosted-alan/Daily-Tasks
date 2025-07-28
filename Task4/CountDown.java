package Task4;

class CountdownTimer extends Thread {
    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Countdown: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Countdown interrupted!");
            }
        }
        System.out.println("Time’s up!");
    }
}

public class CountDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountdownTimer t = new CountdownTimer();
        t.start(); 
	}

}
