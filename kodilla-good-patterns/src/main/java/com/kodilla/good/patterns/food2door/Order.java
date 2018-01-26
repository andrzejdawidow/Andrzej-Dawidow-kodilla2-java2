package com.kodilla.good.patterns.food2door;

public class Order {
    private String nameSupplier;
    private String nameProduct;
    private int quantity;

    public Order(String nameSupplier, String nameProduct, int quantity) {
        this.nameSupplier = nameSupplier;
        this.nameProduct = nameProduct;
        this.quantity = quantity;
    }

    public String getNameSupplier() {
        return nameSupplier;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return nameSupplier + nameProduct + quantity;
    }
}
