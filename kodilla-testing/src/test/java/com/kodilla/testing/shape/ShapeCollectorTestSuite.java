package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddCircle() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("Circle", 5);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(1,shapeCollector.getFigureQuantity());
    }

    @Test
    public void testAddTriangle() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("Triangle",7,9);
        //When
        shapeCollector.addFigure(triangle);
        //Then
        Assert.assertEquals(1,shapeCollector.getFigureQuantity());
    }
    @Test
    public void testAddSquare() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square("Square",4);
        //When
        shapeCollector.addFigure(square);
        //Then
        Assert.assertEquals(1,shapeCollector.getFigureQuantity());
    }

    @Test
    public void testGetCircle2() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("Circle", 5);
        Shape circle1 = new Circle("Circle2", 9);
        Shape circle2 = new Circle("Circle3", 10);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(circle2);
        //When
        Shape retrievedCircle = shapeCollector.getFigure(0);
        Shape retrievedCircle2 = shapeCollector.getFigure(2);
        //Then
        Assert.assertEquals(circle,retrievedCircle);
        Assert.assertEquals(circle2,retrievedCircle2);

    }
    @Test
    public void testGetCircle() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("Circle", 5);
        shapeCollector.addFigure(circle);
        //When
        Shape retrievedCircle = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle,retrievedCircle);
    }

    @Test
    public void testGetTriangle() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("Triangle", 5,9);
        shapeCollector.addFigure(triangle);
        //When
        Shape retrievedTriangle = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(triangle,retrievedTriangle);
    }

    @Test
    public void testGetSquare() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square("Square", 5);
        shapeCollector.addFigure(square);
        //When
        Shape retrievedSquare = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(square,retrievedSquare);
    }

    @Test
    public void testRemoveCircle() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("Circle", 5);
        shapeCollector.addFigure(circle);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector.getFigureQuantity());
    }

    @Test
    public void testRemoveTriangle() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("Triangle", 5,9);
        shapeCollector.addFigure(triangle);
        //When
        boolean result = shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector.getFigureQuantity());
    }

    @Test
    public void testRemoveSquare() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square("Square", 5);
        shapeCollector.addFigure(square);
        //When
        boolean result = shapeCollector.removeFigure(square);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector.getFigureQuantity());

    }

    @Test
    public void testRemoveCircleNotExisting() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("Circle", 5);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveTriangleNotExisting() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("Triangle", 5,9);
        //When
        boolean result = shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveSquareNotExisting() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square("Square", 5);
        //When
        boolean result = shapeCollector.removeFigure(square);
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("Circle", 5);
        Shape triangle = new Triangle("Triangle", 5,9);
        Shape square = new Square("Square", 5);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        //When
        String showString = shapeCollector.showFigures();
        //Then
        Assert.assertEquals(circle.toString() + triangle.toString() +square.toString() ,showString);

    }
}


