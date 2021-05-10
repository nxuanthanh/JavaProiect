package JavaExcersice2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Thành
 * chen phan tu vao mang theo dung vi tri tuong ung tang dan
 * 
 */
public class Bai2_6 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int n, x;
        System.out.print("Nhap vao so phan tu cua mang:");
        n = sc.nextInt();
        System.out.print("Nhap vao cac phan tu cua mang gom " + n + " phan tu: ");
        arr = nhap(n, sc);
        System.out.print("Nhap x: ");
        x = sc.nextInt();

        int index = - 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            //chen vao cuoi
            arr[n] = x;
        } else //dich phai toan bo cac phan tu tu vi tri index
        {
            for (int i = n; i < index; i++) {
                arr[i] = arr[i - 1];
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static int[] nhap(int n, Scanner sc) {
        int[] x = new int[n + 1];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        return x;
    }
}
