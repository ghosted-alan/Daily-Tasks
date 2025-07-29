package casestudy;

import java.util.*;

public class EcommerceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        Customer customer = new Customer(name, email);
        List<Product> products = new ArrayList<>();

        products.add(new Electronics("001", "Smartphone", 30000, "Samsung", 24));
        products.add(new Clothing("001", "TShirt", 1000, "L", "Cotton"));
        products.add(new Book("001", "Java Programming", 500, "AuthorXYZ"));

        Discount discount = (price) -> price * 0.9;

        System.out.println("Select Payment Method: 1) UPI 2) Card 3) COD");
        int choice = scanner.nextInt();
        scanner.nextLine();

        Payment payment;
        if (choice == 1) {
            System.out.print("Enter UPI ID: ");
            String upi = scanner.nextLine();
            payment = new UpiPayment(0, upi);
        } else if (choice == 2) {
            System.out.print("Enter Card Number: ");
            String card = scanner.nextLine();
            payment = new CardPayment(0, card);
        } else {
            payment = new CashOnDelivery(0);
        }

        Order order = new Order(customer, products);
        order.placeOrder(payment, discount);
    }
}
