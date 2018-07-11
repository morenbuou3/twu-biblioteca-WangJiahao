package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LibraryController {
    private LibraryView libraryView = new LibraryView();
    private BookManager bookManager = new BookManager();
    private MovieManager movieManager = new MovieManager();
    private UserLogin userLogin = new UserLogin();
    private BufferedReader bufferedReader;

    {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void login() throws IOException {
        System.out.println("Please input your libraryNumber:");
        String libraryNumber = bufferedReader.readLine();
        System.out.println("Please input your password:");
        String password = bufferedReader.readLine();
        userLogin.login(libraryNumber, password);
    }

    public void welcome() {
        libraryView.showWelcome();
        libraryView.showMenu();
        libraryView.showChooseTip();
    }


    public void begin() throws IOException {
        String input = bufferedReader.readLine();
        while (!"7".equals(input)) {
            String name = "";
            switch (input) {
                case "1":
                    libraryView.showBookList();
                    break;
                case "2":
                    movieManager.showMovieList();
                    break;
                case "3":
                    libraryView.showCheckoutAndReturnTip("book");
                    name = bufferedReader.readLine();
                    bookManager.checkout(name);
                    break;
                case "4":
                    libraryView.showCheckoutAndReturnTip("book");
                    name = bufferedReader.readLine();
                    bookManager.returnBook(name);
                    break;
                case "5":
                    libraryView.showCheckoutAndReturnTip("movie");
                    name = bufferedReader.readLine();
                    movieManager.checkoutMovie(name);
                    break;
                case "6":
                    libraryView.showCheckoutAndReturnTip("movie");
                    name = bufferedReader.readLine();
                    movieManager.returnMovie(name);
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
