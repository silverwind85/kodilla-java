package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayList<Integer> result= oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing " + result);
        Assert.assertEquals(emptyList,result);

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        Integer eventNumber = 20;
        Integer oddNumber = 13;
        numbers.add(eventNumber);
        numbers.add(oddNumber);
        ArrayList<Integer> result= oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing " + result);
        Assert.assertEquals(1,result.size());
        Assert.assertEquals(eventNumber,result.get(0));
    }
}
