package com.twu.biblioteca.entity;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private String year;
    private String director;
    private String movieRate;
    private Integer movieNumber;

    private List<User> user;

    public Movie(String name, String year, String director, String movieRate, Integer movieNumber) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.movieRate = movieRate;
        this.movieNumber = movieNumber;
        this.user = new ArrayList<>();
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

    public Integer getMovieNumber() {
        return movieNumber;
    }

    public void setMovieNumber(Integer movieNumber) {
        this.movieNumber = movieNumber;
    }

    public List<User> getUser() {
        return user;
    }
}
