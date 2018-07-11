package com.twu.biblioteca;

import com.twu.biblioteca.data.BookLists;
import com.twu.biblioteca.entity.Book;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class LibraryView {
    private BufferedReader bufferedReader;

    {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void showWelcome() {
        System.out.println("Welcome to Biblioteca BookManager!");
    }

    public void showMenu() {
        System.out.println("List Books(1):");
        System.out.println("Checkout(2):");
        System.out.println("Return(3):");
        System.out.println("Quit(4):");
    }

    public void showInvalidOption() {
        System.out.println("Select a valid option!");
    }

    public void showSuccessfulCheckout(String type) {
        System.out.println("Thank you! Enjoy the " + type + ".");
    }

    public void showUnsuccessfulCheckout(String type) {
        System.out.println("That " + type + " is not available.");
    }

    public void showSuccessfulReturn(String type) {
        System.out.println("Thank you for returning the " + type + ".");
    }

    public void showUnsuccessfulReturn(String type) {
        System.out.println("That is not a valid " + type + " to return.");
    }

    public void showBookList() {
        List<Book> books = BookLists.getBookList();
        System.out.println("Book List:");
        System.out.println("Book Name|Author|Year Published");
        System.out.println("========================");
        books.stream().forEach(n -> {
            System.out.println(String.format("%1$s|%2$s|%3$s",
                    n.getName(),
                    n.getAuthor(),
                    n.getPublished()));
        });
        System.out.println("========================");
    }

    public void showGoodBye() {
        System.out.println("Thank you for coming,welcome your next visit!");
    }

    public void showChooseTip() {
        System.out.println("Please input your choose:");
    }

    public void showCheckoutAndReturnTip() {
        System.out.println("Please input book name:");
    }

}
