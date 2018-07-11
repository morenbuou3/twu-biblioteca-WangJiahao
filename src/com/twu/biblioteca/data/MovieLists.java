package com.twu.biblioteca.data;

import com.twu.biblioteca.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieLists {
    private static List<Movie> movieList = new ArrayList<Movie>();

    static {
        movieList.add(new Movie("the world of tank", "2001", "wjh", "5", 1));
        movieList.add(new Movie("the world of ship", "2002", "wyx", "5", 1));
        movieList.add(new Movie("the world of plane", "2003", "wjh", "8", 1));
    }

    public static List<Movie> getMovieList() {
        return movieList;
    }
}
