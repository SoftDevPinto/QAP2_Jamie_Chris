package com.keyin.rest.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.Date;

@Entity
public class Book {
    @Id
    @SequenceGenerator(name = "book_sequence", sequenceName = "book_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "book_sequence")
    private long id;
    private String title;
    private String author;
    private Date published;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
}
