package JavaExcersice2;

/**
 *
 * @author Nguyễn Xuân Thành Sử dụng xâu ký tự để viết phương thức kiểm tra số
 * thuận nghịch. Áp dụng cho việc liệt kê các số thuận nghịch có 9 chữ số.
 */
public class Bai2_13 {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 1000; i < 9999; i++) {
            if (isReverse(i + "")) {
                System.out.printf("%6d", i);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

    private static boolean isReverse(String str) {
        String other;
        StringBuilder builder = new StringBuilder(str);
        other = builder.reverse().toString();
        return (str.compareTo(other) == 0);
    }

}
