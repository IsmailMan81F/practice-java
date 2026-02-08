package models;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String memberId;
    private List<Book> borrowedBooks = new ArrayList<>();
    public int borrowedBooksNum = 0;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public Member() { // default constructor (if the fields are null)
        this.name = "unknown";
        this.memberId = "0";
    }

    public void borrowBook(Book b) {
        borrowedBooks.add(b);
        borrowedBooksNum++;
    }

    public void returnBook(Book b) {
        borrowedBooks.remove(b);
        borrowedBooksNum--;
    }

    public void printBorrowedBooks() {
        for (int i = 0; i < borrowedBooks.size(); i++) {
            borrowedBooks.get(i).printInfo();
        }
    }

    public String getName() {
        return this.name;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

}
