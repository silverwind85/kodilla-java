package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = (Board) context.getBean("getBoard");
        board.getToDoList().getTask().add("Third task");
        board.getInProgressList().getTask().add("Second task");
        board.getDoneList().getTask().add("First task");
        //Then
        Assert.assertEquals("Third task", board.getToDoList().getTask().get(0));
        Assert.assertEquals("Second task", board.getInProgressList().getTask().get(0));
        Assert.assertEquals("First task", board.getDoneList().getTask().get(0));
    }

    @Test
    public void testGetToList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = (Board) context.getBean("getBoard");
        board.getToDoList().getTask().add("Third task");
        //Then
        Assert.assertEquals(1,board.getToDoList().getTask().size());

    }

    @Test
    public void testGetInProgressList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = (Board) context.getBean("getBoard");
        board.getInProgressList().getTask().add("Third task");
        //Then
        Assert.assertEquals(1,board.getInProgressList().getTask().size());
    }

    @Test
    public void testgetDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = (Board) context.getBean("getBoard");
        board.getDoneList().getTask().add("Third task");
        //Then
        Assert.assertEquals(1,board.getDoneList().getTask().size());

    }
}
