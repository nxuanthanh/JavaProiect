/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Book;
import Model.BookReaderManagement;
import Model.Reader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xuan Thanh
 */
public class DataController {

    private FileWriter fileWriter;
    private PrintWriter printWriter;
    private BufferedWriter bufferedWriter;
    private Scanner scanner;

    public void openFileToWrite(String fileName) {
        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch (IOException ex) {
            Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void openFileToRead(String fileName) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            scanner = new Scanner(Paths.get(fileName), "UTF-8");
        } catch (IOException ex) {
            Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void closeFileAfterRead(String fileName) {
        try {
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeFileAfterWrite(String fileName) {

        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void writeBookToFile(Book book, String fileName) {
        openFileToWrite(fileName);
        printWriter.println(book.getBookID() + "|" + book.getBookName() + "|"
                + book.getAuthor() + "|" + book.getSpecialization() + "|"
                + book.getPublishYear() + "|" + book.getQuantity());
        closeFileAfterWrite(fileName);
    }

    public void writeReaderToFile(Reader reader, String fileName) {
        openFileToWrite(fileName);
        printWriter.println(reader.getReaderID() + "|" + reader.getFullName() + "|"
                + reader.getAddress() + "|" + reader.getPhoneNumber());
        closeFileAfterWrite(fileName);
    }

    public void writeBRMToFile(BookReaderManagement brm, String fileName) {
        openFileToWrite(fileName);
        printWriter.println(brm.getReader().getReaderID() + "|" + brm.getBook().getBookID() + "|"
                + brm.getNumOfBorrow() + "|" + brm.getState());
        closeFileAfterWrite(fileName);
    }

    public ArrayList<Reader> readReaderFromeFile(String fileName) {
        openFileToRead(fileName);
        ArrayList<Reader> readers = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            Reader reader = createReaderFromData(data);
            readers.add(reader);
        }
        closeFileAfterRead(fileName);
        return readers;
    }

    public Reader createReaderFromData(String data) {
        String[] datas = data.split("\\|");
        Reader r = new Reader(Integer.parseInt(datas[0]), datas[1], datas[2], datas[3]);
        return r;
    }

    public ArrayList<Book> readbookFromFile(String fileName) {
        openFileToRead(fileName);
        ArrayList<Book> books = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            Book book = createBookFromFile(data);
            books.add(book);
        }
        closeFileAfterRead(fileName);
        return books;
    }

    public Book createBookFromFile(String data) {
        String[] datas = data.split("\\|");

        Book book = new Book(Integer.parseInt(datas[0]), datas[1], datas[2],
                datas[3], Integer.parseInt(datas[4]), Integer.parseInt(datas[5]));
        return book;
    }

    public ArrayList<BookReaderManagement> readBRMsFromeFile(String fileName) {
        var books = readbookFromFile("BOOK.DAT");
        var readers = readReaderFromeFile("READER.DAT");
        openFileToRead(fileName);
        ArrayList<BookReaderManagement> brmS = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            BookReaderManagement brm = createBRMsFromData(data, books, readers);
            brmS.add(brm);
        }
        closeFileAfterRead(fileName);
        return brmS;
    }

    public BookReaderManagement createBRMsFromData(String data, ArrayList<Book> books, ArrayList<Reader> readers) {
        String[] datas = data.split("\\|");
        BookReaderManagement brm
                = new BookReaderManagement(getBook(books, Integer.parseInt(datas[1])),
                        getReader(readers, Integer.parseInt(datas[0])), Integer.parseInt(datas[2]), datas[3], 0);
        return brm;
    }

    public void updateBRMfile(ArrayList<BookReaderManagement> lits, String fileName) {
        //Xóa bỏ file cũ
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
        //Ghi mới file này
        openFileToWrite(fileName);
        for (var brm : lits) {
            printWriter.println(brm.getReader().getReaderID() + "|" + brm.getBook().getBookID() + "|"
                    + brm.getNumOfBorrow() + "|" + brm.getState());
        }
        closeFileAfterWrite(fileName);
    }
// Phương thức này trả về một đối tượng Book trong danh sách với id cho trước
    private static Book getBook(ArrayList<Book> books, int booksID) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookID() == booksID) {
                return books.get(i);
            }
        }
        return null;
    }
// Phương thức này trả về một đối tượng Reader trong danh sách với id cho trước
    private static Reader getReader(ArrayList<Reader> readers, int readerID) {
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).getReaderID() == readerID) {
                return readers.get(i);
            }
        }
        return null;
    }
}
