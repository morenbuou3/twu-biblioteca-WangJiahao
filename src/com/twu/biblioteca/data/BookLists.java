package com.twu.biblioteca.data;

import com.twu.biblioteca.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookLists {
    private static List<Book> bookList = new ArrayList<Book>();

    static {
        bookList.add(new Book("Java", "wjh", "2018", 10));
        bookList.add(new Book("C++", "wyx", "2017", 10));
        bookList.add(new Book("Python", "lf", "2016", 10));
        bookList.add(new Book("C", "wjt", "2015", 1));
        bookList.add(new Book("Javascript", "wft", "2014", 1));
    }

    public static List<Book> getBookList() {
        return bookList;
    }
}
