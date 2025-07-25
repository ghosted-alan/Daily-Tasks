package Tasks;

abstract class Shape {
 abstract double area(); 
}

class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 double area() {
	 double pi=3.14;
     return pi * radius * radius;
 }
}

class Rectangle extends Shape {
 private double length;
 private double width;


 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 double area() {
     return length * width;
 }
}
public class Abstract {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Shape circle = new Circle(5.0);
     Shape rectangle = new Rectangle(4.0, 6.0);

     System.out.println("Area of Circle: " + circle.area());
     System.out.println("Area of Rectangle: " + rectangle.area());
 }
}
