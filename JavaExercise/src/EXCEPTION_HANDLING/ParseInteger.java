package EXCEPTION_HANDLING;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Thành
 */
public class ParseInteger {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap chuoi so nguyen: ");
            String str = sc.nextLine();
            // Chuyen chuoi sang so nguyen, neu chuoi khong dung dinh dang, ham parseInt se phat ra mot doi tuong biet le.
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Chuoi nhap vao khong dung dinh dang.");
        }
    }
}
