package Ecommerce.shop;

public class Orders {
    private int orderId;

    public Orders(int orderId) {
        this.orderId = orderId;
    }

    public void showOrder() {
        System.out.println("Order ID: " + orderId);
    }
}
