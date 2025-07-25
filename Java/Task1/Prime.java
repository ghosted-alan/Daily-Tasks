package Task1;

public class Prime {
	    public static void main(String[] args) {
	    	// TODO Auto-generated method stub
	        int count = 0;  

	        for (int num = 2; count < 10; num++) {
	            if (isPrime(num)) {
	                System.out.println(num);
	                count++;
	            }
	        }
	    }

	    static boolean isPrime(int n) {
	        if (n <= 1) return false;

	        for (int i = 2; i <= n / 2; i++) {
	            if (n % i == 0)
	                return false;
	        }
	        return true;
	    }
	}
