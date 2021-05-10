/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerUltility;
import Controller.DataController;
import Model.Book;
import Model.BookReaderManagement;
import Model.Reader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Xuan Thanh
 */
public class View {

    public static void main(String[] args) {
        int choice = 0;
        var booksFileName = "BOOK.DAT";
        var readersFileName = "READER.DAT";
        var brmFileName = "BRM.DAT";

        var controller = new DataController();
        var ultility = new ControllerUltility();
        var books = new ArrayList<Book>();
        var readers = new ArrayList<Reader>();
        var brms = new ArrayList<BookReaderManagement>();

        var isReaderChecked = false;
        var isBookchecked = false;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("===============MENU===============");
            System.out.println("1.  Thêm một đầu sách vào file. ");
            System.out.println("2.  Hiển thị danh sách các đầu sách có trong file. ");
            System.out.println("3.  Thêm một bạn đọc vào file. ");
            System.out.println("4.  Hiển thị danh sách các bạn đọc có trong file.");
            System.out.println("5.  Lập thông tin quản lí mượn.");
            System.out.println("6.  Sắp xếp thông tin quản lí mượn. ");
            System.out.println("7.  Tìm kiếm thông tin quản lí mượn theo tên bạn đọc. ");
            System.out.println("0.  Thoát ứng dụng.  ");
            System.out.print("    Chọn chức năng: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // đọc bỏ dòng chứa lứa chọn.
            switch (choice) {
                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng dịch vụ của chúng tôi ! ");
                    break;
                case 1:
                    if (!isBookchecked) {
                        checkBookId(controller, booksFileName);
                        isBookchecked = true;
                    }
                    String[] specializ = {"Science", "Art", "Economic", "IT"};
                    String bookName,
                     author,
                     spec;
                    int pYear,
                     qualty,
                     sp = 0;

                    System.out.print("Nhập tên sách: ");
                    bookName = scanner.nextLine();

                    System.out.print("Nhập tên tác giả: ");
                    author = scanner.nextLine();

                    do {
                        System.out.println("Nhập thể loại sách: ");
                        System.out.println("1. Science\n2. Art\n3. Economic\n4. IT");
                        sp = scanner.nextInt();
                    } while (sp < 1 || sp > 4);
                    spec = specializ[sp - 1];

                    System.out.print("Nhập vào năm xuất bản: ");
                    pYear = scanner.nextInt();

                    System.out.println("Nhập số lượng: ");
                    qualty = scanner.nextInt();

                    Book book = new Book(0, bookName, author, spec, pYear, qualty);
                    controller.writeBookToFile(book, booksFileName);
                    break;
                case 2:
                    books = controller.readbookFromFile(booksFileName);
                    showbookInfo(books);
                    break;
                case 3:
                    if (!isReaderChecked) {
                        checkReaderId(controller, readersFileName);
                        isReaderChecked = true;
                    }
                    String fullName,
                     address,
                     phoneNumber;
                    System.out.println("Nhập họ và tên: ");
                    fullName = scanner.nextLine();

                    System.out.println("Nhập địa chỉ: ");
                    address = scanner.nextLine();
                    do {
                        System.out.println("Nhập số điện thoại: ");
                        phoneNumber = scanner.nextLine();
                    } while (!phoneNumber.matches("\\d{10}"));

                    Reader reader = new Reader(0, fullName, address, phoneNumber);
                    controller.writeReaderToFile(reader, readersFileName);
                    break;
                case 4:
                    readers = controller.readReaderFromeFile(readersFileName);
                    showReadersInfo(readers);
                    break;
                case 5:
                    //Khởi tạo danh sách
                    books = controller.readbookFromFile(booksFileName);
                    readers = controller.readReaderFromeFile(readersFileName);
                    brms = controller.readBRMsFromeFile(brmFileName);

                    //chọn một bạn đọc từ danh sách để cho phép mượn, kiểm tra nếu đã mượn đủ số lượng thì không cho mượn nữa.
                    int readerID,
                     booksID;
                    boolean isBorrowable = false;
                    do {
                        showReadersInfo(readers);
                        System.out.println("--------------------------------------------------");
                        System.out.println("Nhập mã bạn đọc, nhập 0 để bỏ qua: ");
                        readerID = scanner.nextInt();
                        if (readerID == 0) {
                            break;  // tất cả bạn đọc đã mượn đủ sách quy định
                        }
                        isBorrowable = checkBorrowed(brms, readerID);
                        if (isBorrowable) {
                            break;
                        } else {
                            System.out.println("Bạn đọc này đã mượn đủ số lượng cho phép.");
                        }

                    } while (true);
                    //Chọn một đầu sách cần mượn,nếu đầu sách đố đã mượn tối đa số lần cho phép thì không cho mượn nữa yêu cầu mượn sách khác
                    boolean isFull = false;
                    do {
                        showbookInfo(books);
                        System.out.println("------------------------------------------------");
                        System.out.println("Nhập mã sách, nhập 0 để bỏ qua: ");

                        booksID = scanner.nextInt();
                        if (booksID == 0) {
                            break;
                        }
                        isFull = checkFull(brms, readerID, booksID);
                        if (!isFull) {
                            System.out.println("Vui lòng chọn đầu sách khác. ");
                        } else {
                            break;
                        }
                    } while (true);
                    int total = getTotal(brms, readerID, booksID);
                    do {
                        System.out.println("Nhập só lượng mượn, tối đa 3 cuốn(đã mượn " + total + "): ");
                        int x = scanner.nextInt();
                        if ((x + total) >= 1 && (x + total) <= 3) {
                            total += x;
                            break;
                        } else {
                            System.out.println("Bạn đã nhập quá số lượng quy định, vui lòng nhập lại !");
                        }
                    } while (true);

                    scanner.nextLine();
                    System.out.println("Nhập tinh trạng: ");
                    String status = "";
                    status = scanner.nextLine();

                    //cập nhật lại file BRM.DAT
                    Book currentBook = getBook(books, booksID);
                    Reader curentReader = getReader(readers, readerID);
                    BookReaderManagement b = new BookReaderManagement(currentBook, curentReader, total, status, 0);

                    brms = ultility.updateBRMInfo(brms, b); //Cập nhật danh sách quản lí mượn
                    controller.updateBRMfile(brms, brmFileName);//Cập nhật file du liệu

                    //In dánh sách ra màn hình
                    showBRMInfo(brms);

                    break;
                case 6:
                    brms = controller.readBRMsFromeFile(brmFileName); //đọc ra danh sách quan lí

                    //update so luong muon
                    brms = ultility.updateTotalBorrowed(brms);
                    System.out.println("----------------------------------------------------");
                    System.out.println("________________Các lựa chọn sắp xếp________________");
                    int x = 0;

                    do {
                        System.out.println("1.  Sắp xếp theo tên bạn đọc(A-Z)");
                        System.out.println("2.  Sắp xếp theo số lượng mượn giảm dần.");
                        System.out.println("0.  Trở lại menu chính");
                        System.out.print("Nhập lựa chọn: ");

                        x = scanner.nextInt();
                        if (x == 0) {
                            break;
                        }
                        switch (x) {
                            case 1:
                                //Sắp xếp theo tên 
                                brms = ultility.sortByReaderName(brms);
                                showBRMInfo(brms);
                                break;
                            case 2:
                                //Xắp xếp theo sso lượng
                                brms = ultility.sortByTotalBorrowed(brms);
                                showBRMInfo(brms);
                        }
                    } while (true);
                    break;
                case 7:
                    brms = controller.readBRMsFromeFile(brmFileName);
                    System.out.println("Nhập cụm từ có trong ten bạn đọc cần tìm: ");
                    String key = scanner.nextLine();
                    var result = ultility.searchByreaderName(brms, key);
                    if (result.size()==0) {
                        System.out.println("Không tìm thấy thông tin. ");
                    }else{
                        showBRMInfo(result);
                    }
                    break;
            }
        } while (choice != 0);
    }

