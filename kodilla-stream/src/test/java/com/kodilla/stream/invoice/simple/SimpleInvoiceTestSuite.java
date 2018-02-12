package com.kodilla.stream.invoice.simple;

import org.junit.Assert;
import org.junit.Test;

public class SimpleInvoiceTestSuite {
    @Test
    public void testGetValueToPay() {
        //Given
        SimpleInvoice invoice = new SimpleInvoice();
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.28), 2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99), 3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3", 6.49), 5.0));
        //When

        Double result = invoice.getValueToPay();
        //Then
        Assert.assertEquals(108.975, result, 0.001);
    }

    @Test
    public void testGetValue() {
        //Given
        SimpleItem simpleItem = new SimpleItem(new SimpleProduct("Product 1", 2), 2);
        SimpleItem simpleItem2 = new SimpleItem(new SimpleProduct("Product 2", 2), 2);
        SimpleItem simpleItem3 = new SimpleItem(new SimpleProduct("Product 3", 2), 2);
        //When
        simpleItem.getValue();
        //Then

    }
}
