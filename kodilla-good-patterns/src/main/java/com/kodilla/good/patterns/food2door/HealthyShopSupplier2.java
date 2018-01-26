package com.kodilla.good.patterns.food2door;

public class HealthyShopSupplier2 implements Supplier {
    private String name;

    public HealthyShopSupplier2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean process() {

        return true;
    }
}
