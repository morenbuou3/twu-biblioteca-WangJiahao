package com.twu.biblioteca;

import com.twu.biblioteca.entity.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class MovieManagerTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private MovieManager movieManager = new MovieManager();
    private User user = new User("111-1111", "123", "wjh", "123@qq.com", "13311111111");

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        Session.setUser(user);
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

    @Test
    public void checkoutMovieInvalid() {
        String expect = "That movie is not available.\r\n";
        String name = "Java1";
        movieManager.checkoutMovie(name);
        Assert.assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void checkoutMovieValid() {
        String expect = "Thank you! Enjoy the movie.\r\n";
        String name = "the world of tank";
        movieManager.checkoutMovie(name);
        Assert.assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void returnMovieInvalid() {
        String expect = "That is not a valid movie to return.\r\n";
        String name = "Java1";
        movieManager.returnMovie(name);
        Assert.assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void returnMovieValid() {
        String expect = "Thank you! Enjoy the movie.\r\n"
                + "Thank you for returning the movie.\r\n";
        String name = "the world of tank";
        movieManager.checkoutMovie(name);
        movieManager.returnMovie(name);
        Assert.assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void checkoutMovieWithoutUser() {
        Session.setUser(null);
        String expect = "Please login!\r\n";
        String name = "the world of tank";
        movieManager.checkoutMovie(name);
        Assert.assertThat(outContent.toString(), is(expect));
    }

    @Test
    public void returnMovieWithoutUser() {
        Session.setUser(null);
        String expect = "Please login!\r\n";
        String name = "the world of tank";
        movieManager.returnMovie(name);
        Assert.assertThat(outContent.toString(), is(expect));
    }
}
