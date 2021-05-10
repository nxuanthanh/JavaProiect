package JavaExcersice1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Nguyễn Xuân Thành
 */
public class FormatDate {

    public static void main(String[] args) {
        String pattern = "dd/MM/yyyy";
        
        String pattern2 = "hh:mm:ss a dd/MM/yyyy";
        
        String pattern3 = "hh:mm:ss a EEEEE, dd MMMMM  dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern3,new Locale("vi","VN"));
        
        System.out.println(dateFormat.format(new Date()));
        
        String dateStr = "11-04-2021";
        String pattern4 = "dd/MM/yyyy";
        
        String dateStr2 = "11/04/2021 12:45 PM";
        String pattern5 = "dd/MM/yyyy hh:mm a";
        SimpleDateFormat dateFormat4 = new SimpleDateFormat(pattern4);
        SimpleDateFormat dateFormat3 = new SimpleDateFormat(pattern5);
        
        try {
            Date date = dateFormat3.parse(dateStr2);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
