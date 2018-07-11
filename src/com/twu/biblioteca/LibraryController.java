package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LibraryController {
    private LibraryView libraryView = new LibraryView();
    private BookManager library = new BookManager();
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
            String name = "";
            switch (input) {
                case "1":
                    libraryView.showBookList();
                    break;
                case "2":
                    libraryView.showCheckoutAndReturnTip();
                    name = bufferedReader.readLine();
                    library.checkout(name);
                    break;
                case "3":
                    libraryView.showCheckoutAndReturnTip();
                    name = bufferedReader.readLine();
                    library.returnBook(name);
                    break;
                default:
                    libraryView.showInvalidOption();
                    break;
            }
            System.out.println();
            libraryView.showMenu();
            libraryView.showChooseTip();
            input = bufferedReader.readLine();
        }
        libraryView.showGoodBye();
    }
}
