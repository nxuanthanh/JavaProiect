/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP;

/**
 *
 * @author Xuan Thanh
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day {
    /*
        Tính số ngày sai lệch giữa hai thời điểm cho trước
        Hướng dẫn:
        B1: Nhập vào hai giá trị string
        B2: Chuyển đổi các giá trị đầu vào từ String->Date qua lớp SimpleDateFormat
        B3: Chuyển hai thời điểm thành mili giây
        B4: Lấy trị tuyệt đối của hiệu hai mili giây này
        B5: Chia cho số mili giây trong một ngày => DONE!
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ngay bat dau: ");
        String start = scanner.nextLine();
        System.out.print("Nhap ngay ket thuc: ");
        String end = scanner.nextLine();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {

            Date startDate = simpleDateFormat.parse(start);
            Date endDate = simpleDateFormat.parse(end);

            long startValue = startDate.getTime();
            long endValue = endDate.getTime();
            long tmp = Math.abs(startValue- endValue);

            long result = tmp/(24*60*60*1000);

            System.out.println("So ngay chenh lech: " + result);

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
