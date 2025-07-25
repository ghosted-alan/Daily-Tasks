package Task3;

abstract class Shape1 {
 abstract double area(); 

 void displayShapeType() { 
     System.out.println("This is a shape");
 }
}

class Circle1 extends Shape1 {
 double radius;
 double pi=3.14;

 Circle1(double radius) {
     this.radius = radius;
 }

 double area() {
     return pi * radius * radius;
 }
}

public class NonAbstract {
 public static void main(String[] args) {
	// TODO Auto-generated method stub
     Shape1 s = new Circle1(3.0);
     s.displayShapeType();          
     System.out.println(s.area());  
 }
}


