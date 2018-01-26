package com.kodilla.good.patterns.food2door;

public class GlutenFreeShopSupplier3 implements Supplier {
    private Order order;

    public GlutenFreeShopSupplier3(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "GlutenFreeShopSupplier3{" +
                "order= " + order +
                '}';
    }

    @Override
    public boolean process() {

     return true;
    }
}
