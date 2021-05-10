package JavaExcersice1;

/**
 *
 * @author Nguyễn Xuân Thành
 */
import java.util.Scanner;

public class Bai1_3 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int x, output;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 2 * n; j++) {
                x = j - n;
                if (x < 0) {
                    x *= -1;

                }
                output = i - x;
                if (output > 0) {
                    System.out.printf("%3d", output);

                } else {
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }

    }

}
