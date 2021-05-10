package JavaExcersice2;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Thành
 */
public class Bai2_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("Nhap vao chuoi ki tu: ");
        input = sc.nextLine();

        String[] inputs = input.split(" ");
        int index = 0;
        int lenMax = 0;
        for (int i = 0; i < inputs.length; i++) {
            int len = inputs[i].length();
            if (len > lenMax) {
                lenMax = len;
                index = i;

            }
        }
        System.out.println("Tu: " + inputs[index] + ", o vi tri thu " + (index + 1) + " la tu dai nhat" + ", do dai: " + lenMax);
    }
}
