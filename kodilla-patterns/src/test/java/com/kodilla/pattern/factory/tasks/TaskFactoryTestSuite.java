package com.kodilla.pattern.factory.tasks;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("Sopping in Lidl",shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }
    @Test
    public void testFactoryPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("Painting",paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }
    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        drivingTask.executeTask();
        //Then
        Assert.assertEquals("Driving",drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}
