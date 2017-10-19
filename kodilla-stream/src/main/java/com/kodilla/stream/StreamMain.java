package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.time.Month;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main1(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Beautiful and interesting text", text -> text.toUpperCase());
        poemBeautifier.beautify("Beautiful and interesting text", text -> "ABC " + text);
        poemBeautifier.beautify("Beautiful and interesting text", text -> text + " ABC");
        poemBeautifier.beautify("Beautiful and interesting text", text -> text.substring(0, 9));
        poemBeautifier.beautify("Beautiful and interesting text", text -> text.replace("e", "B"));
        poemBeautifier.beautify("Beautiful and interesting text", text -> text.replace("and interesting", "and touching"));

    }

    public static void main2(String[] args) {
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


    }

    public static void main3(String[] args) {
        People.getList().stream()
                .forEach(System.out::println);
    }

        public static void main4(String[] args) {
            People.getList().stream()
                    .map(String::toUpperCase)
                    .filter(s -> s.length() > 11)
                    .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                    .filter(s -> s.substring(0, 1).equals("M"))
                    .forEach(System.out::println);
        }

    public static void main7(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);
    }
    public static void main8(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);




//Now access the values as below
        /*LocalDate now = new LocalDate(2014, 2, 28); // test, in real world without args
        Years age = Years.yearsBetween(birthdate, now);*/

        /*BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/
    }

}


