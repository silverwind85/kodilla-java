package com.kodilla.testing.loop;

import org.junit.Assert;
import org.junit.Test;

public class testLoopAndConditionalBreakpoints {
    @Test
    public void testLoop(){
        //Given
        int sum = 0;
        //When
        for(int n = 0; n< 1000; n++){
            sum=+n;
            System.out.println("["+n+ "] Sum equals: " + sum);
        }
        //then
        Assert.assertEquals(999,sum);
    }
}
