package models;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public static int totalBooks;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void printInfo() {
        String info = "Book : " + this.title + ", Author : " + this.author + ", isbn : " + this.isbn
                + "\nTotal number of books : " + totalBooks;
        System.out.println(info);
    }

}
