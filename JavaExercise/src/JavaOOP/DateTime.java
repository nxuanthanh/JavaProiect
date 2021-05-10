package JavaOOP;

/**
 *
 * @author Admin
 */
import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author User
 */
public class DateTime {

    public static void main(String[] args) {
        LocalDate time = LocalDate.now();
        int toDay = time.getDayOfMonth();
        int Month = time.getMonthValue();
        int year = time.getYear();
        time = time.minusDays(toDay - 1);
        DayOfWeek dow = time.getDayOfWeek();
        int value = dow.getValue();
        System.out.println("Mon Tus Wed Thus Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.printf("    ");
        }
        while (time.getMonthValue() == Month) {
            System.out.printf("%3d", +time.getDayOfMonth());
            if (time.getDayOfMonth() == toDay) {
                System.out.printf("*");
            } else {
                System.out.printf(" ");
            }
            time = time.plusDays(1);
            if (time.getDayOfWeek().getValue() == 1) {
                System.out.println("");
            }

        }
        System.out.println("\n");
        System.out.println("Time now: ");
        System.out.println(" Day " + toDay
                + " Month " + Month + " Year " + year);
    }

};
