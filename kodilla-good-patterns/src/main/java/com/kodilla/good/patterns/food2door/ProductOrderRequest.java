package com.kodilla.good.patterns.food2door;

public class ProductOrderRequest {
    private Order order;

    public ProductOrderRequest(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
}
