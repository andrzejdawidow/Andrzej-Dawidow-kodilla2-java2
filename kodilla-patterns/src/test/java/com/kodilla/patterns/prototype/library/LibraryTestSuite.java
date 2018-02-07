package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.HashSet;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("title 1", "Franek",
                LocalDate.of(2001, 01, 01));
        Book book2 = new Book("title 2", "Zenek",
                LocalDate.of(2002, 02, 02));
        Book book3 = new Book("title 3", "Maniek",
                LocalDate.of(2003, 03, 03));

        HashSet<Book> setLibrary = new HashSet<>();
        setLibrary.add(book1);
        setLibrary.add(book2);
        setLibrary.add(book3);
        System.out.println(setLibrary);
        //When
        //Then
        Assert.assertEquals(3, setLibrary.size());
    }
}
