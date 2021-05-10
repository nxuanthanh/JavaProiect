/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Xuan Thanh
 */
public class BookReaderManagement {

    private Book book;
    private Reader reader;
    private int numOfBorrow;
    private String State;
    private int totalBorrowed;

    public BookReaderManagement() {
    }

    public BookReaderManagement(Book book) {
        this.book = book;
    }

    public BookReaderManagement(Book book, Reader reader, int numOfBorrow, String State, int totalBorrowed) {
        this.book = book;
        this.reader = reader;
        this.numOfBorrow = numOfBorrow;
        this.State = State;
        this.totalBorrowed = totalBorrowed;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public int getNumOfBorrow() {
        return numOfBorrow;
    }

    public void setNumOfBorrow(int numOfBorrow) {
        this.numOfBorrow = numOfBorrow;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public int getTotalBorrowed() {
        return totalBorrowed;
    }

    public void setTotalBorrowed(int totalBorrowed) {
        this.totalBorrowed = totalBorrowed;
    }

    @Override
    public String toString() {
        return "BookReaderManagement{" + "readerID: " + reader.getReaderID() 
                    + ", readerName: " + reader.getFullName()
                    + ", bookID: " + book.getBookID() 
                    + ", bookName: " + book.getBookName() 
                    + ", numOfBorrow: " + numOfBorrow
                    + ", State: " + State 
                    + ", totalBorrowed: " + totalBorrowed + '}';
    }

}
