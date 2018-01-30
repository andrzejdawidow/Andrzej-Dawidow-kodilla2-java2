package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderProcessor(final InformationService informationService,
                                 final ProductOrderService productOrderService,
                                 final ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public ProductOrderDto process(final ProductOrderRequest productOrderRequest) {
        boolean isOrdered = productOrderService.productOrder(productOrderRequest.getUser(), productOrderRequest.getQuantity());

        if(isOrdered) {
            informationService.inform(productOrderRequest.getUser());
            productOrderRepository.createOrder(productOrderRequest.getUser());
            return new ProductOrderDto(productOrderRequest.getUser(), true);
        } else {
            return new ProductOrderDto(productOrderRequest.getUser(), false);
        }
    }
}
