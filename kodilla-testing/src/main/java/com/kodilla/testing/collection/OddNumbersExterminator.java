package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (Integer numberInt : numbers
                ) {
            if (numberInt%2 == 0) {
                evenList.add(numberInt);
            }
        }
        return evenList;
    }
}
