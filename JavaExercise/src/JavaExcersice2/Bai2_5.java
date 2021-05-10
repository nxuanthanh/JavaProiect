package JavaExcersice2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Thành
 * Chen mot mang vao mang khac theo vi tri chi dinh p.
 */
public class Bai2_5 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr, brr, crr;
        int a, b, c, p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua lan luot 2 mang arr, brr:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;

        System.out.print("Nhap gia tri mang arr[] gom " + a + " phan tu.");
        arr = nhap(a);
        System.out.print("Nhap gia tri mang brr[] gom " + b + " phan tu. ");
        brr = nhap(b);
        crr = new int[c];
        System.out.print("Nhap vao gia tri p: ");
        do {
            p = sc.nextInt();
        } while (p >= a || p < 0);

        //copy du lieu tu hai mang vao mang dich
        for (int i = 0; i < p; i++) {
            crr[i] = arr[i];
        }
        //copy ca mang b vao mang c
        for (int i = 0; i < b; i++) {
            crr[i + p] = brr[i];
        }
        //copy phan con lai cua mang a vao mang c
        for (int i = p; i < a; i++) {
            crr[i + a] = arr[i];
        }

        System.out.println("Mang arr[]: " + Arrays.toString(arr));
        System.out.println("Mang brr[]: " + Arrays.toString(brr));
        System.out.println("Mang crr[]: " + Arrays.toString(crr));

    }

    public static int[] nhap(int n) {
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        return x;
    }

}
