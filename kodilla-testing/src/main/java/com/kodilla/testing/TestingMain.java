package com.kodilla.testing;

import com.kodilla.testing.calaculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("First test Calculator");
        System.out.println("Testing first method add");
        Calculator calculator = new Calculator();
        final int A = 9;
        final int B = 10;
        int resultAdd = A + B;
        int calculatorAdd = calculator.add(A, B);
        if (resultAdd == calculatorAdd) {
            System.out.println("test ok");
        } else {
            System.out.println("Error");
        }
        System.out.println("Testing second method subtract");
        int resultSubtract = A - B;
        int calculatorSubtract = calculator.subtract(A, B);
        if (resultSubtract == calculatorSubtract) {
            System.out.println("test ok");
        } else {
            System.out.println("Error");
        }
    }
}