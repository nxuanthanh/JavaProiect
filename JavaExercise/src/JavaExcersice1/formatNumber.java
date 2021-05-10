package JavaExcersice1;


import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Nguyễn Xuân Thành
 */
public class formatNumber {

    public static void main(String[] args) {
        long l = 123456789;
        double d = 123489.2345345;

        Locale locale = new Locale("vi", "VN");
        NumberFormat format = NumberFormat.getInstance(locale);

        format.setRoundingMode(RoundingMode.CEILING);

        format.setMaximumFractionDigits(2);
        format.setMinimumFractionDigits(0);

        System.out.println(format.format(l));
        System.out.println(format.format(d));

        System.out.println("----------------");
        String pattern = "###,###.##";
//        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance(locale);

        System.out.println(decimalFormat.format(l));
        System.out.println(decimalFormat.format(d));

        System.out.println("-----------------------");
        decimalFormat.setGroupingSize(4);

        System.out.println(decimalFormat.format(l));
        System.out.println(decimalFormat.format(d));
    }
}
