package Task1;


public class Task7 {
	
	byte defaultByte;
    short defaultShort;
    int defaultInt;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		byte b=1;
		short s=5;
		int a = 10;
		float f= 2;
		double d=20.2;
		char c='A';
		boolean t =true;
			
		System.out.println("Initialized Local Variables: ");
		System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + a);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + t);
		
        System.out.println("\nDefault Values of Instance Variables: ");
        
        Task7 obj = new Task7();
        System.out.println("byte: " + obj.defaultByte);
        System.out.println("short: " + obj.defaultShort);
        System.out.println("int: " + obj.defaultInt);
        System.out.println("float: " + obj.defaultFloat);
        System.out.println("double: " + obj.defaultDouble);
        System.out.println("char: [" + obj.defaultChar + "]");
        System.out.println("boolean: " + obj.defaultBoolean);
	}

}




