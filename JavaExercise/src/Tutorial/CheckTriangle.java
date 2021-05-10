package Tutorial;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CheckTriangle {

    public static void main(String[] args) {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextFloat();
        System.out.println("Nhap b: ");
        b = sc.nextFloat();
        System.out.println("Nhap c: ");
        c = sc.nextFloat();

        if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0)) {
            System.out.print("a,b,c la ba canh cua ");
            if ((a == b) && (b == c)) {
                System.out.println("Tam giac deu.");
            } else if ((a == b) || (b == c) || (a == c)) {
                System.out.println("Tam giac can.");
            } else if (((a * a + b * b == c * c) && (a == b)) || ((a * a + c * c == b * b)) && (c == a)
                    || ((c * c + b * b == c * c) && (c == b))) {
                System.out.println("Tam giac vuong can.");
            } else if ((a * a == b * b + c * c)
                    || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
                System.out.println("Tam giac vuong.");
            } else {
                System.out.println("Tam giac thuong.");
            }
        } else {
            System.out.println("3 canh tam giac khong hop le.");
        }
    }

}
