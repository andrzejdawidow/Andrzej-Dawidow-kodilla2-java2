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


 /*   private String productName;
    private int quantity;


    public ProductOrderRequest(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    } */