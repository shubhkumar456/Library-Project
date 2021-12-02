package com.example.Library.Project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Library")
public class Library {

    @Id
    @GeneratedValue
    private int id;
    private String book_name;
    private String author_name;
    private String charges;

    public Library() {
    }

    public Library(int id, String book_name, String author_name, String charges) {
        this.id = id;
        this.book_name = book_name;
        this.author_name = author_name;
        this.charges = charges;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }
}
