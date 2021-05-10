package Tutorial;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CommonDivisor {

    public static int USCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return USCLN(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        System.out.println("USCLN cua " + a + " va " + b + " la:" + USCLN(a, b));
    }
}
