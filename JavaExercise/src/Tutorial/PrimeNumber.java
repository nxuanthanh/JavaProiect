package Tutorial;

import java.util.Scanner;

class PrimeNumber {

    public static void main(String args[]) {
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra:");
        int num = scan.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " Là số nguyên tố!");
        } else {
            System.out.println(num + " Không phải là số nguyên tố!");
        }
    }
}
