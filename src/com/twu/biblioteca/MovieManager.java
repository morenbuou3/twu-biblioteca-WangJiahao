package com.twu.biblioteca;

import com.twu.biblioteca.data.MovieLists;

import java.util.List;

public class MovieManager {
    public void showMovieList() {
        List<com.twu.biblioteca.entity.Movie> movies = MovieLists.getMovieList();
        System.out.println("MovieManager List:");
        System.out.println("MovieManager Name|Year|Director|MovieManager Rating");
        System.out.println("========================");
        movies.stream().forEach(n -> {
            System.out.println(String.format("%1$s|%2$s|%3$s|%4$s",
                    n.getName(),
                    n.getYear(),
                    n.getDirector(),
                    n.getMovieRate()));
        });
        System.out.println("========================");
    }
}
