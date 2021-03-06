package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LibraryViewTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private LibraryView libraryView = new LibraryView();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void firstGetInTheSystemWillWelcome() {
        String expect = "Welcome to Biblioteca BookManager!\r\n";
        libraryView.showWelcome();
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void printMainMenu() {
        String expect = "List Books(1):\r\n"
                + "List Movies(2):\r\n"
                + "Checkout Book(3):\r\n"
                + "Return Book(4):\r\n"
                + "Checkout Movie(5):\r\n"
                + "Return Movie(6):\r\n"
                + "User Information(7):\r\n"
                + "Quit(8):\r\n";
        libraryView.showMenu();
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void printInvalidOption() {
        String expect = "Select a valid option!\r\n";
        libraryView.showInvalidOption();
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void printSuccessfulCheckout() {
        String expect = "Thank you! Enjoy the book.\r\n";
        libraryView.showSuccessfulCheckout("book");
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void printUnsuccessfulCheckout() {
        String expect = "That book is not available.\r\n";
        libraryView.showUnsuccessfulCheckout("book");
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void printSuccessfulReturn() {
        String expect = "Thank you for returning the book.\r\n";
        libraryView.showSuccessfulReturn("book");
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void printUnsuccessfulReturn() {
        String expect = "That is not a valid book to return.\r\n";
        libraryView.showUnsuccessfulReturn("book");
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void printBookList() {
        String expect = "Book List:\r\n" +
                "Book Name|Author|Year Published\r\n" +
                "========================\r\n" +
                "Java|wjh|2018\r\n" +
                "C++|wyx|2017\r\n" +
                "Python|lf|2016\r\n" +
                "C|wjt|2015\r\n" +
                "Javascript|wft|2014\r\n" +
                "========================\r\n";
        libraryView.showBookList();
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void printGoodBye() {
        String expect = "Thank you for coming,welcome your next visit!\r\n";
        libraryView.showGoodBye();
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void printChooseTip() {
        String expect = "Please input your choose:\r\n";
        libraryView.showChooseTip();
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void printCheckoutTip() {
        String expect = "Please input book name:\r\n";
        libraryView.showCheckoutAndReturnTip("book");
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void printReturnTip() {
        String expect = "Please input book name:\r\n";
        libraryView.showCheckoutAndReturnTip("book");
        assertThat(outContent.toString(), is(expect));
    }
}
