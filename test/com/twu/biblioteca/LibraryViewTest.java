package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LibraryViewTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void FirstGetInTheSystemWillWelcome() {
        String expect = "Welcome to Biblioteca Library!\r\n";
        LibraryView libraryView = new LibraryView();
        libraryView.showWelcome();
        assertThat(outContent.toString(), is(expect));
    }
}
