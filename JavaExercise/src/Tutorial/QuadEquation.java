package Tutorial;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuadEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a, b, c, x1, x2, del;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = keyboard.nextFloat();
        System.out.println("Nhap b: ");
        b = keyboard.nextFloat();
        System.out.println("Nhap c: ");
        c = keyboard.nextFloat();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else // tuc la b != 0
            {
                System.out.println("Phuong trinh co nghiem = " + (-c / b));
            }
        } else {
            del = b * b - 4 * a * c;
            if (del < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (del == 0) {
                x1 = x2 = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep = " + x1);
            } else //del>0
            {

                x1 = (float) (-b + Math.sqrt(del)) / (2 * a);
                x2 = (float) (-b - Math.sqrt(del)) / (2 * a);

                System.out.println("Phuong trinh co 2 nghiem: \n x1 = " + x1 + "\n x2 = " + x2);
            }
        }
    }
}
