package JavaExcersice1;

/**
 *
 * @author Nguyễn Xuân Thành
 */
import java.util.Scanner;

public class Bai1_8 {

    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("uoc la: ");
            if (n % i == 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.printf("\n%d co " + count + " uoc so", n);
    }
}
