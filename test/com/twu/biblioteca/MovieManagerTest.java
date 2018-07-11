package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class MovieManagerTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private MovieManager movieManager = new MovieManager();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void printMovieList() {
        String expect = "MovieManager List:\r\n" +
                "MovieManager Name|Year|Director|MovieManager Rating\r\n" +
                "========================\r\n" +
                "the world of tank|2001|wjh|5\r\n" +
                "the world of ship|2002|wyx|5\r\n" +
                "the world of plane|2003|wjh|8\r\n" +
                "========================\r\n";
        movieManager.showMovieList();
        assertThat(outContent.toString(), is(expect));
    }
}
