/*
 * Author Name : M.Krishna.
 * Date: 27-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.bookstore;

public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book("123453", "THE ENCOUNTER", "this book has a very good comedy", 200.0, "MK");
        Author author = new Author("VAMSHI KRISHNA", " SANTOOR PEN ");
        System.out.println("The author  name is : " + author.getAuthorName());
        System.out.println("The Author pen name is : " + author.getAuthorPenName());
        book.displayDetails();

    }
}
