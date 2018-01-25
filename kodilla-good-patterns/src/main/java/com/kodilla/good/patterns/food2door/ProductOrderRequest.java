package com.kodilla.good.patterns.food2door;

public class ProductOrderRequest {
    private int quantity;
    private String kind;

    public ProductOrderRequest(int quantity, String kind) {
        this.quantity = quantity;
        this.kind = kind;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getKind() {
        return kind;
    }
}
