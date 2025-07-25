package javaoops.inheritance;

class A4{
	double pi=3.14;
}
class B4 extends A4{
	// area of circle = 2*3.14*radius
	void area_of_circle() {
		double res;
		res=2*pi*5;
		System.out.println("Area Of Circle: "+res);
	}
}
class C4 extends A4{
	// surface area of sphere = 4*pi*radius 
	void surface_area_of_sphere() {
		double res;
		res=4*pi*5;
		System.out.println("Surface Area Of Sphere: "+res);
	}
}
class D4 extends B4{
	
}
public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D4 obj =new D4();
		obj.area_of_circle();
		//obj.surface_area_of_sphere();
	}

}
