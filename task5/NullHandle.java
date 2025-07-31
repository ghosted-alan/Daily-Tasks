package task5;

import java.util.Optional;

public class NullHandle {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        Double balance = null;

        try {
            double amount = balance;
            System.out.println("Unboxed value: " + amount);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }

        Optional<Double> optionalBalance = Optional.ofNullable(balance);
        double optionalValue = optionalBalance.orElse(0.0);
        System.out.println("Balance using Optional: " + optionalValue);
    }
}

