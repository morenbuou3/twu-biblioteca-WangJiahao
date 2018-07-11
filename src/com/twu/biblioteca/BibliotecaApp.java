package com.twu.biblioteca;

import java.io.IOException;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {
        LibraryController libraryController = new LibraryController();
        UserLogin userLogin = new UserLogin();
        while (!userLogin.checkLogin()) {
            libraryController.login();
        }
        libraryController.welcome();
        libraryController.begin();
    }
}
