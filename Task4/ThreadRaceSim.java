package Task4;

class ThreadRaceSim extends Thread { 
	public ThreadRaceSim(String name) { 
		super(name); 
} 
	public void run() { 
		for(int i = 1; i <= 5; i++) { 
			System.out.println(getName() + " running " + i); 
			try { 
				Thread.sleep((int)(Math.random() * 1000)); 
				}catch(Exception e) {} 
		} 
} 
public static void main(String[] args) { 
	// TODO Auto-generated method stub
	new ThreadRaceSim("Tortoise").start(); 
	new ThreadRaceSim("Rabbit").start(); 
	new ThreadRaceSim("Dog").start(); 
	} 
} 