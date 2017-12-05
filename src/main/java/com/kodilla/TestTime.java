package com.kodilla;

import java.util.*;
import java.lang.*;

class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        Book e = (Book) o;
        return this.author.equals(e.getAuthor()) && this.title.equals(e.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    public String toString() {
        return this.author + " - " + this.title;
    }
}

class TestTime {
    public static void main(String[] args) throws java.lang.Exception {
        LinkedList<Book> books1 = new LinkedList<Book>();

        for (int n = 0; n < 2000000; n++) {
            books1.add(new Book("Ktos", "Cos"));
        }
        System.out.println("Wszystkich ksiazek jest: " + books1.size());
        System.out.println();

        long begin = System.nanoTime();
        books1.remove(0);
        long end = System.nanoTime();
        System.out.println("Usuwanie pierwszego elementu trwa: " + (end - begin) + " ns ");
        System.out.println("Wszystkich ksiazek jest: " + books1.size());
        begin = System.nanoTime();
        books1.remove(books1.size() - 1);
        end = System.nanoTime();
        System.out.println("Usuwanie ostatniego elementu trwa: " + (end - begin) + " ns ");
        System.out.println("Wszystkich ksiazek jest: " + books1.size());
        System.out.println();

        begin = System.nanoTime();
        books1.add(0, new Book("Ktos", "Cos"));
        end = System.nanoTime();
        System.out.println("Wstawianie pierwszego elementu trwa: " + (end - begin) + " ns ");
        System.out.println("Wszystkich ksiazek jest: " + books1.size());
        begin = System.nanoTime();
        books1.add(books1.size(), new Book("Ktos", "Cos"));
        end = System.nanoTime();
        System.out.println("Wstawianie ostatniego elementu trwa: " + (end - begin) + " ns ");
        System.out.println("Wszystkich ksiazek jest: " + books1.size());
        System.out.println();
        System.out.println();

        HashMap<Book, Integer> books2 = new HashMap<Book, Integer>();

        for (int n = 1; n < 1500000 + 1; n++) {
            books2.put(new Book("Ktos" + n, "Cos" + n), n);
        }
        System.out.println("Ksiazek w HashMapie jest: " + books2.size());
        System.out.println();

        begin = System.nanoTime();
        books2.get(new Book("Ktos" + 5000, "Cos" + 5000));
        end = System.nanoTime();
        System.out.println("Szukanie 5000 elementu trwa: " + (end - begin) + " ns ");
        System.out.println();

        begin = System.nanoTime();
        books2.put(new Book("Ktos" + 1500001, "Cos" + 1500001), 1500001);
        end = System.nanoTime();
        System.out.println("Dodawanie jednego elementu trwa: " + (end - begin) + " ns ");
        System.out.println("Ksiazek w HashMapie jest: " + books2.size());
        System.out.println();

        begin = System.nanoTime();
        books2.remove(new Book("Ktos" + 5000, "Cos" + 5000));
        end = System.nanoTime();
        System.out.println("Usuwanie jednego elementu trwa: " + (end - begin) + " ns ");
        System.out.println("Ksiazek w HashMapie jest: " + books2.size());
        System.out.println();

        ArrayList<Book> books3 = new ArrayList<Book>();

        for (int n = 0; n < 2000000; n++) {
            books3.add(new Book("Ktos", "Cos"));
        }
        System.out.println("Wszystkich ksiazek w ArrayList jest: " + books3.size());
        System.out.println();

        begin = System.nanoTime();
        books3.remove(0);
        end = System.nanoTime();
        System.out.println("Usuwanie pierwszego elementu trwa: " + (end - begin) + " ns ");
        System.out.println("Wszystkich ksiazek jest: " + books3.size());
        begin = System.nanoTime();
        books3.remove(books3.size() - 1);
        end = System.nanoTime();
        System.out.println("Usuwanie ostatniego elementu trwa: " + (end - begin) + " ns ");
        System.out.println("Wszystkich ksiazek jest: " + books3.size());
        System.out.println();

        begin = System.nanoTime();
        books3.add(0, new Book("Ktos", "Cos"));
        end = System.nanoTime();
        System.out.println("Wstawianie pierwszego elementu trwa: " + (end - begin) + " ns ");
        System.out.println("Wszystkich ksiazek jest: " + books3.size());
        begin = System.nanoTime();
        books3.add(books3.size(), new Book("Ktos", "Cos"));
        end = System.nanoTime();
        System.out.println("Wstawianie ostatniego elementu trwa: " + (end - begin) + " ns ");
        System.out.println("Wszystkich ksiazek jest: " + books3.size());
    }

}
