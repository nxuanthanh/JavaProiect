package JavaExcersice2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Thành
 * Ma tran chuyen tri
 */
public class Bai2_8 {

    public static void main(String[] args) {
        int m, n;
        int[][] arr, brr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap m,n: ");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Nhap ma tran arr[][]: ");
        arr = nhap(m, n, sc);
        brr = chuyenVi(arr);

        System.out.println("Ma tran goc: ");
        show(arr);

        System.out.println("Ma tran chuyen vi: ");
        show(brr);
    }

    private static int[][] nhap(int m, int n, Scanner sc) {
        int[][] x = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        return x;
    }

    private static int[][] chuyenVi(int[][] arr) {
        int m, n;
        m = arr.length;
        n = arr[0].length;
        int[][] brr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                brr[i][j] = arr[j][i];
            }
        }
        return brr;
    }

    private static void show(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
