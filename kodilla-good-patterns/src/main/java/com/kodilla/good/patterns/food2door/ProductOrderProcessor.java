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
    //    final Supplier supplier;

//    public ProductOrderProcessor(Supplier supplier) {
//        this.supplier = supplier;
//    }

    public void process() {

    }
}
