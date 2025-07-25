package Task3;

interface RemoteControl {
 void turnOn(); 

 default void batteryStatus() { 
     System.out.println("Battery is 80% charged");
 }
}

class TV implements RemoteControl {
 public void turnOn() {
     System.out.println("TV is turned on");
 }
}

public class TV2 {
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TV tv = new TV();
	     tv.turnOn();         
	     tv.batteryStatus();  
 }
}
