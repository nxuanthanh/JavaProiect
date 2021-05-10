package JavaExcersice2;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Thành Viết chương trình tính tích 2 ma trận các số nguyên
 * A [m][n] và B[n][k].
 */
public class Bai2_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, k;
        int[][] a, b, c;
        System.out.print("Nhap cap ma tran a: ");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.print("Nhap so cot ma tran b: ");
        k = sc.nextInt();

        System.out.println("Nhap ma tran a: ");
        a = nhap(m, n, sc);
        System.out.println("Nhap ma tran b: ");
        b = nhap(n, k, sc);

        System.out.println("Ma tran a: ");
        xuat(a);
        System.out.println("Ma tran b: ");
        xuat(b);

        c = nhanMaTran(a, b);
        System.out.println("Ket qua: ");
        xuat(c);
    }

    public static int[][] nhap(int m, int n, Scanner sc) {
        int[][] x = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        return x;
    }

    public static void xuat(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.printf("%5d", x[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] nhanMaTran(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];
        int m = a.length;
        int n = b[0].length;
        int k = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < k; l++) {
                    c[i][j] += a[i][l] * b[l][j];
                }
            }
        }
        return c;
    }

}
