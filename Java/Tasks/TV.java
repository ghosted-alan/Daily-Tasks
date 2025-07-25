package Tasks;

abstract class Appliance {
 abstract void turnOn();
}

interface Connectable {
 void connect();
}

class SmartTV extends Appliance implements Connectable {
 
 public void turnOn() {
     System.out.println("SmartTV is turned on");
 }

 public void connect() {
     System.out.println("SmartTV is connected to WiFi");
 }
}

public class TV {
 public static void main(String[] args) {
	// TODO Auto-generated method stub
     SmartTV tv = new SmartTV();
     tv.turnOn();
     tv.connect();
 }
}

