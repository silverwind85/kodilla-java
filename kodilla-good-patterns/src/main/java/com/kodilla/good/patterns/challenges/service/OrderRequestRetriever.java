package com.kodilla.good.patterns.challenges.service;


import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User ("Mike","Egg");
        LocalDateTime sellDate = LocalDateTime.of(2017,4,23,13,24);
        InfoPostShipment infoPostShipment = new InfoPostShipment("InfoPost",12,2);
        int quantity = 3;
        int price = 300;
        return  new OrderRequest(user,sellDate,infoPostShipment,quantity,price);


    }
}
