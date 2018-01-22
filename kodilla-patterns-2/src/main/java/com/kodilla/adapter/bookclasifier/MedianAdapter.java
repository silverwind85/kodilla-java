package com.kodilla.adapter.bookclasifier;


import com.kodilla.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.adapter.bookclasifier.libraryb.Book;
import com.kodilla.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<com.kodilla.adapter.bookclasifier.librarya.Book> books) {
        Map<BookSignature, Book> libraryBBooks = new HashMap<>();
        for (com.kodilla.adapter.bookclasifier.librarya.Book book : books
                ) {libraryBBooks.put(new BookSignature(book.getSignature())
                ,new Book(book.getAuthor()
                        ,book.getTitle()
                        ,book.getPublicationYear()));

        }
        return medianPublicationYear(libraryBBooks);
    }
}

