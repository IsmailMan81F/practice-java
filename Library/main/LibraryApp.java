package main;

import models.*;

public class LibraryApp {
    public static void main(String[] args) {
        Member member1 = new Member("smail", "964185");
        Member member2 = new Member("mohamed", "127856");

        Book book1 = new Book("Lescos", "LuckyPatcher", "lovo");
        Book book2 = new Book("Anima", "LorensVolter", "classMaster");
        Book book3 = new Book("Piardo", "JamaykaSonva", "Mours");

        member1.borrowBook(book1);
        member2.borrowBook(book2);

        System.out.println("Borrowed books of member1 : \n");
        member1.printBorrowedBooks();
        System.out.println("Borrowed books of member2 : \n");
        member2.printBorrowedBooks();

        System.out.println("Total number of books is : " + Book.totalBooks);
        int totalBorrowedBooks = member1.borrowedBooksNum + member2.borrowedBooksNum;
        System.out.println("Total number of borrowed books is : " + totalBorrowedBooks);

    }
}
