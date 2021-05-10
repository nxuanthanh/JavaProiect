package JavaExcersice2;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Thành Đọc vào một dãy số a có n phần tử là các số nguyên.
 * Nhập vào một số X. Xác định vị trí của số nguyên tố trên a có giá trị gần với
 * X nhất
 */
public class Bai2_3 {

    public static void main(String[] args) {
        int n, x, index = -1, min = Integer.MAX_VALUE;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n, x: ");
        n = sc.nextInt();
        x = sc.nextInt();
        System.out.print("Nhap vao cac phan tu cua mang: ");
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int currentMin = getMin(arr[i], x);
            if ((nguyenTo(arr[i]) && currentMin < min)) {
                min = currentMin;
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Chi so phan tu: " + index + " Gia tri " + arr[index] + " la so nguyen to gan " + x + " nhat.");
            System.out.println("");
        } else {
            System.out.println("Khong ton tai gia tri thoa man.");
        }

    }

    public static int getMin(int x, int a) {
        return Math.abs(a - x);
    }

    public static boolean nguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        int a = (int) Math.sqrt(n);
        for (int i = 2; i <= a; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
