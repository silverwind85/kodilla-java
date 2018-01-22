package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.adapter.bookclasifier.MedianAdapter;
import com.kodilla.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class MedianAdapterTestSuite {

    private Set<Book> booksLibraryA;

    @Before
    public void before() {
        this.booksLibraryA = new HashSet<>();
        IntStream.iterate(1, n -> n + 1).limit(10).forEach(n -> booksLibraryA.add(new Book("Book" + n, "Title" + n, 1874 + 3 * n, "AB" + n / 3)));
    }

    @Test
    public void publicationYearMedian() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(booksLibraryA);
        //Then
        Assert.assertEquals(1892,median);
    }
}
