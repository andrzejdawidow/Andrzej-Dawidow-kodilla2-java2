package com.kodilla.good.patterns.food2door;

public class ProductOrderProcessor {
    private InfoService infoService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderProcessor(final InfoService infoService,
                                 final ProductOrderService productOrderService,
                                 final ProductOrderRepository productOrderRepository) {
        this.infoService = infoService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }
    public ProductOrderDto process(final ProductOrderRequest productOrderRequest) {
        boolean isOrdered = productOrderService.productOrder(productOrderRequest.getUser(),
                productOrderRequest.getProductName(), productOrderRequest.getQuantity());

        if(isOrdered) {
            infoService.inform(productOrderRequest.getUser());
            productOrderRepository.createOrder(productOrderRequest.getUser(), productOrderRequest.getProductName(),
                    productOrderRequest.getQuantity());
            return new ProductOrderDto(productOrderRequest.getUser(), true);
        } else {
            return new ProductOrderDto(productOrderRequest.getUser(), false);
        }
    }

}
