package com.kodilla.module.three.four;

public class Application {
    public static void main(String[] args) {
        LettersAGenerator lettersAGenerator = new LettersAGenerator();

        DivisionIntoEvenAndOdd divisionIntoEvenAndOdd = new DivisionIntoEvenAndOdd();
        divisionIntoEvenAndOdd.divider(lettersAGenerator.getArrayDeque());
    }


}
