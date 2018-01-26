package com.kodilla.good.patterns.food2door;

public class ProductOrderDto {
    private String name;
    private String productName;
    private int quantity;
    private boolean isOrdered;

    public ProductOrderDto(String productName, int quantity, String name, boolean isOrdered) {
        this.name = name;
        this.productName = productName;
        this.quantity = quantity;
        this.isOrdered = isOrdered;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
