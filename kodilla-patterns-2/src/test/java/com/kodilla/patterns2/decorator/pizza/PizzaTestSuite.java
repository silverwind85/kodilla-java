package com.kodilla.patterns2.decorator.pizza;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;



public class PizzaTestSuite {
    private PizzaOrder pizzaOrder = new BasicPizzaOrder();

    @Before
    public void before(){
        //Given
        pizzaOrder = new PepperPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new BaconPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new MushroomPizzaDecorator(pizzaOrder);
        pizzaOrder = new ChessPizzaDecorator(pizzaOrder);
        pizzaOrder = new DeliveryPizzaOrderDecorator(pizzaOrder);

    }

    @Test
    public void testBasicPizzaOrderWithPepperBaconMushrumsChessDeliveryGetCost(){
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal (17.5),cost);
    }
    @Test
    public void testBasicPizzaOrderWithPepperBaconMushrumsChessDeliveryGetDescription(){
        //When
       String description = pizzaOrder.getDescription();
        //Then
        assertEquals("pizza dough, tomato sauce, pepper, bacon, mushroom, chess, delivery, ",description);
    }
}
