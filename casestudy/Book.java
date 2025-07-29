package casestudy;

public class Book extends Product {
    private String author;

    public Book(String id, String name, double price, String author) {
        super(id, name, price);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book: " + name + " | Author: " + author + " | Price: ₹" + price);
    }
}

