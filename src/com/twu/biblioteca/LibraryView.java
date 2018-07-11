package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LibraryView {
    private BufferedReader bufferedReader;

    {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void showWelcome() {
        System.out.println("Welcome to Biblioteca Library!");
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

    public void showSuccessfulCheckout() {
        System.out.println("Thank you! Enjoy the book.");
    }

    public void showUnsuccessfulCheckout() {
        System.out.println("That book is not available.");
    }

    public void showSuccessfulReturn() {
        System.out.println("Thank you for returning the book.");
    }

    public void showUnsuccessfulReturn() {
        System.out.println("That is not a valid book to return.");
    }
}
