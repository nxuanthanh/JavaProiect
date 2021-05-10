package JavaExcersice1;

/**
 *
 * @author Nguyễn Xuân Thành
 */
import java.util.Scanner;

public class Bai1_9 {

    public static void main(String[] args) {
        int n, x;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int sum = 0;
        while (n > 0) {
            x = n % 10;
            n /= 10;
            sum += x;
        }
        System.out.println("Sum = " + sum);
    }
}
