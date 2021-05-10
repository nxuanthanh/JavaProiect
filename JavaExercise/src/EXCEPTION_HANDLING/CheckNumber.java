package EXCEPTION_HANDLING;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Thành
 */
class UnsignedIntegerException extends Exception {

    public UnsignedIntegerException(String str) {
        super(str);
    }
}

public class CheckNumber {

    public static void checkNumber(String s) throws UnsignedIntegerException {
        String numReg = "^\\d+$";
        Boolean b = s.matches(numReg);

        if (b == false) {
            throw new UnsignedIntegerException("Dinh dang chuoi so nguyen duong khong hop le.");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap chuoi so nguyen duong: ");
            String numStr = sc.nextLine();

            checkNumber(numStr);
        } catch (UnsignedIntegerException e) {
            System.out.println(e.getMessage());
        }
    }
}
