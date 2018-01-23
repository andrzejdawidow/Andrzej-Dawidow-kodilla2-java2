package com.kodilla.good.patterns.challenges;

public class Application1 {
    public static void main(String[]args) {
        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
        ProductOrderRequest productOrderRequest = productOrderRequestRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(
                new MailService(), new Allegro(), new AllegroProductOrderRepository());
        productOrderProcessor.process(productOrderRequest);
    }
}
