package JavaExcersice2;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Thành Đọc vào một xâu họ tên theo cấu trúc:
 * họ...đệm...tên; sau đó thực hiện chuyển xâu đó sang biểu diễn theo cấu trúc
 * tên…họ…đệm.
 */
public class Bai2_17 {

    public static void main(String[] args) throws IOException {
        Scanner inputFromFile = new Scanner(Paths.get("input.txt"), "UTF-8");
        PrintWriter printWrite = new PrintWriter("KetQua.Out", "UTF-8");
        while (inputFromFile.hasNextLine()) {
            String name = inputFromFile.nextLine();
            name = name.trim();
            String[] names = name.split(" ");
            StringBuilder builder = new StringBuilder();
            builder.append(names[names.length - 1] + " ");
            builder.append(names[0] + " ");
            for (int i = 1; i < names.length - 1; i++) {
                if (names[i].length() != 0) {
                    builder.append(names[i] + " ");
                }
            }
            name = builder.toString();
            printWrite.println(name);
        }

        printWrite.close();
        inputFromFile.close();
    }
}
