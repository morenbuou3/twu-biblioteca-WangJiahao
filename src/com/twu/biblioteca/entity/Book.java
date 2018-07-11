package com.twu.biblioteca.entity;

import java.util.Date;

public class Book {
    private String name;
    private String author;
    private Date published;
    private Integer number;

    public Book(String name, String author, Date published, Integer number) {
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

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
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
}
