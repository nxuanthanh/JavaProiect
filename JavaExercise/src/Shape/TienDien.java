package Shape;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class TienDien {

    public static void main(String[] args) {
        float soDien, chiSoDau, chiSoCuoi, thanhTien;
        Scanner ThongTin = new Scanner(System.in);
        System.out.println("Nhập chỉ số đầu: ");
        chiSoDau = ThongTin.nextFloat();
        System.out.println("Nhập chỉ số cuối: ");
        chiSoCuoi = ThongTin.nextFloat();
        soDien = chiSoCuoi - chiSoDau;
        if (soDien <= 50) {
            thanhTien = soDien * 230;
        } else if (soDien <= 100) {
            thanhTien = (50 * 480) + ((soDien - 50) * 700);
        } else {
            thanhTien = (50 * 480) + (50 * 700) + ((soDien - 100) * 900);
        }
        System.out.println("Số điện đã sử dụng:" + soDien);
        System.out.println("Số tiền đện cần thanh toán là: " + thanhTien);
        System.out.println("Nguyễn Xuân Thành 18DT1");

    }

}
