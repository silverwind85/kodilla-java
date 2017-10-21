package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] myIntArray = {10, 2, 8, 6, 7};
        int[] myIntArray2 = {20};
        //Then
        double result = ArrayOperations.getAverage(myIntArray);
        double result2 = ArrayOperations.getAverage(myIntArray2);
        //When
        Assert.assertEquals(4.80, result, 2);
        Assert.assertEquals(20, result2, 0);
    }
}
