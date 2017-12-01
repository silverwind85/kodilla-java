package com.kodilla.module.three.four;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class DivisionIntoEvenAndOdd {
    List<String> oddList = new ArrayList<>();
    List<String> evenList = new ArrayList<>();

    public void divider(Deque<String> deque) {
        for (int i = 0; i < deque.size(); i++) {
            if(deque.peek().length()%2==0){
                evenList.add(deque.poll());
            }else{
                oddList.add((deque.poll()));
            }
        }
        printEvenList();
        printOddList();
    }
    private  void printEvenList() {

        System.out.println("Even List character \"a\": ");
        for (String string : evenList) {
            System.out.println("Lenght: " + string.length() + " | " + string);

        }
    }
    private  void printOddList() {
        System.out.println("Odd List character \"a\": ");
        for (String string : oddList) {
            System.out.println("Lenght: " + string.length() + " | " + string);
        }
    }
}
