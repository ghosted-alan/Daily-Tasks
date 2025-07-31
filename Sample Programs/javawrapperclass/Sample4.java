package javawrapperclass;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=1;
		Byte bobj = Byte.valueOf(a);
		
		int b = 10;
		Integer intobj = Integer.valueOf(b);
		
		float c = 16.6f;
		Float floatobj = Float.valueOf(c);
		
		double d = 250.5;
		Double doubleobj = Double.valueOf(d);
		
		char e = 'a';
		Character charobj = Character.valueOf(e);
		
		System.out.println("Printing as objects");
		System.out.println(bobj);
		System.out.println(intobj);
		System.out.println(floatobj);
		System.out.println(doubleobj);
		System.out.println(charobj);
		
		byte bv =bobj;
		int iv = intobj;
		float fv = floatobj;
		double dv = doubleobj;
		char cv = charobj;
		
		
		System.out.println("Printing as data types");
		System.out.println(bv);
		System.out.println(iv);
		System.out.println(fv);
		System.out.println(dv);
		System.out.println(cv);
	}

}
