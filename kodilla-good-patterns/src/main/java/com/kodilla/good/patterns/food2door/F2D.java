package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class F2D implements ProductOrderService {
    private List<Supplier> suppliers = new ArrayList<>();

    public void addSupplier(Supplier nameSupplier) {
        suppliers.add(nameSupplier);
    }

    public boolean productOrder(String nameSupplier,  String nameProduct, int quantity) {
        for (Supplier sup : suppliers) {
            if (sup.getName().equals(nameSupplier))
            return sup.process(nameProduct, quantity);
        }
        return false;
    }
}
