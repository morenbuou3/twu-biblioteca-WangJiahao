package com.twu.biblioteca;

public class LibraryController {
    private LibraryView libraryView = new LibraryView();

    public void beginWelcome() {
        libraryView.showWelcome();
        libraryView.showMenu();
        libraryView.showChooseTip();
    }
}
