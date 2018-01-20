package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class DoubleChessPizzaDecorator extends AbstractPizzaOrderDecorator {
    protected DoubleChessPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);

    }

    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }


    public String getName() {
        return super.getName() + " double chess";

    }

}
