package JavaExcersice1;

/**
 *
 * @author Nguyễn Xuân Thành
 */
import java.util.Scanner;

public class Bai1_1 {

    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap m va n: ");
        m = scanner.nextInt();
        n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
