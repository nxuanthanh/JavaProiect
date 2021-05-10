package JavaExcersice1;

/**
 *
 * @author Nguyễn Xuân Thành
 */
import java.util.Scanner;

public class Bai1_7 {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i < n; i++) {
            sum += (double) 1 / i;

        }
        System.out.println("Result = " + sum);

    }
}
