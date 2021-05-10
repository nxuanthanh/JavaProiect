package JavaExcersice1;

/**
 *
 * @author Nguyễn Xuân Thành
 */
import java.util.Scanner;
import java.util.Random;

public class Bai1_5 {

    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        int count = 0;

        Random rng = new Random();
        while (true) {
            int randNumber = rng.nextInt(100); // [0,99]
            count++;
            System.out.println("Random number: " + randNumber + ", input: " + input);

            if (randNumber == input) {
                System.out.println("Thuc hien " + count + " lan.");
                break;
            }
        }
    }

}
