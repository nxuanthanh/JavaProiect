package QuanLiXe;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        DSXeOto ds = new DSXeOto();
        while (true) {
            System.out.println("QUAN LI XE O TO ");
            System.out.println("1.  Them xe Oto vao danh sach");
            System.out.println("2.  Hien thi tat cac xe Oto trong danh sach");
            System.out.println("3.  Nhan phim bat ki de thoat");
            System.out.print("Lua chon. ");
            int choice = (int) Validation.inputDouble();
            switch (choice) {
                case 1:
                    ds.themXe();
                    break;
                case 2:
                    ds.hienThiDanhSach();
                    break;
                default:
                    return;
            }
        }

    }
}
