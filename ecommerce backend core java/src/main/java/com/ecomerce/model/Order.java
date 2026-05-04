package com.ecomerce.model;
import java.util.*;

public class Order {
    private int orderId;
    private Map<Product, Integer> items;
    private double totalAmount;

    public Order(int orderId, Map<Product, Integer> items, double totalAmount) {
        this.orderId = orderId;
        this.items = items;
        this.totalAmount = totalAmount;
    }
}