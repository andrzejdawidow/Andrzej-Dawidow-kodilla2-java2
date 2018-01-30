package com.kodilla.good.patterns.food2door;

public class Application2 {
    public static void main(String[] args) {
        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
        ProductOrderRequest productOrderRequest = productOrderRequestRetriever.retrieve();
        F2D f2d = new F2D();
        f2d.addSupplier(new ExtraFoodShopSupplier1("dostawca1"));
        f2d.addSupplier(new HealthyShopSupplier2("dostawca2"));
        f2d.addSupplier(new GlutenFreeShopSupplier3("dostawca3"));
        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(
                new MailService(), f2d, new F2DProductOrderRepository());
        productOrderProcessor.process(productOrderRequest);
    }
}
