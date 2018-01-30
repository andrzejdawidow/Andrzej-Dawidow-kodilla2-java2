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
        boolean isOrdered = productOrderService.productOrder(productOrderRequest.getOrder().getNameSupplier(),
                productOrderRequest.getOrder().getNameProduct(), productOrderRequest.getOrder().getQuantity());

        if(isOrdered) {
            infoService.inform(productOrderRequest.getOrder());
            productOrderRepository.createOrder(productOrderRequest.getOrder());

            return new ProductOrderDto(productOrderRequest.getOrder(), true);
        } else {
            return new ProductOrderDto(productOrderRequest.getOrder(), false);
        }
    }
}
