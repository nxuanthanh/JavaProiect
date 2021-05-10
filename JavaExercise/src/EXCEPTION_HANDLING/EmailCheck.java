package EXCEPTION_HANDLING;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Thành
 */
class EmailaddressException extends Exception {

    EmailaddressException(String str) {
        super(str);
    }
}

public class EmailCheck {

    public static void check(String str) throws EmailaddressException {
        int place = str.indexOf('@');

        if (place == -1) {
            throw new EmailaddressException("Khong hop le do khong chua '@'");
        }
        if (place == 0) {
            throw new EmailaddressException("Khong hop le do '@' o vi tri dau tien.");
        }
        place = str.indexOf('@', place + 1);

        if (place != -1) {
            throw new EmailaddressException("Khong hop le do co hon 1 ki tu '@'");
        }
        System.out.println("Dia chi Email hop le.");
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap dia chi Email: ");
            String email = sc.nextLine();

            check(email);
        } catch (EmailaddressException e) {
            System.out.println(e.getMessage());
        }                                          
    }
}