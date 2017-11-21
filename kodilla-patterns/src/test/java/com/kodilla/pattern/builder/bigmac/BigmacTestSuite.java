package com.kodilla.pattern.builder.bigmac;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("Sesam roll")
                .burger(2)
                .sauce("spicey")
                .ingredient("cucumber")
                .ingredient("lettuce")
                .ingredient("onion")
                .ingredient("chilli peppers")
                .ingredient("mushrooms")
                .build();

        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(5, howManyIngredients);
        Assert.assertEquals(2,bigmac.getBurger());
    }
}
