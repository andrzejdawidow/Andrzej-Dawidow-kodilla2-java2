package com.kodilla.good.patterns.food2door;

public class ProductOrderRequestRetriever {
    public ProductOrderRequest retrieve() {
        int quantity = 90;
        String kind = "potatoes";
        return new ProductOrderRequest(quantity, kind);
    }
}
