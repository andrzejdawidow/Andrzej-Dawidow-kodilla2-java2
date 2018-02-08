package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

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

        Library library = new Library("z1");
        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("z2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("z3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.books.remove(book1);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals("z1", library.name);
        Assert.assertEquals("z2", clonedLibrary.name);
        Assert.assertEquals("z3", deepClonedLibrary.name);
        Assert.assertEquals(2, library.books.size());
        Assert.assertEquals(2, clonedLibrary.books.size());
        Assert.assertEquals(3, deepClonedLibrary.books.size());
        Assert.assertNotEquals(deepClonedLibrary.books, library.books);
    }
}
