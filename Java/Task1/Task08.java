package Task1;

public class Task08 {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        
        int a = 5;
        System.out.println("Original a: " + a);
        System.out.println("Post-increment (a++): " + (a++)); 
        System.out.println("After post-increment: " + a);
        System.out.println("Pre-increment (++a): " + (++a)); 

        System.out.println("\nBitwise Shift Operators:");
        int x = 8; 
        System.out.println("x << 1 (Left shift): " + (x << 1)); 
        System.out.println("x >> 1 (Right shift): " + (x >> 1)); 

        System.out.println("\nLogical AND (&&) vs Bitwise AND (&):");

        int p = 10, q = 5, r = 0;

        
        if (p < q && ++r < 10) {
            System.out.println("Logical AND: True");
        } else {
            System.out.println("Logical AND: False");
        }
        System.out.println("Value of r after logical AND: " + r); 

        
        if (p < q & ++r < 10) {
            System.out.println("Bitwise AND: True");
        } else {
            System.out.println("Bitwise AND: False");
        }
        System.out.println("Value of r after bitwise AND: " + r); 
    }
}
