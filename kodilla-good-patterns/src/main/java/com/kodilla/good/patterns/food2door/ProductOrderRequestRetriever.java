package com.kodilla.good.patterns.food2door;

public class ProductOrderRequestRetriever {
    public ProductOrderRequest retrieve() {
        String nameSupplier = "dostawca3";
        String productName = " buraki: ";
       int quantity = 90;

        return new ProductOrderRequest(new Order(nameSupplier, productName, quantity));
    }
}
