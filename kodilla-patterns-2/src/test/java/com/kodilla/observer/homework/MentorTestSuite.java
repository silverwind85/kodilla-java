package com.kodilla.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class MentorTestSuite {
    @Test
    public void testUpdate(){
        //Given
        Student johnBean = new Student("John","Bean");
        Student marryWhite = new Student("Marry","White");

        StudentHomework observerPatterHomeworkJohnBean = new ObserverPatterHomework(johnBean);
        StudentHomework mysqlDbHomeworkJohnBean = new MysqlDbHomework(johnBean);
        StudentHomework observerPatterHomeworkMarryWhite = new ObserverPatterHomework(marryWhite);
        StudentHomework mysqlDbHomeworkMarryWhite = new MysqlDbHomework(marryWhite);

        Mentor mikeByzon = new Mentor("Mike Byznoe");
        Mentor kateParry = new Mentor("Kate Parry");

        observerPatterHomeworkJohnBean.registerObserver(mikeByzon);
        mysqlDbHomeworkJohnBean.registerObserver(mikeByzon);

        observerPatterHomeworkMarryWhite.registerObserver(kateParry);
        mysqlDbHomeworkMarryWhite.registerObserver(kateParry);

        observerPatterHomeworkJohnBean.addSolution("Observer pattern code");
        mysqlDbHomeworkJohnBean.addSolution("Mysql database solution");
        observerPatterHomeworkJohnBean.addSolution("New solution");
        observerPatterHomeworkMarryWhite.addSolution("Observer patter solution");

        Assert.assertEquals(3,mikeByzon.getUpdateCount());
        Assert.assertEquals(1,kateParry.getUpdateCount());

    }
}
