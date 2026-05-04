package com.ecomerce;

import java.util.*;

import com.ecomerce.service.CartService;
import com.ecomerce.service.ProductService;
import com.ecomerce.service.OrderService;
import com.ecomerce.model.Cart;
import com.ecomerce.model.Product;


public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProductService ps = new ProductService();
        CartService cs = new CartService();
        OrderService os = new OrderService();

        Cart cart = new Cart();

        // Add sample products
        ps.addProduct(new Product(1, "Laptop", 50000, 10));
        ps.addProduct(new Product(2, "Phone", 20000, 20));

        while (true) {
            System.out.println("\n1. View Products\n2. Add to Cart\n3. Place Order\n4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ps.showProducts();
                    break;

                case 2:
                    System.out.print("Enter product id: ");
                    int id = sc.nextInt();
                    Product p = ps.getProductById(id);

                    if (p != null) {
                        System.out.print("Enter quantity: ");
                        int qty = sc.nextInt();
                        cs.addToCart(cart, p, qty);
                    }
                    break;

                case 3:
                    os.placeOrder(cart);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}