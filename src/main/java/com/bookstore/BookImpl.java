/*
 * Author Name : M.Krishna.
 * Date: 27-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.bookstore;

public class BookImpl {
    // Creating a book object and an author object and printing the author object.
    public static void main(String[] args) {
        Book book = new Book("123453", "THE ENCOUNTER", "this book has a very good comedy", 200.0);
        Author author = new Author("vamshi", "SANTOOR PEN", book);
        System.out.println(author);
        book.displayDetails();

    }
}
