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
        String expect = "Welcome to Biblioteca Library!\r\n";
        libraryView.showWelcome();
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void printMainMenu() {
        String expect = "List Books(1):\r\n"
                        + "Checkout(2):\r\n"
                        + "Return(3):\r\n"
                        + "Quit(4):\r\n";
        libraryView.showMenu();
        assertThat(outContent.toString(), is(expect));
    }
}
