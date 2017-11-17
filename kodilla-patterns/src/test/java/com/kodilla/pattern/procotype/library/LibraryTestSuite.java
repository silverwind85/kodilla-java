package com.kodilla.pattern.procotype.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    private static Library library;
    @BeforeClass
    public static void  testAddBooksToYourLibrary(){
        Library libraryWarsaw = new Library("Library of Warsaw");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> libraryWarsaw
                        .getBooks()
                        .add(new Book("Book number " + n,
                                "Jurek number " + n,
                                LocalDate.of(2001 + n, 12, 1 + n))));
        library =libraryWarsaw;
    }
    @Test
    public void testGetBooksClone() {
        //Given
        Library clonedLibraryWarsaw = null;
        try {
            clonedLibraryWarsaw = library.shallowCopy();
            clonedLibraryWarsaw.setName("Library of Paris");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //When
        library.getBooks().remove(new Book("Book number 1","Jurek number 1",LocalDate.of(2002, 12, 2)));
        int result = library.getBooks().size();
        int clonedResult = clonedLibraryWarsaw.getBooks().size();
        //Then
        System.out.println(library);
        System.out.println(clonedLibraryWarsaw);
        Assert.assertEquals(9, result);
        Assert.assertEquals(9, clonedResult);
        Assert.assertEquals(result, clonedResult);

    }
    @Test
    public void testGetBooksCloneDeep() {
        //Given
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library of Katowice");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        library.getBooks().remove(new Book("Book number 1","Jurek number 1",LocalDate.of(2002, 12, 2)));
        int result = library.getBooks().size();
        int clonedResult = deepClonedLibrary.getBooks().size();

        //Then
        System.out.println(library);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(9, result);
        Assert.assertEquals(10, clonedResult);
        Assert.assertNotSame(result, clonedResult);

    }
}
