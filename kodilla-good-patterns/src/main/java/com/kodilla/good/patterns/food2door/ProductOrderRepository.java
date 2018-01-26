package com.kodilla.good.patterns.food2door;

public interface ProductOrderRepository {
    void createOrder(String productName, int quantity);
}
