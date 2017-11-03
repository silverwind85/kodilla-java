package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService{

   public boolean order(final User user, final LocalDateTime sellDate,final Shipment shipment,final int quantity,final int price){
       System.out.println("Ordering Product for: " + user.getName() +" "+ user.getSurname() + " Date buy: "+sellDate +" Shipment: "+shipment.getName() +" Quantity: "+ quantity + " Price: " + price +"zł");
       return true;
   }



}
