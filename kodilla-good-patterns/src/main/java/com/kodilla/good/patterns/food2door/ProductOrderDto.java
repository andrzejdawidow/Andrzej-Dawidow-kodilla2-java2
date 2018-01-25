package com.kodilla.good.patterns.food2door;

public class ProductOrderDto {
    private boolean isOrdered;

    public ProductOrderDto(boolean isOrdered) {
        this.isOrdered = isOrdered;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
