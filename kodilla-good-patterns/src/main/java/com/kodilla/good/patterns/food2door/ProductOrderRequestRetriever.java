package com.kodilla.good.patterns.food2door;

public class ProductOrderRequestRetriever {
    public ProductOrderRequest retrieve(Order order) {
//        String nameSupplier = "dostawca1";
//        String productName = "potatoes";
///        int quantity = 90;

        return new ProductOrderRequest(order);
    }
}
