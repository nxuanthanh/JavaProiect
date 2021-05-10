package Tutorial;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SumEven {
//  main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N: ");
        int N = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= N; i += 1) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
