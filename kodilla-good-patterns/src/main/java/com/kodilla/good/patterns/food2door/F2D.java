package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class F2D implements ProductOrderService {
    List<Supplier> suppliers = new ArrayList<>();
    public void addSupplier(Supplier order) {
        suppliers.add(order);
    }

    public boolean productOrder(String nameSupplier,  String nameProduct, int quantity) {
        for (Supplier sup : suppliers) {
            if (sup.(nameSupplier).equals(quantity))
            return sup.process(nameSupplier,nameProduct, quantity);
        }
        return true;
    }
}
