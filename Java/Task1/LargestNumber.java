package Task1;

public class LargestNumber {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        int a = 25;
        int b = 40;
        int c = 30;

        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("The largest number is: " + largest);
    }
}

