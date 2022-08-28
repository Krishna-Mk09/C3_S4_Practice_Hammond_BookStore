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


    public Book() {
    }

    public Book(String isbnNumber, String title, String description, double price) {
        this.isbnNumber = isbnNumber;
        this.title = title;
        this.description = description;
        this.price = price;

    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void displayDetails() {
        System.out.println("The price of the book is : " + getPrice());
        System.out.println("Description of the book is : " + getDescription());
        System.out.println("Title of the book : " + getTitle());
        System.out.println("ISBN number of the book is : " + getIsbnNumber());


    }

    @Override
    public String toString() {
        return "Book{" +
                "isbnNumber='" + isbnNumber + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';

    }
}
