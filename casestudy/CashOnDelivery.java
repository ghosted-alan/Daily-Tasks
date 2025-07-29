package casestudy;

public class CashOnDelivery extends Payment {
    public CashOnDelivery(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Cash on Delivery: ₹" + amount + " to be paid at delivery.");
    }
}

