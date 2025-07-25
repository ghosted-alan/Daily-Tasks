package Task3;

abstract class Shape {
 abstract double area();
}

class Circle extends Shape {
 double radius;
 double pi=3.14;

 Circle(double radius) {
     this.radius = radius;
 }

 double area() {
     return pi * radius * radius;
 }
}

class Rectangle extends Shape {
 double length, width;

 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 double area() {
     return length * width;
 }
}

public class Abstract {
 public static void main(String[] args) {
	// TODO Auto-generated method stub
     Shape c = new Circle(3.0);
     Shape r = new Rectangle(4.0, 5.0);

     System.out.println("Circle Area: " + c.area());
     System.out.println("Rectangle Area: " + r.area());
 }
}

