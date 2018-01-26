package com.kodilla.good.patterns.food2door;

public class F2DProductOrderRepository implements ProductOrderRepository {
    public void createOrder(Order order) {
        System.out.println("Order to: " + order);
    }
}
