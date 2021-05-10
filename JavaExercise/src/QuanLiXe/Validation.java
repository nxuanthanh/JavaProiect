package QuanLiXe;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Validation {

    private static Scanner input = new Scanner(System.in);

    public static String inputString() {
        while (true) {
            String i = input.nextLine();
            if (i.isEmpty()) {
                System.out.print("Not empty, type again: ");
            } else {
                return i;
            }
        }
    }

    public static String inputLoaiXe() {
        while (true) {
            String i = input.nextLine();
            if (i.equalsIgnoreCase("nk") || i.equalsIgnoreCase("nd")) {
                return i;
            } else {
                System.out.print("Must be nK (Nhap Khau) or nd (Noi dia), type again: ");
            }
        }
    }

    public static double inputDouble() {
        while (true) {
            try {
                double i = Double.parseDouble(input.nextLine().trim());
                if (i >= 0) {
                    return i;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.print("Must be a number or higher than 0: ");
            }
        }
    }
}
