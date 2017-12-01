package com.kodilla.module.three.four;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class LettersAGenerator {
    private Deque<String> deque = new ArrayDeque<>();
    private Random r = new Random();
    private static final int MAX = 51;
    private static final int MIN = 1;
    private static final String LETTER = "a";

    public LettersAGenerator() {
        for (int i = 0; i < 50; i++) {
            deque.offer(generateLetters(LETTER, r.nextInt(MAX - MIN) + MIN));
        }
    }

    public String generateLetters(String letter, int iterate) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < iterate; k++) {
            stringBuilder.append(letter);
        }
        return stringBuilder.toString();
    }

    public Deque<String> getArrayDeque() {

        return deque;
    }

    public void printDeque() {
        for (String string : deque) {
            System.out.println(string);
        }
    }
}
