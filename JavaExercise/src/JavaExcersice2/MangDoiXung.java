package JavaExcersice2;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Thành Đọc vào dãy số a có n phần tử chỉ gồm các số nguyên
 * dương. Kiểm tra mảng a có phải là mảng đối xứng hay không (ví dụ: 15 2 1 2 15
 * là mảng đối xứng).
 */
public class MangDoiXung {

    public static void main(String[] args) {
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu n: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.print("Nhap vao cac phan tu cua mang.");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean doiXung = true;
        int mid = n / 2;

        for (int i = 0; i < mid; i++) {
            int x = n - 1 - i;
            if (arr[i] != arr[x]) {
                doiXung = false;
                break;
            }
        }
        if (doiXung == true) {
            System.out.println("Day la mang doi xung.");
        } else {
            System.out.println("Mang khong doi xung.");
        }
    }
}
