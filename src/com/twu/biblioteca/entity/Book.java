package com.twu.biblioteca.entity;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
    private String author;
    private String published;
    private Integer number;
    private List<User> user = new ArrayList<User>();

    public Book(String name, String author, String published, Integer number) {
        this.name = name;
        this.author = author;
        this.published = published;
        this.number = number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUser() {
        return user;
    }
}
