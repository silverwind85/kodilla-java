package com.kodilla.spring.reader;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReaderTestSuite {
    @Test
    public void testRead() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        Reader reader = context.getBean(Reader.class);
        //When & Then
        reader.read();
    }
    @Test
    public void testConditional() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        //When
        boolean book2Exists = context.containsBean("book2");
        //Then
        System.out.println("Bean book2 was found in the container: " + book2Exists);
    }
    @Test
    public void testAddBook() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        //When
        Reader reader = (Reader)context.getBean("getReader");
        Book book =(Book)context.getBean("book1");
        book = new Book("pies");
        //Then
        Assert.assertEquals("pies",reader.getTheBook().getTitle());
    }
}
