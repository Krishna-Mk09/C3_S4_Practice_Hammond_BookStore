/*
 * Author Name : M.Krishna.
 * Date: 27-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.bookstore;

public class Author {
    Book book;
    private String authorName;
    private String authorPenName;


    public Author(String authorName, String authorPenName, Book book) {
        this.authorName = authorName;
        this.authorPenName = authorPenName;
        this.book = book;
    }

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
    public String toString() {
        return "Author{" + "authorName='" + authorName + '\'' + ", authorPenName='" + authorPenName + '\'' + ", book=" + book + '}';
    }
}
