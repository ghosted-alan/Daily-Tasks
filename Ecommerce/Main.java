package Ecommerce;


import Ecommerce.shop.Products;
import Ecommerce.shop.Orders;
import Ecommerce.shop.Users;

public class Main {
 public static void main(String[] args) {
	// TODO Auto-generated method stub
     Products p = new Products("Laptop");
     Orders o = new Orders(1001);
     Users u = new Users("John Doe");

     p.showProduct();
     o.showOrder();
     u.showUser();
 }
}
