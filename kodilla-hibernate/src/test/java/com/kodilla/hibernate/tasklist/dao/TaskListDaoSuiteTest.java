package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoSuiteTest {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("In progress", "You should do today");
        taskListDao.save(taskList);
        //When
        List<TaskList> list = taskListDao.findByListName("In progress");
        //Then
        Assert.assertEquals(1,list.size());
        //CleanUp
        taskListDao.deleteAll();


    }
}
