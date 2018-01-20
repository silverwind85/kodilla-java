package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class DeliveryPizzaOrderDecorator extends AbstractPizzaOrderDecorator{
    protected DeliveryPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }


    public String getDescription() {
        return super.getDescription() + "delivery, ";

    }
}
