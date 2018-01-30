package com.kodilla.good.patterns.food2door;

public class HealthyShopSupplier2 implements Supplier {
    private String name;

    public HealthyShopSupplier2(String name) {
        this.name = name;
    }

    @Override
    public boolean process(String nameProduct, int quantity) {
        System.out.println("This is a supplier 2 ");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
