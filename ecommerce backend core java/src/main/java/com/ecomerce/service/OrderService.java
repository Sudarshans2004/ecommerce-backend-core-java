package com.ecomerce.service;
import java.util.List;

import com.ecomerce.model.Cart;
import com.ecomerce.model.Order;
import com.ecomerce.util.DataStore;

public class OrderService {

    private static int orderCounter = 1;

    public void placeOrder(Cart cart) {
        double total = 0;

        for (var entry : cart.getItems().entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }

        Order order = new Order(orderCounter++, cart.getItems(), total);
        DataStore.orders.add(order);

        System.out.println("Order placed! Total: ₹" + total);
    }
}