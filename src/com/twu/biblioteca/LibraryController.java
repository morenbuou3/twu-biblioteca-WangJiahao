package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LibraryController {
    private LibraryView libraryView = new LibraryView();
    private BufferedReader bufferedReader;

    {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void welcome() {
        libraryView.showWelcome();
        libraryView.showMenu();
        libraryView.showChooseTip();
    }


    public void begin() throws IOException {
        String input = bufferedReader.readLine();
        while (!"4".equals(input)) {
            switch (input) {
                case "1":
                    libraryView.showBookList();
                    break;
                case "2":
                    libraryView.showCheckoutAndReturnTip();
                    break;
                case "3":
                    libraryView.showCheckoutAndReturnTip();
                    break;
                default:
                    libraryView.showInvalidOption();
                    break;
            }
            libraryView.showMenu();
            libraryView.showChooseTip();
            input = bufferedReader.readLine();
        }
        libraryView.showGoodBye();
    }
}
