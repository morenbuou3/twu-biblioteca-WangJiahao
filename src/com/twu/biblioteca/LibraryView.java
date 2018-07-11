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
}
