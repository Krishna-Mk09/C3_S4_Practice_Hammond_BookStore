/*
 * Author Name : M.Krishna.
 * Date: 27-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.bookstore;

/**
 * The Author class has a Book object, a String for the author's name, and a String for the author's pen name
 */
public class Author {
    Book book;
    private String authorName;
    private String authorPenName;


    // This is a constructor. It is a special method that is called when an object is created.
    public Author(String authorName, String authorPenName, Book book) {
        this.authorName = authorName;
        this.authorPenName = authorPenName;
        this.book = book;
    }

    // This is a getter and setter method.
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorPenName() {
        return authorPenName;
    }

    public void setAuthorPenName(String authorPenName) {
        this.authorPenName = authorPenName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    // A method that returns a string representation of the object.
    public String toString() {
        return "Author{" + "authorName='" + authorName + '\'' + ", authorPenName='" + authorPenName + '\'' + ", book=" + book + '}';
    }
}
