package com.kodilla.good.patterns.challenges.service;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService ;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }
    public OrderDto process (final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(),
                orderRequest.getSellDate(),orderRequest.getShipment()
                ,orderRequest.getQuantity(),orderRequest.getPrice());
        if(isOrdered){
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),
                    orderRequest.getSellDate(),orderRequest.getShipment()
                    ,orderRequest.getQuantity(),orderRequest.getPrice());
            return new OrderDto(orderRequest.getUser(),isOrdered);
        }else{
            return new OrderDto(orderRequest.getUser(),isOrdered);
        }
    }
}
