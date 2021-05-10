package QuanLiXe;

/**
 *
 * @author Admin
 */
import java.sql.SQLOutput;
import java.util.ArrayList;

public class DSXeOto {

    private ArrayList<XeOto> lst;

    public DSXeOto() {
        lst = new ArrayList<>();
    }

    public void themXe(XeOto xe) {
        lst.add(xe);
    }

    public void themXe() {
        String maxe;
        String hangxe;
        double giaXe;
        String loaixe;
        System.out.println("THEM XE VAO DANH SACH");
        System.out.print("Nhap loai xe  nK (Nhap Khau) or nd (Noi dia): ");
        loaixe = Validation.inputLoaiXe();
        System.out.print("Nhap ma xe:");
        maxe = Validation.inputString();
        System.out.print("Nhap hang xe:");
        hangxe = Validation.inputString();
        System.out.print("Nhap don gia xe: ");
        giaXe = Validation.inputDouble();
        if (loaixe.equalsIgnoreCase("nk")) {
            System.out.print("Nhap gia phu thu cho xe nhap khau: ");
            double giaPhuThu = Validation.inputDouble();
            System.out.print("Nhap gia kiem thue cho xe nhau khau: ");
            double giaKiemThue = Validation.inputDouble();
            this.themXe(new XeNhapKhau(maxe, hangxe, giaXe, giaPhuThu, giaKiemThue));
        } else if (loaixe.equalsIgnoreCase("nd")) {
            System.out.print("Nhap so tien lap rap cho xe noi dia: ");
            double congLapRap = Validation.inputDouble();
            System.out.print("Nhap so ngay cong lap rap cho xe noi dia: ");
            int soNgay = (int) Validation.inputDouble();
            this.themXe(new XeNoiDia(maxe, hangxe, giaXe, congLapRap, soNgay));
        }
    }

    public void hienThiDanhSach() {
        System.out.println("DANH SACH TAT CA XE TRONG GARA");
        if (this.lst.size() == 0) {
            System.out.println("Khong co xe nao");
        } else {
            for (XeOto xe : lst) {
                System.out.println(xe);
            }
        }
    }

}
