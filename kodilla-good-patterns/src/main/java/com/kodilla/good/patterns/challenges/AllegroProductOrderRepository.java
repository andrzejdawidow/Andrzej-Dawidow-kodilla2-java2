package com.kodilla.good.patterns.challenges;

public class AllegroProductOrderRepository implements ProductOrderRepository {
    public void createOrder(User user, int quantity) {
        System.out.println("Order to " + user + " quantity: " + quantity + " Transaction OK" );
    }

    @Override
    public void createOrder(User user) {

    }
}
