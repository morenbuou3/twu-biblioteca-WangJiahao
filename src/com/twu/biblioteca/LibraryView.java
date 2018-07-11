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
}
