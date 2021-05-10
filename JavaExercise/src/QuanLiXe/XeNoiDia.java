package QuanLiXe;

/**
 *
 * @author Admin
 */
public class XeNoiDia extends XeOto {
    private double congLapRap;
    private int soNgay;

    public XeNoiDia(String maXe, String hangXe, double giaXe, double congLapRap, int soNgay) {
        super(maXe, hangXe, giaXe);
        this.congLapRap = congLapRap;
        this.soNgay = soNgay;
    }

    @Override
    public double giaTien() {
        return super.getGiaXe()+congLapRap*soNgay;
    }
    @Override
    public String toString() {
        return  "Xe Noi dia: Ma xe: "+super.getMaXe()+", Hang Xe: "+super.getHangXe()+", GiaXe:"+giaTien();
    }
}
