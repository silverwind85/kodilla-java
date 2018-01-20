package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(8);
    }

    @Override
    public String getName() {
        return ;
    }
}
