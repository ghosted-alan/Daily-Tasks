package casestudy;

public class Furniture extends Product {
    private String material;

    public Furniture(String id, String name, double price, String material) {
        super(id, name, price);
        this.material = material;
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture: " + name + " | Material: " + material + " | Price: ₹" + price);
    }
}

