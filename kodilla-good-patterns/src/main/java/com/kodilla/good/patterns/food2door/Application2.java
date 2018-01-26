package com.kodilla.good.patterns.food2door;

public class Application2 {
    public static void main(String[] args) {
        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
        ProductOrderRequest productOrderRequest = productOrderRequestRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(
                new MailService(), new F2D(), new F2DProductOrderRepository());
        productOrderProcessor.process(productOrderRequest);
    }
}
