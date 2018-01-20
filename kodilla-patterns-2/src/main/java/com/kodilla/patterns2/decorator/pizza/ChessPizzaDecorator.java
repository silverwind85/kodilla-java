package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ChessPizzaDecorator extends AbstractPizzaOrderDecorator {
    protected ChessPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);

    }

    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }


    public String getDescription() {
        return super.getDescription() + "chess, ";

    }

}
