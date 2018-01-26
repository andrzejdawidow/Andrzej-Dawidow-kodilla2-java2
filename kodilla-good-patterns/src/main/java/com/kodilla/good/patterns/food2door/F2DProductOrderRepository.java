package com.kodilla.good.patterns.food2door;

public class F2DProductOrderRepository implements ProductOrderRepository {
    public void createOrder(String productName, int quantity) {
        System.out.println("Order to: .........." + " product name: " + productName + " quantity: " + quantity);
    }
}
