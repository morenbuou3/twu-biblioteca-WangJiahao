package com.twu.biblioteca;

import com.twu.biblioteca.data.BookLists;
import com.twu.biblioteca.entity.Book;

import java.util.List;

public class Library {
    private LibraryView libraryView = new LibraryView();

    public void checkout(String name) {
        List<Book> books = BookLists.getBookList();
        for (Book book : books) {
            if (book.getName().equals(name) && book.getNumber() > 0) {
                book.setNumber(book.getNumber() - 1);
                libraryView.showSuccessfulCheckout();
                return;
            }
        }
        libraryView.showUnsuccessfulCheckout();
    }

    public void returnBook(String name) {
        List<Book> books = BookLists.getBookList();
        for (Book book : books) {
            if (book.getName().equals(name)) {
                book.setNumber(book.getNumber() + 1);
                libraryView.showSuccessfulReturn();
                return;
            }
        }
        libraryView.showUnsuccessfulReturn();
    }
}