    private static void showbookInfo(ArrayList<Book> books) {
        System.out.println("---------------Thông tin sách trong file---------------");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void checkBookId(DataController controller, String fileName) {
        var listBooks = controller.readbookFromFile(fileName);
        if (listBooks.size() == 0) {

        } else {
            Book.setId(listBooks.get(listBooks.size() - 1).getBookID() + 1);
        }
    }

    private static void checkReaderId(DataController controller, String readersFileName) {
        var readers = controller.readReaderFromeFile(readersFileName);
        if (readers.size() == 0) {
            //do not thing
        } else {
            Reader.setId(readers.get(readers.size() - 1).getReaderID() + 1);
        }
    }

    private static void showReadersInfo(ArrayList<Reader> readers) {
        System.out.println("------------------Thông tin các bạn đọc có trong file------------------");
        for (Reader r : readers) {
            System.out.println(r);
        }
    }

    private static boolean checkBorrowed(ArrayList<BookReaderManagement> brms, int readerID) {
        int count = 0;
        for (var brm : brms) {
            if (brm.getReader().getReaderID() == readerID) {
                count += brm.getNumOfBorrow();
            }
        }
        if (count == 15) {
            return false;
        }
        return true;
    }

    private static boolean checkFull(ArrayList<BookReaderManagement> brms, int readerID, int booksID) {
        for (var br : brms) {
            if (br.getReader().getReaderID() == readerID
                    && br.getBook().getBookID() == booksID && br.getNumOfBorrow() == 3) {
                return false; // Không được mượn đầu sách này nữa
            }

        }
        return true;    //được mươn tiếp
    }

    private static int getTotal(ArrayList<BookReaderManagement> brms, int readerID, int booksID) {
        for (var b : brms) {
            if (b.getReader().getReaderID() == readerID && b.getBook().getBookID() == booksID) {
                return b.getNumOfBorrow();
            }
        }
        return 0;
    }

    private static Book getBook(ArrayList<Book> books, int booksID) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookID() == booksID) {
                return books.get(i);
            }
        }
        return null;
    }

    private static Reader getReader(ArrayList<Reader> readers, int readerID) {
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).getReaderID() == readerID) {
                return readers.get(i);
            }
        }
        return null;
    }

    private static void showBRMInfo(ArrayList<BookReaderManagement> brms) {
        for (var br : brms) {
            System.out.println(br);
        }
    }
}
