package com.twu.biblioteca.entity;

public class Movie {
    private String name;
    private String year;
    private String director;
    private String movieRate;

    private User user = null;

    public Movie(String name, String year, String director, String movieRate) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.movieRate = movieRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(String movieRate) {
        this.movieRate = movieRate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}