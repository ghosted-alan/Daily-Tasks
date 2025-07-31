package task5;

public class Convert {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        int i = 42;
        double d = 3.14;
        char c = 'A';

        Integer intObj = Integer.valueOf(i);
        Double doubleObj = Double.valueOf(d);
        Character charObj = Character.valueOf(c); 

        int intPrimitive = intObj.intValue();
        double doublePrimitive = doubleObj.doubleValue();
        char charPrimitive = charObj.charValue();

        System.out.println("int: " + i + ", Wrapperobj: " + intObj + ",primitive: " + intPrimitive);
        System.out.println("double: " + d + ", Wrapperobj: " + doubleObj + ",primitive: " + doublePrimitive);
        System.out.println("char: " + c + ", Wrapperobj: " + charObj + ",primitive: " + charPrimitive);
    }
}

