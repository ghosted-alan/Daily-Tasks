package Tasks;

class Calc {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}

public class Calculator {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Calc calc = new Calc();

        System.out.println("Int add: " + calc.add(5, 10));
        System.out.println("Double add: " + calc.add(5.5, 3.2));
        System.out.println("String add: " + calc.add("Hello, ", "Alan!"));
    }
}

