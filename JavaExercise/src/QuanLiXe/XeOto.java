package QuanLiXe;

/**
 *
 * @author Admin
 */
public class XeOto implements IXE {

    protected String maXe;
    protected String hangXe;
    protected double giaXe;

    public XeOto(String maXe, String hangXe, double giaXe) {
        this.maXe = maXe;
        this.hangXe = hangXe;
        this.giaXe = giaXe;
    }

    public String getMaXe() {
        return maXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public double getGiaXe() {
        return giaXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public void setGiaXe(double giaXe) {
        this.giaXe = giaXe;
    }

    @Override
    public double giaTien() {
        return giaXe;
    }

    @Override
    public String toString() {
        return "Xe Oto: Ma xe: " + this.maXe + ", Hang Xe: " + this.hangXe + ", GiaXe:" + giaXe;
    }
}
