package com.ecomerce.service;

import com.ecomerce.model.Product;
import com.ecomerce.util.DataStore;

public class ProductService {

    public void addProduct(Product product) {
        DataStore.products.add(product);
    }

    public void showProducts() {
        for (Product p : DataStore.products) {
            System.out.println(p.getId() + " " + p.getName() + " ₹" + p.getPrice());
        }
    }

    public Product getProductById(int id) {
        for (Product p : DataStore.products) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}