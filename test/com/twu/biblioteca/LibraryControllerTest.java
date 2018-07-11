package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LibraryControllerTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private LibraryController libraryController = new LibraryController();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void beginWelcome() {
        String expect = "Welcome to Biblioteca BookManager!\r\n"
                + "List Books(1):\r\n"
                + "Checkout(2):\r\n"
                + "Return(3):\r\n"
                + "Quit(4):\r\n"
                + "Please input your choose:\r\n";
        libraryController.welcome();
        assertThat(outContent.toString(), is(expect));
    }
}
