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

        Library library = new Library("z1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        HashSet<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

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
        System.out.println(books);
        Assert.assertEquals("z1", library.getName());
        Assert.assertEquals("z2", clonedLibrary.getName());
        Assert.assertEquals("z3", deepClonedLibrary.getName());
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
