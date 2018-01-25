package com.kodilla.good.patterns.food2door;

public interface ProductOrderRepository {
    void createOrder(int quantity, String kind);
}
