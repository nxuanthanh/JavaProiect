package QuanLiXe;

public class XeNhapKhau extends XeOto {

    private double giaPhuThu;
    private double giaKiemThue;

    public XeNhapKhau(String maXe, String hangXe, double giaXe, double giaPhuThu, double giaKiemThue) {
        super(maXe, hangXe, giaXe);
        this.giaPhuThu = giaPhuThu;
        this.giaKiemThue = giaKiemThue;
    }

    @Override
    public double giaTien() {
        return super.getGiaXe() + this.giaKiemThue + this.giaPhuThu;
    }

    @Override
    public String toString() {
        return "Xe Nhap khau: Ma xe: " + super.getMaXe() + ", Hang Xe: " + super.getHangXe() + ", GiaXe:" + giaTien();
    }
}
