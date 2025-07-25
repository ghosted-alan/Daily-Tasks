package Tasks;


class Vehicle { 
	String brand; 
	int speed; 
	void showDetails() { 
		System.out.println("Brand: " + brand + ", Speed: " + speed + "MPh"); 
	} 
} 
	class Car extends Vehicle { 
		int wheels = 4; 
} 
class Bike extends Vehicle { 
	int wheels = 2; 
	} 
	public class VehicleDetails { 
		public static void main(String[] args) { 
			// TODO Auto-generated method stub
			Car car = new Car(); 
			car.brand = "BMW"; 
			car.speed = 180; 
			car.showDetails(); 
			Bike bike = new Bike(); 
			bike.brand = "Audi"; 
			bike.speed = 120; 
			bike.showDetails(); 
	} 
}