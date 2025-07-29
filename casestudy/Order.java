package casestudy;

import java.util.*;
import java.io.*;

public class Order {
    private Customer customer;
    private List<Product> products;
    private double totalAmount;

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void placeOrder(Payment payment, Discount discount) {
        customer.displayCustomer();
        products.forEach(Product::displayDetails);

        double discounted = discount.applyDiscount(totalAmount);
        System.out.println("Total after discount: ₹" + discounted);

        payment.amount = discounted;
        payment.processPayment();

        saveOrderToFile(discounted);
    }

    public void saveOrderToFile(double discountedAmount) {
        try {
            File file = new File("orders.txt");
            PrintWriter writer = new PrintWriter(new FileWriter(file, true));

            writer.println("----- ORDER -----");
            writer.println("Customer Name: " + customer.getName());
            writer.println("Customer Email: " + customer.getEmail());

            for (Product p : products) {
                writer.println("Product: " + p.name + " | Price: ₹" + p.getPrice());
            }

            writer.println("Total after Discount: ₹" + discountedAmount);
            writer.println("-----------------------------\n");

            writer.close();

        } catch (IOException ex) {
            System.out.println("Error saving order: " + ex.getMessage());
        }
    }
    
}

