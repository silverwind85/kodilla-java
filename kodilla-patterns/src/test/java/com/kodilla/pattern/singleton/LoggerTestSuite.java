package com.kodilla.pattern.singleton;

import com.kodilla.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void testLog(){
        Logger.getInstance().log("Error number 2345");
        Logger.getInstance().log("Error wrong instance class");
    }
    @Test
    public void testGetLastLog(){
        //Given
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Error wrong instance class",result);
    }
}
