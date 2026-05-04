package com.ecomerce.service;

import com.ecomerce.model.Cart;
import com.ecomerce.model.Product;

public class CartService {

    public void addToCart(Cart cart, Product product, int qty) {
        if (product.getStock() >= qty) {
            cart.addProduct(product, qty);
            product.setStock(product.getStock() - qty);
        } else {
            System.out.println("Not enough stock!");
        }
    }
}