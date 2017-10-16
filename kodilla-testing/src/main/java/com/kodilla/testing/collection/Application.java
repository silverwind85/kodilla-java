package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        Random r = new Random();
        for (int i = 0;i <r.nextInt(1000); i++){
            number.add(r.nextInt(1000));
        }

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> evenList = oddNumbersExterminator.exterminate(number2);
        for (Integer integer: evenList
             ) {
            System.out.println(integer);
        }

    }
}
