package Ecommerce.shop;

public class Users {
    private String username;

    public Users(String username) {
        this.username = username;
    }

    public void showUser() {
        System.out.println("User: " + username);
    }
}
