package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    protected PepperPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1.5));
    }


    public String getDescription() {
        return super.getDescription() + "pepper, ";

    }
}
