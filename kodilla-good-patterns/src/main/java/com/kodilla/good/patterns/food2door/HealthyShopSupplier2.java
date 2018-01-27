package com.kodilla.good.patterns.food2door;

public class HealthyShopSupplier2 implements Supplier {
    private Order order;

    public HealthyShopSupplier2(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "HealthyShopSupplier2{" +
                "order= " + order +
                '}';
    }

    @Override
    public boolean process(String nameSupplier, String nameProduct, int quantity) {
        System.out.println("This is a supplier 2 ");
        return true;
    }
}
