package JavaExcersice1;

/**
 *
 * @author Nguyễn Xuân Thành
 */
import java.util.Scanner;

public class Bai1_15 {
    public static void main(String[] args) {
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao c: ");
        c = scanner.nextDouble();
        double pi = 0;
        long n = 0;
        double x = 1.0 / (n * 2 + 1);
        while (c <= x) {
            pi += Math.pow(-1, n)*x;
            n++;
            x = 1.0 / (2 * n + 1);
        }
        pi *= 4;
        System.out.println("PI = " + pi);
    }
}
