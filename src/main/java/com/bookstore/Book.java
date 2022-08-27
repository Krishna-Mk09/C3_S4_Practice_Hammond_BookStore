/*
 * Author Name : M.Krishna.
 * Date: 27-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.bookstore;

public class Book {
    private String isbnNumber;
    private String title;
    private String description;
    private double price;
    Author author;

    public Book() {
    }

    public Book(String isbnNumber, String title, String description, double price, Author author) {
        this.isbnNumber = isbnNumber;
        this.title = title;
        this.description = description;
        this.price = price;
        this.author = author;
    }
}
