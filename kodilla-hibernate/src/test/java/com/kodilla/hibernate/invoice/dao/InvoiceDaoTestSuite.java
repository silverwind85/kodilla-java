package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @After
    public void after(){
        invoiceDao.deleteAll();
        productDao.deleteAll();
        itemDao.deleteAll();
    }
    @Test
    public void testInvoiceDaoSave(){
        //Given
        Item item1 = new Item(new BigDecimal(5),5,new BigDecimal(25));
        Item item2 = new Item(new BigDecimal(2),2,new BigDecimal(4));
        Item item3 = new Item(new BigDecimal(7),5,new BigDecimal(35));
        Product smartphone = new Product("Smartphone");
        Product tv = new Product("TV");
        Product book = new Product("Book");
        Invoice invoice = new Invoice("2343");

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        item1.setProduct(smartphone);
        item2.setProduct(tv);
        item3.setProduct(book);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        //When
        productDao.save(smartphone);
        productDao.save(tv);
        productDao.save(book);
        invoiceDao.save(invoice);
        //Then
        Assert.assertEquals(3,invoice.getItems().size());
        Assert.assertEquals("Smartphone",item1.getProduct().getName());
        Assert.assertEquals("2343",item1.getInvoice().getNumber());
        Assert.assertEquals("TV",item2.getProduct().getName());
        Assert.assertEquals("Book",item3.getProduct().getName());

    }
}
