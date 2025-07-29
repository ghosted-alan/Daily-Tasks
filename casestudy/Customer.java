package casestudy;

public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void displayCustomer() {
        System.out.println("Customer: " + name + " | Email: " + email);
    }

    // ✅ Add these methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

