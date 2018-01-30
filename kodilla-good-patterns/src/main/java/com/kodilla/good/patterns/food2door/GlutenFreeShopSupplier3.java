package com.kodilla.good.patterns.food2door;

public class GlutenFreeShopSupplier3 implements Supplier {
    private String name;

    public GlutenFreeShopSupplier3(String name) {
        this.name = name;
    }

    @Override
    public boolean process(String nameProduct, int quantity) {
        System.out.println("This is a supplier 3 ");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
