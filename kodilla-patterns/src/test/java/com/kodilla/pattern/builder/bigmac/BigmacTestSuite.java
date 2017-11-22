package com.kodilla.pattern.builder.bigmac;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import com.kodilla.patterns.builder.bigmac.Ingredients;
import com.kodilla.patterns.builder.bigmac.Roll;
import com.kodilla.patterns.builder.bigmac.Sauce;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .withRoll(Roll.rollSesame)
                .withBurger(2)
                .withSauce(Sauce.barbecue)
                .withIngredient(Ingredients.bacon)
                .withIngredient(Ingredients.chiliPeppers)
                .withIngredient(Ingredients.onion)
                .withIngredient(Ingredients.mushrooms)
                .withIngredient(Ingredients.shrimps)
                .withBuild();

        System.out.println(bigmac);
        //When
        System.out.println(bigmac.getIngredients().indexOf(Ingredients.bacon));
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(5, howManyIngredients);
        Assert.assertEquals("roll sesame", bigmac.getRoll().getName());
        Assert.assertEquals("barbecue", bigmac.getSauce().getName());
        Assert.assertEquals(2,bigmac.getBurger());
        Assert.assertEquals("bacon",bigmac.getIngredients().get(0).getName());
        Assert.assertEquals("chili peppers",bigmac.getIngredients().get(1).getName());
        Assert.assertEquals("onion",bigmac.getIngredients().get(2).getName());
        Assert.assertEquals("mushrooms",bigmac.getIngredients().get(3).getName());
        Assert.assertEquals("shrimps",bigmac.getIngredients().get(4).getName());




    }
}
