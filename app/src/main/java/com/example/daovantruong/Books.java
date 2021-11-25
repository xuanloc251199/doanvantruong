package com.example.daovantruong;

public class Books {
    String id;
    String book_title;
    String book_author;
    String book_page;

    public Books(String id, String book_title, String book_author, String book_page) {
        this.id = id;
        this.book_title = book_title;
        this.book_author = book_author;
        this.book_page = book_page;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_page() {
        return book_page;
    }

    public void setBook_page(String book_page) {
        this.book_page = book_page;
    }
}
