package com.kodilla.good.patterns.food2door;

public interface Supplier {
    boolean process(String nameProduct, int quantity);
    String getName();
}
