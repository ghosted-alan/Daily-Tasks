package Ecommerce.shop;

public class Products {
    private String name;

    public Products(String name) {
        this.name = name;
    }

    public void showProduct() {
        System.out.println("Product: " + name);
    }
}
