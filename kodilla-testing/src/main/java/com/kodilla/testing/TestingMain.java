package com.kodilla.testing;


import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {



        public static void main(String[] args) {
            final int a = 9;
            final int b = 10;
            SimpleUser simpleUser = new SimpleUser("theForumUser");

            String result = simpleUser.getUsername();

            if (result.equals("theForumUser")) {
                System.out.println("test OK");
            } else {
                System.out.println("Error!");
            }

            System.out.println("First test Calculator");
            System.out.println("Testing first method add");
            Calculator calculator = new Calculator();

            int resultAdd = 19;
            int calculatorAdd = calculator.add(a, b);
            if (resultAdd == calculatorAdd) {
                System.out.println("test ok");
            } else {
                System.out.println("Error");
            }
            System.out.println("Testing second method subtract");
            int resultSubtract = -1;
            int calculatorSubtract = calculator.subtract(a, b);
            if (resultSubtract == calculatorSubtract) {
                System.out.println("test ok");
            } else {
                System.out.println("Error");
            }
        }

}