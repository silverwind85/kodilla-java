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
        board.getToDoList().getTask().add("Third tasks");
        board.getInProgressList().getTask().add("Second tasks");
        board.getDoneList().getTask().add("First tasks");
        //Then
        Assert.assertEquals("Third tasks", board.getToDoList().getTask().get(0));
        Assert.assertEquals("Second tasks", board.getInProgressList().getTask().get(0));
        Assert.assertEquals("First tasks", board.getDoneList().getTask().get(0));
    }

    @Test
    public void testGetToList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = (Board) context.getBean("getBoard");
        board.getToDoList().getTask().add("Third tasks");
        //Then
        Assert.assertEquals(1,board.getToDoList().getTask().size());

    }

    @Test
    public void testGetInProgressList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = (Board) context.getBean("getBoard");
        board.getInProgressList().getTask().add("Third tasks");
        //Then
        Assert.assertEquals(1,board.getInProgressList().getTask().size());
    }

    @Test
    public void testgetDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = (Board) context.getBean("getBoard");
        board.getDoneList().getTask().add("Third tasks");
        //Then
        Assert.assertEquals(1,board.getDoneList().getTask().size());

    }
}
