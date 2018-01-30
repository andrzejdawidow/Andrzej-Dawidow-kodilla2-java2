package com.kodilla.good.patterns.food2door;

public class ExtraFoodShopSupplier1 implements Supplier {
    private String name;

    public ExtraFoodShopSupplier1(String name) {
        this.name = name;
    }

    @Override
    public boolean process(String nameProduct, int quantity) {
        System.out.println("This is a supplier 1 ");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
