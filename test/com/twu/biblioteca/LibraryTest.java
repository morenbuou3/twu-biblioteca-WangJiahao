package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LibraryTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private LibraryView libraryView = new LibraryView();
    private Library library = new Library();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void checkoutBookInValid() {
        String expect = "That book is not available.\r\n";
        String name = "Java1";
        library.checkout(name);
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void checkoutBookValid() {
        String expect = "Thank you! Enjoy the book.\r\n";
        String name = "Java";
        library.checkout(name);
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void returnBookInValid() {
        String expect = "That is not a valid book to return.\r\n";
        String name = "Java1";
        library.returnBook(name);
        assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void returnBookValid() {
        String expect = "Thank you for returning the book.\r\n";
        String name = "Java";
        library.returnBook(name);
        assertThat(outContent.toString(), is(expect));
    }
}
