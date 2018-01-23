package com.kodilla.good.patterns.challenges;

public class ProductOrderRequest {
    public User user;
    public int quantity;

    public ProductOrderRequest(User user, int quantity) {
        this.user = user;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public int getQuantity() {
        return quantity;
    }
}
