package com.twu.biblioteca.data;

import com.twu.biblioteca.entity.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookLists {
    private static List<Book> bookList = new ArrayList<Book>();

    {
        bookList.add(new Book("Java", "wjh", new Date(), 10));
        bookList.add(new Book("C++", "wyx", new Date(), 10));
        bookList.add(new Book("Python", "ztx", new Date(), 10));
        bookList.add(new Book("C", "wjt", new Date(), 1));
        bookList.add(new Book("Javascript", "wft", new Date(), 1));
    }

    public static List<Book> getBookList() {
        return bookList;
    }
}
