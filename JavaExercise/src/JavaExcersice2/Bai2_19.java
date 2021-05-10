package JavaExcersice2;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Thành
 */
public class Bai2_19 {

    public static void main(String[] args) throws IOException {
        Scanner inputFromFile = new Scanner(Paths.get("input.txt"), "UTF-8");
        PrintWriter printWriter = new PrintWriter("Output.txt", "UTF-8");
        String example;

        while (inputFromFile.hasNextLine()) {
            example = inputFromFile.nextLine();
            String[] exs = example.split(" ");
            Arrays.sort(exs);
            for (String s : exs) {
                printWriter.print(s + " ");
            }
            printWriter.println();
        }
        inputFromFile.close();;
        printWriter.close();
    }

}
