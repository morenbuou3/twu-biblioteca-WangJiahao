package com.twu.biblioteca;

import com.twu.biblioteca.data.MovieLists;
import com.twu.biblioteca.entity.Movie;

import java.util.List;

public class MovieManager {
    private LibraryView libraryView = new LibraryView();
    private UserLogin userLogin = new UserLogin();

    public void showMovieList() {
        List<Movie> movies = MovieLists.getMovieList();
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

    public void checkoutMovie(String name) {
        if (!checkLogin()) return;
        List<Movie> movies = MovieLists.getMovieList();
        for (Movie movie : movies) {
            if (movie.getName().equals(name) && movie.getMovieNumber() > 0) {
                movie.setMovieNumber(movie.getMovieNumber() - 1);
                movie.getUser().add(Session.getUser());
                libraryView.showSuccessfulCheckout("movie");
                return;
            }
        }
        libraryView.showUnsuccessfulCheckout("movie");
    }

    public void returnMovie(String name) {
        if (!checkLogin()) return;
        List<Movie> movies = MovieLists.getMovieList();
        for (Movie movie : movies) {
            if (movie.getName().equals(name) && movie.checkUserValid(Session.getUser())) {
                movie.setMovieNumber(movie.getMovieNumber() + 1);
                movie.getUser().remove(Session.getUser());
                libraryView.showSuccessfulReturn("movie");
                return;
            }
        }
        libraryView.showUnsuccessfulReturn("movie");
    }

    private boolean checkLogin() {
        if (Session.getUser() == null) {
            libraryView.showLoginTip();
            return false;
        }
        return true;
    }
}
