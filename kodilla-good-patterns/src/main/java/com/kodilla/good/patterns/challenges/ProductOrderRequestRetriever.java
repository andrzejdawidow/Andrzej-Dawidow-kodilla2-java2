package com.kodilla.good.patterns.challenges;

public class ProductOrderRequestRetriever {
    public ProductOrderRequest retrieve() {
        User user = new User("Jan Kowalski");
        int quantity = 90;
        return new ProductOrderRequest(user, quantity);
    }
}
