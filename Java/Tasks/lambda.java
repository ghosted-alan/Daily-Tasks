package Tasks;

@FunctionalInterface
interface Operation {
 int op(int a, int b);
}

public class lambda {
 public static void main(String[] args) {
	// TODO Auto-generated method stub
     
     Operation add = (a, b) -> a + b;  
     Operation sub = (a, b) -> a - b; 
     Operation mul= (a, b) -> a * b;


     System.out.println("Addition: " + add.op(10, 5));
     System.out.println("Subtraction: " + sub.op(10, 5));
     System.out.println("Multiplication: " + mul.op(10, 5));
 }
}

