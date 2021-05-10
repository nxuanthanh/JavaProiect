package JavaExcersice2;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Thành Đọc vào một dãy số a có n phần tử là các số nguyên.
 * Đếm số lần xuất hiện của từng phần tử trong mảng. In ra phần tử và số lần
 * xuất hiện của phần tử có số lần xuất hiện nhiều nhất trong a.
 */
public class demPhantuMang {

    public static void main(String[] args) {
        int[] arr, res;
        int n, count;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu n: ");
        n = sc.nextInt();
        arr = new int[n];
        res = new int[n];
        System.out.print("Nhap vao cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            res[i] = -1;
        }

        // dem so lan xuat hien cua cac phan tu trong mang
        for (int i = 0; i < n; i++) {
            count = 1;
            for (int j = i + 1; j < n; j++) {
                if (res[j] != 0 && arr[i] == arr[j]) {
                    count++;
                    res[j] = 0;
                }
            }
            if (res[i] != 0) {
                res[i] = count;
            }
        }
        // tim so lan xuat lien max
        int max = res[0];
        for (int i = 0; i < n; i++) {
            if (res[i] > max) {
                max = res[i];
            }
        }
        System.out.print("So lan xuat hien nhieu nhat cua 1 phan tu: " + max + ", la cac phan tu: ");
        for (int i = 0; i < n; i++) {
            if (res[i] == max) {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("\b\b");
    }

}
